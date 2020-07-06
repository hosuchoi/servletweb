package lake.pool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
DispatcherServlet에서 생성한 applicationContext
 */
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class)) // 모든 bean 등록 false 후 Controller만 빈으로 등록 하겠다
@EnableWebMvc // 아래 빈을 등록하여 처리하는 rowlevel 방식보다 발전된 방식
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/",".jsp");
    }

    /*
    implements WebMvcConfigurer 사용시 아래 빈설정을 편하게 해줌 ( 아래 다 주석 처리 )
     */

    /*

//    아래의 빈 등록후 처리하는 방식은
//    가장 row level의 spring mvc 설정 방식

    @Bean
    public HandlerMapping handlerMapping(){
        RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
        handlerMapping.setInterceptors();
        handlerMapping.setOrder((Ordered.HIGHEST_PRECEDENCE));
        return handlerMapping;
    }

    @Bean
    public HandlerAdapter handlerAdapter(){
        RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
        return handlerAdapter;
    }

//    viewResolver를 빈등록 하여서 prefix, suffix 설정함 ( controller에서 view 경로에 생략가능 )
//    그외에 viewResoler를 통해서 정의 가능
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
*/
}
