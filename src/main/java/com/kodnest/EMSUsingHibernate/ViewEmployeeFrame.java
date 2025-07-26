package com.kodnest.EMSUsingHibernate;

import javax.swing.*;

public class ViewEmployeeFrame extends JFrame {
    public ViewEmployeeFrame() {
        setTitle("View Employee");
        setSize(300, 300);
        setLayout(null);

        JLabel idL = new JLabel("Enter ID:");
        JTextField idF = new JTextField();
        JButton fetchBtn = new JButton("Fetch");

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        idL.setBounds(30, 30, 100, 25);
        idF.setBounds(130, 30, 120, 25);
        fetchBtn.setBounds(100, 70, 80, 30);
        resultArea.setBounds(30, 120, 220, 100);

        add(idL); add(idF); add(fetchBtn); add(resultArea);

        fetchBtn.addActionListener(e -> {
            int id = Integer.parseInt(idF.getText());
            App app = new App();
            Employee emp = app.getEmployee(id);

            if (emp != null) {
                resultArea.setText("Name: " + emp.getName() +
                                   "\nSalary: " + emp.getSalary() +
                                   "\nDepartment: " + emp.getDepartment());
            } else {
                resultArea.setText("Employee not found.");
            }
        });

        setVisible(true);
    }
}

