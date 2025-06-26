package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Cart extends JFrame implements ActionListener, MouseListener {
    JLabel bgLabel;
    JTextArea DetailsTextArea;
    JButton deleteButton;
    JButton DetailsButton;
    JButton backButton;
    Font f1;
    Font f2;
    Color c1;
    Color originalreg;
    Color originalback;

    public Cart() {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 700);
        this.setResizable(false);
        this.setTitle("Order Details");
        this.setLocationRelativeTo(null);

        c1 = new Color(209, 209, 209);
        f1 = new Font("Calibri", Font.BOLD, 26);
        f2 = new Font("Times New Roman", Font.PLAIN, 20);

        bgLabel = new JLabel();
        bgLabel.setLayout(null);
        bgLabel.setBounds(0, 0, 500, 700);
        bgLabel.setBackground(c1);
        bgLabel.setOpaque(true);

        DetailsTextArea = new JTextArea();
        DetailsTextArea.setBounds(30, 120, 420, 450);
        DetailsTextArea.setFont(f1);
        DetailsTextArea.setLineWrap(true);
        DetailsTextArea.setWrapStyleWord(true);
        DetailsTextArea.setCaretPosition(0);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(50, 600, 150, 30);
        deleteButton.setFont(f2);
        deleteButton.setFocusable(false);

        backButton = new JButton("Back");
        backButton.setBounds(300, 600, 150, 30);
        backButton.setFont(f2);
        backButton.setFocusable(false);

        originalback = backButton.getBackground();
        originalreg = deleteButton.getBackground();

        DetailsButton = new JButton("Show Details");
        DetailsButton.setBounds(100, 20, 300, 50);
        DetailsButton.setFont(f2);
        DetailsButton.setFocusable(false);

        bgLabel.add(deleteButton);
        bgLabel.add(backButton);
        bgLabel.add(DetailsButton);
        bgLabel.add(DetailsTextArea);

        deleteButton.addActionListener(this);
        DetailsButton.addActionListener(this); 
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
                dispose();
            }
        });

        deleteButton.addMouseListener(this);
        backButton.addMouseListener(this);

        this.add(bgLabel);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == DetailsButton){
            DetailsTextArea.setText("");
            try {
                File file = new File("./details.txt");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null){
                    DetailsTextArea.append(line + "\n");
                }
                reader.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage());
            }
        } 
        else if (e.getSource() == deleteButton){
            DetailsTextArea.setText(""); 
    }
	}
    public void mouseEntered(MouseEvent me)
	{
        if (me.getSource() == deleteButton){
            deleteButton.setBackground(Color.green);
        }
        if (me.getSource() == backButton){
            backButton.setBackground(Color.red);
        }
    }
    public void mouseExited(MouseEvent me)
	{
        if (me.getSource() == deleteButton){
            deleteButton.setBackground(originalreg);
        }
        if (me.getSource() == backButton){
            backButton.setBackground(originalback);
        }
    }
    public void mouseClicked(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
}
