package lake.pool;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.Controller;

/*
DispatcherServlet에서 생성한 applicationContext
 */
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class)) // 모든 bean 등록 false 후 Controller만 빈으로 등록 하겠다
public class WebConfig {
}
