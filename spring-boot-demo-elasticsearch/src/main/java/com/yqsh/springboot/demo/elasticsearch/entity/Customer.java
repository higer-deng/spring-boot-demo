package com.yqsh.springboot.demo.elasticsearch.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "customer")
public class Customer {

    @Id
    private Long id;
    private String name;
    @Field(fielddata = true)
    private String age;
    private String idcard;

}
