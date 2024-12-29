import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    JButton rules, back;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
//        JLabel image = new JLabel(i1);
//        image.setBounds(0, 0, 600, 500);
//        add(image);

        JLabel welcome = new JLabel("Hello, there... Welcome to");
        welcome.setBounds(260, 120, 500, 45);
        welcome.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
        welcome.setForeground(new Color(16, 16, 16));
        add(welcome);

        JLabel heading = new JLabel("Knowledge Crush");
        heading.setBounds(240, 160, 500, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        rules = new JButton("Start");
        rules.setBounds(220, 400, 120, 40);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Close");
        back.setBounds(480, 400, 120, 40);
        back.setBackground(new Color(255, 15, 70));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.PLAIN, 20));
        back.addActionListener(this);
        add(back);

        setSize(820, 650);
        setLocation(360, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            setVisible(false);
            new Rules();
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}