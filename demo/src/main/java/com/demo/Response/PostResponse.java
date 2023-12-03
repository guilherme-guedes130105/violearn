package com.demo.Response;

import com.demo.Entity.Post;

public record PostResponse(Long id, String text, String imageUrl) {
    public PostResponse(Post post){
        this(post.getId(), post.getText(), post.getImageUrl());
    }
}
