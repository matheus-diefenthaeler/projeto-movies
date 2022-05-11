import MovieStars from "components/MovieStars";
import './styles.css'

function MovieScore() {
  const score = 3.5;
  const count = 13;

  return (
    <div className="projectmovie-score-container">
      <p className="projectmovie-score-value">
        {score > 0 ? score.toFixed(1) : "-"}
      </p>
      <MovieStars />
      <p className="projectmovie-score-count">{count} avaliações</p>
    </div>
  );
}

export default MovieScore;
