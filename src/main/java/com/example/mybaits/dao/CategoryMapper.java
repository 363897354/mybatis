package com.example.mybaits.dao;

import com.example.mybaits.domain.Category;
import com.example.mybaits.domain.QueryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface CategoryMapper {

    @Select("select * from mall_category where id =#{id}")
    Category findOne(@Param("id") Integer id);

    Category queryByid(Integer id);

    void save(Category category);

    int updateCategory(Category category);

    void deleteCategoryById(Integer id);

    List<Category> findByName(String categoryName);

    int count();

    Category findByQueryVo(QueryVo queryVo);
}
