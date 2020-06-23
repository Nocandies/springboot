package ml.cl.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/boot")
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody String Hello(){
        return "Hello SpringBoot ~ ~ ";
    }
}
