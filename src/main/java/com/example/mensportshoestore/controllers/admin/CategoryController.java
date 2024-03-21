package com.example.mensportshoestore.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class CategoryController {
    @GetMapping("/category")
    public String category(){
        return "/admin/category/category";
    }

    @GetMapping("/add-category")
    public String add(){
        return "/admin/category/add";
    }
}
