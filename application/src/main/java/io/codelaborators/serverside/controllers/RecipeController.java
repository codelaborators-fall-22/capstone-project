package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Comment;
import io.codelaborators.serverside.models.Recipe;
import io.codelaborators.serverside.repositories.CommentRepository;
import io.codelaborators.serverside.repositories.RecipeRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin

public class RecipeController {

    @Resource
    private RecipeRepository recipeRepo;
    @Resource
    private CommentRepository commentRepo;
    @GetMapping("/recipes")
    public Collection<Recipe> getRecipes(){
        return (Collection<Recipe>) recipeRepo.findAll();
    }

    @PostMapping("/recipes/recipe/{id}/add-comment")
    public Collection<Recipe> addComment(@RequestBody String body, @PathVariable Long id) throws JSONException{
        JSONObject newComment = new JSONObject(body);
        String comment = newComment.getString("comment");
        String userName = newComment.getString("userName");
        Recipe recipe = recipeRepo.findById(id).get();
        Comment commentToAdd = new Comment(comment, userName, recipe);
        commentRepo.save(commentToAdd);
        recipe.addComment(commentToAdd);
        recipeRepo.save(recipe);
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
