package cn.lijunhaoit.myblog.service;


import cn.lijunhaoit.myblog.entity.User;
import cn.lijunhaoit.myblog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    public User selectById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    public void evictUser(Long id) {
        System.out.println("evict user:" + id);
    }
}
