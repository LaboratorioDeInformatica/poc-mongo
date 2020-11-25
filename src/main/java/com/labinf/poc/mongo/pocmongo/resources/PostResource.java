package com.labinf.poc.mongo.pocmongo.resources;

import com.labinf.poc.mongo.pocmongo.domain.Post;
import com.labinf.poc.mongo.pocmongo.domain.User;
import com.labinf.poc.mongo.pocmongo.dto.PostDTO;
import com.labinf.poc.mongo.pocmongo.dto.UserDTO;
import com.labinf.poc.mongo.pocmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PostDTO> findById(@PathVariable String id) {
        Post post = postService.findById(id);
        return ResponseEntity.ok().body(new PostDTO(post));
    }
}