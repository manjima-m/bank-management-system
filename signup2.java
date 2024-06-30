
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class signup2 extends JFrame implements ActionListener{

    
    JTextField pan_no,aadhar_no;
    JComboBox religion,category,education,occupation,income;
    JRadioButton senioryes,seniorno,yesexisted,notexisted;
    JButton button;
    String formno;
    signup2(){
    super("Signup Form");
    
    this.formno = formno;


    /*Image icon settings bank */
    ImageIcon image1 = new ImageIcon("C:\\Users\\manji\\bank management\\bank.png");
    Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon image3 = new ImageIcon(image2);
    JLabel label = new JLabel(image3);
    label.setBounds(320,20,100,100);
    add(label);

    /*label for additional details
    JLabel label1 = new JLabel("Additional Details");
    label1.setBounds(230,130,300,60);
    label1.setFont(new Font(null,Font.BOLD,20));
    add(label1);*/

    JLabel labelF = new JLabel("Registration number: " +formno);
    labelF.setBounds(230,130,300,60);
    labelF.setFont(new Font(null,Font.BOLD,20));
    add(labelF);
    
    

/*label for name */
JLabel label2 = new JLabel("Religion: ");
label2.setBounds(130,200,300,26);
label2.setFont(new Font(null,Font.PLAIN,18));
add(label2);

/*combobox for religion */
String[] rel = {"Hindhu","Christian","Muslim","Others"};
religion = new JComboBox(rel);
religion.setBounds(350,200,350,26);
add(religion);


/*label for fathers name */
JLabel label3 = new JLabel("Category: ");
label3.setBounds(130,250,300,26);
label3.setFont(new Font(null,Font.PLAIN,18));
add(label3);

/*textfield for Caetogory */
String[] cat = {"General","OBC","SC","ST"};
category = new JComboBox(cat);
category.setBounds(350,250,350,26);
add(category);



/*label for income */
JLabel label4 = new JLabel("Income: ");
label4.setBounds(130,300,300,26);
label4.setFont(new Font(null,Font.PLAIN,18));
add(label4);

/*adding textfield for income*/
String[] inc = {"Below 250000","Above 250000"};
income = new JComboBox(inc);
income.setBounds(350,300,350,26);
add(income);

/*label for Education */
JLabel label5 = new JLabel("Education ");
label5.setBounds(130,350,300,26);
label5.setFont(new Font(null,Font.PLAIN,18));
add(label5);


/*Education  */
String[] edu = {"PostGraduated","Graduated","Diploma","Plus Two","SSLC"};
education = new JComboBox(edu);
education.setBounds(350,350,350,26);
add(education);




/*label foroccupation */
JLabel label7 = new JLabel("Occupation: ");
label7.setBounds(130,400,300,26);
label7.setFont(new Font(null,Font.PLAIN,18));
add(label7);

/*combobox for Occupation */

String[] ocu = {"Private","Government","Business","Others"};
occupation = new JComboBox(ocu);
occupation.setBounds(350,400,350,26);
add(occupation);


/*label for pan_no */

JLabel label6 = new JLabel("PAN Number: ");
label6.setBounds(130,450,300,26);
label6.setFont(new Font(null,Font.PLAIN,18));
add(label6);

/*textfield for pan_num */
pan_no = new JTextField();
pan_no.setBounds(350,450,350,26);
add(pan_no);

/*label for aadhar */
JLabel label8 = new JLabel("AADHAR Number: ");
label8.setBounds(130,500,300,26);
label8.setFont(new Font(null,Font.PLAIN,18));
add(label8);

/*textfield for aadhar */

aadhar_no = new JTextField();
aadhar_no.setBounds(350,500,350,26);
add(aadhar_no);


/*label for senior */

JLabel label9 = new JLabel("Senior citizen?:");
label9.setBounds(130,550,300,26);
label9.setFont(new Font(null,Font.PLAIN,18));
add(label9);

/*radiobutton for senior citizen */

senioryes = new JRadioButton("Yes");
seniorno =  new JRadioButton("No");

ButtonGroup group3 = new ButtonGroup();
group3.add(senioryes);
group3.add(seniorno);

senioryes.setBounds(350,550,100,26);
seniorno.setBounds(470,550,100,26);

add(senioryes);
add(seniorno);



/*label for existing ac */

JLabel label10 = new JLabel("Existing account?:");
label10.setBounds(130,600,300,26);
label10.setFont(new Font(null,Font.PLAIN,18));
add(label10);

/*radiobutton for senior citizen */

yesexisted = new JRadioButton("Yes");
notexisted =  new JRadioButton("No");

ButtonGroup group4 = new ButtonGroup();
group4.add(yesexisted);
group4.add(notexisted);

yesexisted.setBounds(350,600,100,26);
notexisted.setBounds(470,600,100,26);

add(yesexisted);
add(notexisted);









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
        new signup2();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            
        }


    }
}



