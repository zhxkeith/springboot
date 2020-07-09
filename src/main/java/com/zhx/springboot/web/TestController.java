package com.zhx.springboot.web;

import com.zhx.springboot.pojo.Poduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
   @RequestMapping("/test")
    public String test(Model m){
       String htmlContent = "<p style='color:red'> 红色文字</p>";
       Poduct currentProduct =new Poduct(5,"product 5", 200);
       m.addAttribute("htmlContent", htmlContent);
       m.addAttribute("currentProduct", currentProduct);
       return "test";
   }

}
