package ml.cl.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("boot")
public class JspController {
    @GetMapping("/toindex")
    public String toIndex(Model model){
        model.addAttribute("msg","Springboot 集成 jsp");
        return "index";
    }
}
