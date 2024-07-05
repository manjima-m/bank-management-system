import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Pin extends JFrame{
    JTextField t1,t2;
    JButton deposit,back;
    Pin(){
        
        setSize(1000,800);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Change Your PIN");
        label1.setBounds(180,50,300,50);
        label1.setFont(new Font(null,Font.BOLD,30));
        add(label1);

        JLabel label2 = new JLabel("New PIN: ");
        label2.setBounds(230,170,200,30);
        label2.setFont(new Font(null,Font.PLAIN,20));
        add(label2);

        JLabel label3 = new JLabel("Re-Enter PIN: ");
        label3.setBounds(230,240,200,30);
        label3.setFont(new Font(null,Font.PLAIN,20));
        add(label3);

        t1 = new JTextField();
        t1.setBounds(400,170,300,30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(400,230,300,30);
        add(t2);

        deposit = new JButton("DEPOSIT");
        deposit.setBounds(600,500,230,35);
        deposit.setBackground(Color.BLACK);
        deposit.setForeground(Color.WHITE);
        deposit.setFocusable(false);
        add(deposit);


        back = new JButton("BACK");
        back.setBounds(600,600,230,35);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        add(back);

        
        setVisible(true);
    }

    public static void main(String[] args){
        new Pin();
    }
}