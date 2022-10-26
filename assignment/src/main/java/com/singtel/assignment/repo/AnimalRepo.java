package com.singtel.assignment.repo;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="animal")
@Data
public class AnimalRepo {
    @Id
    String id;
    @Field("sing")
    String sing;
    @Field("walk")
    String walk;
    @Field("swim")
    String swim;
    @Field("name")
    String name;


}
