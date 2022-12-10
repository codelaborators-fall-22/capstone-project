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

@Resource
private DairyFreeRepository dairyFreeRepo;

@Resource
private PaleoRepository paleoRepo;



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


    }
}
