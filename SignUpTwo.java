
package bank.management.system;

/**
 *
 * @author Naman
 */

import javax.swing.*;  //Swing
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class SignUpTwo extends JFrame implements ActionListener {
    JTextField pan,aadhar;
    JButton next,back;
    JRadioButton syes,sno,eyes,eno;
    
    JComboBox religion,category,income,occupation,education;
    String formno;
    
    SignUpTwo(String formno){
        this.formno=formno;
        setLayout(null);
        // Set the color of frame
        getContentPane().setBackground(Color.WHITE);
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details: ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religionLabel = new JLabel("Religion: ");
        religionLabel.setFont(new Font("Raleway",Font.BOLD,20));
        religionLabel.setBounds(100, 140, 200, 30);
        add(religionLabel);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300,140,400,30);
        add(religion);
        
        
       
        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        
        String valcategory[] = {"General","SC","ST","OBC","Others"};
        category = new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        category.setFont(new Font("Raleway",Font.BOLD,14));
        category.addActionListener(this);
        add(category);
        
        
        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomecategory[] = {"Null","<150000","<250000","<500000","Up to 1000000",">1000000"};
        income = new JComboBox(incomecategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300,240,400,30);
        income.setFont(new Font("Raleway",Font.BOLD,14));
        income.addActionListener(this);
        add(income);
        
        
        
        JLabel gender = new JLabel("Educational ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
       
        
        JLabel email = new JLabel("Qualifications: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 310, 220, 30);
        add(email);
        
        String educationalValues[] = {"Non-Graduation","Graduate","Post-Graduation","","Others"};
        education = new JComboBox(educationalValues);
        education.setBackground(Color.WHITE);
        education.setBounds(300,298,400,30);
        education.setFont(new Font("Raleway",Font.BOLD,14));
        education.addActionListener(this);
        add(education);
       
        
        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 390, 220, 30);
        add(marital);
        
        String occupationalValues[] = {"Salaried","Self-Employed","Business","Student","Others"};
        occupation = new JComboBox(occupationalValues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,390,400,30);
        occupation.setFont(new Font("Raleway",Font.BOLD,14));
        occupation.addActionListener(this);
        add(occupation);
        
        
        JLabel address = new JLabel("PAN No.: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 440, 220, 30);
        add(address);
        
        pan = new JTextField();
        pan.setBounds(300,440,400,30);
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.addActionListener(this);
        add(pan);
        
        
        JLabel city = new JLabel("Aadhar No.: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 490, 220, 30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setBounds(300,490,400,30);
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.addActionListener(this);
        add(aadhar);
        
        
        JLabel state = new JLabel("Senior Citizen ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 540, 220, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        syes.addActionListener(this);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        sno.addActionListener(this);
        add(sno);
        
        ButtonGroup senior = new ButtonGroup();
        senior.add(syes);
        senior.add(sno);
        
        
        
        
        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 590, 220, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        eyes.addActionListener(this);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        eno.addActionListener(this);
        add(eno);
        
        ButtonGroup existing = new ButtonGroup();
        existing.add(eyes);
        existing.add(eno);
        
        
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        next.setBounds(620,660,80,30);
        add(next);
        
        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.addActionListener(this);
        back.setBounds(180,660,80,30);
        add(back);
        
        //Creating a frame of 850 and 800
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation  = (String) education.getSelectedItem();
        String soccupation  = (String) occupation.getSelectedItem();
        String seniorcitizen  = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
            
        }
        else  if(sno.isSelected()){
            seniorcitizen = "No";
            
        }else {
            JOptionPane.showMessageDialog(null, "Please select an option for Senior Citizen");
            return;
        }
        
        
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        }
        else if(eno.isSelected()){
            existingaccount="No";
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select an option for Existing Account.");
            return;
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        try{
           if(religion.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Religion field is Mandatory.");
            }
            else{
                Conn c = new Conn();
                String query = "INSERT INTO signupformTwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) VALUES ('" + formno + "', '" + sreligion + "', '" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "', '" + saadhar + "', '" + seniorcitizen + "', '" + existingaccount + "')";
                c.s.executeUpdate(query);
                // signup 3 class object
                new SignUpThree(formno);
            }
//            if(pan.equals("")){
//                JOptionPane.showMessageDialog(null, "Pan field is Mandatory.");
//                return;
//            }
//            if(aadhar.equals("")){
//                JOptionPane.showMessageDialog(null, "Pan field is Mandatory.");
//                return;
//            }
//            if(span.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "PAN field is mandatory.", "Error", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            if(saadhar.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Aadhar field is mandatory.", "Error", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
    }
    public static void main(String args[]) {
        new SignUpTwo("");
    }
}

