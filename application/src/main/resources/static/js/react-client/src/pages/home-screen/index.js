import React from 'react';

import spoonsHeroImg from '../../assets/pexels-pixabay-357743.jpeg';
import style from './style.module.scss';

import { useHistory } from 'react-router-dom';



const HomeScreen = () => {
  const history = useHistory();





  return (
    <div>
        <div className={style.subheader}>
          <img src={spoonsHeroImg}  alt="spoons hero image"/>
          <h2>Website Name</h2>
          <h3>Description of website</h3>
        </div>
          

        <div className={style.recipeCategories}>
            <div className={style.categoryContainer}>
              <img src="insert dairy free img here" alt="dairy free recipe image" className="dairyFreeImg"/>
              <h4>Dairy Free Recipes</h4>
              <p>Dairy Free Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=>history.push("/recipes/dairy-free") }>Click here to see dairy-free recipes →</button>
            </div>
       
            <div className={style.categoryContainer}>
              <img src="gluten free" alt="gluten free recipe image" className="glutenFreeImg"/>
              <h4>Gluten Free Recipes</h4>
              <p>Gluten Free Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=>history.push("/recipes/gluten-free") }>Click here to see gluten-free recipes →</button>
              </div>
  
            <div className={style.categoryContainer}>
            <img src="insert keto img here" alt="keto recipe image" className="ketoImg"/>
              <h4>Keto Recipes</h4>
              <p>Keto Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=> history.push("/recipes/keto") }>Click here to see keto recipes →</button>
            </div>
      
            <div className={style.categoryContainer}>
              <img src="insert mediterranean img here" alt="mediterranean recipe image" className="mediterraneanImg"/>
              <h4>Mediterranean Recipes</h4>
              <p>Mediterranean Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=> history.push("/recipes/mediterranean") }>Click here to see mediterranean recipes →</button>
            </div>
        
            <div className={style.categoryContainer}>
              <img src="insert paleo img here" alt="paleo recipe image" className="paleoImg"/>
              <h4>Paleo Recipes</h4>
              <p>Paleo Description</p>
              <button className="homeScreenRecipeCategoryBtn" onClick = { ()=>history.push("/recipes/paleo") }>Click here to see paleo recipes →</button>
            </div>

            <div className={style.categoryContainer}>
              <img src="insert vegan img here" alt="vegan recipe image" className="veganImg"/>
              <h4>Vegan Recipes</h4>
              <p>Vegan Description</p>
              <button className={style.homeScreenRecipeCatBtn}>See more →</button>

    
  
    
       
        </div>
     
        
    </div>
  );
}

export default HomeScreen;
