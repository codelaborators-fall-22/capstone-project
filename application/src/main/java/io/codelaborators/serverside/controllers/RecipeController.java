package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Recipe;
import io.codelaborators.serverside.repositories.RecipeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin

public class RecipeController {

    @Resource
    private RecipeRepository recipeRepo;

    @GetMapping("/recipes")
    public Collection<Recipe> getRecipes(){
        return (Collection<Recipe>) recipeRepo.findAll();
    }

    @GetMapping("/recipes/meal/{mealType}")
    public  Collection<Recipe> getRecipesByMealType(@PathVariable String mealType) {
        return (Collection<Recipe>) recipeRepo.findByMealType(mealType.toLowerCase()); }

    @GetMapping("/recipes/recipe/{id}")
    public Optional<Recipe> getRecipes(@PathVariable Long id) {
        return recipeRepo.findById(id);}

    @GetMapping("/recipes/{difficultyLevel}")
    public  Collection<Recipe> getRecipesByDifficultyLevel(@PathVariable String difficultyLevel) {
        return (Collection<Recipe>) recipeRepo.findByDifficultyLevel(difficultyLevel.toLowerCase()); }

}
