import React, {Component} from 'react';
import axios from "axios";
import TipnitCard from "../components/TipnitCard";
import {Link} from "react-router-dom";


class Home extends Component {
    constructor(props) {
        super(props);
        this.state = {
            tipnitLists: []
        }
        this.apiKey = process.env.REACT_APP_API_KEY;
    }

    componentDidMount() {
        const listsUrl = "https://api.themoviedb.org/3/movie/now_playing?api_key=";

        const getLists = async () => {
            let listData = [];
            await axios.get(listsUrl + this.apiKey)
                .then( (response)=> {

                    /* let lists = response.data.results.lists;

                     lists.map(async (list) => {

                         let data = {id: list.list_id, type: list.updated, name: list.display_name, url_part: list.list_name_encoded, movies:list.movies }
                         listData.push(data);

                     });*/
                    this.setState({tipnitLists: listData});
                })
                .catch((err) => {
                    console.log("Fetch Erorr: could not get list names." + err)
                })
        }
        getLists()
    }


    render() {
        return (
            <>
                <div className="row">
                    <div className="col-12">
                        <h3 className="display-4 page-title text-center m-3">The Results</h3>
                        <hr/>
                    </div>
                </div>

                {
                    this.state.tipnitLists.map((list)=>{
                        const tipnitLink = "/list/" + list.url_part;

                        return (
                            <div className="row mb-3" key={list.url_part}>
                                <div className="col mb-3">
                                    <Link to={tipnitLink}  className="movie-list-link">{list.name} &gt;</Link>
                                </div>
                                <div className="row">
                                    {
                                        list.tipnits.map((tipnit)=>{
                                            const key = list.id + "_" + tipnit.primary_isbn13;
                                            return <TipnitCard listType={list.type} tipnit={tipnit} key={key} />
                                        })
                                    }
                                </div>
                            </div>

                        )
                    })
                }

            </>
        );
    }
}

export default Home;