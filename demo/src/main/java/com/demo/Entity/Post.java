package com.demo.Entity;

import com.demo.Request.PostRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostRemove;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Post")
@Entity(name = "Post")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String text;
    
    private String imageUrl;
    
    /*public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }*/

    public Post (PostRequest data) {
        this.text = data.text();
        this.imageUrl = data.imageUrl();
    }
}
