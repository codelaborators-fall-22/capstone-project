import React from 'react';
import contactUs from '../../assets/peaches.jpg';
import style from './style.module.scss';

const ContactScreen = () => {
  return (
    <div className={style.contact}>
       <img src={contactUs} alt= 'contact us' />
          
          <h1 className={style.text}>Contact us!</h1>
    </div>
  );
}

export default ContactScreen;
