package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Vegan;
import io.codelaborators.serverside.models.Vegan;
import io.codelaborators.serverside.repositories.VeganRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin


public class VeganController {

    @Resource
    private VeganRepository veganRepo;

    @GetMapping ("/recipes/vegan")
    public Collection<Vegan> getAllVeganRecipes(){

        return (Collection<Vegan>) veganRepo.findAll();
    }


    @GetMapping ("/recipes/vegan/{difficultyLevel}")
    public Collection<Vegan> getRecipesByDifficultyLevel(@PathVariable String difficultyLevel) {
        return (Collection<Vegan>) veganRepo.findByDifficultyLevel(difficultyLevel.toLowerCase()); }



    @GetMapping("/recipes/vegan/meal/{mealType}")
    public Collection<Vegan> getDairyFreeRecipesByMealType(@PathVariable String mealType) {
        return (Collection<Vegan>) veganRepo.findByMealType(mealType.toLowerCase()); }

}
