import React, { useEffect, useState } from 'react';

import Axios from 'axios';
import { useParams } from 'react-router-dom';

const FilteredRecipesScreen = () => {
const category = useParams();
console.log(category.category);

 //state variables: state is a moment of time for a variable in your application
 const [recipesToDisplay, setRecipesToDisplay] = useState([]);

 //a React tool that handles component lifecycle 
 //Lifecycle consists of mounting, display and calls to the API
 useEffect(() => {

     const fetchData = async () => {
         const result = await Axios(`http://localhost:8080/recipes/${category.category}`);
          console.log(result);
      }

      fetchData();

  }, []);




  return (
    <div>
     
    </div>
  );
}

export default FilteredRecipesScreen;
