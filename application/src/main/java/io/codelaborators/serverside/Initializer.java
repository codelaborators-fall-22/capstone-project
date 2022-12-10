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
        dairyFreeRecipe1Ingredients.add("20 ounces frozen diced hash browns");
        dairyFreeRecipe1Ingredients.add("10 large eggs");
        dairyFreeRecipe1Ingredients.add("1/2 cup soy milk");
        dairyFreeRecipe1Ingredients.add("1 teaspoon dry mustard");
        dairyFreeRecipe1Ingredients.add("1 teaspoon salt");
        dairyFreeRecipe1Ingredients.add("1/2 teaspoon pepper");

        dairyFreeRecipe1Steps.add("Preheat oven to 400 degrees F.");
        dairyFreeRecipe1Steps.add("Spray baking pan with nonstick cooking spray.");
        dairyFreeRecipe1Steps.add("Brown the sausage with the onions and garlic.");
        dairyFreeRecipe1Steps.add("Once cooked, add the spinach, stirring occasionally til it wilts.");
        dairyFreeRecipe1Steps.add("In large bowl, whisk together eggs, soy milk, dry mustard, salt and pepper.");
        dairyFreeRecipe1Steps.add("Add the hash browns to prepared pan.");
        dairyFreeRecipe1Steps.add("Spread the pork sausage mixture on top of the potatoes.");
        dairyFreeRecipe1Steps.add("Pour the egg mixture over the casserole.");
        dairyFreeRecipe1Steps.add("Bake for 35-40 minutes or until the eggs are cooked through. Serve immediately.");

        DairyFree dairyFreeRecipe1 = new DairyFree(20, "easy", dairyFreeRecipe1Ingredients, 8, 40, 318, 19, 20, 2, 457, 16, "breakfast", dairyFreeRecipe1Steps, "insert image url here");
        dairyFreeRepo.save(dairyFreeRecipe1);
    }

    @Override
    public void run(String... args) throws Exception {

        List<String> dairyFreeRecipe2Ingredients = new ArrayList<>();
        List<String> dairyFreeRecipe2Steps = new ArrayList<>();

        dairyFreeRecipe2Ingredients.add("2 cups baby spinach");
        dairyFreeRecipe2Ingredients.add("3 oz grilled skinless boneless chicken breast, chopped ");
        dairyFreeRecipe2Ingredients.add("1/4 cup fresh tomato");
        dairyFreeRecipe2Ingredients.add("1/4 cup thinly sliced cucumber");
        dairyFreeRecipe2Ingredients.add("10 hamburger pickle chips");
        dairyFreeRecipe2Ingredients.add("1/4 cup banana pepper rings, drained");
        dairyFreeRecipe2Ingredients.add("1/4 cup mushrooms, thinly sliced");
        dairyFreeRecipe2Ingredients.add("1 tbsp grated parmesan-reggiano");
        dairyFreeRecipe2Ingredients.add("1/2 tsp lemon pepper");
        dairyFreeRecipe2Ingredients.add("1 tbsp vinaigrette dressing");

        dairyFreeRecipe2Steps.add("To a serving bowl, add the baby spinach.");
        dairyFreeRecipe2Steps.add("Top with  the chicken, tomatoes, cucumbers, pickles, banana peppers and mushrooms.");
        dairyFreeRecipe2Steps.add("Sprinkle with the cheese and lemon pepper.");
        dairyFreeRecipe2Steps.add("Drizzle with vinaigrette on top.");

        DairyFree dairyFreeRecipe2 = new DairyFree(15, "easy", dairyFreeRecipe2Ingredients, 1, 0, 351, 10, 44, 5, 671, 20, "lunch", dairyFreeRecipe2Steps, "insert image url here");
        dairyFreeRepo.save(dairyFreeRecipe2);

    }

    @Override
    public void run(String... args) throws Exception {

        List<String> dairyFreeRecipe3Ingredients = new ArrayList<>();
        List<String> dairyFreeRecipe3Steps = new ArrayList<>();

        dairyFreeRecipe3Ingredients.add("1 bunch thin speared asparagus, ends removed");
        dairyFreeRecipe3Ingredients.add("1 tbsp + 1 tsp olive oil, divided");
        dairyFreeRecipe3Ingredients.add("1/8 + 1/8 tsp salt, divided");
        dairyFreeRecipe3Ingredients.add("2 salmon fillets, 4 oz each, no more than 3/4 in thick");
        dairyFreeRecipe3Ingredients.add("pinch of black pepper");
        dairyFreeRecipe3Ingredients.add("3 tablespoons mayonnaise");
        dairyFreeRecipe3Ingredients.add("1 tbsp lemon juice");
        dairyFreeRecipe3Ingredients.add("1 tsp dijon mustard");
        dairyFreeRecipe3Ingredients.add("1/4 tsp minced or pressed garlic");

        dairyFreeRecipe3Steps.add("Preheat oven to 425 degrees F");
        dairyFreeRecipe3Steps.add("Place the asparagus on a rimmed baking sheet and toss with the 1 tbsp olive oil and 1/8 tsp salt. Arrange in single layer, leaving space for the salmon.");
        dairyFreeRecipe3Steps.add("Place the salmon skin side down on the baking sheet. Brush the salmon with the remaining 1 tsp olive oil and season with the remaining 1/8 tsp salt and pepper.");
        dairyFreeRecipe3Steps.add("Bake for 15 minutes or until center of the salmon reaches 165 degrees F and the asparagus spears are tender and beginning to brown at the tips.");
        dairyFreeRecipe3Steps.add("In a small bowl, whisk together the mayonnaise, lemon juice, mustard, and garlic until smooth.");
        dairyFreeRecipe3Steps.add("Divide the salmon and asparagus between two plates and drizzle each serving with half of the mayonnaise sauce.");

        DairyFree dairyFreeRecipe3 = new DairyFree(5, "medium", dairyFreeRecipe3Ingredients, 2, 15, 384, 27, 27, 4, 533, 10, "dinner", dairyFreeRecipe3Steps, "insert image url here");
        dairyFreeRepo.save(dairyFreeRecipe3);

    }
}