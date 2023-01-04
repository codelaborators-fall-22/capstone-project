import DairyFreeImg from '../../assets/chopsticks-dairy-free.jpg';
import GlutenFreeBeef from '../../assets/beef-glutenfree.jpg';
import KetoImg from '../../assets/pizza-keto.jpg';
import MediterraneanImg from '../../assets/tomato-mediterranean.jpg';
import PaleoImg from '../../assets/shrimp-paleo.jpg';
import React from 'react';
import spoonsHeroImg from '../../assets/pexels-pixabay-357743.jpeg';
import style from './style.module.scss';
import { useHistory } from 'react-router-dom';
import veganImg from '../../assets/veggies-vegan.jpg';

const HomeScreen = () => {
  const history = useHistory();


  return (
    <div>
        <div className={style.subheader}>
          <img src={spoonsHeroImg}  alt="spoons hero image"/>
          
          <div>
            <h2 className={style.h2}>RecipeMe</h2>
            <h3 className={style.h3}> Organized, Tasty, Handpicked</h3>
            <button className={style.homeScreenMainRecipeBtn} onClick = { ()=>history.push("/recipes") }>Find recipes</button>
          </div>

        </div>
          

        <div className={style.recipeCategories}>
            <div className={style.categoryContainer}>
              <img src={DairyFreeImg} alt="dairy free image"/>
              <h4>Dairy Free Recipes</h4>
              <p>The dairy free diet avoids all products containing or made from mammal milk. This includes, but is not limited to, milk, butter, yogurt, and cheese. While this diet is similar to other plant-based diets, it allows other animal products such as meat, fish, and eggs.</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=>history.push("/recipes/dairy-free") }>See more →</button>
            </div>
       
            <div className={style.categoryContainer}>
              <img src={GlutenFreeBeef} alt="gluten free beef image" />
              <h4>Gluten Free Recipes</h4>
              <p>The gluten free diet is primarily used for managing signs and symptoms of celiac disease. It excludes foods containing any gluten. Gluten is a protein found in wheat, barley, rye, and triticale. All other foods are allowed in this diet.</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=>history.push("/recipes/gluten-free") }>See more →</button>
              </div>
  
            <div className={style.categoryContainer}>
            <img src={KetoImg} alt="Keto Image"/>
              <h4>Keto Recipes</h4>
              <p>The keto diet is designed to keep the body in a nearly-constant state of ketosis. This means the body creates ketones from fat instead of carbs to use as the body's primary energy source. This includes a diet high in fats, moderate in proteins, and very minimal carbs.</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=> history.push("/recipes/keto") }>See more →</button>
            </div>
      
            <div className={style.categoryContainer}>
              <img src={MediterraneanImg} alt="Mediterranean Image"/>
              <h4>Mediterranean Recipes</h4>
              <p>The mediterranean diet promotes increased consumption of heart-healthy foods. Heart-healthy foods include vegetables, fish, fruits, grains, olive oil, and nuts. Red meats are avoided and dairy products kept to a minimum.</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=> history.push("/recipes/mediterranean") }>See more →</button>
            </div>
        
            <div className={style.categoryContainer}>
              <img src={PaleoImg} alt="Paleo Image"/>
              <h4>Paleo Recipes</h4>
              <p>The paleo diet is very similar to the keto diet. While meats are a main component of both, paleo also includes fish, vegetables, fruit, nuts, and seeds. Grains, dairy, processed foods, beans, legumes, and sugars are avoided.</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=>history.push("/recipes/paleo") }>See more →</button>
            </div>

            <div className={style.categoryContainer}>
              <img src={veganImg} alt="vegan recipe image"/>
              <h4>Vegan Recipes</h4>
              <p>The vegan diet excludes any animal-based products. It focuses on plant-based foods such as vegetables and legumes. Meats, eggs, dairy, and honey are all avoided.</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=> history.push("/recipes/vegan") }>See more →</button>
        </div>
     </div>
        
    </div>
  );
}

export default HomeScreen;
