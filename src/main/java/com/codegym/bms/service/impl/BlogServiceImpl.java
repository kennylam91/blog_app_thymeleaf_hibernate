package com.codegym.bms.service.impl;

import com.codegym.bms.model.Blog;
import com.codegym.bms.repository.BlogRepository;
import com.codegym.bms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }
}