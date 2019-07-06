package com.codegym.bms.service.impl;

import com.codegym.bms.model.Blog;
import com.codegym.bms.repository.BlogRepository;
import com.codegym.bms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
       return blogRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}
