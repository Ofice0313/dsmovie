import GithubIcon from '../../assets/github.svg'
import './styles.css';

function Navbar() {

    return (
        <>
            <header>
                <nav className='container'>
                    <div className='dsmovie-nav-content'>
                        <h1>DS Movie</h1>
                        <a href="https://github.com/Ofice0313/dsmovie">
                            <div className="dsmovie-contact-container">
                                <img src={GithubIcon} alt="GitHub" />
                                <p className="dsmovie-contact-link">/ofice0313</p>
                            </div>
                        </a>
                    </div>
                </nav>
            </header>
        </>
    )
}

export default Navbar;