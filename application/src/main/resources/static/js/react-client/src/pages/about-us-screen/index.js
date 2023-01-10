import AlliHeadshotImg from '../../assets/alli-headshot.jpeg';
import ChrisHeadshotImg from '../../assets/chris-headshot.jpg';
import GaylonHeadshotImg from '../../assets/gaylon.jpg';
import MikeHeadshotImg from '../../assets/Mike.jpg';
import MukaHeadshotImg from '../../assets/muka.png';
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
            <h3>We are a team of new software developers and the first cohort graduating from the CodeLaborators bootcamp! </h3>
            <p>Over the last 4 months we've built fundemental skills in Java, JavaSCript, Spring, React, API Development, HTML, CSS, Git, and GitHub.</p>
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
              <img src={ChrisHeadshotImg} alt="Chris profile image"/>
              <h4>Chris Lanier</h4>
              <p>I'm a lifelong learner that has recently fell in love with software development. Currently, I'm in Content Operations for a division of The American Chemical Society, where I process chemical and structural data extracted from patents and journal articles. </p>
              <p>My goals, after the bootcamp, are to expand my skills and knowledge by contributing to open-source projects and completing my own personal projects. After gaining a level of proficiency, I will began to seek a full-time Junior Software Developer role.</p>
            </div>

            <div className={style.individualProfiles}>
              <img src={GaylonHeadshotImg} alt="Gaylon profile image"/>
              <h4>Gaylon Knox</h4>
              <p>Hello! I am currently employed with Medical Mutual of Ohio as Medicare Enrollment Coordinator.</p>
              <p>My primary background has been within the financial and insurance industries serving in supervisory, auditing and oversight roles.</p>
              <p>Future goals include sharpening the skills learned in the CodeLaborators Bootcamp and seeking out roles in software testing and quality assurance function.</p>
              <p>Thank you for taking time to check out our app---I'm sure there is something here that gets your appetite going--Enjoy!</p>
            </div>
        
            <div className={style.individualProfiles}>
              <img src={MikeHeadshotImg} alt="Mike profile image"/>
              <h4>Mike Changwe</h4>
              <p>Hey, everyone! My name is Michael Changwe and I am estatic to be a part of the inaugaral Codelaborators cohort! After most recently working in technical recruitment and after a lot of conversation with engineers and personal research, I decided to make the transition into software development. </p>
              <p>Growing up in the social media era I have always had a natural inclination towards the latest tech trends and innovations. Following the end the boot camp, I plan on increasing my profiency in all things full stack and hope to work as a Back End Developer in the near future.</p>
            </div>
        
            <div className={style.individualProfiles}>
              <img src={MukaHeadshotImg} alt="Muka profile image"/>
              <h4>Mukagala Shawa</h4>
              <p>Mukagala has 8 years of customer service experience and 4 years of sales experience. Graduate  of business information systems and has a passion for system security and software technology.</p>
            </div>
        </div>
    </div>
  );
}

export default AboutUsScreen;
