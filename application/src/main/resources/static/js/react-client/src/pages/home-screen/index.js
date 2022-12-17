import React from 'react';
import { useHistory } from 'react-router-dom';


const HomeScreen = () => {
  const history = useHistory();





  return (
    <div>
        <div className="subheader">
          <h2>Website Name</h2>
          <h3>Description of website</h3>
        </div>
          
        <div className="dairyfree">
            <div className="dairyFreeContainer">
              <h4>Dairy Free Recipes</h4>
              <p>Dairy Free Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=>history.push("/recipes/dairy-free") }>Click here to see dairy-free recipes →</button>
            </div>
            <img src="insert dairy free img here" alt="dairy free recipe image"></img>
        </div>
        <div className="glutenfree">
            <img src="insert gluten free img here" alt="gluten free recipe image"></img>
            <div className="glutenFreeContainer">
              <h4>Gluten Free Recipes</h4>
              <p>Gluten Free Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=>history.push("/recipes/gluten-free") }>Click here to see gluten-free recipes →</button>
            </div>
        </div>
        <div className="keto">
            <div className="ketoContainer">
              <h4>Keto Recipes</h4>
              <p>Keto Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=> history.push("/recipes/keto") }>Click here to see keto recipes →</button>
            </div>
            <img src="insert keto img here" alt="keto recipe image"></img>
        </div>
        <div className="mediterranean">
            <img src="insert mediterranean img here" alt="mediterranean recipe image"></img>
            <div className="mediterraneanContainer">
              <h4>Mediterranean Recipes</h4>
              <p>Mediterranean Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=> history.push("/recipes/mediterranean") }>Click here to see mediterranean recipes →</button>
            </div>
        </div>
        <div className="paleo">
            <div className="paleoContainer">
                <h4>Paleo Recipes</h4>
                <p>Paleo Description</p>
                <button className="homeScreenRecipeCategoryBtn" onClick = { ()=>history.push("/recipes/paleo") }>Click here to see paleo recipes →</button>
            <img src="insert paleo img here" alt="paleo recipe image"></img>
            </div>
        </div>
    </div>
  );
}

export default HomeScreen;
