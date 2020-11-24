package com.labinf.poc.mongo.pocmongo.resources;

import com.labinf.poc.mongo.pocmongo.domain.User;
import com.labinf.poc.mongo.pocmongo.dto.UserDTO;
import com.labinf.poc.mongo.pocmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity< List<UserDTO> > findAll(){
        List<User> list = userService.findAll();
        List<UserDTO> dtoList = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(dtoList);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity< UserDTO> findById(@PathVariable  String id){
        User user = userService.findById(id);
        return ResponseEntity.ok().body(new UserDTO(user));
    }


}
