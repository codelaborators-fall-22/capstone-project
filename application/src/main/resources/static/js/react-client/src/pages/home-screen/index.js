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
          <h2>Website Name</h2>
          <h3>Description of website</h3>
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
