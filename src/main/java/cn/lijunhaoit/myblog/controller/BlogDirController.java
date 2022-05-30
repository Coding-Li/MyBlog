package cn.lijunhaoit.myblog.controller;

import cn.lijunhaoit.myblog.entity.BlogDir;
import cn.lijunhaoit.myblog.service.IBlogDirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogDir")
public class BlogDirController {

    @Autowired
    private IBlogDirService iBlogDirService;

    @GetMapping("/getBlogDirs")
    public List<BlogDir> getBlogDirs(){
        return iBlogDirService.getBlogDirs();
    }
}
