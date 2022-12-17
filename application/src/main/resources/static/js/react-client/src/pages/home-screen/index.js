import React from 'react';

const HomeScreen = () => {
  return (
    <div>
        <div className="subheader">
          <h2>Website Name</h2>
          <h3>Description of website</h3>
        </div>
          
        <div class="dairyfree">
            <div class="dairyFreeContainer">
              <h4>Dairy Free Recipes</h4>
              <p>Dairy Free Description</p>
              <button class="homeScreenRecipeCategoryBtn">Click here to see dairy-free recipes →</button>
            </div>
            <img src="insert dairy free img here" alt="dairy free recipe image"></img>
        </div>
        <div class="glutenfree">
            <img src="insert gluten free img here" alt="gluten free recipe image"></img>
            <div class="glutenFreeContainer">
              <h4>Gluten Free Recipes</h4>
              <p>Gluten Free Description</p>
              <button class="homeScreenRecipeCategoryBtn">Click here to see gluten-free recipes →</button>
            </div>
        </div>
        <div class="keto">
            <div class="ketoContainer">
              <h4>Keto Recipes</h4>
              <p>Keto Description</p>
              <button class="homeScreenRecipeCategoryBtn">Click here to see keto recipes →</button>
            </div>
            <img src="insert keto img here" alt="keto recipe image"></img>
        </div>
        <div class="mediterranean">
            <img src="insert mediterranean img here" alt="mediterranean recipe image"></img>
            <div class="mediterraneanContainer">
              <h4>Mediterranean Recipes</h4>
              <p>Mediterranean Description</p>
              <button class="homeScreenRecipeCategoryBtn">Click here to see mediterranean recipes →</button>
            </div>
        </div>
        <div class="paleo">
            <div class="paleoContainer">
                <h4>Paleo Recipes</h4>
                <p>Paleo Description</p>
                <button class="homeScreenRecipeCategoryBtn">Click here to see paleo recipes →</button>
            <img src="insert paleo img here" alt="paleo recipe image"></img>
            </div>
        </div>
    </div>
  );
}

export default HomeScreen;
