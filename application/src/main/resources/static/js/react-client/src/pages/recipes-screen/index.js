import React from 'react';
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
        //img
        <button onClick={() => history.push("recipes/dairy-free")}>Dairy Free</button>
      </div> 
      
      <div className={style.categoryContainer}>
        //img
        <button onClick={() => history.push("recipes/gluten-free")}>Gluten Free</button>
      </div>

      <div className={style.categoryContainer}>
        <button onClick={() => history.push("recipes/keto")}>Keto</button>
      </div>

      <div className={style.categoryContainer}>
        <button onClick={() => history.push("recipes/mediterranean")}>Mediterranean</button>
      </div>

      <div className={style.categoryContainer}>
         <button onClick={() => history.push("recipes/paleo")}>Paleo</button>
      </div>

      <div className={style.categoryContainer}>
        <button onClick={() => history.push("recipes/vegan")}>Vegan</button>
      </div>
    </div>
    </div>

    <div>
      <h2 className={style.subheader}>Meal Types</h2>
      
      <div className={style.recipeMealType}>
        <button onClick={() => history.push("recipes/breakfast")}>Breakfast</button>
        <button onClick={() => history.push("recipes/lunch")}>Lunch</button>
        <button onClick={() => history.push("recipes/dinner")}>Dinner</button>
      </div>
    </div>

    <div> 
      <h2 className={style.subheader}>Difficulty Level</h2>
      
      <button onClick={() => history.push("recipes/easy")}>Easy</button>
      <button onClick={() => history.push("recipes/medium")}>Medium</button>
      <button onClick={() => history.push("recipes/hard")}>Hard</button>
    </div>
</div>
  )
}


export default RecipesScreen;
