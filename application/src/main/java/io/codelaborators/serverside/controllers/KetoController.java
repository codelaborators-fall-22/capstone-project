package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Keto;
import io.codelaborators.serverside.repositories.KetoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin


public class KetoController {

    @Resource
    private KetoRepository ketoRepo;

    @GetMapping ("/recipes/keto")
    public Collection<Keto> getAllKetoRecipes(){

        return (Collection<Keto>) ketoRepo.findAll();
    }


}
