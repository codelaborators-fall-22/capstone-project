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

<<<<<<< HEAD
    @Resource
    private DairyFreeRepository dairyFreeRepo;
=======
@Resource
private DairyFreeRepository dairyFreeRepo;

@Resource
private PaleoRepository paleoRepo;
>>>>>>> c1a25aabc3c6b7e36539e66fdd4916842cab9bee


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

<<<<<<< HEAD
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
=======
        List<String> paleoSesameChickenIngredients = new ArrayList<>();
        List<String> paleoSesameChickenSteps = new ArrayList<>();

        paleoSesameChickenIngredients.add("2/3 cup water warmed slightly");
        paleoSesameChickenIngredients.add("5 medjool dates pitted");
        paleoSesameChickenIngredients.add("1/4 cup coconut aminos");
        paleoSesameChickenIngredients.add("3 Tbsp rice vinegar");
        paleoSesameChickenIngredients.add("2 tsp arrowroot flour or tapioca");
        paleoSesameChickenIngredients.add("1 Tbsp sesame oil");
        paleoSesameChickenIngredients.add("1/2 tsp garlic powder");
        paleoSesameChickenIngredients.add("1/4-1/2 tsp red pepper flakes adjust to taste");
        paleoSesameChickenIngredients.add("2lb boneless skinless chicken thighs cut into 1 inch pieces");
        paleoSesameChickenIngredients.add("1 tsp sesame oil");
        paleoSesameChickenIngredients.add("1/2 tsp garlic powder");
        paleoSesameChickenIngredients.add("1 cup tapioca flour or arrowroot");
        paleoSesameChickenIngredients.add("1 1/4 tsp salt");
        paleoSesameChickenIngredients.add("1/4 tsp black pepper");
        paleoSesameChickenIngredients.add("2 eggs whisked");
        paleoSesameChickenIngredients.add("Avocado oil or refined coconut oil for frying");
        paleoSesameChickenIngredients.add("2 Tbsps sesame seeds for garnish");
        paleoSesameChickenIngredients.add("Thinly sliced scallions for garnish");

        paleoSesameChickenSteps.add("In a high speed blender, blend together all the sauce ingredients except for the red pepper flakes, until a smooth mixture forms, scraping down the sides to incorporate all the dates if needed.");
        paleoSesameChickenSteps.add("Transfer the sauce to a small saucepan over medium heat. Whisk and heat for 2-3 minutes to a boil, then lower the heat to med-low to simmer. Add the red pepper flakes, then simmer for another 3-4 minutes until the mixture thickens and reduces a bit (it should resemble a thick caramel).");
        paleoSesameChickenSteps.add("Place the arrowroot or tapioca in a shallow bowl along with the salt and pepper.");
        paleoSesameChickenSteps.add("Whisk the eggs in a separate shallow bowl. Drizzle the chicken with the sesame oil and sprinkle with the garlic powder.");
        paleoSesameChickenSteps.add("Coat chicken pieces in whisked egg lightly, then toss in arrowroot starch, shaking off excess, and place in s bowl");
        paleoSesameChickenSteps.add("Heat about 1/2 cup of oil in a large deep non-stick skillet. Once sizzling hot, work in batches to cook the chicken pieces, frying for about 3 minutes until crisp and golden, turning once or twice.");
        paleoSesameChickenSteps.add("Place chicken on a paper-towel-lined plate and repeat the process for the remaining chicken, adjusting the temperature of the heat as needed and adding more oil if needed.");
        paleoSesameChickenSteps.add("Gently reheat the sesame sauce and toss it with the chicken. To serve, sprinkle all over with sesame seeds and green onion and and serve over sautéed cauliflower rice or your favorite veggies. Enjoy!");

        Paleo paleoSesameChickenRecipe = new Paleo(15, "medium", paleoSesameChickenIngredients, 6, 20, 382, 12, 32, 13, 869, 37, "dinner", paleoSesameChickenSteps, "insert image url here");
        paleoRepo.save(paleoSesameChickenRecipe);

        List<String> paleoCreamyTuscanChickenIngredients = new ArrayList<>();
        List<String> paleoCreamyTuscanChickenSteps = new ArrayList<>();

        paleoCreamyTuscanChickenIngredients.add("1.5 lbs chicken thighs boneless and skinless");
        paleoCreamyTuscanChickenIngredients.add("1 Tbsp coconut oil plus additional if needed");
        paleoCreamyTuscanChickenIngredients.add("Sea salt and pepper");
        paleoCreamyTuscanChickenIngredients.add("1/4 tsp garlic powder");
        paleoCreamyTuscanChickenIngredients.add("1/4 tsp onion powder");
        paleoCreamyTuscanChickenIngredients.add("1 small onion chopped");
        paleoCreamyTuscanChickenIngredients.add("4 cloves garlic minced");
        paleoCreamyTuscanChickenIngredients.add("1 Tbsp tapioca flour or arrowroot");
        paleoCreamyTuscanChickenIngredients.add("1 cup chicken bone broth");
        paleoCreamyTuscanChickenIngredients.add("1/2 cup coconut milk full fat, blended before adding if needed");
        paleoCreamyTuscanChickenIngredients.add("1/2 Tbsp stone ground mustard");
        paleoCreamyTuscanChickenIngredients.add("1 1/2 Tbsp nutritional yeast optional");
        paleoCreamyTuscanChickenIngredients.add("1 tsp Italian seasoning blend");
        paleoCreamyTuscanChickenIngredients.add("1/4 tsp sea salt or to taste");
        paleoCreamyTuscanChickenIngredients.add("1/8 tsp black pepper or to taste");
        paleoCreamyTuscanChickenIngredients.add("2/3 cup sun dried tomatoes roughly chopped");
        paleoCreamyTuscanChickenIngredients.add("1 1/2 cups baby spinach roughly chopped");

        paleoCreamyTuscanChickenSteps.add("Season the chicken with sea salt, pepper, garlic, and onion powder. In a large skillet add the coconut oil and cook the chicken thighs on medium-high heat for 5-7 minutes on each side or until browned and no longer pink in center. Remove chicken and set aside on a plate.");
        paleoCreamyTuscanChickenSteps.add("Add additional oil if necessary and cook the onions over medium heat until soft, then stir in the garlic and cook another 45 seconds.");
        paleoCreamyTuscanChickenSteps.add("Whisk in the tapioca or arrowroot, the add the broth and coconut milk. Stir to combine, then stir in the mustard, yeast, Italian seasoning, sea salt and pepper. Cook and stir over medium-high heat until it starts to thicken.");
        paleoCreamyTuscanChickenSteps.add("Add the spinach and sun-dried tomatoes and allow mixture to simmer until spinach is wilted and tomatoes are softened. Add chicken back to the skillet and simmer another 2 minutes. Serve over cauli rice, zucchini noodles, or with roasted potatoes. Enjoy!");

        Paleo paleoCreamyTuscanChickenRecipe = new Paleo(10, "medium", paleoCreamyTuscanChickenIngredients, 6, 20, 368, 25, 23, 5, 253, 12, "dinner", paleoCreamyTuscanChickenSteps, "insert image url here");
        paleoRepo.save(paleoCreamyTuscanChickenRecipe);

        List<String> paleoSweetPotatoPancakesIngredients = new ArrayList<>();
        List<String> paleoSweetPotatoPancakesSteps = new ArrayList<>();

        paleoSweetPotatoPancakesIngredients.add("1/2 cup sweet potato, microwaved until soft and mashed");
        paleoSweetPotatoPancakesIngredients.add("2 eggs");
        paleoSweetPotatoPancakesIngredients.add("1 tbsp coconut flour");
        paleoSweetPotatoPancakesIngredients.add("1 1/2 tsp cinnamon");
        paleoSweetPotatoPancakesIngredients.add("1/4 tsp baking soda");
        paleoSweetPotatoPancakesIngredients.add("1/4 tsp vanilla");
        paleoSweetPotatoPancakesIngredients.add("coconut oil, for pan");

        paleoSweetPotatoPancakesSteps.add("Mix together all ingredients but the coconut oil and beat just until a batter forms.");
        paleoSweetPotatoPancakesSteps.add("Heat coconut oil in a skillet over medium heat. Pour about 1/4 cup of batter out and cook until bubbles start to form. Flip the pancake and cook for about another minute or two until fully cooked.");
        paleoSweetPotatoPancakesSteps.add("Repeat with the rest of the batter. Enjoy!");

        Paleo paleoSweetPotatoPancakesRecipe = new Paleo(0, "easy", paleoSweetPotatoPancakesIngredients, 4, 15, 110, 7, 4, 3, 126, 9, "breakfast", paleoSweetPotatoPancakesSteps, "insert image url here");
        paleoRepo.save(paleoSweetPotatoPancakesRecipe);
>>>>>>> c1a25aabc3c6b7e36539e66fdd4916842cab9bee

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