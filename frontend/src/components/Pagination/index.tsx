import arrowUrl from '../../assets/arrow.svg';

function Pagination() {
    return (
        <div className="dsmovie-pagination-container">
            <div className="dsmovie-pagination-box">
                <button className="dsmovie-pagination-button" disabled={true}>
                    <img src={arrowUrl} alt="Previous" />
                </button>
                <p>{`${1} de ${3}`}</p>
                <button className="dsmovie-pagination-button" disabled={false}>
                    <img className="dsmovie-flip-horizontal" src={arrowUrl} alt="Next" />
                </button>
            </div>
        </div>
    );
}

export default Pagination;