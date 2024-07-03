import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
JRadioButton SavingB,CurrentB,FixedB,ReccB;
JCheckBox atm,mob,emailBox,internet,cheque,last;
JButton subButton,CanButton;
String formno;
    signup3(String formno){
        super("Registration form : Account Details");
        this.formno=formno;

        /*form no */
        JLabel labelF = new JLabel("Registration number: " +formno);
        labelF.setBounds(230,130,300,60);
        labelF.setFont(new Font(null,Font.BOLD,20));
        add(labelF);

        /*Image icon settings bank */
    ImageIcon image1 = new ImageIcon("C:\\Users\\manji\\bank management\\bank.png");
    Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon image3 = new ImageIcon(image2);
    JLabel label = new JLabel(image3);
    label.setBounds(330,5,100,100);
    add(label);


/*label for account DEtails */
            JLabel label13 = new JLabel("Account Details ");
            label13.setBounds(290,100,300,60);
            label13.setFont(new Font(null,Font.BOLD,25));
            add(label13);


     /*label for account type */

     JLabel label14 = new JLabel("Account Type : ");
     label14.setBounds(100,200,300,30);
     label14.setFont(new Font(null,Font.PLAIN,20));
     add(label14);


/*saving button */

SavingB = new JRadioButton("Saving Account");
SavingB.setBounds(110,250,200,30);
add(SavingB);

/*Fixed Button */
FixedB = new JRadioButton("Fixed Deposit Account");
FixedB.setBounds(360,250,280,30);
add(FixedB);

/*Current Ac Button */
CurrentB = new JRadioButton("Current Account");
CurrentB.setBounds(110,300,200,30);
add(CurrentB);

/*reccuring account button*/
ReccB = new JRadioButton("Reccuring Deposit Account");
ReccB.setBounds(360,300,200,30);
add(ReccB);

FixedB.setFocusable(false);
SavingB.setFocusable(false);
CurrentB.setFocusable(false);
ReccB.setFocusable(false);

ButtonGroup group5 = new ButtonGroup();

group5.add(FixedB);
group5.add(ReccB);
group5.add(CurrentB);
group5.add(SavingB);


/*Label for card number */

JLabel label15 = new JLabel("Card Number: ");
label15.setBounds(100,380,150,30);
label15.setFont(new Font(null,Font.PLAIN,18));
add(label15);

/*Label for PIN */

JLabel label16 = new JLabel("PIN: ");
label16.setBounds(100,450,150,30);
label16.setFont(new Font(null,Font.PLAIN,18));
add(label16);
        

/*label for services required */

JLabel label17 = new JLabel("Services Required: ");
label17.setBounds(100,520,250,30);
label17.setFont(new Font(null,Font.BOLD,20));
add(label17);


/*Checkbox for atm */

atm = new JCheckBox("  ATM");
atm.setBounds(100,580,150,30);
atm.setFocusable(false);
add(atm);


/*checkbox for mobile banking */

mob = new JCheckBox("Mobile Banking");
mob.setBounds(100,620,150,30);
mob.setFocusable(false);
add(mob);

/*checkbox for cheque book */

cheque = new JCheckBox("Cheque Book");
cheque.setBounds(280,580,150,30);
cheque.setFocusable(false);
add(cheque);


/*checkbox for last */

last = new JCheckBox("last");
last.setBounds(460,580,150,30);
last.setFocusable(false);
add(last);

/*checkbox for internet banking */

internet = new JCheckBox("Internet Banking");
internet.setBounds(280,620,150,30);
internet.setFocusable(false);
add(internet);

/*checkbox for emailalerts */
emailBox = new JCheckBox("Email/Alerts");
emailBox.setBounds(460,620,150,30);
emailBox.setFocusable(false);
add(emailBox);



/*checkbox for declaration */
JCheckBox deccheck = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge", true);
deccheck.setBounds(130,670,680,30);
deccheck.setFocusable(false);
add(deccheck);



/*submit button */
subButton = new JButton("Submit");
subButton.setBounds(170,720,100,30);
subButton.setFocusable(false);
subButton.addActionListener(this);
add(subButton);

/*Cancel button */
CanButton = new JButton("Cancel");
CanButton.setBounds(370,720,100,30);
CanButton.setFocusable(false);
CanButton.addActionListener(this);
add(CanButton);



        /*frame settings */
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(850,800);
            setLocationRelativeTo(null);
            setLayout(null);
            setVisible(true);
    }
    public static void main(String[] args){
            new signup3("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       
        String save = "";

        if(SavingB.isSelected()){
            save = "Savings Account";
        }else if(FixedB.isSelected()){
            save="Fixed Deposit Account";
        }else if(CurrentB.isSelected()){
            save="Current Account";
        }else if(ReccB.isSelected()){
            save="Reccuring Deposit Account";
        }
        //cardno setting using random
        Random ran1 = new Random();
        long card_num=(ran1.nextLong() % 90000000L) + 7654310000000L;
        String carno = " " +Math.abs(card_num);

        //pinno setting also using random
        Random ran2 = new Random();
        long pin_num = (ran2.nextLong() %9000L) + 1000L;
        String pinNo = " " +Math.abs(pin_num);

        String ser = "";
        if(atm.isSelected()){
            ser +="ATM Card";
        }else if(mob.isSelected()){
            ser+= "Mobile banking";
        }
        else if(internet.isSelected()){
            ser += "Internet Banking";
        }else if(emailBox.isSelected()){
            ser+="Email/Alerts";
        }else if(cheque.isSelected()){
            ser+="Cheque Book";
        }else if(last.isSelected()){
            ser+="E-statements";
        }

        try{
            if(e.getSource()==subButton){
                if(save.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill the Required Fields");
                }else{
                    connection conn3=new connection();
                    String query1 = "Insert into signupthree values('"+formno+"','"+save+"','"+carno+"','"+pinNo+"','"+ser+"')";
                    String query2 ="Insert into login values('"+formno+"','"+carno+"','"+pinNo+"')";
                    conn3.statement.executeUpdate(query1);
                    conn3.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card No: "+carno+"\n PIN: " +pinNo);
                    setVisible(false);
                }
            }else if(e.getSource()==CanButton){
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    
}
