package com.bp5308.lab2.content.controller;

import com.bp5308.lab2.content.dto.PostCreationRequest;
import com.bp5308.lab2.content.entity.Post;
import com.bp5308.lab2.content.services.PostService;
import com.bp5308.lab2.user.entity.User;
import com.bp5308.lab2.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<PostCreationRequest> create(@RequestBody PostCreationRequest post) {
        Post newPost = new Post();
        newPost.setTitle(post.getTitle());
        newPost.setContent(post.getContent());
        Date currentDate = new Date();
        newPost.setCreatedAt(currentDate);
        newPost.setUpdatedAt(currentDate);
        User user = userService.findById(post.getUserId()).get();
        newPost.setAuthor(user);
        Post createdPost = postService.createPost(newPost);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
}
