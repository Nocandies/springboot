package ml.cl.springboot.controller;

import ml.cl.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/boot")
public class ConfigController {

    @Value("${boot.name}")
    private String name;
    @Value("${boot.sex}")
    private String sex;

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/getp")
    public @ResponseBody String getp(){
        System.out.println(name+"++++"+sex);
        System.out.println("bean:"+configInfo.getName()+"\t"+configInfo.getSex());
        return name+"----"+sex;
    }
}
