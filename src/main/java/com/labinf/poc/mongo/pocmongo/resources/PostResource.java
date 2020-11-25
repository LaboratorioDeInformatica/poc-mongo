package com.labinf.poc.mongo.pocmongo.resources;

import com.labinf.poc.mongo.pocmongo.domain.Post;
import com.labinf.poc.mongo.pocmongo.domain.User;
import com.labinf.poc.mongo.pocmongo.dto.PostDTO;
import com.labinf.poc.mongo.pocmongo.dto.UserDTO;
import com.labinf.poc.mongo.pocmongo.resources.util.URL;
import com.labinf.poc.mongo.pocmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

    @RequestMapping(value = "/titlesearch", method = RequestMethod.GET)
    public ResponseEntity<List<PostDTO>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> posts = postService.findByTitle(text);
        List<PostDTO> dtoList = posts.stream().map(x -> new PostDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(dtoList);
    }

    @RequestMapping(value = "/fullsearch", method = RequestMethod.GET)
    public ResponseEntity<List<PostDTO>> fullSearch
            (@RequestParam(value = "text", defaultValue = "") String text,
             @RequestParam(value = "minDate", defaultValue = "") String minDate,
             @RequestParam(value = "maxDate", defaultValue = "") String maxDate) {
        text = URL.decodeParam(text);
        Date min = URL.convertDate(minDate, new Date(0L));
        Date max = URL.convertDate(minDate, new Date());
        List<Post> posts = postService.fullSearch(text,min,max);
        List<PostDTO> dtoList = posts.stream().map(x -> new PostDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(dtoList);
    }
}
