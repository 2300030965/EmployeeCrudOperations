package com.employees;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class EmployeeGUI extends JFrame {

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtRole;
    private JTextField txtSalary;

    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnSearch;
    private JButton btnShowAll;
    private JButton btnClear;

    private JTable table;
    private DefaultTableModel model;

    private EmployeeManager manager;

    public EmployeeGUI() {

        manager = new EmployeeManager();

        initializeUI();

        loadTable();

    }

    private void initializeUI() {

        setTitle("Employee Records Management");
        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(4,2,10,10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Employee Details"));

        txtId = new JTextField();
        txtName = new JTextField();
        txtRole = new JTextField();
        txtSalary = new JTextField();

        formPanel.add(new JLabel("Employee ID"));
        formPanel.add(txtId);

        formPanel.add(new JLabel("Employee Name"));
        formPanel.add(txtName);

        formPanel.add(new JLabel("Role"));
        formPanel.add(txtRole);

        formPanel.add(new JLabel("Salary"));
        formPanel.add(txtSalary);

        add(formPanel,BorderLayout.NORTH);

        // Buttons

        JPanel buttonPanel = new JPanel(new FlowLayout());

        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnSearch = new JButton("Search");
        btnShowAll = new JButton("Show All");
        btnClear = new JButton("Clear");

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnSearch);
        buttonPanel.add(btnShowAll);
        buttonPanel.add(btnClear);

        add(buttonPanel,BorderLayout.SOUTH);

        // Table

        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Role");
        model.addColumn("Salary");

        table = new JTable(model);

        JScrollPane scroll = new JScrollPane(table);

        add(scroll,BorderLayout.CENTER);
        table.getSelectionModel().addListSelectionListener(e -> {

            int row = table.getSelectedRow();

            if(row != -1) {

                txtId.setText(model.getValueAt(row,0).toString());

                txtName.setText(model.getValueAt(row,1).toString());

                txtRole.setText(model.getValueAt(row,2).toString());

                txtSalary.setText(model.getValueAt(row,3).toString());

            }

        });
        btnAdd.addActionListener(e -> {

            try {

                int id = Integer.parseInt(txtId.getText());

                String name = txtName.getText();

                String role = txtRole.getText();

                double salary = Double.parseDouble(txtSalary.getText());

                Employee emp = new Employee(id, name, role, salary);

                if(manager.addEmployee(emp)) {

                    JOptionPane.showMessageDialog(this, "Employee Added Successfully");

                    loadTable();
                    clearFields();


                } else {

                    JOptionPane.showMessageDialog(this, "Duplicate Employee ID");

                }

            }
            catch(Exception ex) {

                JOptionPane.showMessageDialog(this, "Please Enter Valid Data");

            }

        });
        btnUpdate.addActionListener(e -> {

            try {

                int id = Integer.parseInt(txtId.getText());

                String name = txtName.getText();

                String role = txtRole.getText();

                double salary = Double.parseDouble(txtSalary.getText());

                Employee emp = new Employee(id, name, role, salary);

                if(manager.updateEmployee(emp)) {

                    JOptionPane.showMessageDialog(this, "Employee Updated Successfully");

                    loadTable();
                    clearFields();

                } else {

                    JOptionPane.showMessageDialog(this, "Employee Not Found");

                }

            }
            catch(Exception ex) {

                JOptionPane.showMessageDialog(this, "Please Enter Valid Data");

            }

        });
        btnDelete.addActionListener(e -> {

            try {

                int id = Integer.parseInt(txtId.getText());

                if(manager.deleteEmployee(id)) {

                    JOptionPane.showMessageDialog(this, "Employee Deleted Successfully");

                    loadTable();

                    clearFields();

                } else {

                    JOptionPane.showMessageDialog(this, "Employee Not Found");

                }

            }
            catch(Exception ex) {

                JOptionPane.showMessageDialog(this, "Invalid Employee ID");

            }

        });
        btnClear.addActionListener(e -> {

            clearFields();

        });
        btnSearch.addActionListener(e -> {

            try {

                int id = Integer.parseInt(txtId.getText());

                Employee emp = manager.searchById(id);

                if(emp != null) {

                    txtName.setText(emp.getName());

                    txtRole.setText(emp.getRole());

                    txtSalary.setText(String.valueOf(emp.getSalary()));

                } else {

                    JOptionPane.showMessageDialog(this, "Employee Not Found");

                }

            }
            catch(Exception ex) {

                JOptionPane.showMessageDialog(this, "Invalid Employee ID");

            }

        });
        btnShowAll.addActionListener(e -> {

            loadTable();

        });
    }
    private void clearFields() {

        txtId.setText("");

        txtName.setText("");

        txtRole.setText("");

        txtSalary.setText("");

    }

	private void loadTable() {

        model.setRowCount(0);

        manager.loadEmployees();

        for(Employee e : manager.getEmployees()) {

            Object row[] = {

                    e.getId(),
                    e.getName(),
                    e.getRole(),
                    e.getSalary()

            };

            model.addRow(row);

        }

    }

}