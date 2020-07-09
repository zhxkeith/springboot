package com.zhx.springboot.web;

import com.zhx.springboot.dao.CategoryDao;
import com.zhx.springboot.mapper.CategoryMapper;
import com.zhx.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
   private CategoryMapper categoryMapper;
   /* CategoryDao categoryDao;*/

    @RequestMapping("/listcategory")
    public String listCategory(Model model){
        List<Category> categoryList = categoryMapper.findAll();
        model.addAttribute("cs",categoryList);
        return "/listcategory";
    }
}
