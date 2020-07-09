package com.zhx.springboot.mapper;

import com.zhx.springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
     List<Category> findAll();

}
