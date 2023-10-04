/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author alvarez
 */
public class Latihan4 extends JFrame {
    
    public Latihan4(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelNama = new JLabel("Input Nama:");
        labelNama.setBounds(130, 40, 100, 15);
        
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(130, 60, 100, 30);
        
        JLabel labelTelepon = new JLabel("Telepon:");
        labelTelepon.setBounds(130, 95, 100, 15);
        
        JTextField textFieldTelepon = new JTextField();
        textFieldTelepon.setBounds(130, 120, 100, 30);
        
        JButton button = new JButton("Klik");
        button.setBounds(130, 165, 100, 40);
        
        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(90, 250, 200, 100);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText() + " - " + textFieldTelepon.getText() + "\n";
                txtOutput.append(nama);
                textFieldNama.setText("");
                textFieldTelepon.setText("");
            }
        });
        
        this.add(labelNama);
        this.add(textFieldNama);
        this.add(labelTelepon);
        this.add(textFieldTelepon);
        this.add(button);
        this.add(txtOutput);
        
        this.setSize(400, 500);
        this.setLayout(null);
    
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan4 app = new Latihan4();
                app.setVisible(true);
            }
        });
    }
}
