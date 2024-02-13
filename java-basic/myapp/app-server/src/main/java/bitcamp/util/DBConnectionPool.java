package bitcamp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DBConnectionPool {

  // DB 커넥션 목록
  ArrayList<Connection> connections = new ArrayList<>();

  private String jdbcUrl;
  private String username;
  private String password;

  // 개별 스레드용 커넥션 저장소
  private static final ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();

  public DBConnectionPool(String jdbcUrl, String username, String password) {
    this.jdbcUrl = jdbcUrl;
    this.username = username;
    this.password = password;
  }

  public Connection getConnection() throws Exception {
    // 현재 스레드에 보관 중인 Connection 객체 꺼냄
    Connection con = connectionThreadLocal.get();

    if (con == null) {
      // 스레드에 보관된 Connection이 없다면,
      if (connections.size() > 0) {
        // 스레드풀에 놀고 있는 Connection이 있다면 꺼냄
        con = connections.remove(0);  // 목록에서 맨 처음 객체를 꺼냄
        System.out.printf("%s: DB 커넥션풀에서 꺼냄\n", Thread.currentThread().getName());
      } else {
        // 스레드풀에도 놀고 있는 Connection이 없다면 새로 Connection을 만듦
        con = DriverManager.getConnection(jdbcUrl, username, password);
        System.out.printf("%s: DB 커넥션 생성\n", Thread.currentThread().getName());
      }

      // 나중에 또 사용할 수 있도록 현재 스레드에 Connection을 보관
      connectionThreadLocal.set(con);

    } else {
      System.out.printf("%s: 스레드에 보관된 DB 커넥션 리턴\n", Thread.currentThread().getName());
    }
    return con;
  }

  public void returnConnection(Connection con) {
    // 스레드에 보관중인 Connection 객체를 제거
    connectionThreadLocal.remove();

    // Connection을 커넥션풀에 반환
    connections.add(con);

    System.out.printf("%s: DB 커넥션을 커넥션풀에 반환\n", Thread.currentThread().getName());
  }
}
