package com.example.mybaits.dao;


import com.example.mybaits.domain.QueryUserVo;
import com.example.mybaits.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll(){
        //5.执行查询所有方法
        List<User> users = userMapper.findAll();
        for(User user : users){
            System.out.println(user);
        }

    }


    /**
     * 测试删除操作
     */
    @Test
    public void testFindOne(){
        //5.执行查询一个方法
        User  user = userMapper.findById(50);
        System.out.println(user);
    }

    /**
     * 测试模糊查询操作
     */
    @Test
    public void testFindByName(){
        //5.执行查询一个方法
        List<User> users = userMapper.findByName("%王%");
//        List<User> users = userDao.findByName("王");
        for(User user : users){
            System.out.println(user);
        }
    }

    /**
     * 测试使用QueryVo作为查询条件
     */
    @Test
    public void testFindByVo() {
        QueryUserVo vo = new QueryUserVo();
        User user = new User();
        user.setUserName("%王%");
        vo.setUser(user);
        //5.执行查询一个方法
        List<User> users = userMapper.findUserByVo(vo);
        for (User u : users) {
            System.out.println(u);
        }
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindByCondition(){
        User u = new User();
        u.setUserName("老王");
        u.setUserSex("女");

        //5.执行查询所有方法
        List<User> users = userMapper.findUserByCondition(u);
        for(User user : users){
            System.out.println(user);
        }

    }


    /**
     * 测试foreach标签的使用
     */
    @Test
    public void testFindInIds(){
        QueryUserVo vo = new QueryUserVo();
        List<Integer> list = new ArrayList<Integer>();
        list.add(41);
        list.add(42);
        list.add(46);
        vo.setIds(list);


        //5.执行查询所有方法
        List<User> users = userMapper.findUserInIds(vo);
        for(User user : users){
            System.out.println(user);
        }

    }
}
