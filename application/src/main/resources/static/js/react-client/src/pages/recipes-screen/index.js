import React from 'react';


const RecipesScreen = () => {
  return (
    <div>
      <h2>What recipes are you in the mood for? </h2>
      <button onClick={() => "accessDairyFreeRecipes()"}>Dairy Free</button>
      <button onClick={() => "accessglutenFreeRecipes()"}>Gluten Free</button>
      <button onClick={() => "accessKetoRecipes()"}>Keto</button>
      <button onClick={() => "accessMediterraneanRecipes()"}>Mediterranean</button>
      <button onClick={() => "accessPaleoRecipes()"}>Paleo</button>
      <button onClick={() => "accessVeganRecipes()"}>Vegan</button>

    </div>
  )
  

}


export default RecipesScreen;
