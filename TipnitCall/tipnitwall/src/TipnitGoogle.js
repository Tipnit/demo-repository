import { Wrapper, Status } from "@googlemaps/react-wrapper";
import {useEffect, useRef, useState} from "react";

function TipnitGoogle() {


   //this.apiKey = process.env.REACT_APP_API_KEY;
    let url = "https://www.google.com/maps/embed/v1/MAP_MODE?key=AIzaSyD3ons1SrA7rmRhr56nKyF92s_fJSHOESI&callback=initMap";
    const ref = useRef(null);
    const [map, setMap] =useState();

    useEffect(() => {
        if (ref.current && !map) {
            setMap(new window.google.maps.Map(ref.current, {}));
        }
    }, [ref, map]);
    const render = (status: Status) => {
        return <h1>{status}</h1>;
    };

    return(
        <Wrapper apiKey={"AIzaSyCGfTLJCe-Wknc0JnSAAo4IAX7kNrv7l0w"} render={render}>
        <div ref={ref} />
        </Wrapper>
    )

}


export default TipnitGoogle;