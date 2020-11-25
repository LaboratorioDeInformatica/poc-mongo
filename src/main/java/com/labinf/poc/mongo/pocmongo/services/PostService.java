package com.labinf.poc.mongo.pocmongo.services;

import com.labinf.poc.mongo.pocmongo.domain.Post;
import com.labinf.poc.mongo.pocmongo.repository.PostRepository;
import com.labinf.poc.mongo.pocmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
