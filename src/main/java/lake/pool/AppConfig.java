package lake.pool;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.Controller;

/*
루트서블릿
모든 서블릿이 공통으로 공유 가능
서블릿들의 부모인 설정파일
 */
@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class)) //Controller는 bean 빼고 모든 Bean 등록
public class AppConfig {
}
