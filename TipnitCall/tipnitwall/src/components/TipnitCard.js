import React from 'react';


function TipnitCard(props) {
    let tipnit = props.tipnit;
    let altText = tipnit.title + " " + tipnit.release_date;
    const tipnitLink = "https://image.tmdb.org/t/p/w500/" + tipnit.poster_path;
    return(
        <div className="col mb-3" key={tipnit["primary_isbn10"]}>
            <div className="card h-100  position-relative">
                <img src={tipnitLink} className="card-img-top tipnit-img mx-auto pt-1" alt={altText}  />
                <div className="card-body tipnit-card-details">

                    <h5 className="card-title tipnit-title">{tipnit.title} &nbsp;&nbsp;
                        <span className="badge position-absolute top-0 start-0 rounded-pill translate-middle bg-primary">{tipnit.rank}</span>
                    </h5>
                    <h6 className="card-subtitle mb-2 text-muted tipnit-author"><i>{tipnit.release_date}</i></h6>
                    <p className="card-text">{tipnit.overview}</p>
                </div>
            </div>
        </div>
    );

}
export default TipnitCard;