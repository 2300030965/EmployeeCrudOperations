import React from "react";
import { Link } from "react-router-dom";

const HeaderComponent = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-primary shadow">
      <div className="container">

        {/* Logo */}
        <Link className="navbar-brand fw-bold fs-3" to="/">
          👨‍💼 Employee Management System
        </Link>

        {/* Mobile Toggle */}
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        {/* Menu */}
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav ms-auto">

            <li className="nav-item">
              <Link className="nav-link active" to="/employees">
                Home
              </Link>
            </li>

            <li className="nav-item">
              <Link className="nav-link" to="/add-employee">
                Add Employee
              </Link>
            </li>

          </ul>
        </div>

      </div>
    </nav>
  );
};

export default HeaderComponent;