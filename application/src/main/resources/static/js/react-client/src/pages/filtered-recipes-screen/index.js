import React from 'react';

const FilteredRecipesScreen = () => {
  return (
    <div>
      <table>
        <button class="recipeScreenRecipeCategoryBtn">Dairy Free</button>
        <button class="recipeScreenRecipeCategoryBtn">Gluten Free</button>
        <button class="recipeScreenRecipeCategoryBtn">Keto</button>
        <button class="recipeScreenRecipeCategoryBtn">Mediterranean</button>
        <button class="recipeScreenRecipeCategoryBtn">Paleo</button>
      </table>
    </div>
  );
}

export default FilteredRecipesScreen;
