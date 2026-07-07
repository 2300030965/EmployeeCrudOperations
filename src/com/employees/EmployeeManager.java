package com.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManager {

    private ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
        loadEmployees();
    }

    // Load employees from database
    public void loadEmployees() {

        employees.clear();

        try {

            Connection con = DatabaseHelper.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM employees");

            while (rs.next()) {

                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getDouble("salary"));

                employees.add(emp);

            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // Add Employee
    public boolean addEmployee(Employee emp) {

        // Duplicate ID Check

        for (Employee e : employees) {

            if (e.getId() == emp.getId()) {

                System.out.println("Duplicate Employee ID");

                return false;

            }

        }

        try {

            Connection con = DatabaseHelper.getConnection();

            String sql =
                    "INSERT INTO employees(id,name,role,salary) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getRole());
            ps.setDouble(4, emp.getSalary());

            ps.executeUpdate();

            ps.close();
            con.close();

            employees.add(emp);

            return true;

        } catch (Exception e) {

            e.printStackTrace();

            return false;

        }

    }

    // Update Employee

    public boolean updateEmployee(Employee emp) {

        try {

            Connection con = DatabaseHelper.getConnection();

            String sql =
                    "UPDATE employees SET name=?, role=?, salary=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getRole());
            ps.setDouble(3, emp.getSalary());
            ps.setInt(4, emp.getId());

            int rows = ps.executeUpdate();

            ps.close();
            con.close();

            if (rows > 0) {

                for (Employee e : employees) {

                    if (e.getId() == emp.getId()) {

                        e.setName(emp.getName());
                        e.setRole(emp.getRole());
                        e.setSalary(emp.getSalary());

                        break;

                    }

                }

                return true;

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;

    }

    // Delete Employee

    public boolean deleteEmployee(int id) {

        try {

            Connection con = DatabaseHelper.getConnection();

            String sql = "DELETE FROM employees WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            ps.close();
            con.close();

            if (rows > 0) {

                Iterator<Employee> itr = employees.iterator();

                while (itr.hasNext()) {

                    Employee e = itr.next();

                    if (e.getId() == id) {

                        itr.remove();

                        break;

                    }

                }

                return true;

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;

    }

    // Search by ID

    public Employee searchById(int id) {

        for (Employee e : employees) {

            if (e.getId() == id) {

                return e;

            }

        }

        return null;

    }

    // Search by Name

    public ArrayList<Employee> searchByName(String name) {

        ArrayList<Employee> result = new ArrayList<>();

        for (Employee e : employees) {

            if (e.getName().toLowerCase().contains(name.toLowerCase())) {

                result.add(e);

            }

        }

        return result;

    }

    // Show All Employees

    public ArrayList<Employee> getEmployees() {

        return employees;

    }

}