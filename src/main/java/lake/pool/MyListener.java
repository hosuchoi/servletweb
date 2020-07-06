package lake.pool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
서브릿 컨텍스트의 라이프사이클 이벤트
 */
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener context Initialized");
        sce.getServletContext().setAttribute("name","lake");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener context Destroyed");
    }
}
