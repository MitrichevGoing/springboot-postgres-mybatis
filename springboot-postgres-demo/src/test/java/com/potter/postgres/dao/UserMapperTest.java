package com.potter.postgres.dao;

import com.alibaba.fastjson.JSON;
import com.potter.postgres.domain.User;
import com.potter.postgres.domain.UserExample;
import com.potter.postgres.domain.UserExample.Criteria;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.tomcat.jni.Local;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

  @Resource
  private UserMapper userMapper;

  @Test
  public void selectByExample() {
    UserExample userExample = new UserExample();
    List<User> users = userMapper.selectByExample(userExample);
    Assert.assertTrue(users.isEmpty());
  }

  @Test
  public void insert(){
    User user = new User();
    user.setAvatarUrl("www.baidu.com");
    user.setCreatedAt(LocalDateTime.now());
    user.setLastSignInAt(LocalDateTime.now());
    user.setPassword("123");
    user.setName("诸葛亮");
    user.setStatus("1");
    user.setUsername("18896347610");
    Map<String, String> map = new HashMap<>(4);
    map.put("deptName","技术部");
    map.put("deptId", "12");
    map.put("deptAddr", "苏州工业园区");
    user.setDeptInfo(JSON.parseObject(JSON.toJSONString(map)));

    int insert = userMapper.insert(user);
    System.out.println(insert);
  }

  @Test
  public void update(){
    UserExample userExample = new UserExample();
    Criteria criteria = userExample.createCriteria();
    criteria.andNameEqualTo("诸葛亮");

    User condition = new User();
    condition.setUsername("18896347610");
    condition.setAvatarUrl("www.ctrip.com");
    String[] roleids = new String[]{"12","34","56"};
    String[] menuids = new String[]{"22","34","36"};
    condition.setRoleIds(roleids);
    condition.setMenuIds(menuids);
    condition.setUpdatedAt(LocalDateTime.now());

    int i = userMapper.updateByExampleSelective(condition, userExample);
    System.out.println(i);
  }
}
