package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Post;
import com.demo.Repository.PostRepo;
import com.demo.Request.PostRequest;
import com.demo.Response.PostResponse;

@RestController
@RequestMapping("Post")
public class PostController {

    //anotação para instanciar//
    @Autowired
    private PostRepo repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")

    @PostMapping
    public void savePost (@RequestBody PostRequest data) {

        Post postData = new Post(data);
        repository.save(postData);
        return;
    }

    @GetMapping
    public List<PostResponse> getAll(){

        List<PostResponse> postList = repository.findAll().stream().map(PostResponse::new).toList();
        return postList;
    }
}
