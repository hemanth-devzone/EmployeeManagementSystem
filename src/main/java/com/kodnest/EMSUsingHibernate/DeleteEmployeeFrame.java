package com.kodnest.EMSUsingHibernate;

import javax.swing.*;

public class DeleteEmployeeFrame extends JFrame {
    public DeleteEmployeeFrame() {
        setTitle("Delete Employee");
        setSize(300, 200);
        setLayout(null);

        JLabel idL = new JLabel("Enter ID:");
        JTextField idF = new JTextField();
        JButton deleteBtn = new JButton("Delete");

        idL.setBounds(30, 30, 100, 25);
        idF.setBounds(130, 30, 120, 25);
        deleteBtn.setBounds(100, 80, 100, 30);

        add(idL); add(idF); add(deleteBtn);

        deleteBtn.addActionListener(e -> {
            int id = Integer.parseInt(idF.getText());
            App app = new App();
            Employee emp = app.getEmployee(id);

            if (emp != null) {
                app.deleteEmployee(id);
                JOptionPane.showMessageDialog(this, "Employee Deleted!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Employee Not Found.");
            }
        });

        setVisible(true);
    }
}
