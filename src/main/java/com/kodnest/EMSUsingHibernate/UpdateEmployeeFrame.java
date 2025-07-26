package com.kodnest.EMSUsingHibernate;

import javax.swing.*;

public class UpdateEmployeeFrame extends JFrame {
    public UpdateEmployeeFrame() {
        setTitle("Update Employee");
        setSize(300, 350);
        setLayout(null);

        JLabel idL = new JLabel("Enter ID:");
        JTextField idF = new JTextField();
        JButton fetchBtn = new JButton("Load");

        JLabel nameL = new JLabel("Name:");
        JLabel salaryL = new JLabel("Salary:");
        JLabel deptL = new JLabel("Department:");

        JTextField nameF = new JTextField();
        JTextField salaryF = new JTextField();
        JTextField deptF = new JTextField();

        JButton updateBtn = new JButton("Update");

        idL.setBounds(30, 30, 100, 25);
        idF.setBounds(130, 30, 120, 25);
        fetchBtn.setBounds(100, 70, 80, 30);

        nameL.setBounds(30, 120, 100, 25);
        salaryL.setBounds(30, 160, 100, 25);
        deptL.setBounds(30, 200, 100, 25);

        nameF.setBounds(130, 120, 120, 25);
        salaryF.setBounds(130, 160, 120, 25);
        deptF.setBounds(130, 200, 120, 25);

        updateBtn.setBounds(100, 250, 100, 30);

        add(idL); add(idF); add(fetchBtn);
        add(nameL); add(salaryL); add(deptL);
        add(nameF); add(salaryF); add(deptF);
        add(updateBtn);

        fetchBtn.addActionListener(e -> {
            int id = Integer.parseInt(idF.getText());
            App app = new App();
            Employee emp = app.getEmployee(id);

            if (emp != null) {
                nameF.setText(emp.getName());
                salaryF.setText(String.valueOf(emp.getSalary()));
                deptF.setText(emp.getDepartment());
            } else {
                JOptionPane.showMessageDialog(this, "Employee not found.");
            }
        });

        updateBtn.addActionListener(e -> {
            int id = Integer.parseInt(idF.getText());
            String name = nameF.getText();
            int salary = Integer.parseInt(salaryF.getText());
            String dept = deptF.getText();

            App app = new App();
            Employee emp = new Employee(name, salary, dept);
            emp.setId(id); // VERY IMPORTANT
            app.updateEmployee(emp);

            JOptionPane.showMessageDialog(this, "Employee Updated!");
            dispose();
        });

        setVisible(true);
    }
}
