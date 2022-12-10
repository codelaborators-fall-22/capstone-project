package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Recipe;
import io.codelaborators.serverside.repositories.RecipeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin

public class RecipeController {

    @Resource
    private RecipeRepository recipeRepo;

    @GetMapping("/recipes")
    public Collection<Recipe> getRecipes(){
        return (Collection<Recipe>) recipeRepo.findAll();
    }

    @GetMapping("/recipes/{mealType}")
    public  Collection<Recipe> getRecipesByMealType(@PathVariable String mealType) {
        return (Collection<Recipe>) recipeRepo.findByMealType(mealType.toLowerCase()); }

    @GetMapping("/recipes/{difficultyLevel}")
    public  Collection<Recipe> getRecipesByDifficultyLevel(@PathVariable String difficultyLevel) {
        return (Collection<Recipe>) recipeRepo.findByDifficultyLevel(difficultyLevel.toLowerCase()); }

}
