package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Login extends JFrame implements ActionListener
{
    JLabel welcomeLbl, namelbl, passlbl, imageLabel;
    JTextField namefld;
    JPasswordField passfld;
    JButton loginbtn, rgstrbtn, eyebutton;
    Color mycolor, lblcolor;
    Font myfont;
    ImageIcon img, eye, eye2;
    JPanel rightPanel, leftPanel;

    public Login()
    {
        this.setSize(700, 550);
        this.setTitle("CAFE MistyMegh");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mycolor = new Color(45, 55, 65);
        lblcolor = new Color(33, 150, 243);
        myfont = new Font("Cambria", Font.PLAIN, 24);

        leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBounds(0, 0, 350, 550);
        leftPanel.setBackground(Color.BLACK);

        rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBounds(350, 0, 350, 550);
        rightPanel.setBackground(new Color(209, 209, 209));

        imageLabel = new JLabel();
        imageLabel.setBounds(0, 0, 425, 550);

        img = new ImageIcon("./Images/cafe.jpg");
        Image im = img.getImage().getScaledInstance(350, 550, Image.SCALE_SMOOTH);
        ImageIcon re = new ImageIcon(im);
        imageLabel.setIcon(re);

        leftPanel.add(imageLabel);

        welcomeLbl = new JLabel("Welcome to cafe MistyMegh");
        welcomeLbl.setFont(new Font("Cambria", Font.BOLD, 23));
        welcomeLbl.setForeground(Color.black);
        welcomeLbl.setBounds(20, 30, 300, 40);
        rightPanel.add(welcomeLbl);

        namelbl = new JLabel("User Name :");
        namelbl.setBounds(30, 100, 160, 40);
        namelbl.setForeground(Color.black);
        namelbl.setFont(myfont);
        rightPanel.add(namelbl);

        namefld = new JTextField();
        namefld.setBounds(30, 140, 220, 30);
        rightPanel.add(namefld);

        passlbl = new JLabel("Password :");
        passlbl.setBounds(30, 170, 160, 40);
        passlbl.setForeground(Color.black);
        passlbl.setFont(myfont);
        rightPanel.add(passlbl);

        passfld = new JPasswordField();
        passfld.setBounds(30, 210, 220, 30);
        final char defaultEchoChar = passfld.getEchoChar(); // Store default echo char
        rightPanel.add(passfld);

        eyebutton = new JButton();
        eyebutton.setBounds(270, 210, 50, 30);
        rightPanel.add(eyebutton);

        eye = new ImageIcon("./Images/eyecon.jpg");
        Image new_eye = eye.getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);
        ImageIcon res = new ImageIcon(new_eye);
        eyebutton.setIcon(res);

        eyebutton.addActionListener(new ActionListener()
        {
            boolean passVisible = false;

            public void actionPerformed(ActionEvent e)
            {
                if(passVisible)
                {
                    passfld.setEchoChar(defaultEchoChar);
                    eyebutton.setIcon(res);
                }
                else
                {
                    passfld.setEchoChar((char) 0);
                    eye2 = new ImageIcon("./Images/eyecon2.jpg");
                    Image new_eye2 = eye2.getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);
                    ImageIcon res2 = new ImageIcon(new_eye2);
                    eyebutton.setIcon(res2);
                }
                passVisible = !passVisible;
            }
        });

        rgstrbtn = new JButton("SignUp");
        rgstrbtn.setBounds(180, 280, 100, 40);
        rgstrbtn.setFocusable(false);
        rgstrbtn.setBackground(lblcolor);
        rightPanel.add(rgstrbtn);

        loginbtn = new JButton("Login");
        loginbtn.setBounds(30, 280, 100, 40);
        loginbtn.setFocusable(false);
        loginbtn.setBackground(lblcolor);
        rightPanel.add(loginbtn);

        loginbtn.addActionListener(this);
        rgstrbtn.addActionListener(this);

        this.add(rightPanel);
        this.add(leftPanel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == rgstrbtn)
        {
            this.setVisible(false);
            SignUp s = new SignUp();
            s.setVisible(true);
        }

        if (e.getSource() == loginbtn)
        {
            String username = namefld.getText().trim();
            char[] passwordChars = passfld.getPassword();
            String password = String.valueOf(passwordChars).trim();

            if (username.isEmpty() || password.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Fillup all Information carefully", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean canLogin = false;
            try
            {
                File file = new File("./dat.txt");
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine())
                {
                    String line = sc.nextLine();
                    String[] part = line.split("\t");

                    if (part.length == 3)
                    {
                        String store_username = part[0].trim();
                        String store_password = part[2].trim();

                        if (username.equals(store_username) && password.equals(store_password))
                        {
                            canLogin = true;
                            break;
                        }
                    }
                }
                sc.close();

                if (canLogin)
                {
                    JOptionPane.showMessageDialog(null, "Login successful");
                    this.setVisible(false);
                    HomePage home = new HomePage();
                    home.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Your Username or Password is Invalid!", "Login unsuccessful", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            catch (Exception me)
            {
                me.printStackTrace();
            }
        }
    }
}
