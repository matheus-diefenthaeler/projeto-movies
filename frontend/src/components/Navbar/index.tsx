import { ReactComponent as GithubIcon } from "assets/img/github.svg";

function Navbar() {
  return (
    <header>
      <nav>
        <div>
          <h1>Movie's Project</h1>
          <a href="https://github.com/matheus-diefenthaeler">
            <div>
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
