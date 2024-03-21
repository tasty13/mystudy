package bitcamp.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@ComponentScan(value = {
    "bitcamp.myapp.controller"
})
public class AppConfig {

  @Bean
  MultipartResolver multipartResolver() {
    StandardServletMultipartResolver mr = new StandardServletMultipartResolver();
    return mr;
  }
}
