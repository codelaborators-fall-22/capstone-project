import React from 'react';
import spoonsHeroImg from '../../assets/pexels-pixabay-357743.jpeg';
import style from './style.module.scss';

const HomeScreen = () => {
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
              <button className={style.homeScreenRecipeCatBtn}>See more →</button>
            </div>
       
            <div className={style.categoryContainer}>
              <img src="gluten free" alt="gluten free recipe image" className="glutenFreeImg"/>
              <h4>Gluten Free Recipes</h4>
              <p>Gluten Free Description</p>
              <button className={style.homeScreenRecipeCatBtn}>See more →</button>
              </div>
  
            <div className={style.categoryContainer}>
            <img src="insert keto img here" alt="keto recipe image" className="ketoImg"/>
              <h4>Keto Recipes</h4>
              <p>Keto Description</p>
              <button className={style.homeScreenRecipeCatBtn}>See more →</button>
            </div>
      
            <div className={style.categoryContainer}>
              <img src="insert mediterranean img here" alt="mediterranean recipe image" className="mediterraneanImg"/>
              <h4>Mediterranean Recipes</h4>
              <p>Mediterranean Description</p>
              <button className={style.homeScreenRecipeCatBtn}>See more →</button>
            </div>
        
            <div className={style.categoryContainer}>
              <img src="insert paleo img here" alt="paleo recipe image" className="paleoImg"/>
              <h4>Paleo Recipes</h4>
              <p>Paleo Description</p>
              <button className={style.homeScreenRecipeCatBtn}>See more →</button>
            </div>

            <div className={style.categoryContainer}>
              <img src="insert vegan img here" alt="vegan recipe image" className="veganImg"/>
              <h4>Vegan Recipes</h4>
              <p>Vegan Description</p>
              <button className={style.homeScreenRecipeCatBtn}>See more →</button>
            </div>
        </div>
    </div>
  );
}

export default HomeScreen;
