package bitcamp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnectionPool implements ConnectionPool {

  // 개별 스레드용 DB 커넥션 저장소
  private static final ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();
  private final Log log = LogFactory.getLog(this.getClass());
  // DB 커넥션 목록
  ArrayList<Connection> connections = new ArrayList<>();

  @Value("${jdbc.url}")
  private String jdbcUrl;

  @Value("${jdbc.username}")
  private String username;

  @Value("${jdbc.password}")
  private String password;

  public DBConnectionPool() {
    log.debug("생성자 호출됨!");
  }

  public Connection getConnection() throws Exception {
    // 현재 스레드에 보관중인 Connection 객체를 꺼낸다.
    Connection con = connectionThreadLocal.get();

    if (con == null) {
      // 스레드에 보관된 Connection 이 없다면,

      if (connections.size() > 0) {
        // 스레드풀에 놀고 있는 Connection이 있다면,
        con = connections.remove(0); // 목록에서 맨 처음 객체를 꺼낸다.
        log.debug(String.format("%s: DB 커넥션풀에서 꺼냄\n", Thread.currentThread().getName()));

      } else {
        // 스레드풀에도 놀고 있는 Connection 이 없다면,
        // 새로 Connection을 만든다.
        con = new ConnectionProxy(DriverManager.getConnection(jdbcUrl, username, password), this);
        log.debug(String.format("%s: DB 커넥션 생성\n", Thread.currentThread().getName()));
      }

      // 현재 스레드에 Connection 을 보관한다.
      connectionThreadLocal.set(con);

    } else {
      log.debug(String.format("%s: 스레드에 보관된 DB 커넥션 리턴\n", Thread.currentThread().getName()));
    }

    return con;
  }

  public void returnConnection(Connection con) {
    // 스레드에 보관중인 Connection 객체를 제거한다.
    connectionThreadLocal.remove();

    // Connection을 커넥션풀에 반환
    connections.add(con);

    log.debug(String.format("%s: DB 커넥션을 커넥션풀에 반환\n", Thread.currentThread().getName()));
  }

  public void closeAll() {
    for (Connection con : connections) {
      ((ConnectionProxy) con).realClose();
    }
  }
}
