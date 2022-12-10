package io.codelaborators.serverside.controllers;


import io.codelaborators.serverside.models.GlutenFree;

import io.codelaborators.serverside.models.DairyFree;

import io.codelaborators.serverside.models.Keto;
import io.codelaborators.serverside.models.Paleo;
import io.codelaborators.serverside.repositories.KetoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin


public class KetoController {

    @Resource
    private KetoRepository ketoRepo;

    @GetMapping("/recipes/keto")
    public Collection<Keto  > getAllKetoRecipes() {
        return (Collection<Keto>) ketoRepo.findAll();
    }


    @GetMapping ("/recipes/keto/{difficultyLevel}")
    public Collection<Keto> getRecipesByDifficultyLevel(@PathVariable String difficultyLevel) {
        return (Collection<Keto>) ketoRepo.findByDifficultyLevel(difficultyLevel.toLowerCase()); }
    }

    @GetMapping("/recipes/keto/{mealType}")
    public Collection<Keto> getKetoRecipesByMealType(@PathVariable String mealType) {
        return (Collection<Keto>) ketoRepo.findByMealType(mealType.toLowerCase()); }


