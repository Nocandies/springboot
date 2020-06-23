package ml.cl.springboot.controller;

import ml.cl.springboot.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@Controller
@RequestMapping("/boot")
public class RESTFullController {

    @RequestMapping("/restfull/{id}/{name}/{age}")
    public @ResponseBody Student getStu(@PathVariable("id") Integer id,
                                        @PathVariable("name") String name,
                                        @PathVariable("age") Integer age) {
        Student student = new Student(id,name,age);
        return student;
    }


}
