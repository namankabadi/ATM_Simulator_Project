
package bank.management.system;

/**
 *
 * @author Naman
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class PinChange extends JFrame implements ActionListener{
    String pinnumber;
    JButton change,back;
    JPasswordField pin,repin;
    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("CHANGE YOUR PIN:");
        text.setBounds(250,280,700,35);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JLabel pintext = new JLabel("NEW PIN:");
        pintext.setBounds(165,320,180,25);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setForeground(Color.WHITE);
        image.add(pintext);
       
        JLabel repintext = new JLabel("Re-Enter New PIN:");
        repintext.setBounds(165,360,180,25);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setForeground(Color.WHITE);
        image.add(repintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
            try{
                String npin=pin.getText();
                String rpin=pin.getText();
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Entered PIN Does not Match..");
                    return;
                }
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Field Cannot be Empty...Please enter new PIN");
                    return;
                }
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Field Cannot be Empty...Please re-enter new PIN");
                    return;
                }
                
                Conn conn=new Conn();
                
                String query1="UPDATE bank set pin='"+rpin+"' where pin='"+pinnumber+"'";
                
                String query2="UPDATE login set pin='"+rpin+"' where pin='"+pinnumber+"'";
                
                
                String query3="UPDATE signupthree set pin='"+rpin+"' where pin='"+pinnumber+"'";
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "PIN Changed Succesfully!!");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
                
            }
            catch(Exception e){
                System.out.println(e);
            }
        }else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]) {
        new PinChange("").setVisible(true);
    }
}
