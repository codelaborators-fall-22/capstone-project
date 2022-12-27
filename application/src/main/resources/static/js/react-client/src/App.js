import AppRouter from './components/app-router';
import { BrowserRouter } from 'react-router-dom';
import Footer from './components/footer';
import Header from './components/header';
import React from 'react';
import style from './style.module.scss';

//App component is like our main headquarters of control (this is our top level)
const App = () => {
  return (
    <BrowserRouter>

     
      <div className={style.page}>

      <Header />
      <AppRouter />

      <div className={style.page}>
        <Header />
        <AppRouter />
        <Footer />

      </div>
    </BrowserRouter>
  );
}

export default App;