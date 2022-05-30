package cn.lijunhaoit.myblog.service.impl;

import cn.lijunhaoit.myblog.entity.BlogDir;
import cn.lijunhaoit.myblog.mapper.BlogDirMapper;
import cn.lijunhaoit.myblog.mapper.UserMapper;
import cn.lijunhaoit.myblog.service.IBlogDirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogDirServiceImpl implements IBlogDirService {

    @Autowired
    private BlogDirMapper blogDirMapper;

    @Override
    public List<BlogDir> getBlogDirs() {
        return blogDirMapper.getBlogDirs();
    }
}
