package com.labinf.poc.mongo.pocmongo.dto;

import com.labinf.poc.mongo.pocmongo.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 3569763673163492436L;

    private String id;
    private String name;
    private String email;

    public UserDTO (User user){
        id = user.getId();
        email = user.getEmail();;
        name = user.getName();;
    }
}
