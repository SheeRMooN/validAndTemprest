package com.example.demovalidation.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 3)
    private String name;

    private String title;

    private String type;

    public Home(Long id, @NotEmpty @Size(min = 3) String name, String title, String type) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.type = type;
    }
}
