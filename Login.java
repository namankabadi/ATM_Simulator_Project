/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;

/**
 *
 * @author Naman
 */

import javax.swing.*;  //Swing
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    //Globally Defining the JButton
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    //Constructor
    Login(){
        
        setTitle("ATM Simulator System");
       
         //Frame default layout is set to null
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3); //Using JLabel to set image on the frame and add label etc
        
        label.setBounds(70,10, 100, 100);
        add(label);
        // Set the color of frame
        getContentPane().setBackground(Color.WHITE);
        
        //Creating Label
        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);

        //Creating label
        JLabel cardno = new JLabel("Card Number: ");
        cardno.setBounds(120, 150, 250, 30);
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        add(cardno);
        
        //Creating the Text Field 
        cardTextField = new JTextField();
        cardTextField.setBounds(310,150,260,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        //Creating the Text Field
        JLabel pin = new JLabel("ATM PIN:");
        pin.setBounds(120, 220, 400, 30);
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        add(pin);
        
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(310,220,260,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
     
        
        // Frame Length and breadth 800 and 480
        setSize(800, 480);
        // Set Visible Makes Frame Visible
        setVisible(true);
        setLocation(350, 200); //Left 350 and right 200
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== clear ){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource()== login ){
            Conn conn = new Conn();
            String cardnumber=cardTextField.getText();
            String pin=pinTextField.getText();
            String query = "SELECT * FROM login where cardnumber='"+cardnumber+"' and pin = '"+pin+"'";
            try{
                ResultSet rs= conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin Number Please Check!!");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if (ae.getSource() == signup ){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new Login();
    }
}
