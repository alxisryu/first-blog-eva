package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping("/api/posts")
    public String getPosts() {
        return "[]"; // Placeholder for posts
    }
}
