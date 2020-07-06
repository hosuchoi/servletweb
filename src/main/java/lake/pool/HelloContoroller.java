package lake.pool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoroller {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return "lake pool hello";
    }
}
