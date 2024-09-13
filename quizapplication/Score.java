package quizapplication;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


public class Score extends JFrame implements ActionListener {
    int result;
    String name;
    JButton replay,quit;
    
    public Score(String name, int result){
        this.result=result;
        this.name=name;

        JLabel greet= new JLabel("Thanks for playing "+name);
        greet.setBounds(550, 160, 600, 40);
        greet.setFont(new Font("Tahoma", Font.BOLD, 30));
        greet.setBackground(Color.BLACK);
        greet.setForeground(Color.WHITE);
        add(greet);


        JLabel marks= new JLabel(" Your score is "+ result);
        marks.setBounds(550, 220, 600, 30);
        marks.setFont(new Font("Tahoma", Font.BOLD, 30));
        marks.setBackground(Color.BLACK);
        marks.setForeground(Color.WHITE);
        add(marks);



        replay = new JButton("Play again ");
        replay.setBounds(650, 280, 150, 40);
        replay.setBackground(Color.BLUE);
        replay.setForeground(Color.WHITE);
        replay.setFont(new Font("Tahoma", Font.BOLD, 20));
        replay.addActionListener(this);
        add(replay);

        quit = new JButton("Quit Game");
        quit.setBounds(650, 330, 150, 40);
        quit.setBackground(Color.BLUE);
        quit.setForeground(Color.WHITE);
        quit.setFont(new Font("Tahoma", Font.BOLD, 20));
        quit.addActionListener(this);
        add(quit);



        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i2= img.getImage().getScaledInstance(500, 460, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 500, 460);
        add(image);

        setLocation(200, 170);
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==replay){
            setVisible(false);
            dispose();
            new Login();

        }
        else if (ae.getSource() == quit) {
            setVisible(false);
            dispose();

        }
    }
    public static void main(String[] args) {
        new Score("user",10);
    }
}
