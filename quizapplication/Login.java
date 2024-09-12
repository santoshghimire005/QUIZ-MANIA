package quizapplication;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {
    JButton submit, quit;
    JTextField nameBox;

    public Login() {
        JLabel heading = new JLabel("QUIZ MANIA");
        heading.setBounds(650, 60, 300, 45);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(550, 180, 200, 50);
        name.setFont(new Font("viner Hand ITC", Font.BOLD, 20));
        add(name);

        nameBox = new JTextField();
        nameBox.setBounds(750, 180, 150, 40);
        add(nameBox);

        submit = new JButton("Submit ");
        submit.setBounds(750, 280, 150, 40);
        submit.addActionListener(this);
        add(submit);

        quit = new JButton("Quit Game");
        quit.setBounds(550, 280, 150, 40);
        quit.addActionListener(this);
        add(quit);

        getContentPane().setBackground(Color.WHITE);
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

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name= nameBox.getText();
            setVisible(false);
            dispose();
            new Rules(name);

        }

        else if (ae.getSource() == quit) {
            setVisible(false);
            dispose();

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
