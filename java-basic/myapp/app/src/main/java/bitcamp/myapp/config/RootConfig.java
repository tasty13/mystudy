package bitcamp.myapp.config;

import java.io.InputStream;
import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(value = {"bitcamp.myapp.dao"})
@PropertySource({
    "classpath:config/jdbc.properties"
})
public class RootConfig {

  private final Log log = LogFactory.getLog(this.getClass());

  public RootConfig() {
    log.debug("생성자 호출됨!");
  }

  @Bean
  public DataSource dataSource(
      @Value("${jdbc.url}") String url,
      @Value("${jdbc.username}") String username,
      @Value("${jdbc.password}") String password) {
    return new DriverManagerDataSource(url, username, password);
  }

  @Bean
  public PlatformTransactionManager transactionManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

  @Bean
  public SqlSessionFactory sqlSessionFactory(ApplicationContext ctx, DataSource dataSource)
      throws Exception {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource);
    sqlSessionFactoryBean.setTypeAliasesPackage("bitcamp.myapp.vo");
    sqlSessionFactoryBean.setMapperLocations(ctx.getResources("classpath:mapper/*Mapper.xml"));
    return sqlSessionFactoryBean.getObject();
  }
}
