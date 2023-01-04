import AlliHeadshotImg from '../../assets/alli-headshot.jpeg';
import React from 'react';
import style from './style.module.scss';
import teamHeroImg from '../../assets/steak.jpg';

const AboutUsScreen = () => {
  return (
    <div>
        <div className={style.subheader}>
          <img src={teamHeroImg}  alt="about us hero image"/>
          <div>
            <h2>Meet our team</h2>
            <h3>We are a team of new software developers and the first cohort graduating from the CodeLaborators bootcamp! Over the last 4 months we've built fundemental skills in Java, JavaSCript, Spring, React, API Development, HTML, CSS, Git, and GitHub.</h3>
            <p> As our final project, we chose to create a dynamic online recipe repository to highlight our proficiency in software design and development. Not only did this project allow us to work together as a team to build our skillsets, it was a design we believe we can further expand on after the bootcamp. The idea came from us wanting to build a tool for those who struggle with finding healthy, tasty, meals that fit their dietary needs. With everyone's busy lives, we know how difficult this can be for those trying to stick to a plan.</p>
          </div>
        </div>
        
        <div className={style.profileContainer}>
            <div className={style.individualProfiles}>
              <img src={AlliHeadshotImg} alt="Alli's profile image"/>
              <h4>Alli Folluo</h4>
              <p>Hi Everyone! I am currently working as a finance business manager supporting the Consumer and Community Bank Data and Analytics organization at JP Morgan Chase. </p>
              <p>Prior to my role at Chase, I was an analyst in operations and asset management for local start ups in residential real estate development and completed my MBA at Ohio State University. My expertise lies in standing up new workflows, creating process efficiencies, and managing key partners.</p>
              <p>A few of my goals after completing this bootcamp are to create my own software apps, collaborate on app production with colleagues, and join a development team to continue to advance my skillset. I hope you enjoy our website and find some tasty recipes!</p>
            </div>
         

            <div className={style.individualProfiles}>
              <img src="insert img 2 here" alt="profile image 2"/>
              <h4>Chris Lanier</h4>
              <p>Profile Details 2</p>
            </div>

            <div className={style.individualProfiles}>
              <img src="insert img 3 here" alt="profile image 3"/>
              <h4>Gaylon </h4>
              <p>Profile Details 3</p>
            </div>
        
            <div className={style.individualProfiles}>
              <img src="insert img 4 here" alt="profile image 4"/>
              <h4>Mike</h4>
              <p>Profile Details 4</p>
            </div>
        
            <div className={style.individualProfiles}>
              <img src="insert img 5 here" alt="profile image 5"/>
              <h4>Muka</h4>
              <p>Profile Details 5</p>
            </div>

            <div className={style.individualProfiles}>
              <img src="insert img 6 here" alt="profile image 6"/>
              <h4>Name 6</h4>
              <p>Profile Details 6</p>
            </div>
        </div>
    </div>
  );
}

export default AboutUsScreen;
