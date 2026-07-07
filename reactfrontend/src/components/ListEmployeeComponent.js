import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import EmployeeService from "../services/EmployeeService";

const ListEmployeeComponent = () => {

    const [employees, setEmployees] = useState([]);
    const [search, setSearch] = useState("");

    useEffect(() => {
        getAllEmployees();
    }, []);

    const getAllEmployees = () => {
        EmployeeService.getAllEmployees()
            .then((response) => {
                setEmployees(response.data);
            })
            .catch((error) => {
                console.log(error);
            });
    };

    const deleteEmployee = (employeeId) => {

        if (window.confirm("Are you sure you want to delete this employee?")) {

            EmployeeService.deleteEmployee(employeeId)
                .then(() => {
                    getAllEmployees();
                })
                .catch((error) => {
                    console.log(error);
                });

        }
    };

    const filteredEmployees = employees.filter((employee) =>
        employee.firstName.toLowerCase().includes(search.toLowerCase()) ||
        employee.lastName.toLowerCase().includes(search.toLowerCase()) ||
        employee.emailId.toLowerCase().includes(search.toLowerCase())
    );

    return (
        <div className="container mt-4">

            {/* Dashboard Cards */}

            <div className="row mb-4">

                <div className="col-md-4">
                    <div className="card shadow text-center bg-primary text-white">
                        <div className="card-body">
                            <h2>{employees.length}</h2>
                            <h5>Total Employees</h5>
                        </div>
                    </div>
                </div>

                <div className="col-md-8">

                    <div className="card shadow">

                        <div className="card-body">

                            <div className="d-flex justify-content-between align-items-center">

                                <h3 className="text-primary fw-bold">
                                    Employee Dashboard
                                </h3>

                                <Link
                                    to="/add-employee"
                                    className="btn btn-success"
                                >
                                    ➕ Add Employee
                                </Link>

                            </div>

                        </div>

                    </div>

                </div>

            </div>

            {/* Search */}

            <div className="card shadow mb-4">

                <div className="card-body">

                    <input
                        type="text"
                        className="form-control"
                        placeholder="🔍 Search Employee..."
                        value={search}
                        onChange={(e) => setSearch(e.target.value)}
                    />

                </div>

            </div>

            {/* Table */}

            <div className="card shadow">

                <div className="card-body">

                    <table className="table table-hover table-bordered">

                        <thead className="table-dark">

                        <tr>

                            <th>ID</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                            <th width="220">Actions</th>

                        </tr>

                        </thead>

                        <tbody>

                        {
                            filteredEmployees.length > 0 ?

                            filteredEmployees.map((employee) => (

                                <tr key={employee.id}>

                                    <td>{employee.id}</td>

                                    <td>{employee.firstName}</td>

                                    <td>{employee.lastName}</td>

                                    <td>{employee.emailId}</td>

                                    <td>

                                        <Link
                                            className="btn btn-warning btn-sm me-2"
                                            to={`/edit-employee/${employee.id}`}
                                        >
                                            ✏ Update
                                        </Link>

                                        <button
                                            className="btn btn-danger btn-sm"
                                            onClick={() => deleteEmployee(employee.id)}
                                        >
                                            🗑 Delete
                                        </button>

                                    </td>

                                </tr>

                            ))

                            :

                            <tr>

                                <td colSpan="5" className="text-center text-danger">
                                    No Employees Found
                                </td>

                            </tr>

                        }

                        </tbody>

                    </table>

                </div>

            </div>

        </div>
    );
};

export default ListEmployeeComponent;