package ml.cl.springboot.controller;

import ml.cl.springboot.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/boot")
@SuppressWarnings("all")
public class SpringMVCController {
    @RequestMapping("/mvc")
    public List<User> mvcTest(){
        User user1 = new User(11,"承诺1");
        User user2 = new User(12,"承诺2");
        User user3 = new User(13,"承诺3");
        User user4 = new User(14,"承诺4");
        List<User> list = Arrays.asList(user1,user2,user3,user4);
        return list;
    }
    @GetMapping("/getmvc")
    public List<User> mvcTest2(){
        User user1 = new User(11,"承诺1");
        User user2 = new User(12,"承诺2");
        User user3 = new User(13,"承诺3");
        User user4 = new User(14,"承诺4");
        List<User> list = Arrays.asList(user1,user2,user3,user4);
        return list;
    }
    @PostMapping("/postmvc")
    public List<User> mvcTest3(){
        User user1 = new User(11,"承诺1");
        User user2 = new User(12,"承诺2");
        User user3 = new User(13,"承诺3");
        User user4 = new User(14,"承诺4");
        List<User> list = Arrays.asList(user1,user2,user3,user4);
        return list;
    }


}
