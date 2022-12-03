package io.codelaborators.serverside.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Paleo extends Recipe {

    @Id
    @GeneratedValue
    private Long id;

    private String imageUrl;

    @Override
    public Long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Paleo(int prepTime, String difficultyLevel, List<String> ingredients, int servingSize, int cookTime, int calories, int fat, int protein, int sugar, int sodium, int carbs, List<String> steps, String imageUrl) {
        super(prepTime, difficultyLevel, ingredients, servingSize, cookTime, calories, fat, protein, sugar, sodium, carbs, steps);
        this.imageUrl = imageUrl;
    }

    public Paleo() {
    }

}