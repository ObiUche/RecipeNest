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


    public Recipe(String name, Chef creator, String ingredients, String instructions) {
        super();
        this.name = name;
        this.creator = creator;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Long getRecipeId() {
        return recipeId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Chef getCreator() {
        return creator;
    }

    public void setCreator(Chef creator) {
        this.creator = creator;
    }


}
