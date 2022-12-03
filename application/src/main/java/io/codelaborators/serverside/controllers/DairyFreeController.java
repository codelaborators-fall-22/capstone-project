package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.DairyFree;
import io.codelaborators.serverside.repositories.DairyFreeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin


public class DairyFreeController {

    @Resource
    private DairyFreeRepository dairyFreeRepo;

    @GetMapping ("/recipes/dairy-free")
    public Collection<DairyFree> getAllPaleoRecipes(){

        return (Collection<DairyFree>) dairyFreeRepo.findAll();
    }


}