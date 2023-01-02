package io.codelaborators.serverside.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.List;

@Entity
public class GlutenFree extends Recipe {


    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public GlutenFree(String recipeName, int prepTime, String difficultyLevel, List<String> ingredients, int servingSize, int cookTime, int calories, int fat, int protein, int sugar, int sodium, int carbs,String mealType, List<String> steps, String imageUrl) {
        super(recipeName, prepTime, difficultyLevel, ingredients, servingSize, cookTime, calories, fat, protein, sugar, sodium, carbs,mealType, steps);
        this.imageUrl = imageUrl;
    }

    public GlutenFree(){}
}
