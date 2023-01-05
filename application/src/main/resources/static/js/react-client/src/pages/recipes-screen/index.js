import BreakfastImage from '../../assets/coffee.png';
import DairyFreeImage from '../../assets/dairy-free (2).png';
import DinnerImage from '../../assets/dinner.png';
import Easy from '../../assets/level 1.png';
import GlutenFreeImage from '../../assets/gluten-free (1).png';
import Hard from '../../assets/level 3.png';
import KetoImage from '../../assets/ketogenic-diet.png';
import LunchImage from '../../assets/lunch.png';
import MediterraneanImage from '../../assets/olive-oil (1).png';
import Medium from '../../assets/statistics.png';
import PaleoImage from '../../assets/paleo.png';
import React from 'react';
import VeganImage from '../../assets/leaf.png';
import style from './style.module.scss';
import { useHistory } from 'react-router-dom';
const RecipesScreen = () => {
const history = useHistory();

  return (
    <div>
      <div>
        
      <h2 className={style.subheader}> What recipes are you in the mood for? </h2>
        
      <div className={style.recipeCategories}>
        <div className={style.categoryContainer}>
          <img src={DairyFreeImage} alt="dairy free image"/>
          <button className={style.recipeScreenRecipeCatBtn} onClick={() => history.push("recipes/dairy-free")}>Dairy Free</button>
        </div> 
        
        <div className={style.categoryContainer}>
          <img src={GlutenFreeImage} alt="gluten free image"/>
          <button className={style.recipeScreenRecipeCatBtn} onClick={() => history.push("recipes/gluten-free")}>Gluten Free</button>
        </div>

        <div className={style.categoryContainer}>
          <img src={KetoImage} alt="keto image"/>
          <button className={style.recipeScreenRecipeCatBtn} onClick={() => history.push("recipes/keto")}>Keto</button>
        </div>

        <div className={style.categoryContainer}>
          <img src={MediterraneanImage} alt="mediterranean image"/>
          <button className={style.recipeScreenRecipeCatBtn} onClick={() => history.push("recipes/mediterranean")}>Mediterranean</button>
        </div>

        <div className={style.categoryContainer}>
          <img src={PaleoImage} alt="paleo image"/>
          <button className={style.recipeScreenRecipeCatBtn} onClick={() => history.push("recipes/paleo")}>Paleo</button>
        </div>

        <div className={style.categoryContainer}>
          <img src={VeganImage} alt="vegan image"/>
          <button className={style.recipeScreenRecipeCatBtn} onClick={() => history.push("recipes/vegan")}>Vegan</button>
        </div>
      </div>
      </div>

      <div>
        <h2 className={style.subheader}>Meal Types</h2>
        
        <div className={style.recipeMealType}>
          <div className={style.mealTypeContainer}>
            <img src={BreakfastImage} alt="breakfast image"/>
            <button className={style.recipeScreenMealTypeBtn} onClick={() => history.push("recipes/breakfast")}>Breakfast</button>
          </div>
          
          <div className={style.mealTypeContainer}>
            <img src={LunchImage} alt="lunch image"/>
            <button className={style.recipeScreenMealTypeBtn} onClick={() => history.push("recipes/lunch")}>Lunch</button>
          </div>
          
          <div className={style.mealTypeContainer}>
            <img src={DinnerImage} alt="dinner image"/>
            <button className={style.recipeScreenMealTypeBtn} onClick={() => history.push("recipes/dinner")}>Dinner</button>
          </div>
        </div>
      </div>

      <div> 
        <h2 className={style.subheader}>Difficulty Level</h2>
        
        <div className={style.recipeDifficulty}>
        
          <div className={style.difficultyContainer}>
            <img src={Easy} alt="easy difficulty level image"/>
            <button className={style.recipeScreenDifficultyLevelBtn} onClick={() => history.push("recipes/easy")}>Easy</button>
          </div>

          <div className={style.difficultyContainer}>  
            <img src={Medium} alt="medium defficulty level image"/>
            <button className={style.recipeScreenDifficultyLevelBtn} onClick={() => history.push("recipes/medium")}>Medium</button>
          </div>
            
          <div className={style.difficultyContainer}> 
            <img src={Hard} alt="hard diffulty level image"/>
            <button className={style.recipeScreenDifficultyLevelBtn} onClick={() => history.push("recipes/hard")}>Hard</button>
          </div>  
        </div>
      </div>
</div>
  )
}


export default RecipesScreen;
