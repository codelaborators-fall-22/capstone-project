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
private DairyFreeRepository dairyFreeRepo;



    @Override
    public void run(String... args) throws Exception {

        List<String> dairyFreeRecipe1Ingredients = new ArrayList<>();
        List<String> dairyFreeRecipe1Steps = new ArrayList<>();

        dairyFreeRecipe1Ingredients.add("1 pound Jimmy Dean Sage ground pork");
        dairyFreeRecipe1Ingredients.add("1 medium onion, diced");
        dairyFreeRecipe1Ingredients.add("2 garlic cloves, minced");
        dairyFreeRecipe1Ingredients.add("8 ounces spinach");
        dairyFreeRecipe1Ingredients.add("20 ounces frozen diced hashbrowns");
        dairyFreeRecipe1Ingredients.add("10 large eggs");
        dairyFreeRecipe1Ingredients.add("1/2 cup soy milk");
        dairyFreeRecipe1Ingredients.add("1 teaspoon dry mustard");
        dairyFreeRecipe1Ingredients.add("1 teaspoon salt");
        dairyFreeRecipe1Ingredients.add("1/2 teaspoon pepper");

        dairyFreeRecipe1Steps.add("Preheat oven to 400 degrees");
        dairyFreeRecipe1Steps.add("Spray baking pan with nonstick cooking spray");
        dairyFreeRecipe1Steps.add("Brown the sausage with the onions and garlic");
        dairyFreeRecipe1Steps.add("Once cooked, add the spinach, stirring occasionally til it wilts");
        dairyFreeRecipe1Steps.add("In large bowl, whisk together eggs, soy milk, dry mustard, salt and pepper");
        dairyFreeRecipe1Steps.add("Add the hashbrowns to prepared pan");
        dairyFreeRecipe1Steps.add("Spread the pork sausage mixture on top of the potatoes");
        dairyFreeRecipe1Steps.add("Pour the egg mixture over the casserole");
        dairyFreeRecipe1Steps.add("Bake for 35-40 minutes or until the eggs are cooked through. Serve immediately");

        DairyFree dairyFreeRecipe1 = new DairyFree(10,"easy",dairyFreeRecipe1Ingredients,8,40,318,19,20,1,457,16,"breakfast",dairyFreeRecipe1Steps,"insert image url here");
        dairyFreeRepo.save(dairyFreeRecipe1);




    }
}
