package cn.lijunhaoit.myblog.service;


import cn.lijunhaoit.myblog.entity.User;
import cn.lijunhaoit.myblog.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);
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

    @Async("asyncExecutor")
    public void executeAsync(){
        int id = new Random().nextInt(100);

        logger.info("{} start",id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("{} end",id);
    }
}
