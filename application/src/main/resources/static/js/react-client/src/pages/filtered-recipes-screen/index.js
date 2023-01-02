import React, { useEffect, useState } from 'react';
import { useHistory, useParams } from 'react-router-dom';

import Axios from 'axios';

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
      <h2>Your Recipes:</h2>
      {recipesToDisplay.map(recipe => {
        console.log(recipe);
        return (
          <div>
            <img src={recipe.imageUrl} alt='' />
            <h2 onClick={() => renderRedirect(recipe.id)}>{recipe.recipeName}</h2>
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
      })}
    </div>
  );
}

export default FilteredRecipesScreen;
