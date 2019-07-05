package com.codegym.bms.service;

import com.codegym.bms.model.Blog;
import com.codegym.bms.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface BlogService {
    void save(Blog blog);

}
