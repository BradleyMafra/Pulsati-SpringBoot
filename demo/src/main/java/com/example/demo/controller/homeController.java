package com.example.demo.controller;
import com.example.demo.model.funcionarioModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class homeController {
    @RequestMapping("/home")

    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @RequestMapping( value = { "/" , "" ,"/funcionario" })
    public ModelAndView funcionario(){
        return new ModelAndView("home/funcionario");
    }
}
