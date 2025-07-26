package com.kodnest.EMSUsingHibernate;

import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Employee Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton addBtn = new JButton("Add Employee");
        JButton viewBtn = new JButton("View Employee");
        JButton updateBtn = new JButton("Update Employee");
        JButton deleteBtn = new JButton("Delete Employee");

        addBtn.setBounds(100, 30, 200, 30);
        viewBtn.setBounds(100, 70, 200, 30);
        updateBtn.setBounds(100, 110, 200, 30);
        deleteBtn.setBounds(100, 150, 200, 30);

        add(addBtn);
        add(viewBtn);
        add(updateBtn);
        add(deleteBtn);

        addBtn.addActionListener(e -> new AddEmployeeFrame());
        viewBtn.addActionListener(e -> new ViewEmployeeFrame());
        updateBtn.addActionListener(e -> new UpdateEmployeeFrame());
        deleteBtn.addActionListener(e -> new DeleteEmployeeFrame());

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
