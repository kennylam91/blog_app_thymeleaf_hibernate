package com.codegym.bms.controller;

import com.codegym.bms.model.Blog;
import com.codegym.bms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/create")
    public ModelAndView showCreateBlog(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog",new Blog());
        return modelAndView;
    }

    @PostMapping(value = "/save")
    public String createNewBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/list")
    public ModelAndView listBlog(){
        List<Blog> blogs= blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("blogs",blogs);
        return modelAndView;
    }
}
