package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Paleo;
import io.codelaborators.serverside.repositories.PaleoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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


}
