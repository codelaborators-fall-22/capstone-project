import React from 'react';
import { NavLink } from 'react-router-dom';
import style from './style.module.scss';


const Header = () => {
  return (
    <div className={style.header}>
      <nav className={style.nav}>
        <NavLink to={'/'}>Home/Logo</NavLink>
        <NavLink to={'/recipes'}>Recipes</NavLink>
        <NavLink to={'/filtered-recipes'}>Filtered Recipes</NavLink>
        <NavLink to={'/about-us'}>About Us</NavLink>
        <NavLink to={'/contact'}>Contact</NavLink>
      </nav>
    </div>
  );
}

export default Header;
