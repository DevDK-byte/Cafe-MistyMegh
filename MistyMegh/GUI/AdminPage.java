package GUI;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AdminPage extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JPanel pizzap,sandwichp,coffeep;
	JLabel pizzal,sandwichl,coffeel;
	JLabel UpdateItem,titlelbl2;
	JLabel pizzProduct,pizzPrice,pizzQty,sanProduct,sanPrice,sanQty,coffeeProduct,coffeePrice,coffeeQty;
	JLabel FoodNamel,NewPricel,NewNamel;;
	JTextField FoodNamef,NewPricef,NewNamef;
	JTextField pizzqtyL,sanqtyL,coffeeqtyL;
	JButton UpdateButton,backb;
	JCheckBox pizzbox,sanbox,coffeebox;
	ImageIcon pizza,sandwich,coffee,addImg,appImg;
	Font f1,f2,f3;
	Color c1,original_backb;
	
	public AdminPage()
	{
		this.setSize(900,600);
		this.setResizable(false);
		this.setTitle("Admin Panel");
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
		
		titlelbl2 = new JLabel("Admin Panel");
		titlelbl2.setBounds(0,0,670,70);
		titlelbl2.setBackground(Color.orange);
		titlelbl2.setFont(f1);
		titlelbl2.setHorizontalAlignment(SwingConstants.CENTER);
		titlelbl2.setOpaque(true);
		
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
		
		 UpdateItem = new JLabel("Update Item");
		 UpdateItem.setBounds(0,0,230,50);
		 UpdateItem.setFont(f2);
		 UpdateItem.setHorizontalAlignment(SwingConstants.CENTER);
		 UpdateItem.setBackground(c1);
		 UpdateItem.setForeground(Color.BLUE);
		 UpdateItem.setOpaque(true);
		 
		FoodNamel = new JLabel("Food Name :");
		FoodNamel.setBounds(24,70,140,40);
		FoodNamel.setBackground(new Color(211,211,211));
        FoodNamel.setFont(f3);
		FoodNamel.setOpaque(true);
		
		FoodNamef = new JTextField();
		FoodNamef.setBounds(24,110,160,30);
        FoodNamef.setFont(f3);
		
		NewPricel = new JLabel("Enter New Price :");
		NewPricel.setBounds(24,150,140,40);
		NewPricel.setBackground(new Color(211,211,211));
        NewPricel.setFont(f3);
		NewPricel.setOpaque(true);
		
		NewPricef = new JTextField();
		NewPricef.setBounds(24,190,160,30);
        NewPricef.setFont(f3);
		
		NewNamel = new JLabel("Enter new Food name :");
		NewNamel.setBounds(24,220,200,40);
		NewNamel.setBackground(new Color(211,211,211));
        NewNamel.setFont(f3);
		NewNamel.setOpaque(true);
		
		NewNamef = new JTextField();
		NewNamef.setBounds(24,260,160,30);
        NewNamef.setFont(f3);
		
		UpdateButton = new JButton("Update");
		UpdateButton.setBounds(60,300,100,50);
		UpdateButton.setBackground(new Color(0,0,0));
		UpdateButton.setForeground(Color.white);
		UpdateButton.setFocusable(false);
		UpdateButton.addActionListener(this);
		
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
		
		pizzap.add(pizzProduct);
		pizzap.add(pizzPrice);
		pizzap.add(pizzQty);
		pizzap.add(pizzqtyL);
		pizzap.add(pizzal);
		
		sandwichp.add(sanProduct);
		sandwichp.add(sanPrice);
		sandwichp.add(sanQty);
		sandwichp.add(sandwichl);
		
		coffeep.add(coffeeProduct);
		coffeep.add(coffeePrice);
		coffeep.add(coffeeQty);
		sandwichp.add(sanqtyL);
		coffeep.add(coffeeqtyL);
		coffeep.add(coffeel);
		
		pizzap.add(pizzbox);
		sandwichp.add(sanbox);
		coffeep.add(coffeebox);
		
		p2.add(titlelbl2);
		p2.add(pizzap);
		p2.add(sandwichp);
		p2.add(coffeep);
		
		p1.add(UpdateItem);
		p1.add(FoodNamel);
		p1.add(FoodNamef);
		p1.add(NewPricel);
		p1.add(NewPricef);
		p1.add(NewNamel);
		p1.add(NewNamef);
		p1.add(UpdateButton);
		titlelbl2.add(backb);
		
		this.add(p1,BorderLayout.EAST);
		this.add(p2,BorderLayout.CENTER);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
{
	String Item_name = FoodNamef.getText().trim();
	String Item_price = NewPricef.getText().trim();
	String Item_new_name = NewNamef.getText().trim();

	if (e.getSource() == UpdateButton)
	{
		if (Item_name.equalsIgnoreCase("pizza"))
		{
			pizzProduct.setText("Product name : " + Item_new_name);
			pizzPrice.setText("Product Price : " + Item_price);
		}
		else if (Item_name.equalsIgnoreCase("sandwich"))
		{
			sanProduct.setText("Product name : " + Item_new_name);
			sanPrice.setText("Product Price : " + Item_price);
		}
		else if (Item_name.equalsIgnoreCase("coffee"))
		{
			coffeeProduct.setText("Product name : " + Item_new_name);
			coffeePrice.setText("Product Price : " + Item_price);
		}
		else {
			JOptionPane.showMessageDialog(null, "Item not found. Please enter pizza, sandwich, or coffee.");
			return;
		}
		
		JOptionPane.showMessageDialog(null, "Successfully updated the menu.");
	}
}

}
		