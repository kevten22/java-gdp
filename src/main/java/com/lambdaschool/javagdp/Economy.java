package com.lambdaschool.javagdp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Economy {
    private @Id @GeneratedValue Long id;
    private String language;
    private Long population;

    public Economy(){

    }

    public Economy(String language, Long population) {
        this.language = language;
        this.population = population;
    }
}
