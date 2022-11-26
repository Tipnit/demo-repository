import TipnitList from "./pages/TipnitList";
import "./App.css"
import React from "react";
import {
    BrowserRouter as Router,
    Routes,
    Route,
    Link
} from "react-router-dom";
import Home from "./pages/Home";

function App() {
    return (
        <Router>
            <div className="header">
                <nav className="navbar navbar-expand-lg navbar-light bg-light">
                    <div className="container-fluid">
                        <a className="navbar-brand" >
                            The Result</a>
                        <button className="navbar-toggler" type="button" data-bs-toggle="collapse"
                                data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                                aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarNav">
                            <ul className="navbar-nav">
                                <li className="nav-item">
                                    <Link to="/" className="nav-link active" aria-current="page" >Home</Link>
                                </li>

                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
            <div className="container">

                <div className="row">
                    <div className="col-12">

                        <Routes>
                            <Route path="/" element ={<Home/>} />
                            <Route path="/list/:listName" element={<TipnitList />}/>
                        </Routes>

                    </div>
                </div>

            </div>
        </Router>

    );
}

export default App;