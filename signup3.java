import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class signup3 extends JFrame implements ActionListener {
JRadioButton SavingB,CurrentB,FixedB,ReccB;

    signup3(){
        super("Registration form : Account Details");


        /*Image icon settings bank */
    ImageIcon image1 = new ImageIcon("C:\\Users\\manji\\bank management\\bankimg.png");
    Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon image3 = new ImageIcon(image2);
    JLabel label = new JLabel(image3);
    label.setBounds(330,5,100,100);
    add(label);


/*label for account DEtails */
            JLabel label13 = new JLabel("Account Details ");
            label13.setBounds(290,100,300,60);
            label13.setFont(new Font(null,Font.BOLD,30));
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
label16.setBounds(100,440,150,30);
label16.setFont(new Font(null,Font.PLAIN,18));
add(label16);
        



        /*frame settings */
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(850,800);
            setLayout(null);
            setVisible(true);
    }
    public static void main(String[] args){
            new signup3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
