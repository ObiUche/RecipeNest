package com.recipenest.app.entity;


import jakarta.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long recipeId;

    private String name, ingredients;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private Chef creator;

    private String instructions;



    public Recipe(){

    }



    public Chef getCreator() {
        return creator;
    }

    public void setCreator(Chef creator) {
        this.creator = creator;
    }


}
