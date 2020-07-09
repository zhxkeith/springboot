package com.zhx.springboot.test;

import com.zhx.springboot.SpringbootApplication;
import com.zhx.springboot.dao.CategoryDao;
import com.zhx.springboot.pojo.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class TestJPA {
@Autowired
    CategoryDao categoryDao;
@Before
public void before(){
    List<Category> categoryDaoAll = categoryDao.findAll();
    for (Category category:categoryDaoAll){
        categoryDao.delete(category);
    }
    for (int i = 0; i <10 ; i++) {
        Category category = new Category();
        category.setName("category"+i);
        categoryDao.save(category);
    }
}
@Test
    public void test01(){
    List<Category> categoryDaoAll = categoryDao.findAll();
    System.out.println("所有分类信息");
    for (Category category :categoryDaoAll){
        System.out.println(category.getName());
    }
}
@Test
public void test02(){

}
}
