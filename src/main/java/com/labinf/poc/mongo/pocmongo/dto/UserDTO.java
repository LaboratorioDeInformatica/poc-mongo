package com.labinf.poc.mongo.pocmongo.dto;

import com.labinf.poc.mongo.pocmongo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
