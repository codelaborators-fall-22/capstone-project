import React from 'react';

import spoonsHeroImg from '../../assets/pexels-pixabay-357743.jpeg';
import GlutenFreeBeef from '../../assets/beef-glutenfree.jpg';
import DairyFreeImg from '../../assets/chopsticks-dairy-free.jpg';
import KetoImg from '../../assets/pizza-keto.jpg';
import PaleoImg from '../../assets/shrimp-paleo.jpg';
import MediterraneanImg from '../../assets/tomato-mediterranean.jpg';
import veganImg from '../../assets/veggies-vegan.jpg';


import style from './style.module.scss';

import { useHistory } from 'react-router-dom';



const HomeScreen = () => {
  const history = useHistory();





  return (
    <div>
        <div className={style.subheader}>
          <img src={spoonsHeroImg}  alt="spoons hero image"/>
          <h2 className={style.h2}>RecipeMe</h2>
          <h3 className={style.h3}>Dietary restrictions can be very challenging for some people, but with a little careful planning, you can make dietary restrictions work for you. Our recipes are designed to help people accomodate their needs.</h3>
        </div>
          

        <div className={style.recipeCategories}>
            <div className={style.categoryContainer}>
              <img src={DairyFreeImg} alt="dairy free image"/>
              <h4>Dairy Free Recipes</h4>
              <p>Dairy Free Description</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=>history.push("/recipes/dairy-free") }>See more →</button>
            </div>
       
            <div className={style.categoryContainer}>
              <img src={GlutenFreeBeef} alt="gluten free beef image" />
              <h4>Gluten Free Recipes</h4>
              <p>Gluten Free Description</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=>history.push("/recipes/gluten-free") }>See more →</button>
              </div>
  
            <div className={style.categoryContainer}>
            <img src={KetoImg} alt="Keto Image"/>
              <h4>Keto Recipes</h4>
              <p>Keto Description</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=> history.push("/recipes/keto") }>See more →</button>
            </div>
      
            <div className={style.categoryContainer}>
              <img src={MediterraneanImg} alt="Mediterranean Image"/>
              <h4>Mediterranean Recipes</h4>
              <p>Mediterranean Description</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=> history.push("/recipes/mediterranean") }>See more →</button>
            </div>
        
            <div className={style.categoryContainer}>
              <img src={PaleoImg} alt="Paleo Image"/>
              <h4>Paleo Recipes</h4>
              <p>Paleo Description</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=>history.push("/recipes/paleo") }>See more →</button>
            </div>

            <div className={style.categoryContainer}>
              <img src={veganImg} alt="vegan recipe image"/>
              <h4>Vegan Recipes</h4>
              <p>Vegan Description</p>
              <button className={style.homeScreenRecipeCatBtn} onClick = { ()=> history.push("/recipes/vegan") }>See more →</button>

    
  
    
       
        </div>
     </div>
        
    </div>
  );
}

export default HomeScreen;
