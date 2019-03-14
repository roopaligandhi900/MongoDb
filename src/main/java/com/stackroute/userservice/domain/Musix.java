package com.stackroute.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(value="musix")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Musix {

    @Id
    private int id;
    private String name;
    private int rating;
    private String comments;

}
