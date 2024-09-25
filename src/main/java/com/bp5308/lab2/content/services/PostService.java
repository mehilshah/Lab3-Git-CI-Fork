package com.bp5308.lab2.content.services;

import com.bp5308.lab2.content.entity.Post;
import com.bp5308.lab2.content.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepo;

    public List<Post> findAll() {
        return postRepo.findAll();
    }

    public Post createPost(Post post) {
        return postRepo.save(post);
    }

    public void deletePost(Post post) {
        postRepo.delete(post);
    }

    public void deletePost(String id) {
        List<Post> posts = postRepo.findAll();
        for (Post post : posts) {
            if (post.getId() == Integer.parseInt(id)) {
                postRepo.delete(post);
            }
        }
    }
}
