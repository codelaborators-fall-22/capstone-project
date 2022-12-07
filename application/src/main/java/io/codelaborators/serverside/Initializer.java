package io.codelaborators.serverside;

import io.codelaborators.serverside.models.*;
import io.codelaborators.serverside.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class Initializer implements CommandLineRunner {

@Resource
private GlutenFreeRepository glutenFreeRepo;

    @Override
    public void run(String... args) throws Exception {

        List<String> glutenFreeRecipe1steps = new ArrayList<>();
        List<String> glutenFreeRecipe1ingredients = new ArrayList<>();

        glutenFreeRecipe1ingredients.add("2 cups of water");
        glutenFreeRecipe1ingredients.add("1 cup of dry grits");

        glutenFreeRecipe1steps.add("Bring 2 cups of water to a boil in a sauce pan.");
        glutenFreeRecipe1steps.add("After water has began to boil, add 1 cup of dry grits to the sauce pan.");
        glutenFreeRecipe1steps.add("Stir mixture every 2 minutes for 10 minutes.");
        glutenFreeRecipe1steps.add("Once mixture has reached ideal consistency, remove from heat and add butter.");
        glutenFreeRecipe1steps.add("Allow to cool for 5 minutes and enjoy!");

        GlutenFree glutenFreeRecipe1 = new GlutenFree(5,"easy", glutenFreeRecipe1ingredients,
                2, 10, 300,20,5,10,50,75,"Breakfast",
                glutenFreeRecipe1steps, "insert image url here");

        glutenFreeRepo.save(glutenFreeRecipe1);


        List<String> glutenFreeRecipe2steps = new ArrayList<>();
        List<String> glutenFreeRecipe2ingredients = new ArrayList<>();

        glutenFreeRecipe2ingredients.add("Corn tortillas");
        glutenFreeRecipe2ingredients.add("5 oz. of sliced turkey");
        glutenFreeRecipe2ingredients.add("Chopped lettuce, 1 tomato, 1 serving of mayonnaise");
        glutenFreeRecipe2ingredients.add("3 oz of baby carrots");

        glutenFreeRecipe2steps.add(" Warm corn tortillas in the microwave for 1 minute.");
        glutenFreeRecipe2steps.add("Now spread a thin layer of mayo on the tortilla.");
        glutenFreeRecipe2steps.add("Now layer your lettuce, tomato, sliced turkey.");
        glutenFreeRecipe2steps.add("start at the end of the tortilla and roll it until tightly packed.");
        glutenFreeRecipe2steps.add("Cut tortilla in 2 halves and enjoy!");

        GlutenFree glutenFreeRecipe2 = new GlutenFree(5,"easy", glutenFreeRecipe2ingredients,
                1, 1, 250,7,35,10,20,40,"Lunch",
                glutenFreeRecipe2steps, "insert image url here");

        glutenFreeRepo.save(glutenFreeRecipe2);




    }
}
