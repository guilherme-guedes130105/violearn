package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Entity.Post;

public interface PostRepo extends JpaRepository<Post, Long> {
    
}
