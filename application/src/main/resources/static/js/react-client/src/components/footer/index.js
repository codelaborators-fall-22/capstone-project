import React from 'react';
import style from './style.module.scss';
import tikTokIcon from '../../assets/tiktokicon.jpg';
import igIcon from '../../assets/IGicon.jpg';
import twitterIcon from '../../assets/Twittericon.jpg';



const Footer = () => {
  return (
    <div className={style.footer}>
      <img src={tikTokIcon} alt= 'TikTok' />
      <img src={igIcon} alt= 'Ig' />
      <img src={twitterIcon} alt= 'Twitter' />
    </div>
  );
}

export default Footer;
