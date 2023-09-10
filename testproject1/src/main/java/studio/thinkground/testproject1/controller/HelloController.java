package studio.thinkground.testproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        System.out.println("in hello con");
        return "hello";
    }
}
