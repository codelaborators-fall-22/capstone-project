package io.codelaborators.serverside.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.List;

@Entity
public class GlutenFree extends Recipe {

    @Id
    @GeneratedValue

    private Long id;

    private String imageUrl;

    public Long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public GlutenFree(int prepTime, String difficultyLevel, List<String> ingredients, int servingSize, int cookTime, int calories, int fat, int protein, int sugar, int sodium, int carbs, List<String> steps, String imageUrl) {
        super(prepTime, difficultyLevel, ingredients, servingSize, cookTime, calories, fat, protein, sugar, sodium, carbs, steps);
        this.imageUrl = imageUrl;
    }

    public GlutenFree(){}
}
