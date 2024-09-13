package quizapplication;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Firstqn extends JFrame {

    JButton next, fifty, submit;
    JRadioButton opt1, opt2, opt3, opt4;
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][]= new String [10][1];
    JLabel qno, question;
    ButtonGroup groupoptions;
    public static int timer = 3;
    public static int ans_given = 0;
    public static int count = 0;

    public Firstqn() {

        qno = new JLabel();
        qno.setBounds(100, 260, 30, 20);
        qno.setFont(new Font("Dialog", Font.PLAIN, 17));
        add(qno);

        question = new JLabel();
        question.setBounds(130, 260, 750, 30);
        question.setBackground(Color.WHITE);
        question.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(question);

        opt1 = new JRadioButton();
        opt1.setBounds(100, 300, 400, 20);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(100, 330, 400, 20);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(100, 360, 400, 20);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(100, 390, 400, 20);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        next = new JButton("Next");
        next.setBounds(720, 310, 100, 30);
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        add(next);

        submit = new JButton("submit");
        submit.setBounds(720, 360, 100, 30);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        add(submit);

        fifty = new JButton("50-50 ");
        fifty.setBounds(720, 410, 100, 30);
        fifty.setBackground(Color.BLUE);
        fifty.setForeground(Color.WHITE);
        add(fifty);

        getContentPane().setBackground(Color.black);
        setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));
        JLabel image = new JLabel(img);
        image.setBounds(0, 0, 1000, 250);
        add(image);

        start(count);

        setBounds(200, 170, 1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left : " + timer + " sec";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 20));

        if (timer > 0) {
            g.drawString(time, 700, 310);
            
        } else {
            g.drawString("Times up!!!", 700, 310);
        }
        timer--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();

        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 3;
        } else if (timer < 0) {
            timer = 3;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";

            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();

            }
            count++;
            start(count);
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText("" + questions[count][0] + "");
        opt1.setText("" + questions[count][1] + "");
        opt2.setText("" + questions[count][2] + "");
        opt3.setText("" + questions[count][3] + "");
        opt4.setText("" + questions[count][4] + "");

    }

    public static void main(String[] args) {
        new Firstqn();

    }

}