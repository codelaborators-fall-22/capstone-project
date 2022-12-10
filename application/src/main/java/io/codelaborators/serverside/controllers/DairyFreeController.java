package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.DairyFree;
import io.codelaborators.serverside.models.Keto;
import io.codelaborators.serverside.repositories.DairyFreeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin


public class DairyFreeController {

    @Resource
    private DairyFreeRepository dairyFreeRepo;

    @GetMapping ("/recipes/dairy-free")
    public Collection<DairyFree> getAllDairyFreeRecipes(){

        return (Collection<DairyFree>) dairyFreeRepo.findAll();
    }


    @GetMapping ("/recipes/dairy-free/{difficultyLevel}")
    public Collection<DairyFree> getRecipesByDifficultyLevel(@PathVariable String difficultyLevel) {
        return (Collection<DairyFree>) dairyFreeRepo.findByDifficultyLevel(difficultyLevel.toLowerCase()); }



    @GetMapping("/recipes/dairy-free/{mealType}")
    public Collection<DairyFree> getDairyFreeRecipesByMealType(@PathVariable String mealType) {
        return (Collection<DairyFree>) dairyFreeRepo.findByMealType(mealType.toLowerCase()); }

}