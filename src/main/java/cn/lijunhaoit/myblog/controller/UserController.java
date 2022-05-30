package cn.lijunhaoit.myblog.controller;


import cn.lijunhaoit.myblog.entity.User;
import cn.lijunhaoit.myblog.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> lists() {
        return userService.getUsers();
    }

    @GetMapping("/userListPage")
    public List<User> userListPage(@RequestParam(defaultValue = "1") int pageNo,@RequestParam(defaultValue = "10") int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        //这个查询会分页
        List<User> userList = userService.getUsers();
        return userList;
        //这个不会进行查询分页
//        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User selectUserById(@PathVariable("id") Long id){
        return userService.selectById(id);
    }

}
