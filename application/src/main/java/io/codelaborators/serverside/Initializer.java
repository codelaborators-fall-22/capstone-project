package io.codelaborators.serverside;

import io.codelaborators.serverside.models.*;
import io.codelaborators.serverside.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class Initializer implements CommandLineRunner {


    @Resource
    private DairyFreeRepository dairyFreeRepo;


    @Resource

    private GlutenFreeRepository glutenFreeRepo;


    @Resource
    private PaleoRepository paleoRepo;


    @Resource
    private KetoRepository ketoRepo;
    private VeganRepository veganRepo;


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


        GlutenFree glutenFreeRecipe1 = new GlutenFree("Creamy Breakfast Grits", 5, "easy", glutenFreeRecipe1ingredients,
                2, 10, 300, 20, 5, 10, 50, 75, "Breakfast",

                glutenFreeRecipe1steps, "/images/gluten-free-grits.jpg");

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


        GlutenFree glutenFreeRecipe2 = new GlutenFree("Turkey Wraps", 5, "easy", glutenFreeRecipe2ingredients,
                1, 1, 250, 7, 35, 10, 20, 40, "Lunch",

                glutenFreeRecipe2steps, "/images/gluten-free-turkey-wrap.jpg");

        glutenFreeRepo.save(glutenFreeRecipe2);

        List<String> glutenFreeRecipe3steps = new ArrayList<>();
        List<String> glutenFreeRecipe3ingredients = new ArrayList<>();

        glutenFreeRecipe3ingredients.add("2 tablespoons of grassfed butter");
        glutenFreeRecipe3ingredients.add(" 3 cloves minced fresh garlic");
        glutenFreeRecipe3ingredients.add("1 teaspoon chopped fresh thyme");
        glutenFreeRecipe3ingredients.add("salt and black pepper");
        glutenFreeRecipe3ingredients.add(" 5 lamb loin chops");

        glutenFreeRecipe3ingredients.add("Heat a dry cast iron skillet over a medium high heat, " +
                "Then, place the chops narrow fat side");
        glutenFreeRecipe3ingredients.add("Using tongs press the chops down so that the fat " +
                "renders and turns crisp and brown");
        glutenFreeRecipe3ingredients.add("Once the fat has melted into the pan, lay the chops " +
                "flat on one of their sides. Cook them until browned, then turn and cook on the other side");
        glutenFreeRecipe3ingredients.add("Add 2 tablespoons of butter, garlic and thyme");
        glutenFreeRecipe3ingredients.add("Stir well until the butter is foaming, " +
                "and spoon the butter over the lamb for a minute");


        GlutenFree glutenFreeRecipe3 = new GlutenFree("Garlic Butter Lamb Chops", 5, "medium", glutenFreeRecipe3ingredients,
                3, 15, 260, 20, 20, 0, 11, 20, "Dinner",
                glutenFreeRecipe3steps, "/images/gluten-free-garlic-butter-lamb-chops.png");

        glutenFreeRepo.save(glutenFreeRecipe3);


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

        DairyFree dairyFreeRecipe1 = new DairyFree("Egg Casserole", 20, "easy", dairyFreeRecipe1Ingredients, 8, 40, 318, 19, 20, 2, 457, 16, "breakfast", dairyFreeRecipe1Steps, "/images/dairy-free-egg-casserole.jpg");


        dairyFreeRepo.save(dairyFreeRecipe1);


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

        DairyFree dairyFreeRecipe2 = new DairyFree("Chicken Salad", 15, "easy", dairyFreeRecipe2Ingredients, 1, 0, 351, 10, 44, 5, 671, 20, "lunch", dairyFreeRecipe2Steps, "/images/nisha-chicken-salad.jpg");
        dairyFreeRepo.save(dairyFreeRecipe2);

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
        paleoSesameChickenIngredients.add("2 tbsp sesame seeds for garnish");
        paleoSesameChickenIngredients.add("Thinly sliced scallions for garnish");

        paleoSesameChickenSteps.add("In a high speed blender, blend together all the sauce ingredients except for the red pepper flakes, until a smooth mixture forms, scraping down the sides to incorporate all the dates if needed.");
        paleoSesameChickenSteps.add("Transfer the sauce to a small saucepan over medium heat. Whisk and heat for 2-3 minutes to a boil, then lower the heat to med-low to simmer. Add the red pepper flakes, then simmer for another 3-4 minutes until the mixture thickens and reduces a bit (it should resemble a thick caramel).");
        paleoSesameChickenSteps.add("Place the arrowroot or tapioca in a shallow bowl along with the salt and pepper.");
        paleoSesameChickenSteps.add("Whisk the eggs in a separate shallow bowl. Drizzle the chicken with the sesame oil and sprinkle with the garlic powder.");
        paleoSesameChickenSteps.add("Coat chicken pieces in whisked egg lightly, then toss in arrowroot starch, shaking off excess, and place in s bowl");
        paleoSesameChickenSteps.add("Heat about 1/2 cup of oil in a large deep non-stick skillet. Once sizzling hot, work in batches to cook the chicken pieces, frying for about 3 minutes until crisp and golden, turning once or twice.");
        paleoSesameChickenSteps.add("Place chicken on a paper-towel-lined plate and repeat the process for the remaining chicken, adjusting the temperature of the heat as needed and adding more oil if needed.");
        paleoSesameChickenSteps.add("Gently reheat the sesame sauce and toss it with the chicken. To serve, sprinkle all over with sesame seeds and green onion and and serve over sautéed cauliflower rice or your favorite veggies. Enjoy!");

        Paleo paleoSesameChickenRecipe = new Paleo("SesameChickenRecipe", 15, "medium", paleoSesameChickenIngredients, 6, 20, 382, 12, 32, 13, 869, 37, "dinner", paleoSesameChickenSteps, "/images/paleo-sesame-chicken.jpg");
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

        Paleo paleoCreamyTuscanChickenRecipe = new Paleo("CreamyTuscanChickenRecipe", 10, "hard", paleoCreamyTuscanChickenIngredients, 6, 20, 368, 25, 23, 5, 253, 12, "dinner", paleoCreamyTuscanChickenSteps, "/images/paleo-tuscan-chicken.jpg");
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

        Paleo paleoSweetPotatoPancakesRecipe = new Paleo("SweetPotatoPancakes", 0, "easy", paleoSweetPotatoPancakesIngredients, 4, 15, 110, 7, 4, 3, 126, 9, "breakfast", paleoSweetPotatoPancakesSteps, "/images/paleo-sweet-potato-pancakes.jpg");
        paleoRepo.save(paleoSweetPotatoPancakesRecipe);


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

        dairyFreeRecipe3Steps.add("Preheat oven to 425°");
        dairyFreeRecipe3Steps.add("Place the asparagus on a rimmed baking sheet and toss with the 1 tbsp olive oil and 1/8 tsp salt. Arrange in single layer, leaving space for the salmon.");
        dairyFreeRecipe3Steps.add("Place the salmon skin side down on the baking sheet. Brush the salmon with the remaining 1 tsp olive oil and season with the remaining 1/8 tsp salt and pepper.");
        dairyFreeRecipe3Steps.add("Bake for 15 minutes or until center of the salmon reaches 165 degrees F and the asparagus spears are tender and beginning to brown at the tips.");
        dairyFreeRecipe3Steps.add("In a small bowl, whisk together the mayonnaise, lemon juice, mustard, and garlic until smooth.");
        dairyFreeRecipe3Steps.add("Divide the salmon and asparagus between two plates and drizzle each serving with half of the mayonnaise sauce.");

        DairyFree dairyFreeRecipe3 = new DairyFree("Sheet Pan Salmon", 5, "medium", dairyFreeRecipe3Ingredients, 2, 15, 384, 27, 27, 4, 533, 10, "dinner", dairyFreeRecipe3Steps, "/images/salmon-asparagus.jpg");
        dairyFreeRepo.save(dairyFreeRecipe3);


        List<String> ketoRecipe1Ingredients = new ArrayList<>();
        List<String> ketoRecipes1Steps = new ArrayList<>();

        ketoRecipe1Ingredients.add("2 lb. Brussels sprouts");
        ketoRecipe1Ingredients.add("2 tbsp. extra-virgin olive oil");
        ketoRecipe1Ingredients.add("2 cloves garlic, minced");
        ketoRecipe1Ingredients.add("1 tsp. freshly chopped thyme");
        ketoRecipe1Ingredients.add("Kosher salt");
        ketoRecipe1Ingredients.add("Freshly ground black pepper");
        ketoRecipe1Ingredients.add("1 c. shredded mozzarella");
        ketoRecipe1Ingredients.add("1/4 c. freshly grated Parmesan");
        ketoRecipe1Ingredients.add("Freshly chopped parsley, for garnish");

        ketoRecipes1Steps.add("Preheat oven to 425° and line a large baking sheet with parchment paper. Prepare an ice bath in a large bowl.");
        ketoRecipes1Steps.add("Blanch Brussels sprouts: Bring a large pot of salted water to a boil. Add Brussels sprouts and cook until bright green and very tender, 8 to 10 minutes. Add Brussels sprouts to ice bath to cool then drain.");
        ketoRecipes1Steps.add("On a large baking sheet, toss blanched Brussels sprouts with oil, garlic, and thyme. Using the end of a small glass or mason jar, press down on Brussels sprouts to smash them into a flat patty. Season each smashed Brussels sprout with salt and pepper, then sprinkle mozzarella and Parmesan on top.");
        ketoRecipes1Steps.add("Bake until bottoms of sprouts are crispy and cheese is melty and golden, 20 to 25 minutes.");
        ketoRecipes1Steps.add("Garnish with parsley and serve warm.");


        Keto ketoRecipe1 = new Keto("Parmesan Crusted Brussels Sprouts", 25, "medium", ketoRecipe1Ingredients, 4, 25, 180, 4, 10, 4, 376, 10, "dinner", ketoRecipes1Steps, "/images/smashed-brussel-sprouts.jpg");
        ketoRepo.save(ketoRecipe1);


        List<String> veganSouthwestSkilletIngredients = new ArrayList<>();
        List<String> veganSouthwestSkilletSteps = new ArrayList<>();

        veganSouthwestSkilletIngredients.add("1 cup sliced mushrooms");
        veganSouthwestSkilletIngredients.add("1 cup diced zucchini");
        veganSouthwestSkilletIngredients.add("1/2 cup onion, red or white");
        veganSouthwestSkilletIngredients.add("1/2 chopped green onion");
        veganSouthwestSkilletIngredients.add("handful of fresh chopped cilantro");
        veganSouthwestSkilletIngredients.add("1/2 a red bell pepper, diced");
        veganSouthwestSkilletIngredients.add("1 sliced vegan sausage");
        veganSouthwestSkilletIngredients.add("1 tsp garlic powder");
        veganSouthwestSkilletIngredients.add("1 tsp chili powder");
        veganSouthwestSkilletIngredients.add("1/2 tsp cumin");
        veganSouthwestSkilletIngredients.add("1/2 tsp paprika");
        veganSouthwestSkilletIngredients.add("salt and pepper, to taste");
        veganSouthwestSkilletIngredients.add("avocado, for serving");
        veganSouthwestSkilletIngredients.add("salsa, for serving");

        veganSouthwestSkilletSteps.add("Add everything except the avocado and salsa to a skillet.");
        veganSouthwestSkilletSteps.add("Cook over medium-high heat until the veggies are softened and nicely browned, about 6-7 minutes.");
        veganSouthwestSkilletSteps.add("Season with salt and pepper.");
        veganSouthwestSkilletSteps.add("Top with avocado, salsa, extra chopped green onion and fresh cilantro. ");
        veganSouthwestSkilletSteps.add("Serve Immediately; Enjoy!");

        Vegan veganSouthwestSkillet = new Vegan("Southwest Skillet", 5, "easy", veganSouthwestSkilletIngredients, 1, 10, 361, 12, 34, 12, 202, 31, "breakfast", veganSouthwestSkilletSteps, "/images/vegan-southwest-skillet.png");
        veganRepo.save(veganSouthwestSkillet);


        List<String> veganBlueberryCoconutMuffinsIngredients = new ArrayList<>();
        List<String> veganBlueberryCoconutMuffinsSteps = new ArrayList<>();

        veganBlueberryCoconutMuffinsIngredients.add("1 flax egg  (1 tbsp ground flax seeds mixed with 3 tbsp water)");
        veganBlueberryCoconutMuffinsIngredients.add("1 ¾ cups whole wheat pastry flour");
        veganBlueberryCoconutMuffinsIngredients.add("¾ cup unsweetened shredded coconut");
        veganBlueberryCoconutMuffinsIngredients.add("2 ½ tsp baking powder");
        veganBlueberryCoconutMuffinsIngredients.add("½ tsp salt");
        veganBlueberryCoconutMuffinsIngredients.add("¾ cup coconut oil, softened");
        veganBlueberryCoconutMuffinsIngredients.add("½ cup maple syrup or agave nectar");
        veganBlueberryCoconutMuffinsIngredients.add("¼ cup sugar");
        veganBlueberryCoconutMuffinsIngredients.add("¾ cup unsweetened non dairy milk, lukewarm");
        veganBlueberryCoconutMuffinsIngredients.add("1 to 1 ½ cups blueberries (fresh or frozen)");
        veganBlueberryCoconutMuffinsIngredients.add("Cooking spray");

        veganBlueberryCoconutMuffinsSteps.add("Preheat the oven at 400°F.");
        veganBlueberryCoconutMuffinsSteps.add("Line a muffin pan with 12 liners and coat them with cooking spray.");
        veganBlueberryCoconutMuffinsSteps.add("Combine the ground flax seeds with 3 tbsp water In a small bowl. Set aside.");
        veganBlueberryCoconutMuffinsSteps.add("Combine the flour, shredded coconut, baking powder and salt in a medium bowl and set aside.");
        veganBlueberryCoconutMuffinsSteps.add("Using an electric mixer, beat the coconut oil, maple syrup or agave and sugar together at medium speed until creamy, 2-3 minutes.");
        veganBlueberryCoconutMuffinsSteps.add("Add the milk and flax mixture and keep beating until well combined (the mixture might look curdled).");
        veganBlueberryCoconutMuffinsSteps.add("Add the flour mixture and beat at low speed until just combined (do not overmix).");
        veganBlueberryCoconutMuffinsSteps.add("Gently fold in the blueberries using a wooden spoon or a spatula.");
        veganBlueberryCoconutMuffinsSteps.add("Scoop about ¼ cup of batter into the muffin liners.");
        veganBlueberryCoconutMuffinsSteps.add("Bake for 25-30 minutes");

        Vegan veganBlueberryCoconutMuffins = new Vegan("Blueberry Coconut Muffins", 15, "hard", veganBlueberryCoconutMuffinsIngredients, 12, 30, 238, 15, 2, 14, 121, 24, "breakfast", veganBlueberryCoconutMuffinsSteps, "/images/vegan-blueberry-coconut-muffins.png");
        veganRepo.save(veganBlueberryCoconutMuffins);


        List<String> veganBreakfastBurritosIngredients = new ArrayList<>();
        List<String> veganBreakfastBurritosSteps = new ArrayList<>();

        veganBreakfastBurritosIngredients.add("1 diced bell pepper or sweet potato");
        veganBreakfastBurritosIngredients.add("1/2 cup diced vegetables of choice");
        veganBreakfastBurritosIngredients.add("16 oz tofu, silken or firm");
        veganBreakfastBurritosIngredients.add("optional 1 tbsp minced garlic");
        veganBreakfastBurritosIngredients.add("optional 1 tbsp nutritional yeast");
        veganBreakfastBurritosIngredients.add("1 tsp each: curry powder and onion powder");
        veganBreakfastBurritosIngredients.add("1/2 tsp ground turmeric");
        veganBreakfastBurritosIngredients.add("1/2 tsp salt, and optional pinch black pepper");
        veganBreakfastBurritosIngredients.add("1 handful spinach or kale if desired");
        veganBreakfastBurritosIngredients.add("tortillas (your choice of size)");
        veganBreakfastBurritosIngredients.add("burrito add-ins of choice, such as vegan cheese, salsa, hash browns, or sliced avocado");

        veganBreakfastBurritosSteps.add("Grease a nonstick pan using either oil or cooking spray to prevent sticking.");
        veganBreakfastBurritosSteps.add("Sauté the vegetables (and optional garlic) over medium heat until lightly browned.");
        veganBreakfastBurritosSteps.add("Drain the tofu and add it to the pan.");
        veganBreakfastBurritosSteps.add("Break it up with a spatula.");
        veganBreakfastBurritosSteps.add("Add spices and salt.");
        veganBreakfastBurritosSteps.add("Continue cooking—stirring occasionally—until tofu is hot and the liquid has evaporated so it looks like scrambled eggs.");
        veganBreakfastBurritosSteps.add("Stir in optional spinach until it wilts.");
        veganBreakfastBurritosSteps.add("Portion into the middle of each tortilla (see recipe video for a visual), add toppings if desired, and wrap up tightly.");
        veganBreakfastBurritosSteps.add("Burritos can be served immediately or wrapped in foil and refrigerated or frozen in a resealable bag or airtight container.");

        Vegan veganBreakfastBurritos = new Vegan("Breakfast Burritos", 15, "medium", veganBreakfastBurritosIngredients, 6, 15, 124, 4, 12, 4, 431, 10, "breakfast", veganBreakfastBurritosSteps, "/images/vegan-breakfast-burritos.png");
        veganRepo.save(veganBreakfastBurritos);


        List<String> veganGyrosIngredients = new ArrayList<>();
        List<String> veganGyrosSteps = new ArrayList<>();

        veganGyrosIngredients.add("12 oz sliced mushrooms , white, or a mix of cremini, white, bella");
        veganGyrosIngredients.add("1/2 cup sliced onion");
        veganGyrosIngredients.add("2 tbsp vegan Worcestershire sauce");
        veganGyrosIngredients.add("4 tsp shawarma spice blend");
        veganGyrosIngredients.add("1 tsp sugar or other sweetener");
        veganGyrosIngredients.add("Optional addins: 2 cloves of garlic minced , salt if needed");
        veganGyrosIngredients.add("sliced onion, cucumber, tomato");
        veganGyrosIngredients.add("chopped lettuce or greens, pickles");
        veganGyrosIngredients.add("3 Pita breads");
        veganGyrosIngredients.add("For the tzatziki sauce:");
        veganGyrosIngredients.add("7 oz firm tofu , drained");
        veganGyrosIngredients.add("1/2 tsp garlic powder or 1 cloves of garlic");
        veganGyrosIngredients.add("1 tablespoon lemon juice");
        veganGyrosIngredients.add("1 teaspoon white vinegar");
        veganGyrosIngredients.add("1/4 teaspoon salt");
        veganGyrosIngredients.add("1/8 teaspoon black pepper");
        veganGyrosIngredients.add("1 teaspoon dried dill or 1 tbsp fresh");
        veganGyrosIngredients.add("1/2 English cucumber , peeled and cubed");

        veganGyrosSteps.add("Add everything to a saucepan, cover and cook over medium heat.");
        veganGyrosSteps.add("Add 1/4 cup water to deglaze after 5 mins.");
        veganGyrosSteps.add("Cover and Cook for another 6 to 8 mins or until mushrooms are tender to preference.");
        veganGyrosSteps.add("Slice onions, cucumber and tomatoes if using.");
        veganGyrosSteps.add("Chop up some greens or lettuce.");
        veganGyrosSteps.add("Warm the pita bread.");
        veganGyrosSteps.add("For the tzatziki sauce:");
        veganGyrosSteps.add("Process the tofu through black pepper in a food processor until smooth. Add tbsp water if needed.");
        veganGyrosSteps.add("Add dill and cucumber and pulse until cucumber is evenly chopped.");
        veganGyrosSteps.add("Taste and adjust salt.");
        veganGyrosSteps.add("Assemble: Add greens if using, add the mushrooms, cucumber, onion, tomato and a generous helping of tzatziki (see below). Serve immediately.");

        Vegan veganGyros = new Vegan("Gyros", 10, "easy", veganGyrosIngredients, 3, 25, 220, 4, 13, 7, 351, 33, "lunch", veganGyrosSteps, "/images/vegan-gyros.png");
        veganRepo.save(veganGyros);




    }
}