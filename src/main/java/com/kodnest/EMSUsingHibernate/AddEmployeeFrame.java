package com.kodnest.EMSUsingHibernate;

import javax.swing.*;

public class AddEmployeeFrame extends JFrame {
    public AddEmployeeFrame() {
        setTitle("Add Employee");
        setSize(300, 250);
        setLayout(null);

        JLabel nameL = new JLabel("Name:");
        JLabel salaryL = new JLabel("Salary:");
        JLabel deptL = new JLabel("Department:");

        JTextField nameF = new JTextField();
        JTextField salaryF = new JTextField();
        JTextField deptF = new JTextField();

        JButton submit = new JButton("Add");

        nameL.setBounds(30, 30, 100, 25);
        salaryL.setBounds(30, 70, 100, 25);
        deptL.setBounds(30, 110, 100, 25);

        nameF.setBounds(130, 30, 120, 25);
        salaryF.setBounds(130, 70, 120, 25);
        deptF.setBounds(130, 110, 120, 25);

        submit.setBounds(100, 160, 100, 30);

        add(nameL); add(salaryL); add(deptL);
        add(nameF); add(salaryF); add(deptF);
        add(submit);

        submit.addActionListener(e -> {
            String name = nameF.getText();
            int salary = Integer.parseInt(salaryF.getText());
            String dept = deptF.getText();

            App app = new App();
            app.addEmployee(name, salary, dept);
            JOptionPane.showMessageDialog(this, "Employee Added!");
            dispose();
        });

        setVisible(true);
    }
}
