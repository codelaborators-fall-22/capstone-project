import React, { useEffect, useState } from 'react';
import { useHistory, useParams } from 'react-router-dom';

import Axios from 'axios';
import style from './style.module.scss';

const FilteredRecipesScreen = () => {
  const category = useParams();
  console.log(category.category);

  //state variables: state is a moment of time for a variable in your application
  const [recipesToDisplay, setRecipesToDisplay] = useState([]);

  //a React tool that handles component lifecycle 
  //Lifecycle consists of mounting, display and calls to the API
  useEffect(() => {

    const fetchData = async () => {
      if (category.category === 'breakfast' || category.category === 'lunch' || category.category === 'dinner') {
        const result = await Axios(`http://localhost:8080/recipes/meal/${category.category}`);
        console.log(result);
        setRecipesToDisplay(result.data);
      }
      else {
        const result = await Axios(`http://localhost:8080/recipes/${category.category}`);
        console.log(result);
        setRecipesToDisplay(result.data);
      }
    }

    fetchData();

  }, []);

  const history = useHistory();

  const renderRedirect = (id) => {
    return history.push(`/recipes/recipe/${id}`)

  }


  return (
    <div>
      <h2 className={style.recipeTitle}>Your Recipes:</h2>

      <div className={style.recipeContainer}>
      {recipesToDisplay.map(recipe => {
        console.log(recipe);
        return (
          <div>
            <img className={style.photo} src={recipe.imageUrl} alt='' />
            <h2 className={style.recipeFilterScreenRecipeBtn} onClick={() => renderRedirect(recipe.id)}>{recipe.recipeName}</h2>
            
            <div className={style.subheader}>
              <h2>Difficulty: <span className={style.subheaderSpan}>{recipe.difficultyLevel}</span></h2>
              <h2>Prep Time: <span className={style.subheaderSpan}>{recipe.prepTime}</span></h2>
              <h2>Meal Type: <span className={style.subheaderSpan}>{recipe.mealType}</span></h2>
              <h2>Serving Size: <span className={style.subheaderSpan}>{recipe.servingSize}</span></h2>
            </div>
            
            <div className={style.paragraph}>
              <h2>Calories: <span className={style.nutritionLabelSpan}> {recipe.calories} </span></h2>
              <h2>Carbs: <span className={style.nutritionLabelSpan}> {recipe.carbs}</span></h2>
              <h2>Fat: <span className={style.nutritionLabelSpan}> {recipe.fat}</span></h2>
              <h2>Protein: <span className={style.nutritionLabelSpan}> {recipe.protein}</span></h2>
              <h2>Sodium: <span className={style.nutritionLabelSpan}> {recipe.sodium}</span></h2>
              <h2>Sugar: <span className={style.nutritionLabelSpan}> {recipe.sugar}</span></h2>
            </div>
          </div>

        )
      })}
      </div>
    </div>
  );
}

export default FilteredRecipesScreen;
