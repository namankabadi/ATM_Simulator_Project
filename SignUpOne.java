package bank.management.system;

/**
 *
 * @author Naman
 */
//Importing Packages 

import javax.swing.*;  //Swing
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class SignUpOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    
    SignUpOne(){
        
        setLayout(null);
        // Set the color of frame
        getContentPane().setBackground(Color.WHITE);
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details: ");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Enter Your Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 200, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.addActionListener(this);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.addActionListener(this);
        add(fnameTextField);
        
        
        JLabel dob = new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        //dateChooser.addActionListener(this);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        male.addActionListener(this);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        female.addActionListener(this);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 340, 220, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.addActionListener(this);
        add(emailTextField);
        
        JLabel marital = new JLabel("Mariatal Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 390, 220, 30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        married.addActionListener(this);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        unmarried.addActionListener(this);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        other.addActionListener(this);
        add(other);
        
        
        ButtonGroup marriedgroup = new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(unmarried);
        marriedgroup.add(other);
        //marriedgroup.addActionListener(this);
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 440, 220, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.addActionListener(this);
        add(addressTextField);
        
        
        JLabel city = new JLabel("Enter Your City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 490, 220, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.addActionListener(this);
        add(cityTextField);
        
        
        JLabel state = new JLabel("Enter Your State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 540, 220, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.addActionListener(this);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Enter Pin Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 590, 220, 30);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setBounds(300,590,400,30);
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.addActionListener(this);
        add(pinTextField);
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        next.setBounds(620,660,80,30);
        add(next);
        
        
        
        //Creating a frame of 850 and 800
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random; //long
        String name = nameTextField.getText();
        
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender  = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else  if(female.isSelected()){
            gender = "Female";
        }
        
        
        String email = emailTextField.getText();
        String marital=null;
        if(unmarried.isSelected()){
            marital="Single";
        }
        else if(married.isSelected()){
            marital="Married";
        }
        else if(other.isSelected()){
            marital= "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pinTextField.getText();
        
        try{
            if (ae.getSource() instanceof JRadioButton) {
                   // If the action event was triggered by a radio button, do nothing
                    return;
             }
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name field is Mandatory.");
            }
            else{
                Conn c = new Conn();
                String query = "INSERT INTO signup (formno, name, dob, gender, email, marital_status, address, city, state, pin) VALUES ('" + formno + "', '" + name + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + state + "', '" + pincode + "')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUpTwo(formno).setVisible(true);

            }
//           
//            if(dob.equals("")){
//                JOptionPane.showMessageDialog(null, "Date Of Birth field is Mandatory.");
//            }
//            
//            if (!male.isSelected() && !female.isSelected()) {
//                JOptionPane.showMessageDialog(this, "Please select a gender");
//            }

//            if(email.equals("")){
//                JOptionPane.showMessageDialog(null, "Email field is Mandatory.");
//            }
//            if(address.equals("")){
//                JOptionPane.showMessageDialog(null, "Address field is Mandatory.");
//            }
//            if(city.equals("")){
//                JOptionPane.showMessageDialog(null, "City field is Mandatory.");
//            }
//            if(state.equals("")){
//                JOptionPane.showMessageDialog(null, "State field is Mandatory.");
//            }
//            if(pincode.equals("")){
//                JOptionPane.showMessageDialog(null, "pincode field is Mandatory.");
//            }
//            
//            if (!married.isSelected() && !unmarried.isSelected() && !other.isSelected()) {
//                JOptionPane.showMessageDialog(this, "Please select a marital status");
//               
//            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    public static void main(String args[]) {
        new SignUpOne();
    }
}
