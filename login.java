import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JFrame implements ActionListener{
        JLabel label,label2,label3;
        JTextField field1;
        JPasswordField password;
        JButton signButton,clrButton,signupButton;

    login(){
     super("Bank Management System");

     /*bank logo */
     ImageIcon image1 = new ImageIcon("C:\\Users\\manji\\bank management\\bankimg.png");
     Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
     ImageIcon image3 = new ImageIcon(image2);
     JLabel label = new JLabel(image3);
     label.setBounds(380,0,100,100);
     add(label);




    /*card logo */
    ImageIcon image11 = new ImageIcon("C:\\Users\\manji\\bank management\\card.webp");
    Image image21 = image11.getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT);
    ImageIcon image31 = new ImageIcon(image21);
    JLabel label1 = new JLabel(image31);
    label1.setBounds(750,300,110,110);
    add(label1);


    /*for welcome */
   label = new JLabel("Welcome to ATM");
   label.setBounds(280,110,450,40);
   label.setForeground(Color.BLACK);
  label.setFont(new Font(null,Font.BOLD,35));
   add(label);


   /*ask for card number */
        label2 = new JLabel("Card Number: ");
        label2.setFont(new Font(null,Font.PLAIN,15));
        label2.setBounds(150,200,350,30);
        add(label2);



        /*card number textfield */

        field1 = new JTextField();
        field1.setBounds(300,200,350,30);
        field1.setFont(new Font(null,Font.PLAIN,15));
        add(field1);



        /*Ask for pin number */
        label3 = new JLabel("PIN: ");
        label3.setFont(new Font(null,Font.PLAIN,15));
        label3.setBounds(150,290,350,30);
        add(label3);



        /*PIN password */
        password = new JPasswordField();
        password.setBounds(300,290,350,30);
        add(password);


       /*Signin setup */

       signButton = new JButton("Sign In");
       signButton.setFont(new Font(null,Font.PLAIN,14));
       signButton.setForeground(Color.white);
       signButton.setBackground(Color.BLACK);
       signButton.setBounds(350,370,100,30);
       signButton.setFocusable(false);
       signButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       signButton.addActionListener(this);
       add(signButton);

       /*clear button setup */

       clrButton = new JButton("Clear");
       clrButton.setFont(new Font(null,Font.PLAIN,14));
       clrButton.setForeground(Color.white);
       clrButton.setBackground(Color.BLACK);
       clrButton.setBounds(500,370,100,30);
       clrButton.setFocusable(false);
       clrButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       clrButton.addActionListener(this);
       add(clrButton);

       /*SignUp button */


       signupButton = new JButton("Register");
       signupButton.setFont(new Font(null,Font.PLAIN,14));
       signupButton.setForeground(Color.white);
       signupButton.setBackground(Color.BLACK);
       signupButton.setBounds(350,430,255,30);
       signupButton.setFocusable(false);
       signupButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       signupButton.addActionListener(this);
       add(signupButton);


    
    /*background image */
    ImageIcon image111 = new ImageIcon("C:\\Users\\manji\\bank management\\card.webp");
    Image image211 = image111.getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT);
    ImageIcon image311 = new ImageIcon(image211);
    JLabel label11 = new JLabel(image311);
    label11.setBounds(650,300,110,110);
    add(label11);

   


    /*frame setting */
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBackground(Color.blue);
     setSize(850,580);
     setLocation(350,100);
    setLayout(null);
     setVisible(true);
    }
    
    public static void main(String[] args){

        new login();

    }

    @Override //login class
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==signButton){

       }else if(e.getSource()==clrButton){
            field1.setText("");
            password.setText(""); //for clear the existing text and remove the text from pin and card no
       }else if(e.getSource()==signupButton){
          new signup();
          dispose();
       }
        
    }
}