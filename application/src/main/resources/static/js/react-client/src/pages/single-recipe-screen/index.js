import React from 'react'
import { useEffect, useState } from 'react';
import { useParams } from 'react-router';
import Axios from 'axios';
import style from './style.module.scss';

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
    
        <div>
            <img src={recipe.imageUrl} alt='' />
            <h2 className={style.nameOfRecipe}>{recipe.recipeName}</h2>
            <h3>Difficulty: {recipe.difficultyLevel}</h3>
            <p>Ingredients</p>
            {recipe.ingredients.map(ingredient => {
              return (
                <li>{ingredient}</li>
              )
            })}
           <div>
            <h2>Prep Time:{recipe.prepTime}</h2>
           </div>
           <h2>Meal Type:{recipe.mealType}</h2>
           <h2>Serving Size:{recipe.servingSize}</h2>
           <h2>Calories:{recipe.calories}</h2>
           <h2>Carbs:{recipe.carbs}</h2>
           <h2>Fat:{recipe.fat}</h2>
           <h2>Protein:{recipe.protein}</h2>
           <h2>Sodium:{recipe.sodium}</h2>
           <h2>Sugar:{recipe.sugar}</h2>
           <h2>Steps</h2>
            <ol> 
           {recipe.steps.map(ingredient => {
              return (
                <li>{ingredient}</li>
              )
            })}
            </ol>
        </div>
    )
}

export default SingleRecipeScreen