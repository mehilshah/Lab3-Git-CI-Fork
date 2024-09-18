package com.bp5308.lab2.content.repository;

import com.bp5308.lab2.content.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findById(long id);
    Post findByTitle(String title);
}
