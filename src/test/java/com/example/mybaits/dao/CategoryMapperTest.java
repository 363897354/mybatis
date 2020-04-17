package com.example.mybaits.dao;



import com.example.mybaits.domain.Category;
import com.example.mybaits.domain.QueryVo;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void findOne() {
        Gson gson = new Gson();
        Category one = categoryMapper.findOne(100001);
        System.out.print(gson.toJson(one));

    }

    @Test
    public void queryByid() {
        Gson gson = new Gson();
        Category one = categoryMapper.queryByid(100001);
        System.out.print(gson.toJson(one));

    }

    @Test
    public void save() {
        Gson gson = new Gson();
       Category category=new Category();
       category.setParentId(0);
       category.setName("aa");
       category.setStatus(true);
       category.setSortOrder(1);
       categoryMapper.save(category);


    }

    @Test
    public void update() {
        Gson gson = new Gson();
        Category category=new Category();
        category.setId(100031);
        category.setParentId(1);
        category.setName("aab");
        category.setStatus(true);
        category.setSortOrder(1);
        categoryMapper.updateCategory(category);


    }


    @Test
    public void delete() {

        categoryMapper.deleteCategoryById(100031);

    }

    //模糊查询

    @Test
    public void findByName() {
        Gson gson = new Gson();
        List<Category> list = categoryMapper.findByName("%a%");
        for (Category category:list) {
              System.out.print(gson.toJson(category));
        }


    }

    //使用聚合函数
    @Test
    public void count() {
        int count = categoryMapper.count();
        System.out.print(count);


    }

    @Test
    public void findByQueryVo() {
        QueryVo vo=new QueryVo();
        Category category=new Category();
        category.setName("%a%");
        vo.setCategory(category);
        Category byQueryVo = categoryMapper.findByQueryVo(vo);



    }

}