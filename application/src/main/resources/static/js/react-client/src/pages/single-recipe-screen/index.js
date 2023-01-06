import { useEffect, useState } from 'react';

import Axios from 'axios';
import React from 'react'
import style from './style.module.scss';
import { useParams } from 'react-router';

const SingleRecipeScreen = () => {

    const id = useParams();
    const [recipe, setRecipe] = useState(null);

    useEffect(() => {

      const fetchData = async () => {
            const result = await Axios(`http://localhost:8080/recipes/recipe/${id.id}`);
            setRecipe(result.data);

        }   
      
        fetchData();


    }, [id.id]);
    

  return (
        recipe === null ? <h2>Loading...</h2>:
    
        <div className={style.container}>
            <h2 className={style.nameOfRecipe}>{recipe.recipeName}</h2>
              
            <div className={style.subheaderGrid}>
                <img src={recipe.imageUrl} alt='' />
                <div className={style.headerText}>
                  <div className={style.filters}>
                    <h2>Difficulty: {recipe.difficultyLevel}</h2>
                    <h2>Prep Time:{recipe.prepTime}</h2>
                    <h2>Meal Type:{recipe.mealType}</h2>
                    <h2>Serving Size:{recipe.servingSize}</h2>
                  </div>
                
                  <div className={style.nutritionLabel}>
                    <h2>Calories:{recipe.calories}</h2>
                    <h2>Carbs:{recipe.carbs}</h2>
                    <h2>Fat:{recipe.fat}</h2>
                    <h2>Protein:{recipe.protein}</h2>
                    <h2>Sodium:{recipe.sodium}</h2>
                    <h2>Sugar:{recipe.sugar}</h2>
                  </div>
                </div>
            </div>
        
          <h2 className={style.subheader}>Ingredients</h2>
            {recipe.ingredients.map(ingredient => {
              return (
                <li className={style.ingredient}>{ingredient}</li>
              )
            })}
          
           <h2 className={style.subheader}>Steps</h2>
            <ol> 
           {recipe.steps.map(ingredient => {
              return (
                <li className={style.ingredient}>{ingredient}</li>
              )
            })}
            </ol>
        </div>
    )
}

export default SingleRecipeScreen