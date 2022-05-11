import { ReactComponent as Arrow } from "assets/img/arrow.svg";
import './styles.css'

function Pagination() {
  return (
    <div className="projectmovie-pagination-container">
      <div className="projectmovie-pagination-box">
        <button className="projectmovie-pagination-button" disabled={true}>
          <Arrow />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className="projectmovie-pagination-button" disabled={false}>
          <Arrow className="projectmovie-flip-horizontal" />
        </button>
      </div>
    </div>
  );
}

export default Pagination;
