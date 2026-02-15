package com.recipenest.app.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Chef {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName, lastName, location;

    @OneToMany(mappedBy = "creator")
    private List<Recipe> recipeList = new ArrayList<>();


}
