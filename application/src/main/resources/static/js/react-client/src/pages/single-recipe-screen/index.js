import { useEffect, useState } from 'react';

import Axios from 'axios';
import React from 'react'
import style from './style.module.scss';
import { useParams } from 'react-router';

const SingleRecipeScreen = () => {

  const id = useParams();
  const [recipe, setRecipe] = useState(null);
  const [commentText, setCommentText] = useState('');
  const [name, setName] = useState('');
  const [comment, setComment] = useState({
    comment: commentText,
    userName: name,
    recipeId: parseInt(id.id)
  });

  useEffect(() => {

    const fetchData = async () => {
      const result = await Axios(`http://localhost:8080/recipes/recipe/${id.id}`);
      setRecipe(result.data);

    }

    fetchData();


  }, [id.id]);

  useEffect(() => {
    setComment({
      comment: commentText,
      userName: name,
      recipeId: parseInt(id.id)
    });
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [commentText, name]);




  const submitComment = () => {

    Axios.post(`http://localhost:8080/recipes/recipe/${id.id}/add-comment`, comment).then((response) => {
      console.log(response.status);
      console.log('DATA', response.data);
      setRecipe(response.data[id.id - 1]);
    });
  }



  return (
    recipe === null ? <h2>Loading...</h2> :

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
        <h2 className={style.subheader}>Comments</h2>
        <ul>
          {recipe.comments && recipe.comments.map(comment => {
            return (
              <div className={style.ingredient}>
                <p>{comment.comment}</p>
                <p>{comment.userName}</p>
              </div>
            )
          })}
        </ul>
        <form>
          <textarea onChange={(e) => setCommentText(e.target.value)} placeholder='What did you think of this recipe?'></textarea>
          <input onChange={(e) => setName(e.target.value)} type='text' placeholder='name'></input>
          <button onClick={() => submitComment()}>Submit</button>
        </form>
      </div>
  )
}

export default SingleRecipeScreen