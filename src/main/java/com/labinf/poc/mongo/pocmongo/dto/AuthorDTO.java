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
public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = -3228101765341239809L;

    private String id;
    private String name;

    public AuthorDTO(User user){
        id = user.getId();
        name = user.getName();
    }
}
