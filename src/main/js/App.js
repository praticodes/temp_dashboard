import React from 'react';
import { BrowserRouter, Route } from 'react-router-dom';
import DashboardPage from './DashboardPage';
import CurrentClaimPage from './CurrentClaimPage'; // Create this component

function App() {
    return (
        <BrowserRouter>
            <Route exact path="/" component={DashboardPage} />
            <Route path="/claim/:id" component={CurrentClaimPage} />
        </BrowserRouter>
    );
}

export default App;
