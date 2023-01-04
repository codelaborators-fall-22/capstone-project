import ForkLogo from '../../assets/fork.png';
import { NavLink } from 'react-router-dom';
import React from 'react';
import style from './style.module.scss';

const Header = () => {
  return (
    <div className={style.header}>
      <div>
        <nav className={style.logo}>
        <NavLink to={'/'}>{ForkLogo}</NavLink>
          </nav>
      </div>
      <div>
        <nav className={style.nav}>
          <NavLink to={'/recipes'}>Recipes</NavLink>
          <NavLink to={'/about-us'}>About Us</NavLink>
          <NavLink to={'/contact'}>Contact</NavLink>
        </nav>
      </div>
    </div>
  );
}

export default Header;
