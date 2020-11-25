package com.labinf.poc.mongo.pocmongo.domain;

import com.labinf.poc.mongo.pocmongo.dto.AuthorDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "post")
public class Post implements Serializable {

    private static final long serialVersionUID = -4511007507219606654L;
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;
}
