package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.GlutenFree;
import io.codelaborators.serverside.models.Paleo;
import io.codelaborators.serverside.repositories.PaleoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin


public class PaleoController {

    @Resource
    private PaleoRepository paleoRepo;

    @GetMapping ("/recipes/paleo")
        public Collection<Paleo> getAllPaleoRecipes(){

        return (Collection<Paleo>) paleoRepo.findAll();
    }
    @GetMapping("/recipes/paleo/{difficultyLevel}")
    public Collection<Paleo> getRecipesByDifficultyLevel(@PathVariable String difficultyLevel) {
        return (Collection<Paleo>) paleoRepo.findByDifficultyLevel(difficultyLevel.toLowerCase()); }

    @GetMapping("/recipes/paleo/meal/{mealType}")
    public Collection<Paleo> getPaleoRecipesByMealType(@PathVariable String mealType) {
        return (Collection<Paleo>) paleoRepo.findByMealType(mealType.toLowerCase()); }


}
