package com.labinf.poc.mongo.pocmongo.dto;

import com.labinf.poc.mongo.pocmongo.domain.Post;
import com.labinf.poc.mongo.pocmongo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO implements Serializable {

    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    public PostDTO (Post post){
        this.id = post.getId();
        this.date = post.getDate();
        this.title = post.getTitle();
        this.body = post.getBody();
        this.author = post.getAuthor();
    }
}
