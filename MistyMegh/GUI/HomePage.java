package GUI;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class HomePage extends JFrame implements ActionListener,MouseListener
{
	JPanel p1,p2;
	JPanel pizzap,sandwichp,coffeep;
	JLabel pizzal,sandwichl,coffeel;
	JLabel customInfo,titlelbl2,menuItems;
	JLabel namel,addressl,phonel,totalL,addL,appL;
	JLabel pizzProduct,pizzPrice,pizzQty,sanProduct,sanPrice,sanQty,coffeeProduct,coffeePrice,coffeeQty;
	JTextField namef,addressf,phonef,totalf,pizzP;
	JTextField pizzqtyL,sanqtyL,coffeeqtyL;
	JButton backb,confirm,reset,addButton;
	JCheckBox pizzbox,sanbox,coffeebox;
	ImageIcon pizza,sandwich,coffee,addImg,appImg;
	Font f1,f2,f3;
	Color c1,original_backb,original_resetb,original_confirmb;
	
	public HomePage()
	{
		this.setSize(900,600);
		this.setResizable(false);
		this.setTitle("Cafe MistyMegh");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		f1 = new Font("Arial Black",Font.BOLD,24);
		f2 = new Font("Times New Roman",Font.ITALIC,15);
		f3 = new Font("Calibri",Font.PLAIN,18);
        c1 = new Color(105,105,105);
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setPreferredSize(new Dimension(230,0));
		p1.setBackground(new Color(211,211,211));
		p1.setOpaque(true);
		
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setOpaque(true);
		
		titlelbl2 = new JLabel("Place Your Order Here");
		titlelbl2.setBounds(0,0,670,50);
		titlelbl2.setBackground(Color.orange);
		titlelbl2.setFont(f1);
		titlelbl2.setHorizontalAlignment(SwingConstants.CENTER);
		titlelbl2.setOpaque(true);
		
		menuItems = new JLabel("Select from menu :");
		menuItems.setBounds(0,50,170,40);
		menuItems.setBackground(Color.cyan);
		menuItems.setHorizontalAlignment(SwingConstants.CENTER);
		menuItems.setOpaque(true);
		
		appL = new JLabel();
		appL.setBounds(300,50,350,60);
		appL.setBackground(Color.pink);
		appL.setOpaque(true);
		
		appImg = new ImageIcon("./Images/register.jpg");
		Image ap = appImg.getImage().getScaledInstance(350,60,Image.SCALE_SMOOTH);
		ImageIcon re_ap = new ImageIcon(ap);
		appL.setIcon(re_ap);
		appL.addMouseListener(this);
		
		pizzap = new JPanel();
		pizzap.setLayout(null);
		pizzap.setBounds(30,120,170,370);
		pizzap.setBackground(Color.black);
		pizzap.setOpaque(true);
		
		sandwichp = new JPanel();
		sandwichp.setLayout(null);
		sandwichp.setBounds(250,120,170,370);
		sandwichp.setBackground(Color.DARK_GRAY);
		sandwichp.setOpaque(true);
		
		coffeep = new JPanel();
		coffeep.setLayout(null);
		coffeep.setBounds(470,120,170,370);
		coffeep.setBackground(new Color(0,64,128));
	    coffeep.setOpaque(true);
		
		backb = new JButton("<<");
		backb.setBounds(25,15,50,30);
		backb.setBackground(new Color(0,0,0));
		backb.setForeground(Color.white);
		backb.setFocusable(false);
		backb.addActionListener(new ActionListener() //seperate ActionListener for back button
		{
			public void actionPerformed(ActionEvent e)
			{
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		}
		);
		
		confirm = new JButton("Confirm order");
		confirm.setBounds(60,500,170,40);
		confirm.setForeground(Color.black);
		confirm.setBackground(new Color(96,125,139));
		confirm.setFocusable(false);
		
		reset = new JButton("Reset order");
		reset.setBounds(310,500,170,40);
		reset.setForeground(Color.black);
		reset.setBackground(new Color(96,125,139));
		reset.setFocusable(false);
		
		customInfo = new JLabel("CUSTOMER'S INFORMATION");
		customInfo.setBounds(0,0,230,50);
		customInfo.setFont(f2);
		customInfo.setHorizontalAlignment(SwingConstants.CENTER);
		customInfo.setBackground(c1);
		customInfo.setForeground(Color.BLUE);
		customInfo.setOpaque(true);
		
		namel = new JLabel("Customer name :");
		namel.setBounds(24,70,140,40);
		namel.setBackground(new Color(211,211,211));
        namel.setFont(f3);
		namel.setOpaque(true);
		
		namef = new JTextField();
		namef.setBounds(24,110,160,30);
        namef.setFont(f3);
		
		addressl = new JLabel("Present Address :");
		addressl.setBounds(24,150,140,40);
		addressl.setBackground(new Color(211,211,211));
        addressl.setFont(f3);
		addressl.setOpaque(true);
		
		addressf = new JTextField();
		addressf.setBounds(24,190,160,30);
        addressf.setFont(f3);
		
		phonel = new JLabel("Phone Number :");
		phonel.setBounds(24,220,140,40);
		phonel.setBackground(new Color(211,211,211));
        phonel.setFont(f3);
		phonel.setOpaque(true);
		
		phonef = new JTextField();
		phonef.setBounds(24,260,160,30);
        phonef.setFont(f3);
		
		totalL = new JLabel("Total price :");
		totalL.setBounds(24,310,140,40);
		totalL.setBackground(new Color(211,211,211));
        totalL.setFont(f3);
		totalL.setOpaque(true);
		
		totalf = new JTextField();
		totalf.setBounds(24,350,160,30);
		totalf.setEditable(false);
        totalf.setFont(f3);
		
		addL = new JLabel();
		addL.setBounds(0,400,230,150);
		addL.setOpaque(true);
		
		addImg = new ImageIcon("./Images/advertise.jpg");
		Image img = addImg.getImage().getScaledInstance(230,150,Image.SCALE_SMOOTH);
		ImageIcon resized = new ImageIcon(img);
		
		pizzal = new JLabel();
		pizzal.setBounds(0,0,170,210);
		pizzal.setOpaque(true);
		
		ImageIcon img1 = new ImageIcon("./Images/pizza.jpg");
		Image piz = img1.getImage().getScaledInstance(170,210,Image.SCALE_SMOOTH);
		ImageIcon re1 = new ImageIcon(piz);
		pizzal.setIcon(re1);
		
		sandwichl = new JLabel();
		sandwichl.setBounds(0,0,170,210);
		sandwichl.setOpaque(true);
		
		ImageIcon img2 = new ImageIcon("./Images/sandwich.jpg");
		Image san = img2.getImage().getScaledInstance(180,220,Image.SCALE_SMOOTH);
		ImageIcon re2 = new ImageIcon(san);
		sandwichl.setIcon(re2);
		
		coffeel = new JLabel();
		coffeel.setBounds(0,0,170,210);
		coffeel.setOpaque(true);
		
		ImageIcon img3 = new ImageIcon("./Images/coffee.jpg");
		Image cof = img3.getImage().getScaledInstance(170,210,Image.SCALE_SMOOTH);
		ImageIcon re3 = new ImageIcon(cof);
	    coffeel.setIcon(re3);
		
		pizzProduct = new JLabel("Product name : Cheesy Pizza");
		pizzProduct.setBounds(0,210,170,25);
		pizzProduct.setFont(new Font("Arial Black",Font.ITALIC,10));
		pizzProduct.setForeground(Color.green);
		
		pizzPrice = new JLabel("Product Price : TK.650");
		pizzPrice.setBounds(0,230,170,25);
		pizzPrice.setFont(new Font("Arial Black",Font.ITALIC,10));
		pizzPrice.setForeground(Color.green);
		
		pizzQty = new JLabel("Select Quantity :-");
		pizzQty.setBounds(0,260,170,25);
		pizzQty.setFont(new Font("Arial Black",Font.ITALIC,10));
		pizzQty.setForeground(Color.green);
		
		sanProduct = new JLabel("Product name: Sandwich");
		sanProduct.setBounds(0,210,170,25);
		sanProduct.setFont(new Font("Arial Black",Font.ITALIC,10));
		sanProduct.setForeground(new Color(255,223,150));
		
		sanPrice = new JLabel("Product price: TK.150");
		sanPrice.setBounds(0,230,170,25);
		sanPrice.setFont(new Font("Arial Black",Font.ITALIC,10));
		sanPrice.setForeground(new Color(255,223,150));
		
		sanQty = new JLabel("Select Quantity :-");
		sanQty.setBounds(0,260,170,25);
		sanQty.setFont(new Font("Arial Black",Font.ITALIC,10));
		sanQty.setForeground(new Color(255,223,150));
		
		coffeeProduct = new JLabel("Product name : Americano");
		coffeeProduct.setBounds(0,210,170,25);
		coffeeProduct.setFont(new Font("Arial Black",Font.ITALIC,10));
		coffeeProduct.setForeground(Color.white);
		
		coffeePrice = new JLabel("Product Price : TK.250");
		coffeePrice.setBounds(0,230,170,25);
		coffeePrice.setFont(new Font("Arial Black",Font.ITALIC,10));
		coffeePrice.setForeground(Color.white);
		
	    coffeeQty = new JLabel("Select Quantity :-");
		coffeeQty.setBounds(0,260,170,25);
		coffeeQty.setFont(new Font("Arial Black",Font.ITALIC,10));
		coffeeQty.setForeground(Color.white);
		
		pizzqtyL = new JTextField();
		pizzqtyL.setBounds(0,280,80,20);
		
		sanqtyL = new JTextField();
		sanqtyL.setBounds(0,280,80,20);
		
		coffeeqtyL = new JTextField();
		coffeeqtyL.setBounds(0,280,80,20);
		
		//Checkboxes for order quantity confirming.....
		pizzbox = new JCheckBox("Confirm");
		pizzbox.setBounds(90,280,100,20);
		pizzbox.setBackground(Color.black);
		pizzbox.setForeground(new Color(245,245,245));
		pizzbox.setFocusable(false);
		
		sanbox = new JCheckBox("Confirm");
		sanbox.setBounds(90,280,100,20);
		sanbox.setBackground(Color.DARK_GRAY);
		sanbox.setForeground(Color.white);
		sanbox.setFocusable(false);
		
		coffeebox = new JCheckBox("Confirm");
		coffeebox.setBounds(90,280,100,20);
		coffeebox.setBackground(new Color(0,64,128));
		coffeebox.setForeground(Color.white);
		coffeebox.setFocusable(false);
		
		addL.setIcon(resized);

		p2.add(titlelbl2);
		p2.add(menuItems);
		p2.add(pizzap);
		p2.add(sandwichp);
		p2.add(coffeep);
		p2.add(confirm);
		p2.add(reset);
		p2.add(appL);
		
		pizzap.add(pizzal);
		sandwichp.add(sandwichl);
		coffeep.add(coffeel);
		
		pizzap.add(pizzProduct);
		pizzap.add(pizzPrice);
		pizzap.add(pizzQty);
		pizzap.add(pizzqtyL);
		sandwichp.add(sanqtyL);
		coffeep.add(coffeeqtyL);
			
		sandwichp.add(sanProduct);
		sandwichp.add(sanPrice);
		sandwichp.add(sanQty);
		
		coffeep.add(coffeeProduct);
		coffeep.add(coffeePrice);
		coffeep.add(coffeeQty);
		
		pizzap.add(pizzbox);
		sandwichp.add(sanbox);
		coffeep.add(coffeebox);
		
		p1.add(customInfo);
		p1.add(namel);
		p1.add(addressl);
		p1.add(phonel);
		p1.add(totalL);
		p1.add(namef);
		p1.add(addressf);
		p1.add(phonef);
		p1.add(totalf);
		p1.add(addL);
		titlelbl2.add(backb);
		
		original_backb = backb.getBackground();
		original_confirmb = confirm.getBackground();
		original_resetb = reset.getBackground();
		backb.addMouseListener(this);
		confirm.addMouseListener(this);
		reset.addMouseListener(this);
		confirm.addActionListener(this);
		reset.addActionListener(new ActionListener()
		{
			public void  actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null,"You have deleted your choices.Please Select again","Reset",JOptionPane.INFORMATION_MESSAGE);
			pizzqtyL.setText("");
			sanqtyL.setText("");
			coffeeqtyL.setText("");
			pizzbox.setSelected(false);
			sanbox.setSelected(false);
			coffeebox.setSelected(false);
			totalf.setText("");
			}
		}
		);
		
		this.add(p1,BorderLayout.EAST);
		this.add(p2,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		boolean isOrderValid = false;
		boolean isDigit = true;
		int total_price = 0;
		
		String number = phonef.getText();
		String pqty = pizzqtyL.getText().trim();
		String sqty = sanqtyL.getText().trim();
		String cqty = coffeeqtyL.getText().trim();
	
		if(namef.getText().trim().isEmpty() || addressf.getText().trim().isEmpty() || phonef.getText().trim().isEmpty())
		{
			JOptionPane.showMessageDialog(null,"Fill up all Information properly","ConfirmError",JOptionPane.ERROR_MESSAGE);
		    return;
		}
		for(char c:number.toCharArray())
		{
			if(!Character.isDigit(c))
			{
				isDigit = false;
				break;
			}
		}
		
		if(!isDigit)
		{
			JOptionPane.showMessageDialog(null,"Enter a valid phone number","Invalid input",JOptionPane.INFORMATION_MESSAGE);
		    return;
		}
		
	    if(pizzbox.isSelected())
		{
			if(pqty.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Place your order first","Order",JOptionPane.INFORMATION_MESSAGE);
			    return;
			}
			for(char c : pqty.toCharArray())
			{
				if(!Character.isDigit(c))
				{
					JOptionPane.showMessageDialog(null,"Enter a valid quantity","Invalid input",JOptionPane.ERROR_MESSAGE);
				    return;
				}
			}
			int pizza_quantity = Integer.parseInt(pqty);
		    total_price += (pizza_quantity*650);			
			isOrderValid = true;
		}
		if(sanbox.isSelected())
		{
			if(sqty.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Place your order first","Order",JOptionPane.INFORMATION_MESSAGE);
			    return;
			}
			for(char c : sqty.toCharArray())
			{
				if(!Character.isDigit(c))
				{
					JOptionPane.showMessageDialog(null,"Enter a valid quantity","Invalid input",JOptionPane.ERROR_MESSAGE);
				    return;
				}
			}
			int sandwich_quantity = Integer.parseInt(sqty);
			total_price += (sandwich_quantity*150);
			isOrderValid = true;
		}
	    if(coffeebox.isSelected())
		{
			if(cqty.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Place your order first","Order",JOptionPane.INFORMATION_MESSAGE);
			    return;
			}
			for(char c : cqty.toCharArray())
			{
				if(!Character.isDigit(c))
				{
					JOptionPane.showMessageDialog(null,"Enter a valid quantity","Invalid input",JOptionPane.ERROR_MESSAGE);
				    return;
				}
			}
			int coffee_quantity = Integer.parseInt(cqty);
			total_price += (coffee_quantity*250);
			isOrderValid = true;
		}
		
		if(isOrderValid){
		JOptionPane.showMessageDialog(null,"Your Order has been confirmed Successfully \n Thank you for ordering from MistyMegh","Confirmation Message",JOptionPane.INFORMATION_MESSAGE);
		totalf.setText("BDT " + total_price);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Place your order first","Order",JOptionPane.INFORMATION_MESSAGE);
			return;
		}
	}
	public void mousePressed(MouseEvent me)
	{}
	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource()==appL)
		{
			this.setVisible(false);
			SignUp sign = new SignUp();
			sign.setVisible(true);
		}
	}
	public void mouseReleased(MouseEvent me)
	{
	}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==backb)
		{
			backb.setBackground(Color.blue);
		}
		if(me.getSource()==confirm)
		{
			confirm.setBackground(Color.green);
		}
		if(me.getSource()==reset)
		{
			reset.setBackground(Color.red);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==backb)
		{
			backb.setBackground(original_backb);
		}
		if(me.getSource()==confirm)
		{
			confirm.setBackground(original_confirmb);
		}
		if(me.getSource()==reset)
		{
			reset.setBackground(original_resetb);
		}
	}
}