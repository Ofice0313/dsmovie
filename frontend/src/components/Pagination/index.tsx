import type { MoviePage } from 'types/movie';
import arrowUrl from '../../assets/arrow.svg';

type Props = {
   page : MoviePage;
   onChange: Function;
}

function Pagination( { page, onChange } : Props) {
    return (
        <div className="dsmovie-pagination-container">
            <div className="dsmovie-pagination-box">
                <button className="dsmovie-pagination-button" disabled={page.first} onClick={() => onChange(page.number - 1) }>
                    <img src={arrowUrl} alt="Previous" />
                </button>
                <p>{`${page.number + 1} de ${page.totalPages}`}</p>
                <button className="dsmovie-pagination-button" disabled={page.last} onClick={() => onChange(page.number + 1) }>
                    <img className="dsmovie-flip-horizontal" src={arrowUrl} alt="Next" />
                </button>
            </div>
        </div>
    );
}

export default Pagination;