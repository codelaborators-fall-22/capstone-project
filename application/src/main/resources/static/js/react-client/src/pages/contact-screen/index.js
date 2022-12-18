import React from 'react';
import style from './style.module.scss';
import contactUs from '../../assets/contactus.jpg';

const ContactScreen = () => {
  return (
    <div className={style.contact}>
       <img src={contactUs} alt= 'contact us' />
          
          <h1 className={style.text}>Contact us!</h1>
    </div>
  );
}

export default ContactScreen;
