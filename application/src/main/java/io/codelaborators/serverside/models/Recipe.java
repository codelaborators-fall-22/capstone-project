package io.codelaborators.serverside.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Recipe {
    @GeneratedValue
    @Id
    private Long id;

    private String recipeName;
    private int prepTime;
    private String difficultyLevel;
    @ElementCollection
    private List<String> ingredients;
    private int servingSize;
    private int cookTime;
    private int calories;
    private int fat;
    private int protein;
    private int sugar;
    private int sodium;
    private int carbs;
    @ElementCollection
    @Lob
    private List<String> steps;
    private String mealType;




    @OneToMany
    private List<Comment> comments;

    public Long getId() {
        return id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getCookTime() {
        return cookTime;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getProtein() {
        return protein;
    }

    public int getSugar() {
        return sugar;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbs() {
        return carbs;
    }

    public List<String> getSteps() {
        return steps;
    }
    public String getMealType(){return mealType;}

    public List<Comment> getComments(){
        return comments;
    }
    public Recipe(String recipeName,int prepTime, String difficultyLevel, List<String> ingredients, int servingSize, int cookTime, int calories, int fat, int protein, int sugar, int sodium, int carbs, String mealType,List <String> steps, Comment ... comments) {
        this.recipeName = recipeName;
        this.prepTime = prepTime;
        this.difficultyLevel = difficultyLevel.toLowerCase();
        this.ingredients = ingredients;
        this.servingSize = servingSize;
        this.cookTime = cookTime;
        this.calories = calories;
        this.fat = fat;
        this.protein = protein;
        this.sugar = sugar;
        this.sodium = sodium;
        this.carbs = carbs;
        this.mealType =mealType.toLowerCase();
        this.steps = steps;
        this.comments = new ArrayList<>(Arrays.asList(comments));
    }

    public Recipe(){}

    public void addComment(Comment commentToAdd){
        comments.add(commentToAdd);
    }
}
