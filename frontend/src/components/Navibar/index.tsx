import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css'

/*JSX - Parece com html mas pode colocar codigo do react*/ 
function Navbar() {

    return(
        <header>
        <nav className='container'>
          <div className='dsmovie-nav-content'>
            <h1>DSMovie</h1>
            <a href="https://github.com/luanalimadeveloper">
              <div className='dsmovie-contact-container'>
                <GithubIcon />
                <p className='dsmovie-contact-link'>/luanalimadeveloper</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;