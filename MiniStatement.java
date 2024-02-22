/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;

/**
 *
 * @author Naman
 */

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;
public class MiniStatement extends JFrame {
    String pinnumber;
    
    MiniStatement(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        setTitle("Mini Statement");
        
        JLabel mini = new JLabel();
        mini.setBounds(20,140,600,200);
        mini.setFont(new Font("System",Font.BOLD,12));
        mini.setForeground(Color.BLACK);
        add(mini);
        
        JLabel bank = new JLabel("Canara Bank");
        bank.setBounds(150,20,100,20);
        bank.setFont(new Font("System",Font.BOLD,16));
        bank.setForeground(Color.BLACK);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        card.setFont(new Font("System",Font.BOLD,12));
        card.setForeground(Color.BLACK);
        add(card);
        
        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        try{
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("SELECT * FROM login where pin='"+pinnumber+"'");
            
            while(rs.next()){
                card.setText("Card Number: "+rs.getString("cardnumber").substring(0,4)+"-XXXX-XXXX-"+rs.getString("cardnumber").substring(12,16));
            }
        }catch(Exception e){
            
        }
        try{
            int rbalance = 0;
            Conn c1  = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    rbalance += Integer.parseInt(rs.getString("amount"));
                }else{
                    rbalance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your Total Available Balance is Rs "+rbalance);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
        
    }
    public static void main(String args[]) {
        new MiniStatement("");
    }
}
