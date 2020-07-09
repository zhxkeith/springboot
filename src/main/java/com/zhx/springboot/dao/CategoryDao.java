package com.zhx.springboot.dao;

import com.zhx.springboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Integer> {
    public List<Category> findByName(String name);
    public List<Category> findByNameLikeAndIdGreaterThanOrderByNameAsc(String name, int id);
}
