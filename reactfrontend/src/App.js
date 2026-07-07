import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import AddEmployeeComponent from './components/AddEmployeeComponent';

function App() {
  return (
    <Router>
      <div className="app-container">

        {/* Header */}
        <HeaderComponent />

        {/* Main Content */}
        <main className="container py-4">
          <Routes>
            <Route path="/" element={<ListEmployeeComponent />} />
            <Route path="/employees" element={<ListEmployeeComponent />} />
            <Route path="/add-employee" element={<AddEmployeeComponent />} />
            <Route
              path="/edit-employee/:id"
              element={<AddEmployeeComponent />}
            />
          </Routes>
        </main>

        {/* Footer */}
        <FooterComponent />

      </div>
    </Router>
  );
}

export default App;