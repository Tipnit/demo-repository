import MovieList from "./MovieList";
import "./App.css"
import React from "react";

function App() {
  return (
      <div className="container">
        <div className="row">
          <div className="col-12">
            <h3 className="display-4 page-title text-center m-3">The Movie TB Best Seller List</h3>
            <hr/>
          </div>
        </div>
        <div className="row">
          <div className="col-12">
            <MovieList />
          </div>
        </div>

      </div>
  );
}

export defa