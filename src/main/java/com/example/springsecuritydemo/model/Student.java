package com.example.springsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private Long id;
    private String FirstName;
    private String LastName;
}
