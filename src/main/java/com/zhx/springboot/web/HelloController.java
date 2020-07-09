package com.zhx.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {
   @RequestMapping("/hello")
    public String hello(Model model) throws Exception{
       model.addAttribute("name", DateFormat.getDateInstance().format(new Date()));
       /*if (true){
           throw new Exception("some exception");
       }*/
       return "hello";
   }
}
