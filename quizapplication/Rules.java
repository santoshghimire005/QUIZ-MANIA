package quizapplication;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;

    public Rules(String name) {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel greet = new JLabel("Welcome "+name+" to Quiz Mania ");
        greet.setBounds(550, 10, 500, 20);
        greet.setFont(new Font("viner Hand ITC", Font.BOLD, 20));
        greet.setForeground(Color.WHITE);
        add(greet);

        JLabel heading = new JLabel("RULES");
        heading.setBounds(700, 65, 300, 20);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD, 18));
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel rule1 = new JLabel("1. You need to go through every question to submit your result");
        rule1.setBounds(550, 95, 500, 20);
        rule1.setFont(new Font("viner Hand ITC", Font.PLAIN, 14));
        rule1.setForeground(Color.WHITE);
        add(rule1);

        JLabel rule2 = new JLabel("2. You cannot use any computer or AI assistance.");
        rule2.setBounds(550, 125, 500, 20);
        rule2.setFont(new Font("viner Hand ITC", Font.PLAIN, 14));
        rule2.setForeground(Color.WHITE);
        add(rule2);

        JLabel rule3 = new JLabel("3. Each right answer will increase your points by 10 ");
        rule3.setBounds(550, 155, 500, 20);
        rule3.setFont(new Font("viner Hand ITC", Font.PLAIN, 14));
        rule3.setForeground(Color.WHITE);
        add(rule3);

        JLabel rule4 = new JLabel("4. There is a time limit of 30 seconds for each questions ");
        rule4.setBounds(550, 185, 500, 20);
        rule4.setFont(new Font("viner Hand ITC", Font.PLAIN, 14));
        rule4.setForeground(Color.WHITE);
        add(rule4);

        JLabel rule5 = new JLabel("5. There won't be negative marking for wrong answers ");
        rule5.setBounds(550, 215, 500, 20);
        rule5.setFont(new Font("viner Hand ITC", Font.PLAIN, 14));
        rule5.setForeground(Color.WHITE);
        add(rule5);

        JLabel rule6 = new JLabel("5. please don't ask for any prizes after answering all questions. ");
        rule6.setBounds(550, 245, 500, 20);
        rule6.setFont(new Font("viner Hand ITC", Font.PLAIN, 14));
        rule6.setForeground(Color.WHITE);
        add(rule6);

        start = new JButton("START PLAYING");
        start.setBounds(690, 380, 200, 30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.setFont(new Font("viner Hand ITC", Font.BOLD, 14));
        start.addActionListener(this);
        add(start);

        back = new JButton("BACK");
        back.setBounds(550, 380, 120, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("viner Hand ITC", Font.BOLD, 14));
        back.addActionListener(this);
        add(back);

        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));
        JLabel image = new JLabel(img);
        image.setBounds(0, 0, 500, 500);
        add(image);

        setLocation(200, 170);
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            dispose();
            new Firstqn(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
            dispose();
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("user");
    }

}
