package com.labinf.poc.mongo.pocmongo.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -8057091568304411241L;

    @Id
    private String id;
    private String name;
    private String email;

}
