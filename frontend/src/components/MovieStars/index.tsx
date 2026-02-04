import StarFull  from '../../assets/star-full.svg';
import StarHalf from '../../assets/star-half.svg';
import StarEmpty from '../../assets/star-empty.svg';
import './styles.css';

function MovieStars() {
    return (
        <div className="dsmovie-stars-container">
            <img src={StarFull} alt="" />
            <img src={StarFull} alt="" />
            <img src={StarFull} alt="" />
            <img src={StarFull} alt="" />
            <img src={StarHalf} alt="" />
            <img src={StarEmpty} alt="" />
        </div>
    );
}

export default MovieStars;