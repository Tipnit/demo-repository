import React, {Component} from 'react';
import axios from "axios";
import TipnitCard from "../components/TipnitCard";
import { withParams } from "../util/Utilities";

class MovieList extends Component {
    constructor(props) {
        super(props);
        this.state = {
            tipnits : []
        };
        this.listName = this.props.params.listName;
        this.apiKey = process.env.REACT_APP_API_KEY;
        this.state = {
            name: "",
            tipnits : []
        };
    }
    componentDidMount() {
        let url = "https://api.themoviedb.org/3/movie/now_playing?api_key="+ this.apiKey;
        const getTipnits = async () => {
            await axios.get(url).then((response) => {
                //console.log(response.data);
                //console.log(url)
                this.setState({tipnits: response.data.results, type: response.data.results.updated})
            }).catch((err) => {
                console.log(err);
            })
        }
        getTipnits();
    }
    render() {
        return (
            <>

                <div className="row row-cols-sm-2 row-cols-md-5 row-cols-xxl-6">
                    {
                        this.state.tipnits.map((tipnit,idx) => {
                                return <MovieCard tipnit={tipnit} key={idx} />

                            }
                        )

                    }
                </div>
            </>
        );
    }

}

//const MovieList = withParams(MovieLists);
export default TipnitList;

