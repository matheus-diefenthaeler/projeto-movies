import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import "./style.css";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="projectmovie-nav-content">
          <h1>Movie's Project</h1>
          <a href="https://github.com/matheus-diefenthaeler">
            <div className="projectmovie-contact-conteiner">
              <GithubIcon />                
              <p>/Matheus Diefenthaeler</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
