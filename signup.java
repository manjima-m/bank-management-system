import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class signup extends JFrame implements ActionListener{
    /*for random reg number */
    Random random = new Random();
    int random_num = 1000+random.nextInt(9000);
    String reg_num = " "+Math.abs(random_num);

    
    JTextField textname,textfname,textmname,dob,email,address,city,pincode,state;
    JRadioButton genderM,genderF,genderO,married,unmarried;
    JButton button;

    signup(){
    super("Signup Form");

    /*Image icon settings bank */
    ImageIcon image1 = new ImageIcon("C:\\Users\\manji\\bank management\\bank.png");
    Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon image3 = new ImageIcon(image2);
    JLabel label = new JLabel(image3);
    label.setBounds(320,20,100,100);
    add(label);

    /*label for application form no*/
    JLabel label1 = new JLabel("Registration Number: " +reg_num);
    label1.setBounds(230,130,300,60);
    label1.setFont(new Font(null,Font.BOLD,20));
    add(label1);
    

/*label for name */
JLabel label2 = new JLabel("Name: ");
label2.setBounds(130,200,300,26);
label2.setFont(new Font(null,Font.PLAIN,18));
add(label2);

/*Textfield for name */
textname = new JTextField();
textname.setBounds(350,200,350,26);
add(textname);


/*label for fathers name */
JLabel label3 = new JLabel("Father's Name: ");
label3.setBounds(130,250,300,26);
label3.setFont(new Font(null,Font.PLAIN,18));
add(label3);

/*textfield for fathers name */
textfname = new JTextField();
textfname.setBounds(350,250,350,26);
add(textfname);



/*label for mothers name */
JLabel label4 = new JLabel("Mother's Name: ");
label4.setBounds(130,300,300,26);
label4.setFont(new Font(null,Font.PLAIN,18));
add(label4);

/*adding textfield for mothers name */
textmname = new JTextField();
textmname.setBounds(350,300,350,26);
add(textmname);

/*label for DOB */
JLabel label5 = new JLabel("DOB: ");
label5.setBounds(130,350,300,26);
label5.setFont(new Font(null,Font.PLAIN,18));
add(label5);


/*dobfield  */

dob = new JTextField();
dob.setBounds(350,350,350,26);
add(dob);


/*label for Gender */

JLabel label6 = new JLabel("Gender: ");
label6.setBounds(130,400,300,26);
label6.setFont(new Font(null,Font.PLAIN,18));
add(label6);

/*genderbutton */

genderF = new JRadioButton("Female");
genderM = new JRadioButton("Male");
genderO = new JRadioButton("Others");

genderF.setBounds(350,400,100,26);
genderM.setBounds(470,400,100,26);
genderO.setBounds(590,400,100,26);

ButtonGroup group1 = new ButtonGroup();
group1.add(genderF);
group1.add(genderM);
group1.add(genderO);


add(genderF);
add(genderM);
add(genderO);





/*label for email address */
JLabel label7 = new JLabel("Email Address: ");
label7.setBounds(130,450,300,26);
label7.setFont(new Font(null,Font.PLAIN,18));
add(label7);

/*textfield for email address */

email = new JTextField();
email.setBounds(350,450,350,26);
add(email);


/*label for marital status */
JLabel label8 = new JLabel("Marital Status: ");
label8.setBounds(130,500,300,26);
label8.setFont(new Font(null,Font.PLAIN,18));
add(label8);

/*radiobuttons for marital status */

married = new JRadioButton("Married");
married.setBounds(350,500,100,26);
add(married);

unmarried = new JRadioButton("Unmarried");
unmarried.setBounds(470,500,100,26);
add(unmarried);

ButtonGroup group2 = new ButtonGroup();
group2.add(married);
group2.add(unmarried);


/*label for address */

JLabel label9 = new JLabel("Address: ");
label9.setBounds(130,550,300,26);
label9.setFont(new Font(null,Font.PLAIN,18));
add(label9);


/*textfield for address */

address = new JTextField();
address.setBounds(350,550,350,26);
add(address);

/*label for city */

JLabel label10 = new JLabel("City: ");
label10.setBounds(130,600,300,26);
label10.setFont(new Font(null,Font.PLAIN,18));
add(label10);


/*textfield for city */

city = new JTextField();
city.setBounds(350,600,350,26);
add(city);


/*Label for pincode */

JLabel label11 = new JLabel("Pincode: ");
label11.setBounds(130,650,300,26);
label11.setFont(new Font(null,Font.PLAIN,18));
add(label11);

/*textfield for pincode */
pincode = new JTextField();
pincode.setBounds(350,650,350,26);
add(pincode);


/*label for state */

JLabel label12 = new JLabel("State: ");
label12.setBounds(130,700,300,30);
label12.setFont(new Font(null,Font.PLAIN,18));
add(label12);

/*textfield for state */

state = new JTextField();
state.setBounds(350,700,350,26);
add(state);


/*submit button */
    button = new JButton("Next>>>");
    button.setBounds(600,740,100,30);
    button.addActionListener(this);
    add(button);
 
    /*frame settings */
    setSize(800,850);
    setLocation(300,0);
    setResizable(false);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(Color.WHITE);
    setVisible(true);

    }
    public static void main(String[] args){
        new signup();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = reg_num;
        String name = textname.getText();
        String fname = textfname.getText();
        String mname = textmname.getText();
        String dateofB = dob.getText();//((JTextField) dateChooser.getDateEditor().getUIComponent()).getText();
        String gen = null;
        if(genderM.isSelected()){
                gen="Male";
        }else if(genderF.isSelected()){
            gen="Female";
        }else{
            gen = "Others";
        }
        String mail = email.getText();

        String mstatus = null;
        if(married.isSelected()){
            mstatus = "Married";
        }else{
            mstatus = "Unmarried";
        }
        String addr = address.getText();
        String cite = city.getText();
        String pinc = pincode.getText();
        String stat = state.getText();

        try{
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                connection conn1 = new connection();
                String q = "insert into signup values ('"+formno+"','"+name+"', '"+fname+"','"+mname+"','"+dateofB+"','"+gen+"','"+mail+"','"+mstatus+"','"+addr+"','"+cite+"','"+pinc+"','"+stat+"')";
                conn1.statement.executeUpdate(q);
                new signup2();
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }


    }
}

