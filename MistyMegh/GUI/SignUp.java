package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class SignUp extends JFrame implements ActionListener,MouseListener
{
	JLabel bgLabel;
	JLabel titleLbl;
	JLabel usernameLbl;
	JLabel emailLbl;
	JLabel passLbl;
	JTextField usernamef;
	JTextField emailf;
	JPasswordField passf;
	JButton regButton;
	JButton backButton,eyebutton;
	JRadioButton b1,b2;
	ImageIcon bg,eyeclose,eyeopen;
	Font f1;
	Font f2;
	Color c1;
	Color originalreg;
	Color originalback; 
	
	public SignUp()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,700);
		this.setResizable(false);
		this.setTitle("Cafe Management System");
		this.setLocationRelativeTo(null);
		
		c1 = new Color(45,55,65);
		f1 = new Font("Calibri",Font.BOLD,26);
		f2 = new Font("Times New Roman",Font.PLAIN,20);
		
		bgLabel = new JLabel();
		bgLabel.setLayout(null);
		bgLabel.setBounds(0,0,500,700);
		bgLabel.setBackground(c1);
		bgLabel.setOpaque(true);
		
		bg = new ImageIcon("./Images/sign.jpg");
		Image im = bg.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH);
		ImageIcon res = new ImageIcon(im);
		bgLabel.setIcon(res);
		
		titleLbl = new JLabel(" Create an Account ");
		titleLbl.setBounds(100,20,300,50);
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setFont(f1);
		titleLbl.setBackground(Color.white);
		titleLbl.setForeground(Color.black);
		titleLbl.setOpaque(true);
		
		usernameLbl = new JLabel("Username : ");
		usernameLbl.setBounds(50,120,150,30);
		usernameLbl.setFont(f1);
		usernameLbl.setForeground(Color.black);
		usernameLbl.setOpaque(true);
		
		usernamef = new JTextField();
		usernamef.setBounds(50,160,300,40);
		usernamef.setFont(f1);
		
		emailLbl = new JLabel("Email Address :");
		emailLbl.setBounds(50,220,210,30);
		emailLbl.setFont(f1);
		emailLbl.setForeground(Color.black);
		emailLbl.setOpaque(true);
		
		emailf = new JTextField();
		emailf.setBounds(50,260,220,40);
		emailf.setFont(f1);
		
		passLbl = new JLabel("Password : ");
		passLbl.setBounds(50,320,180,30);
		passLbl.setFont(f1);
		passLbl.setForeground(Color.black);
		passLbl.setOpaque(true);
		
		passf = new JPasswordField();
		passf.setBounds(50,360,300,40);
		passf.setEchoChar('*');
		passf.setFont(f1);
		
		eyebutton = new JButton();
		eyebutton.setBounds(370,370,40,30);
		
		eyeclose = new ImageIcon("./Images/eyecon.jpg");
		Image img = eyeclose.getImage().getScaledInstance(40,30,Image.SCALE_SMOOTH);
		ImageIcon re = new ImageIcon(img);
		eyebutton.setIcon(re);
		
		b1 = new JRadioButton("Save Account");
		b1.setBounds(50,420,120,30);
		b1.setForeground(Color.black);
		b1.setFocusable(false);
		b2 = new JRadioButton("Never save");
		b2.setBounds(350,420,100,30);
		b2.setForeground(Color.black);
		b2.setFocusable(false);
		ButtonGroup group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		
		regButton = new JButton("Register");
		regButton.setBounds(50,520,150,30);
		regButton.setFont(f2);
		regButton.setFocusable(false);
		
		regButton = new JButton("Register");
		regButton.setBounds(50,520,150,30);
		regButton.setFont(f2);
		regButton.setFocusable(false);
		
		backButton = new JButton("Back");
		backButton.setBounds(300,520,150,30);
		backButton.setFont(f2);
		backButton.setFocusable(false);
		
		originalback = backButton.getBackground();
		originalreg = regButton.getBackground();
		
		bgLabel.add(titleLbl);
		bgLabel.add(usernameLbl);
		bgLabel.add(usernamef);
		bgLabel.add(emailLbl);
		bgLabel.add(emailf);
		bgLabel.add(passLbl);
		bgLabel.add(passf);	
		bgLabel.add(regButton);
		bgLabel.add(backButton);
		bgLabel.add(b1);
		bgLabel.add(b2);
		bgLabel.add(eyebutton);
		
		regButton.addActionListener(this);
		backButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		});
		regButton.addMouseListener(this);
		backButton.addMouseListener(this);
		eyebutton.addActionListener(new ActionListener()
		{
			boolean isPassVisible = false;
			public void actionPerformed(ActionEvent e)
			{
				if(isPassVisible)
				{
					passf.setEchoChar('*');
					eyebutton.setIcon(re);
				}
				else
				{
					passf.setEchoChar((char) 0);
					eyeopen = new ImageIcon("./Images/eyecon2.jpg");
		            Image img1 = eyeopen.getImage().getScaledInstance(40,30,Image.SCALE_SMOOTH);
		            ImageIcon re1 = new ImageIcon(img1);
		            eyebutton.setIcon(re1);
				}
				isPassVisible = !isPassVisible;
			}
		});
		
		this.add(bgLabel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String username_field = usernamef.getText();
		String email_field = emailf.getText();
		String pass_field = new String(passf.getPassword());
		if(e.getSource()==regButton)
		{
			if(username_field.isEmpty() || email_field.isEmpty() || pass_field.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Please fill up all the fields","Error-25",JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			if(b1.isSelected())
			{
				try
				{
					File file = new File("dat.txt");
					FileWriter insert = new FileWriter("./dat.txt",true);
					
					insert.write(username_field + "\t");
					insert.write(email_field + "\t");
					insert.write(pass_field + "\n");
					
					insert.flush();
					insert.close();
					JOptionPane.showMessageDialog(null,"Account has been created Successfully!","Oficial Registration",JOptionPane.INFORMATION_MESSAGE);
				}
				catch(IOException ioe)
				{
					JOptionPane.showMessageDialog(null,"There is a Problem registering your Account","Registration Error",JOptionPane.ERROR_MESSAGE);
					ioe.printStackTrace();
				}
			}
			else if(!b1.isSelected() && (!username_field.isEmpty() || !email_field.isEmpty() || !pass_field.isEmpty()))
			{
				JOptionPane.showMessageDialog(null,"Your account has not been officially registered. \n Please Select [save Account] and officially be a part of MistyMegh ","Unofficial Registration",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		if(e.getSource()==b2)
		{
			if(!b1.isSelected() && (!username_field.isEmpty() || !email_field.isEmpty() || !pass_field.isEmpty()))
			{
				JOptionPane.showMessageDialog(null,"Your account has not been officially registered. \n Please Select [save Account] and officially be a part of MistyMegh ","Unofficial Registration",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==regButton)
		{
			regButton.setBackground(Color.green);
		}
		if(me.getSource()==backButton)
		{
			backButton.setBackground(Color.red);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==regButton)
		{
			regButton.setBackground(originalreg);
		}
		if(me.getSource()==backButton)
		{
			backButton.setBackground(originalback);
		}
	}
	public void mouseClicked(MouseEvent me)
	{}
	public void mouseReleased(MouseEvent me)
	{}
	public void mousePressed(MouseEvent me)
	{}
	
}