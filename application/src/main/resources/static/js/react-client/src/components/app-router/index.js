import { Route, Switch } from 'react-router-dom';

import ContactScreen from '../../pages/contact-screen';
import HomeScreen from '../../pages/home-screen';
import React from 'react';
import AboutUsScreen from '../../pages/about-us-screen';
import RecipesScreen from '../../pages/recipes-screen';
import FilteredRecipesScreen from '../../pages/filtered-recipes-screen';

const AppRouter = () => {
    return (
        <Switch>
            <Route exact path={'/'} component={HomeScreen} />
            <Route exact path={'/contact'} component={ContactScreen} />
            <Route exact path={'/about-us'} component={AboutUsScreen} />
            <Route exact path={'/recipes'} component={RecipesScreen} />
            <Route exact path={'/recipes/:category'} component={FilteredRecipesScreen} />
        </Switch>
    )
}

export default AppRouter;