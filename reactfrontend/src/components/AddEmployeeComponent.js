import React, { useState, useEffect } from "react";
import { useNavigate, Link, useParams } from "react-router-dom";
import EmployeeService from "../services/EmployeeService";

const AddEmployeeComponent = () => {

  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [emailId, setEmailId] = useState("");

  const navigate = useNavigate();
  const { id } = useParams();

  const saveOrUpdateEmployee = (e) => {
    e.preventDefault();

    const employee = {
      firstName,
      lastName,
      emailId,
    };

    if (id) {
      EmployeeService.updateEmployee(id, employee)
        .then(() => {
          navigate("/employees");
        })
        .catch((error) => console.log(error));
    } else {
      EmployeeService.createEmployee(employee)
        .then(() => {
          navigate("/employees");
        })
        .catch((error) => console.log(error));
    }
  };

  useEffect(() => {
    if (id) {
      EmployeeService.getEmployeeById(id)
        .then((response) => {
          setFirstName(response.data.firstName);
          setLastName(response.data.lastName);
          setEmailId(response.data.emailId);
        })
        .catch((error) => console.log(error));
    }
  }, [id]);

  const pageTitle = () => {
    if (id) {
      return "Update Employee";
    } else {
      return "Add Employee";
    }
  };

  return (
    <div className="container mt-5">

      <div className="row justify-content-center">

        <div className="col-md-7">

          <div className="card shadow-lg border-0 rounded-4">

            <div className="card-header bg-primary text-white text-center rounded-top-4">
              <h3>{pageTitle()}</h3>
            </div>

            <div className="card-body p-4">

              <form onSubmit={saveOrUpdateEmployee}>

                <div className="mb-3">

                  <label className="form-label fw-bold">
                    First Name
                  </label>

                  <input
                    type="text"
                    className="form-control form-control-lg"
                    placeholder="Enter First Name"
                    value={firstName}
                    onChange={(e) => setFirstName(e.target.value)}
                    required
                  />

                </div>

                <div className="mb-3">

                  <label className="form-label fw-bold">
                    Last Name
                  </label>

                  <input
                    type="text"
                    className="form-control form-control-lg"
                    placeholder="Enter Last Name"
                    value={lastName}
                    onChange={(e) => setLastName(e.target.value)}
                    required
                  />

                </div>

                <div className="mb-4">

                  <label className="form-label fw-bold">
                    Email Address
                  </label>

                  <input
                    type="email"
                    className="form-control form-control-lg"
                    placeholder="Enter Email"
                    value={emailId}
                    onChange={(e) => setEmailId(e.target.value)}
                    required
                  />

                </div>

                <div className="text-center">

                  <button
                    type="submit"
                    className="btn btn-success btn-lg me-3"
                  >
                    💾 Save
                  </button>

                  <Link
                    to="/employees"
                    className="btn btn-secondary btn-lg"
                  >
                    ❌ Cancel
                  </Link>

                </div>

              </form>

            </div>

          </div>

        </div>

      </div>

    </div>
  );
};

export default AddEmployeeComponent;