

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.stream.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.applet.*;
import java.io.*;


public class MENDOZA_ELGA extends JFrame implements ActionListener
{

	//////////////////////////////////////*****LOG IN PANEL******////////////////////////////////////////
	JPanel logIn = new JPanel();
	JLabel JL1,JL2, logo,logo2;
    JTextField JT1;
    JPasswordField JP1;
    JButton JB1, JB2;
    JLabel copy = new JLabel("Copyright © 2018 Ayush Srivastava - Chandigarh University");
    JLabel right = new JLabel("Copyright © 2018 Ayush Srivastava - Chandigarh University");
    JLabel copyright = new JLabel("Copyright © 2018 Ayush Srivastava - Chandigarh University");
    //////////////////////////////////////*****LOG IN PANEL******////////////////////////////////////////

    //////////////////////////////////////*****MENU PANEL******////////////////////////////////////////
    JPanel menus = new JPanel();
    JLabel banner = new JLabel(new ImageIcon(getClass().getResource("banner.jpg")));
    JPanel forButtons = new JPanel();
    JButton buttons[] = {new JButton("PURCHASE"),
					   new JButton("INVENTORY"),
					   new JButton("SALES REPORT"),
					   new JButton("ADMIN")};

	JButton logOut = new JButton("LOG OUT");

    //////////////////////////////////////*****MENU PANEL******////////////////////////////////////////

    //////////////////////////////////////*****PURCHASE PANEL******////////////////////////////////////////
    JPanel cashRegister = new JPanel();
    JPanel categoriesPanel = new JPanel();
    JPanel numericPanel = new JPanel();
    JPanel menuPanel = new JPanel();
    JScrollPane scrollPane;
    JTextArea summaryField;
    JLabel orderLabel,totalLabel,paymentLabel,changeLabel,neymLabel,stakLabel;
    JTextField orderField,totalField,paymentField,changeField,neymField,stakField;
    JButton categoriesButton[] = {new JButton("RICE MEALS"),
					   new JButton("SIZZLING RICE MEALS"),
					   new JButton("PASTA & SANDWICHES"),
					   new JButton("CRAVINGS"),
					   new JButton("MUST TRY!"),
					   new JButton("FRENCH FRIES"),
					   new JButton("DRINKS"),
					   new JButton("ICE BLENDED DRINKS"),
					   new JButton("NEW PRODUCT")};
	JButton numericButton[] = {new JButton("1"),
					   new JButton("2"),
					   new JButton("3"),
					   new JButton("4"),
					   new JButton("5"),
					   new JButton("6"),
					   new JButton("7"),
					   new JButton("8"),
					   new JButton("9"),
					   new JButton("0"),
					   new JButton("."),
					   new JButton("CLEAR"),
					   new JButton("ENTER"),
					   new JButton("CANCEL"),
					   new JButton("PAY")};

    JButton menuButton[] = {new JButton("NEXT TRANSACTION"),//menuButton[0]
					   new JButton("VOID"),  //menuButton[1]
					    new JButton("CONTACT US"), //menuButton[2]
					   new JButton("BACK")};//menuButton[3]

	JPanel p[] = {new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel(),new JPanel()};

     //////////////////////////////////////*****PRODUCTS PANEL 1******////////////////////////////////////////
    JButton prodButton1[] = {new JButton("PHILLY CHEESE STEAK - PHP 79"),
                       new JButton("BEEF JERKY - PHP 79"),
					   new JButton("BUFFALO CHICKEN - PHP 79"),
					   new JButton("CHICKEN TEREYAKI - PHP 79")};
    //////////////////////////////////////*****PRODUCTS PANEL 1******////////////////////////////////////////

    //////////////////////////////////////*****PRODUCTS PANEL 2******////////////////////////////////////////
    JButton prodButton2[] = {new JButton("BEEF SALPICAO - PHP 89"),
                       new JButton("CRISPY CHICKEN - PHP 89"),
					   new JButton("PORK SISIG W/ EGG - PHP 89"),
					   new JButton("PORK LIEMPO - PHP 89")};
    //////////////////////////////////////*****PRODUCTS PANEL 2******////////////////////////////////////////

    //////////////////////////////////////*****PRODUCTS PANEL 3******////////////////////////////////////////
    JButton prodButton3[] = {new JButton("PASTA BOLOGNESE - PHP 69"),
					   new JButton("CREAMY PESTO - PHP 69"),
					   new JButton("PASTA ALFREDO - PHP 69"),
					   	new JButton("BACON & EGG SANDWICH - PHP 49"),
					   new JButton("SPAM & EGG SANDWICH - PHP 55")};
    //////////////////////////////////////*****PRODUCTS PANEL 3******////////////////////////////////////////

    //////////////////////////////////////*****PRODUCTS PANEL 4******////////////////////////////////////////
    JButton prodButton4[] = {new JButton("MOZZARELLA POTATO BALLS - PHP 59"),
					   new JButton("MOZZARELLA POCKETS - PHP 59"),
					   new JButton("CHEESY FRIES - PHP 59"),
					   new JButton("CHICKEN NUGGETS - PHP 59")};
    //////////////////////////////////////*****PRODUCTS PANEL 4******////////////////////////////////////////

    //////////////////////////////////////*****PRODUCTS PANEL 5******////////////////////////////////////////
    JButton prodButton5[] = {new JButton("HASHBROWN - PHP 29"),
					   new JButton("TWISTER FRIES - PHP 49")};
    //////////////////////////////////////*****PRODUCTS PANEL 5******////////////////////////////////////////

    //////////////////////////////////////*****PRODUCTS PANEL 6******////////////////////////////////////////
    JButton prodButton6[] = {new JButton("SOLO - PHP 35"),
					   new JButton("UPSIZE - PHP 59")};
    //////////////////////////////////////*****PRODUCTS PANEL 6******////////////////////////////////////////

    //////////////////////////////////////*****PRODUCTS PANEL 7******////////////////////////////////////////
    JButton prodButton7[] = {new JButton("22OZ ICED TEA - PHP 25"),
					   new JButton("ICED COFFEE - PHP 49"),
					   new JButton("ICED COFFEE VANILLA - PHP 49"),
					   new JButton("ICED MOCHA - PHP 49"),
					   new JButton("BOTTLED WATER - PHP 20")};
    //////////////////////////////////////*****PRODUCTS PANEL 7******////////////////////////////////////////

    //////////////////////////////////////*****PRODUCTS PANEL 8******////////////////////////////////////////
    JButton prodButton8[] = {new JButton("PINK PERFECTION - PHP 69"),
					   new JButton("CHUNKY MONKEY - PHP 59"),
					   new JButton("MOCHA LOCA - PHP 59")};
    //////////////////////////////////////*****PRODUCTS PANEL 8******////////////////////////////////////////

    //////////////////////////////////////*****PRODUCTS PANEL 9******////////////////////////////////////////
    JButton prodButton9[] = {new JButton("POTPOTS SOLO - PHP 35"),
					   new JButton("POTPOTS UPSIZE - PHP 59"),
					   new JButton("Biryani - PHP 150"),
					   new JButton("NEW PRODUCT 1"),
					   new JButton("NEW PRODUCT 2"),
					   new JButton("NEW PRODUCT 3")};
    //////////////////////////////////////*****PRODUCTS PANEL 9******////////////////////////////////////////

    String num[] = {"1","2","3","4","5","6","7","8","9","0","."};

    //////////////////////////////////////*****PURCHASE PANEL******////////////////////////////////////////



    //////////////////////////////////////*****SALES REPORT PANEL******////////////////////////////////////////
    JPanel salesPanel8 = new JPanel();
    JLabel salesLabel8,grossLabel8,transactLabel8; JTextField grossField8,transactField8; JTextArea summaryField8; JScrollPane scrollPane8; JButton backButton8;

    //////////////////////////////////////*****SALES REPORT PANEL PANEL******////////////////////////////////////////



    //////////////////////////////////////*****INVENTORY PANEL******////////////////////////////////////////
    JPanel inventoryPanel = new JPanel();
    //JPanel menuPanel2 = new JPanel();
    JLabel inventoryLabel; JTextArea summaryField3; JScrollPane scrollPane3; JButton backButton2;
    //JButton menuButton2[] = {new JButton("ADD STOCKS"), new JButton("EDIT PRICE")};
	Scanner i,i2;
	PrintWriter wrfile,wrfile2;
	String prodId[] = new String[200];
	String prodName[] = new String[200];

	double prodSales[] = new double[200];
	String prodSaless[] = new String[200];

	int prodPrice[] = new int[200];
	int prodStocks[] = new int[200];
	String prodStockss[] = new String[200];
	double totalSales;


    String prodPrices[] = new String[200];
	String newStocks2s[] = new String[200];

	int beks=0;
	String truelaloo;

	int itemSold[] = new int[200];
	String itemSolds[] = new String[200];
	int newStocks2[] = new int[200];

	int newStocks[] = new int[200];
	int Norder[] = new int[200];
	int b=-1;
	int c=-1;
	String id;
	int order =0; int transaction=0;
	double total;
	double newtimes[] = new double[200];
	double payment;
	double gross;
	String[] itemline = new String[1000];
	String[] itemlines = new String[100];
	String itemline2[] = new String[10000];
	String itemline3;
	int t[] = new int[9000];
	int tr;
	String d1[] = new String[9000];
	String d2[] = new String[9000];
	double s[] = new double[9000];
	double sum;

    int jadine=30;

	public void openFile()
	{
		try{
			i = new Scanner(new FileReader("inventory1.txt"));
		}
		catch(IOException e){
			System.out.println("could not find file");
		}
	}



	public void writeFile()
	{
		try{
			wrfile = new PrintWriter(new FileWriter("inventory1.txt"));
		}
		catch(IOException e){
			System.out.println("could not find file");
		}

	}

	public void readFile()
	{

     	while(i.hasNext())
		{
			++b;
			prodId[b] = i.next();
			prodName[b] = i.next();
			beks = Integer.parseInt(prodId[b]);

			prodPrices[b] = i.next();
			prodPrice[b] = Integer.parseInt(prodPrices[b]);

			prodStockss[b] = i.next();
			prodStocks[b] = Integer.parseInt(prodStockss[b]);

            itemSolds[b] = i.next();
			itemSold[b] = Integer.parseInt(itemSolds[b]);

			newStocks2s[b] = i.next();
			newStocks2[b] = Integer.parseInt(newStocks2s[b]);

			prodSaless[b] = i.next();
			prodSales[b] = Double.parseDouble(prodSaless[b]);
		}


	}


	public void printInventory()
	{
		summaryField3.setText("=====================================================================================================================================================\nPROD. ID\t    \t\t\tPROD. NAME\t\t\tINITIAL STOCKS\tITEM SOLD\t                  STOCKS LEFT\n=====================================================================================================================================================\n");


		for(int x =0; x<=(beks-1); x++)
        {
        	itemline[x] = prodId[x] + "\t" + prodName[x] + "\t" + prodPrices[x] + "\t" + prodStockss[x] + "\t" + itemSolds[x]+ "\t" + newStocks2s[x]+ "\t" + prodSaless[x];
        	wrfile.println(itemline[x]);
        	summaryField3.append(""+prodId[x]+"\t    \t\t\t"+prodName[x]+"\t\t"+prodStockss[x]+"\t\t"+itemSolds[x]+"\t\t"+newStocks2s[x]+"\n");

        }


	}

	public void printAdmin()
	{

        productList.setText("====================================================================\nID\tNAME\t\tSTOCKS\tPRICE\n====================================================================\n");

		for(int x =0; x<=(beks-1); x++)
        {
        	itemline[x] = prodId[x] + "\t" + prodName[x] + "\t" + prodPrices[x] + "\t" + prodStockss[x] + "\t" + itemSolds[x]+ "\t" + newStocks2s[x]+ "\t" + prodSaless[x];
        	wrfile.println(itemline[x]);
        	itemlines[x]=""+prodId[x]+"\t"+prodName[x]+"\t"+newStocks2s[x]+"\t"+prodPrices[x]+"\n";
        	productList.append(""+itemlines[x]);

        }


	}


	public void printSalesReport()
	{
		summaryField8.setText("=====================================================================================================================================================\nPROD. ID\t    \t\t\tPROD. NAME\t\t\tPRICE\t                   ITEM SOLD\t               SALES\n=====================================================================================================================================================\n");


		for(int x =0; x<=(beks-1); x++)
        {

        	summaryField8.append(""+prodId[x]+"\t    \t\t\t"+prodName[x]+"\t\t"+prodPrices[x]+"\t\t"+itemSolds[x]+"\t\t"+prodSaless[x]+"\n");
        }

	}


	public void closeFile1()
	{
		i.close();
	}

	public void closeFile2()
	{
		wrfile.close();
	}

	public void totalSales()
	{
		totalSales = prodSales[0]+prodSales[1]+prodSales[2]+prodSales[3]+prodSales[4]+prodSales[5]+prodSales[6]+prodSales[7]+prodSales[7]+prodSales[9]+prodSales[10]+prodSales[11]+prodSales[12]+prodSales[13]+prodSales[14]+prodSales[15]+prodSales[16]+prodSales[17]+prodSales[18]+prodSales[19]+prodSales[20]+prodSales[21]+prodSales[22]+prodSales[23]+prodSales[24]+prodSales[25]+prodSales[26]+prodSales[27]+prodSales[28]+prodSales[29]+prodSales[30]+prodSales[31]+prodSales[32]+prodSales[33]+prodSales[34];
		grossField8.setText(""+totalSales);
	}


    //////////////////////////////////////*****INVENTORY PANEL******////////////////////////////////////////


     //////////////////////////////////////////////ADMIN PANEL//////////////////////////////////////////////////////////
    JPanel adminPanel = new JPanel();

	JTextArea productList;
	JScrollPane productScroll;

	JPanel optionsPanel = new JPanel();

	JButton options[] = {new JButton("ADD"),
					   new JButton("EDIT"),
					   new JButton("DELETE"),
					   new JButton("CANCEL")};

	JLabel nameLabel,stockLabel,priceLabel;
	JTextField nameField,stockField,priceField;

	JButton okButton,beckButton;
    String pidmo;


    //////////////////////////////////////////////ADMIN PANEL//////////////////////////////////////////////////////////

    AudioClip error = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("error.wav"));
    AudioClip numeric = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("numeric.wav"));
    AudioClip intro = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("intro.wav"));
    AudioClip welcome = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("welcome.wav"));
    AudioClip chaching = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("chaching.wav"));

    AudioClip m1 = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("m1.wav"));
    AudioClip m2 = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("m2.wav"));
    AudioClip m3 = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("m3.wav"));
    AudioClip m4 = JApplet.newAudioClip(MENDOZA_ELGA.class.getResource("admin.wav"));

    Font font1 = new Font ("Trebuchet MS", Font.BOLD, 15);
    Font font2 = new Font ("Trebuchet MS", Font.BOLD, 30);
    Font font3 = new Font ("Trebuchet MS", Font.BOLD, 15);

	Color Red = new Color (136, 0, 21);
    Color Blue = new Color (0, 64, 64);

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
    Date date = new Date();

	Container C = getContentPane();

	public MENDOZA_ELGA()
	{
		C.setLayout(null);
		C.setBackground(Red);
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));


		//////////////////////////////////////*****LOG IN PANEL******////////////////////////////////////////
		logIn.setLayout(null);
		C.add(logIn);
		logIn.setBackground(Red);

		logo = new JLabel();
		logIn.add(logo);

	    logo.setIcon(new ImageIcon(getClass().getResource("logo.png")));

		JL1 = new JLabel("USERNAME:");
		logIn.add(JL1);
		JT1 = new JTextField(8);
		logIn.add(JT1);

		JL2 = new JLabel("PASSWORD:");
		logIn.add(JL2);
		JP1 = new JPasswordField(8);
		logIn.add(JP1);

		JB1 = new JButton("LOG-IN");
		logIn.add(JB1);

        logIn.add(right);

		JP1.addActionListener(this);
		JB1.addActionListener(this);

        logo.setBounds(543,120,225,225);
		JL1.setBounds(495,375,200,30);
        JT1.setBounds(685,375,140,25);
        JL2.setBounds(495,410,200,30);
        JP1.setBounds(685,410,140,25);
        JB1.setBounds(610,460,100,25);
        logIn.setBounds(0,0,1364,727);
        right.setBounds(5,670,500,30);

        JL1.setFont(font1);
        JT1.setFont(font1);
        JL2.setFont(font1);
        JP1.setFont(font1);
        JB1.setFont(font1);
        right.setFont(font1);

        JL1.setForeground(Color.ORANGE);
        JL2.setForeground(Color.ORANGE);
        JB1.setBackground(Blue);
        JB1.setForeground(Color.ORANGE);
        right.setForeground(Color.ORANGE);

        logIn.setVisible(true);
        //////////////////////////////////////*****LOG IN PANEL******////////////////////////////////////////

        //////////////////////////////////////*****MENU PANEL******////////////////////////////////////////
        menus.setLayout(null);
        menus.setBackground(Red);
        forButtons.setLayout(new GridLayout(1,3));
        C.add(menus);
        menus.add(forButtons);

        menus.add(banner);

        for(int x = 0; x < buttons.length; x++)
		{
			forButtons.add(buttons[x]);
			buttons[x].addActionListener(this);
			buttons[x].setBackground(Blue);
			buttons[x].setForeground(Color.ORANGE);
			buttons[x].setFont(font3);
		}

        menus.add(logOut);
        menus.add(copy);

        logOut.addActionListener(this);

		logOut.setBackground(Blue);

		logOut.setForeground(Color.ORANGE);
		copy.setForeground(Color.ORANGE);

		logOut.setFont(font3);
		copy.setFont(font1);

        banner.setBounds(430,150,500,230);
		forButtons.setBounds(330,400,690,50);
		menus.setBounds(0,0,1364,727);
		logOut.setBounds(1120,610,230,80);
		copy.setBounds(5,670,500,30);

        menus.setVisible(false);
        //////////////////////////////////////*****MENU PANEL******////////////////////////////////////////

        //////////////////////////////////////*****PURCHASE PANEL******////////////////////////////////////////
		cashRegister.setLayout(null);
        categoriesPanel.setLayout(new GridLayout(3,3));
        numericPanel.setLayout(new GridLayout(5,3));
        menuPanel.setLayout(new GridLayout(2,3));
        C.add(cashRegister);
        cashRegister.setBackground(Red);
        categoriesPanel.setBackground(Red);
        numericPanel.setBackground(Red);
        menuPanel.setBackground(Red);

        /////////****CATEGORIES****//////////
        for(int x = 0; x < categoriesButton.length; x++)
		{
			categoriesPanel.add(categoriesButton[x]);
			categoriesButton[x].addActionListener(this);
			categoriesButton[x].setBackground(Red);
			categoriesButton[x].setForeground(Color.ORANGE);
			categoriesButton[x].setFont(font3);
		}

		/////////****CATEGORIES****//////////

		/////////****PRODUCTS****//////////

	    p[0].setLayout(new GridLayout(2,2));
	    p[1].setLayout(new GridLayout(2,2));
	    p[2].setLayout(new GridLayout(3,2));
	    p[3].setLayout(new GridLayout(2,2));
	    p[4].setLayout(new GridLayout(1,2));
	    p[5].setLayout(new GridLayout(2,2));
	    p[6].setLayout(new GridLayout(3,2));
	    p[7].setLayout(new GridLayout(1,3));
	    p[8].setLayout(new GridLayout(2,2));

	    for(int x = 0; x < p.length; x++)
	    {
	    	p[x].setBackground(Red);
	    }

		for(int x = 0; x < prodButton1.length; x++)
		{
			p[0].add(prodButton1[x]);
			prodButton1[x].addActionListener(this);
			prodButton1[x].setBackground(Red);
			prodButton1[x].setForeground(Color.ORANGE);
			prodButton1[x].setFont(font3);
		}

		for(int x = 0; x < prodButton2.length; x++)
		{
			p[1].add(prodButton2[x]);
			prodButton2[x].addActionListener(this);
			prodButton2[x].setBackground(Red);
			prodButton2[x].setForeground(Color.ORANGE);
			prodButton2[x].setFont(font3);
		}

		for(int x = 0; x < prodButton3.length; x++)
		{
			p[2].add(prodButton3[x]);
			prodButton3[x].addActionListener(this);
			prodButton3[x].setBackground(Red);
			prodButton3[x].setForeground(Color.ORANGE);
			prodButton3[x].setFont(font3);
		}

		for(int x = 0; x < prodButton4.length; x++)
		{
			p[3].add(prodButton4[x]);
			prodButton4[x].addActionListener(this);
			prodButton4[x].setBackground(Red);
			prodButton4[x].setForeground(Color.ORANGE);
			prodButton4[x].setFont(font3);
		}

		for(int x = 0; x < prodButton5.length; x++)
		{
			p[4].add(prodButton5[x]);
			prodButton5[x].addActionListener(this);
			prodButton5[x].setBackground(Red);
			prodButton5[x].setForeground(Color.ORANGE);
			prodButton5[x].setFont(font3);
		}

		for(int x = 0; x < prodButton6.length; x++)
		{
			p[5].add(prodButton6[x]);
			prodButton6[x].addActionListener(this);
			prodButton6[x].setBackground(Red);
			prodButton6[x].setForeground(Color.ORANGE);
			prodButton6[x].setFont(font3);
		}

		for(int x = 0; x < prodButton7.length; x++)
		{
			p[6].add(prodButton7[x]);
			prodButton7[x].addActionListener(this);
			prodButton7[x].setBackground(Red);
			prodButton7[x].setForeground(Color.ORANGE);
			prodButton7[x].setFont(font3);
		}

		for(int x = 0; x < prodButton8.length; x++)
		{
			p[7].add(prodButton8[x]);
			prodButton8[x].addActionListener(this);
			prodButton8[x].setBackground(Red);
			prodButton8[x].setForeground(Color.ORANGE);
			prodButton8[x].setFont(font3);
		}

		for(int x = 0; x < prodButton9.length; x++)
		{
			p[8].add(prodButton9[x]);
			prodButton9[x].addActionListener(this);
			prodButton9[x].setBackground(Red);
			prodButton9[x].setForeground(Color.ORANGE);
			prodButton9[x].setFont(font3);
		}

        for(int x = 0; x < p.length; x++)
		{
		    cashRegister.add(p[x]);
		}

		for(int x = 0; x < p.length; x++)
		{
	       	p[x].setVisible(false);
		}

		for(int x = 0; x < p.length; x++)
		{
		    p[x].setBounds(0,0,690,321);
		}
		/////////****PRODUCTS****//////////

		for(int x = 0; x < numericButton.length; x++)
		{
			numericPanel.add(numericButton[x]);
			numericButton[x].addActionListener(this);
			numericButton[x].setBackground(Blue);
			numericButton[x].setForeground(Color.ORANGE);
			numericButton[x].setFont(font2);
			numericButton[x].setEnabled(false);
		}

		for(int x = 0; x < menuButton.length; x++)
		{
			menuPanel.add(menuButton[x]);
			menuButton[x].addActionListener(this);
			menuButton[x].setBackground(Blue);
			menuButton[x].setForeground(Color.ORANGE);
			menuButton[x].setFont(font3);
		}


        cashRegister.add(categoriesPanel);
        cashRegister.add(numericPanel);
        cashRegister.add(menuPanel);

        scrollPane = new JScrollPane();
        cashRegister.add(scrollPane);
        summaryField = new JTextArea(20,20);
        cashRegister.add(summaryField);
        scrollPane.setViewportView(summaryField);
        summaryField.setEditable(false);

        summaryField.append("============================================================================================\n");
    	summaryField.append("\t\t\t    FOOD CORT\n");
  	    summaryField.append("\t\t\t"+dateFormat.format(date));
  	    summaryField.append("\n\t\t\tOFFICIAL RECEIPT");
	    summaryField.append("\n============================================================================================\n");
        summaryField.append("PROD ID.\t               QTY.\t\t     PRODUCT  \t\tPRICE\t               AMOUNT\n");
        summaryField.setForeground(Color.ORANGE);
        summaryField.setBackground(Color.BLACK);

        neymLabel = new JLabel("NAME:");
        cashRegister.add(neymLabel);

        neymField = new JTextField(10);
        cashRegister.add(neymField);
        neymField.setEditable(false);

        stakLabel = new JLabel("STOCKS:");
        cashRegister.add(stakLabel);

        stakField = new JTextField(10);
        cashRegister.add(stakField);
        stakField.setEditable(false);

        orderLabel = new JLabel("ORDER:");
        cashRegister.add(orderLabel);

        orderField = new JTextField(10);
        cashRegister.add(orderField);
        orderField.setEnabled(false);
        orderField.setEditable(false);

        totalLabel = new JLabel("TOTAL AMOUNT:");
    	cashRegister.add(totalLabel);

    	totalField = new JTextField(10);
    	cashRegister.add(totalField);
    	totalField.setEditable(false);

    	paymentLabel = new JLabel("PAYMENT:");
    	cashRegister.add(paymentLabel);

    	paymentField = new JTextField(10);
    	cashRegister.add(paymentField);
    	paymentField.setEnabled(false);
    	paymentField.setEditable(false);

    	changeLabel = new JLabel("CHANGE:");
    	cashRegister.add(changeLabel);

    	changeField = new JTextField(10);
    	cashRegister.add(changeField);
    	changeField.setEditable(false);

    	orderLabel.setFont(font2);
        orderField.setFont(font2);
        totalLabel.setFont(font2);
        totalField.setFont(font2);
        paymentLabel.setFont(font2);
        paymentField.setFont(font2);
        changeLabel.setFont(font2);
        changeField.setFont(font2);
        neymLabel.setFont(font1);
        stakLabel.setFont(font1);
        neymField.setFont(font1);
        stakField.setFont(font1);

    	orderField.setForeground(Color.GREEN);
        totalField.setForeground(Color.GREEN);
        paymentField.setForeground(Color.GREEN);
        changeField.setForeground(Color.GREEN);

        orderLabel.setForeground(Color.ORANGE);
        totalLabel.setForeground(Color.ORANGE);
        paymentLabel.setForeground(Color.ORANGE);
        changeLabel.setForeground(Color.ORANGE);
        neymLabel.setForeground(Color.ORANGE);
        stakLabel.setForeground(Color.ORANGE);
        neymField.setForeground(Color.ORANGE);
        stakField.setForeground(Color.ORANGE);

        orderField.setBackground(Color.BLACK);
        totalField.setBackground(Color.BLACK);
        paymentField.setBackground(Color.BLACK);
        changeField.setBackground(Color.BLACK);
        neymField.setBackground(Color.BLACK);
        stakField.setBackground(Color.BLACK);

        categoriesPanel.setBounds(0,0,690,321);
        numericPanel.setBounds(0,320,690,380);
        menuPanel.setBounds(690,585,690,120);
        cashRegister.setBounds(0,0,1364,727);

        scrollPane.setBounds(691,0,665,270);
        summaryField.setBounds(691,0,665,270);

        neymLabel.setBounds(720,280,100,30);
        neymField.setBounds(780,280,212,30);
        stakLabel.setBounds(1040,280,100,30);
        stakField.setBounds(1110,280,212,30);

        orderLabel.setBounds(695,335,400,30);
        orderField.setBounds(945,322,412,55);
        totalLabel.setBounds(695,400,400,30);
        totalField.setBounds(945,387,412,55);
        paymentLabel.setBounds(695,465,400,30);
        paymentField.setBounds(945,452,412,55);
        changeLabel.setBounds(695,530,400,30);
        changeField.setBounds(945,517,412,55);

        menuButton[0].setEnabled(false);
        menuButton[1].setEnabled(false);
        cashRegister.setVisible(false);
        //////////////////////////////////////*****PURCHASE PANEL******////////////////////////////////////////


        //////////////////////////////////////*****INVENTORY PANEL******////////////////////////////////////////
        openFile();
        readFile();
        closeFile1();


        inventoryPanel.setLayout(null);
        inventoryPanel.setBackground(Red);
        C.add(inventoryPanel);

        inventoryLabel = new JLabel("INVENTORY");
    	inventoryPanel.add(inventoryLabel);

    	scrollPane3 = new JScrollPane();
        inventoryPanel.add(scrollPane3);
        summaryField3 = new JTextArea(20,20);
        inventoryPanel.add(summaryField3);
        scrollPane3.setViewportView(summaryField3);
        summaryField3.setEditable(false);


	    summaryField3.append("============================================================================================\n");
        summaryField3.append("PROD. ID\t    \t\t\tPROD. NAME\t\tBEGINNING BALANCEt\tITEM SOLD\t\tENDING BALANCE\n");
        summaryField3.append("============================================================================================\n");


        writeFile();
        printInventory();
        closeFile2();

        backButton2 = new JButton("BACK");
        inventoryPanel.add(backButton2);
        backButton2.addActionListener(this);


        summaryField3.setForeground(Color.ORANGE);
        summaryField3.setBackground(Color.BLACK);
        inventoryLabel.setForeground(Color.ORANGE);

        backButton2.setForeground(Color.ORANGE);
        backButton2.setBackground(Blue);

    	inventoryLabel.setFont(font2);
    	backButton2.setFont(font3);

        inventoryPanel.setBounds(0,0,1364,727);
    	inventoryLabel.setBounds(580,15,400,30);
    	scrollPane3.setBounds(165,50,1065,550);
    	summaryField3.setBounds(165,50,1065,550);
    	backButton2.setBounds(1120,610,230,80);
    	inventoryPanel.setVisible(false);
        //////////////////////////////////////*****INVENTORY PANEL******////////////////////////////////////////


        //////////////////////////////////////*****SALES REPORT PANEL******////////////////////////////////////////
        salesPanel8.setLayout(null);
        salesPanel8.setBackground(Red);
        C.add(salesPanel8);

        salesLabel8 = new JLabel("SALES REPORT");
    	salesPanel8.add(salesLabel8);

    	scrollPane8 = new JScrollPane();
        salesPanel8.add(scrollPane8);
        summaryField8 = new JTextArea(20,20);
        salesPanel8.add(summaryField8);
        scrollPane8.setViewportView(summaryField8);
        summaryField8.setEditable(false);

	    summaryField8.setText("=====================================================================================================================================================\nPROD. ID\t    \t\t\tPROD. NAME\t\t\tPRICE\t                   ITEM SOLD\t               SALES\n=====================================================================================================================================================\n");
        printSalesReport();

        grossLabel8 = new JLabel("TOTAL SALES:");
    	salesPanel8.add(grossLabel8);

    	grossField8 = new JTextField(""+String.valueOf(totalSales));
    	salesPanel8.add(grossField8);
    	grossField8.setEditable(false);

    	totalSales();

        backButton8 = new JButton("BACK");
        salesPanel8.add(backButton8);
        backButton8.addActionListener(this);


        summaryField8.setForeground(Color.ORANGE);
        summaryField8.setBackground(Color.BLACK);
        salesLabel8.setForeground(Color.ORANGE);
        grossLabel8.setForeground(Color.ORANGE);;

        grossField8.setBackground(Color.BLACK);
        grossField8.setForeground(Color.GREEN);

        backButton8.setForeground(Color.ORANGE);
        backButton8.setBackground(Blue);

    	salesLabel8.setFont(font2);
    	backButton8.setFont(font3);
    	grossLabel8.setFont(font2);
        grossField8.setFont(font2);

        salesPanel8.setBounds(0,0,1364,727);
    	salesLabel8.setBounds(580,15,400,30);
    	scrollPane8.setBounds(165,50,1065,550);
    	summaryField8.setBounds(165,50,1065,550);
    	backButton8.setBounds(1120,610,230,80);
    	grossLabel8.setBounds(165,637,400,30);
        grossField8.setBounds(415,620,155,55);
        backButton2.setBounds(1120,610,230,80);
    	salesPanel8.setVisible(false);
        //////////////////////////////////////*****SALES REPORT PANEL******////////////////////////////////////////


        //////////////////////////////////////*****ADMIN PANEL******////////////////////////////////////////
        C.add(adminPanel);
        adminPanel.setLayout(null);
        adminPanel.setBackground(Red);

        productScroll = new JScrollPane();
        adminPanel.add(productScroll);
        productList = new JTextArea();
        adminPanel.add(productList);
        productScroll.setViewportView(productList);
        productList.setEditable(false);

        printAdmin();

        optionsPanel.setLayout(new GridLayout (1,3));
        adminPanel.add(optionsPanel);

        productList.setBackground(Color.BLACK);
        productList.setForeground(Color.ORANGE);

        beckButton = new JButton("BACK");
        adminPanel.add(beckButton);
        beckButton.addActionListener(this);

        beckButton.setForeground(Color.ORANGE);
        beckButton.setBackground(Blue);

        beckButton.setFont(font3);


        for(int x=0; x<options.length; x++)
        {
        	optionsPanel.add(options[x]);
        	options[x].setBackground(Blue);
            options[x].setForeground(Color.ORANGE);
            options[x].addActionListener(this);
            options[x].setFont(font1);

        }

        logo2 = new JLabel();
		adminPanel.add(logo2);

	    logo2.setIcon(new ImageIcon(getClass().getResource("logo.png")));

        nameLabel = new JLabel("NAME:");
        adminPanel.add(nameLabel);

        stockLabel = new JLabel("STOCK:");
        adminPanel.add(stockLabel);

        priceLabel = new JLabel("PRICE:");
        adminPanel.add(priceLabel);

        nameField = new JTextField();
        adminPanel.add(nameField);

        stockField = new JTextField();
        adminPanel.add(stockField);

        priceField = new JTextField();
        adminPanel.add(priceField);

        okButton = new JButton("OK");
        adminPanel.add(okButton);
        okButton.addActionListener(this);

        adminPanel.add(copyright);

        nameLabel.setFont(font2);
        stockLabel.setFont(font2);
        priceLabel.setFont(font2);

        nameField.setFont(font2);
        stockField.setFont(font2);
        priceField.setFont(font2);
        okButton.setFont(font2);
        copyright.setFont(font1);

        nameLabel.setForeground(Color.orange);
        stockLabel.setForeground(Color.orange);
        priceLabel.setForeground(Color.orange);
        nameField.setForeground(Color.orange);
        stockField.setForeground(Color.orange);
        priceField.setForeground(Color.orange);
        okButton.setForeground(Color.orange);
        copyright.setForeground(Color.orange);

        nameField.setBackground(Color.black);
        stockField.setBackground(Color.black);
        priceField.setBackground(Color.black);
        okButton.setBackground(Blue);



        productScroll.setBounds(35,35,500,500);
        productList.setBounds(35,35,500,500);
        optionsPanel.setBounds(35,550,500,100);

        nameLabel.setBounds(695,335,400,30);
        beckButton.setBounds(1120,610,230,80);
        nameField.setBounds(845,322,412,55);
        stockLabel.setBounds(695,400,400,30);
        stockField.setBounds(845,387,412,55);
        priceLabel.setBounds(695,465,400,30);
        priceField.setBounds(845,452,412,55);
        okButton.setBounds(845,530,412,55);
        copyright.setBounds(5,670,500,30);
        logo2.setBounds(880,60,225,225);


        adminPanel.setBounds(0,0,1364,727);
        options[3].setEnabled(false);
        adminPanel.setVisible(false);
        //////////////////////////////////////*****ADMIN PANEL******////////////////////////////////////////

        setButtons();

		setTitle("FOOD CORT - SALES AND INVENTORY SYSYTEM");
		setSize(1364,727);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		///////////////////////////////////////ADMIN PANEL///////////////////////////////////////



        if(e.getSource()==beckButton)//back
	    {
	    	numeric.play();
	    	menus.setVisible(true);
            adminPanel.setVisible(false);
            nameField.setText("");
        	stockField.setText("");
        	priceField.setText("");
	    	options[0].setEnabled(true);
	    	options[1].setEnabled(true);
	    	options[2].setEnabled(true);
	    	options[3].setEnabled(false);


	    }

	    if(e.getSource()==buttons[3])//admin button
	    {
	    	numeric.play();

            JPasswordField pf = new JPasswordField();
            String pass1;
	    	int passs1;
            passs1 = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);


            pass1 = new String(pf.getPassword());


            if (passs1 == JOptionPane.OK_OPTION)
            {
	    	if(pass1.equals("15BCS1402") || pass1.equals("15bcs1402"))
	    	{
	    			m4.play();
	    	        menus.setVisible(false);
                    adminPanel.setVisible(true);
	    	}


	    	else
            {
            	error.play();
                JOptionPane.showMessageDialog(null, "INVALID PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            }



	    }

	    if(e.getSource()==options[0])//add button
	    {
	    	numeric.play();
	    	options[1].setEnabled(false);
	    	options[2].setEnabled(false);
	    	options[3].setEnabled(true);

	    }

	    if(e.getSource()==options[1])//edit button
	    {
	    	numeric.play();
	    	options[0].setEnabled(false);
	    	options[2].setEnabled(false);
	    	options[3].setEnabled(true);

                   pidmo = JOptionPane.showInputDialog(null,"Enter Product I.D.:");


                    for(int x=0; x < prodId.length; x++)
                    {
                    	if(pidmo.equals(prodId[x]))
        	            {
        	            	nameField.setText(""+prodName[x]);
        	            	stockField.setText(""+newStocks2s[x]);
        	            	priceField.setText(""+prodPrices[x]);

        	            }
                    }
	    }


	    if(e.getSource()==options[2])//delete button
	    {
	    	numeric.play();

	    	pidmo = JOptionPane.showInputDialog(null,"Enter Product I.D.:");

	    for(int x = 0; x <=3; x++)
		{
			if(pidmo.equals(prodId[x]))
			{
				prodButton1[x].setVisible(false);
			}

		}


		for(int x = 0; x <=3; x++)
		{
			if(pidmo.equals(prodId[x+4]))
			{prodButton2[x].setVisible(false);}
			//prodButton2[x]=null;
		}

		for(int x =0; x <=4; x++)
		{
			if(pidmo.equals(prodId[x+8]))
			prodButton3[x].setVisible(false);
			//prodButton3[x]=null;
		}

		for(int x = 0; x <=3; x++)
		{
			if(pidmo.equals(prodId[x+13]))
			prodButton4[x].setVisible(false);
			//prodButton4[x]=null;
		}

		for(int x = 0; x <=1; x++)
		{
			if(pidmo.equals(prodId[x+17]))
			prodButton5[x].setVisible(false);
			//prodButton5[x].=null;

		}

		for(int x = 0; x <=1; x++)
		{
			if(pidmo.equals(prodId[x+19]))
			prodButton6[x].setVisible(false);
			//prodButton6[x]=null;
		}

		for(int x = 0; x <=4; x++)
		{
			if(pidmo.equals(prodId[x+21]))
			prodButton7[x].setVisible(false);
			//prodButton7[x]=null;
		}

		for(int x = 0; x <=2; x++)
		{
			if(pidmo.equals(prodId[x+26]))
			prodButton8[x].setVisible(false);
			//prodButton8[x]=null;
		}

		for(int x = 0; x <=5; x++)
		{
			if(pidmo.equals(prodId[x+29]))
			prodButton9[x].setVisible(false);
			//prodButton9[x]=null;
		}


                    for(int x=0; x < prodId.length; x++)
                    {
                    	if(pidmo.equals(prodId[x]))
        	            {

        	            	writeFile();
        	            	prodId[x]="";
        	            	prodName[x]="";
        	            	prodPrices[x]="";
        	            	newStocks2s[x]="";
        	            	prodStockss[x]="";
        	            	prodSaless[x]="";
        	            	itemSolds[x]="";

        	            	printInventory();

        	            	closeFile2();
        	                printAdmin();printSalesReport();
        	            }
                    }
                 JOptionPane.showMessageDialog(null, "ITEM DELETED!!", "DELETE", JOptionPane.INFORMATION_MESSAGE);


	    }

	    if(e.getSource()==options[3])//CANCEL button
	    {
	    	numeric.play();
	    	 nameField.setText("");
        	stockField.setText("");
        	priceField.setText("");
	    	options[0].setEnabled(true);
	    	options[1].setEnabled(true);
	    	options[2].setEnabled(true);
	    	options[3].setEnabled(false);

	    }


	    if(e.getSource()==okButton)
	    {
	    	numeric.play();


	    	if(options[0].isEnabled())
	    	{
                            printAdmin();printSalesReport();
                            writeFile();
                            printInventory();

                            beks++;////////////////////PRODUCT ID
                            String bekss ="0"+beks;///////

                            String neym = nameField.getText();////////PRODNAME
        	                int stack = Integer.parseInt(stockField.getText());////STOCKS
        	                int prays = Integer.parseInt(priceField.getText());/////PRICE

        	                String newNeym =neym;/////VALUES TO PRINT
        	                int newStack= stack;/////
        	                int newPrays =prays;////

        	                prodId[beks-1]=bekss;
        	                prodName[beks-1]=newNeym;
        	                prodPrice[beks-1]=newPrays;
        	                prodPrices[beks-1]=""+prodPrice[beks-1];
        	                prodStocks[beks-1]=newStack;
        	                prodStockss[beks-1]=""+prodStocks[beks-1];
        	                itemSold[beks-1]=0;
        	                itemSolds[beks-1]=""+itemSold[beks-1];
        	                newStocks2[beks-1]=newStack;
        	                newStocks2s[beks-1]=""+newStocks2[beks-1];
        	                prodSales[beks-1]=0;
        	                prodSaless[beks-1]=""+prodSales[beks-1];

        	                String itemLineerr = prodId[beks-1] + "\t" + prodName[beks-1] + "\t" + prodPrice[beks-1] + "\t" + prodStocks[beks-1] + "\t" +itemSold[beks-1]+ "\t" + newStocks2[beks-1]+ "\t" +prodSales[beks-1];
        	                String itemliness  =""+prodId[beks-1]+"\t"+prodName[beks-1]+"\t"+newStocks2[beks-1]+"\t"+ prodPrice[beks-1]+"\n";

                            productList.append(""+itemliness);
                            summaryField3.append(""+prodId[beks-1]+"\t    \t\t\t"+prodName[beks-1]+"\t\t"+prodStocks[beks-1]+"\t\t"+itemSold[beks-1]+"\t\t"+newStocks2[beks-1]+"\n");
                            summaryField8.append(""+prodId[beks-1]+"\t    \t\t\t"+prodName[beks-1]+"\t\t"+prodPrice[beks-1]+"\t\t"+itemSold[beks-1]+"\t\t"+prodSales[beks-1]+"\n");
                            wrfile.println(itemLineerr);

        	                closeFile2();

        	                JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED!!", "ADD ITEM!", JOptionPane.INFORMATION_MESSAGE);

	    	}



            if(options[1].isEnabled())
            {

                    for(int x=0; x < prodId.length; x++)
                    {
                    	if(pidmo.equals(prodId[x]))
        	            {
        	            	writeFile();

        	                String neym = nameField.getText();
        	                int stack = Integer.parseInt(stockField.getText());
        	                int prays = Integer.parseInt(priceField.getText());
                            prodName[x]=neym;
                            newStocks2[x]=stack;
                            prodPrice[x]=prays;
                            newStocks2s[x]=""+newStocks2[x];
                            prodPrices[x]=""+prodPrice[x];
                            printInventory();printAdmin();printSalesReport();
                            closeFile2();
        	            }
                    }
                 setButtons();
                 JOptionPane.showMessageDialog(null, "SUCCESSFULLY EDITED!!", "EDIT!", JOptionPane.INFORMATION_MESSAGE);

            }

	    	nameField.setText("");
        	stockField.setText("");
        	priceField.setText("");
	    	options[0].setEnabled(true);
	    	options[1].setEnabled(true);
	    	options[2].setEnabled(true);
	    	options[3].setEnabled(false);

	    }




		///////////////////////////////////////ADMIN PANEL///////////////////////////////////////

		//////////////////////////////////////*****LOG IN PANEL******////////////////////////////////////////
		if(e.getSource()==JB1||e.getSource()==JP1)
	    {
	    	numeric.play();
            String s; s = JT1.getText();

            String s2 = new String(JP1.getPassword());

            if(s.equals("chandigarh university") && s2.equals("15bcs1402"))
            {
            	JOptionPane.showMessageDialog(null, "YOU HAVE SUCCESSFULLY LOGGED-IN!", "WELCOME", JOptionPane.INFORMATION_MESSAGE);
            	intro.play();
            	
                logIn.setVisible(false);
                menus.setVisible(true);
            }

            else if(s.equals("CHANDIGARH UNIVERSITY") && s2.equals("15BCS1402"))
            {
            	JOptionPane.showMessageDialog(null, "YOU HAVE SUCCESSFULLY LOGGED-IN!", "WELCOME", JOptionPane.INFORMATION_MESSAGE);
            	intro.play();
            	
                logIn.setVisible(false);
                menus.setVisible(true);
            }

            else
            {
            	error.play();
                JOptionPane.showMessageDialog(null, "INVALID USERNAME AND PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
                logIn.setVisible(true);
                menus.setVisible(false);
            }
            JP1.setText("");
            JT1.setText("");

	    }
	    //////////////////////////////////////*****LOG IN PANEL******////////////////////////////////////////

	    ////////////////////////////////////////////////SALES REPORT/////////////////////////////////
	    if(e.getSource()==backButton8)//back
	    {
	    	numeric.play();
         	menus.setVisible(true);
            salesPanel8.setVisible(false);
            cashRegister.setVisible(false);
	    	inventoryPanel.setVisible(false);


	    }
	    ////////////////////////////////////////////////////////////SALES REPORT///////////////////////

         //////////////////////////////////////*****MENUS PANEL******////////////////////////////////////////
         if(e.getSource()==logOut)
         {
         	numeric.play();
	    	JOptionPane.showMessageDialog(null, "GOOD BYE!", "LOGGED-OUT", JOptionPane.INFORMATION_MESSAGE);
	        logIn.setVisible(true);
            menus.setVisible(false);
         }

         if(e.getSource()==buttons[0])//purchase button
         {
         	numeric.play();
         	m1.play();
         	menus.setVisible(false);
            cashRegister.setVisible(true);
         }

         if(e.getSource()==buttons[1])//inventory button
         {
         	numeric.play();
         	m2.play();
         	menus.setVisible(false);
            inventoryPanel.setVisible(true);

         }

         if(e.getSource()==buttons[2])//SALES report button
         {
         	numeric.play();
         	m3.play();
         	menus.setVisible(false);
            salesPanel8.setVisible(true);

         }


         //////////////////////////////////////*****MENUS PANEL******////////////////////////////////////////

         //////////////////////////////////////*****CASH REGISTER PANEL******////////////////////////////////////////
	    if(e.getSource()==menuButton[0])//next
	    {
	    	numeric.play();
	    	clear();
	    	intro.play();
	    	


	    }

	    if(e.getSource()==menuButton[1])//void
	    {
	    	numeric.play();

	    	JPasswordField pf = new JPasswordField();
            String pass1;
	    	int passs1;
            passs1 = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);


            pass1 = new String(pf.getPassword());


            if (passs1 == JOptionPane.OK_OPTION)
            {
	    	if(pass1.equals("15BCS1402") || pass1.equals("15bcs1402"))
	    	{
	    	numericButton[14].setEnabled(false);

	    	for(int x =0; x < prodId.length; x++)
	    	{
	    	    	newStocks2[x]=newStocks2[x]+Norder[x];
	    	    	itemSold[x]=itemSold[x]-Norder[x];
	    	    	prodSales[x] =prodSales[x] - newtimes[x];
					prodSaless[x]=""+prodSales[x];
	    	    	newStocks2s[x]=""+newStocks2[x];
	    	    	itemSolds[x]=""+itemSold[x];



                   /*prodStocks[x]=newStocks2[x]+Norder[x];
                   itemSold[x]=itemSold[x]-Norder[x];*/
	    	}
	    	clear();
	    	writeFile();
	    	printInventory();
	    	closeFile2();
	    	printAdmin();
	    	printSalesReport();
	    	}


	    	else
            {
            	error.play();
                JOptionPane.showMessageDialog(null, "INVALID PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            }

	    }


	    if(e.getSource()==menuButton[2])//contact us
	    {
	    	numeric.play();
	    	JOptionPane.showMessageDialog(null, "   Copyright © 2018 Ayush Srivastava - Chandigarh University\n\nCELLPHONE NO:      7087350186\nEMAIL-ADDRESS:     ayushreal888@gmail.com", "CONTACT US", JOptionPane.PLAIN_MESSAGE);

	    }

	    if(e.getSource()==menuButton[3])//back
	    {
	    	numeric.play();
	    	menus.setVisible(true);
            cashRegister.setVisible(false);


	    }

	    if(e.getSource()==numericButton[14])//paymentButton
	    {
	    	numeric.play();
	    	for(int x =0; x < numericButton.length; x++)
	    	{
	    		numericButton[x].setEnabled(true);
	    	}

	    	for(int x =0; x < categoriesButton.length; x++)
	    	{
	    		categoriesButton[x].setEnabled(true);
	    	}

	    	menuButton[0].setEnabled(false);
	    	menuButton[1].setEnabled(true);
        	paymentField.setEnabled(true);
	    }

	    if(e.getSource()==numericButton[13])//cancelButton
	    {
	    	numeric.play();
	    	for(int x = 0; x < p.length; x++)
		    {
	        	p[x].setVisible(false);
	     	}

	     	for(int y = 0; y < numericButton.length; y++)
	    	{
	    	    numericButton[y].setEnabled(false);
	    	}

	    	enabledProd();

	    	if(orderField.isEnabled())
			{
				orderField.setText("");

			}

			else if(paymentField.isEnabled())
			{
				paymentField.setText("");
			}

			if(total!=0)
			{
				numericButton[14].setEnabled(true);
				menuButton[1].setEnabled(true);
			}

            neymField.setText("");
	        stakField.setText("");
	     	categoriesPanel.setVisible(true);
	     	numericButton[13].setEnabled(false);
	    }

	    if(e.getSource()==numericButton[12])//enterButton
	    {
	    	numeric.play();


	    	if(orderField.isEnabled())
			{
				orderField.setEnabled(false);
				for(int y=0; y < prodId.length; y++)
				{
					newStocks[y]=prodStocks[y];
				    if(id==prodId[y])
					{
						order = Integer.parseInt(orderField.getText());

						if(order<=newStocks2[y])
						{
							Norder[y]=order;
							itemSold[y]=itemSold[y]+order;
							itemSolds[y]=""+itemSold[y];
							newStocks2[y] = newStocks2[y]-order;
							newStocks2s[y]= ""+newStocks2[y];
							orderObject order1 =  new orderObject(order,prodPrice[y]); //--------->orderObject<----------
							newtimes[y]=newtimes[y]+order1.order();
							prodSales[y] =prodSales[y] + newtimes[y];
							prodSaless[y]=""+prodSales[y];
							summaryField.append(""+prodId[y]+"\t               "+order+"\t\t      "+prodName[y]+"  \t"+prodPrice[y]+"\t               "+order1.order()+"\n");
						    orderField.setText("");
						}

						if(order>newStocks[y])
			            {
							error.play();
							orderField.setText("");
							JOptionPane.showMessageDialog(null, "INSUFFICIENT STOCK","INSUFFICIENT STOCK",JOptionPane.WARNING_MESSAGE);
			            }

			            if(newStocks2[y]==0)
			            {
							error.play();
      						JOptionPane.showMessageDialog(null, "0 STOCKS LEFT!","OUT OF STOCK!!!",JOptionPane.WARNING_MESSAGE);
			            }

					}

				}
                total = newtimes[0]+newtimes[1]+newtimes[2]+newtimes[3]+newtimes[4]+newtimes[5]+newtimes[6]+newtimes[7]+newtimes[8]+newtimes[9]+newtimes[10]+newtimes[11]+newtimes[12]+newtimes[13]+newtimes[14]+newtimes[15]+newtimes[16]+newtimes[17]+newtimes[18]+newtimes[19]+newtimes[20]+newtimes[21]+newtimes[22]+newtimes[23]+newtimes[24]+newtimes[25]+newtimes[26]+newtimes[27]+newtimes[28]+newtimes[29]+newtimes[30]+newtimes[31]+newtimes[32]+newtimes[33]+newtimes[34];
        	    totalField.setText(String.valueOf(total));
				orderField.setText("");
				writeFile();
				printInventory();
				printSalesReport();
				printAdmin();
				closeFile2();

			}

			for(int x = 0; x < p.length; x++)
		    {
	        	p[x].setVisible(false);
	     	}

	    	for(int x = 0; x < numericButton.length; x++)
	    	{
	    	    numericButton[x].setEnabled(false);
	    	}


            if(total>0)
            {
              numericButton[14].setEnabled(true);
            }

	     	menuButton[1].setEnabled(true);
	    	enabledProd();
            categoriesPanel.setVisible(true);

			if(paymentField.isEnabled())
			{
				payment = Double.parseDouble(paymentField.getText());


            	if(payment<total)
				{
					numeric.play();
					error.play();
					JOptionPane.showMessageDialog(null, "INSUFFICIENT CASH!!!","HEY!", JOptionPane.ERROR_MESSAGE);
					paymentField.setText("");
				}

				else
				{
					numeric.play();
					chaching.play();
			  		orderField.setEnabled(false);

			  		for(int x =0; x < numericButton.length; x++)
			  		{
			  			numericButton[x].setEnabled(false);
			  		}

			  		for(int x =0; x < categoriesButton.length; x++)
			  		{
			  			categoriesButton[x].setEnabled(false);
			  		}


			  		paymentObject p =  new paymentObject(payment,total); //--------->paymentObject<----------

			  		changeField.setText(String.valueOf(p));

			  		summaryField.append("\n============================================================================================");
		      		summaryField.append("\nTOTAL: P "+total);
		      		summaryField.append("\n============================================================================================\n");
		      		summaryField.append("CASH: P "+payment+"\nCHANGE: P "+(p));
		      		menuButton[0].setEnabled(true);
		      		numericButton[14].setEnabled(false);
				}



				totalSales();
			}

            neymField.setText("");
	        stakField.setText("");


	    }

	    if(e.getSource()==numericButton[11])//clearButton
	    {
	    	numeric.play();
			if(orderField.isEnabled())
			{
				orderField.setText("");

			}

			else if(paymentField.isEnabled())
			{
				paymentField.setText("");
			}
	    }
	    //////////////////////////////////////*****CASH REGISTER PANEL******////////////////////////////////////////


	    //////////////////////////////////////*****INVENTORY PANEL******/////////////////////////////////////////////////
	    if(e.getSource()==backButton2)
	    {
	    	numeric.play();
	    	cashRegister.setVisible(false);
	    	inventoryPanel.setVisible(false);
	    	menus.setVisible(true);

	    }







	    //////////////////////////////////////*****INVENTORY  PANEL******////////////////////////////////////////////////


	    //////////////////////////////////////*****CATEGORIES  BUTTON******////////////////////////////////////////////////
	    for(int x = 0; x < categoriesButton.length; x++)
	    {
	    	if(e.getSource()==categoriesButton[x])
	    	{
	    		numeric.play();
	    		numericButton[13].setEnabled(true);
	    		categoriesPanel.setVisible(false);
	    		p[x].setVisible(true);
        	}
	    }
	    //////////////////////////////////////*****CATEGORIES  BUTTON******////////////////////////////////////////////////

	    //////////////////////////////////////*****PRODUCTS  BUTTON******////////////////////////////////////////////////
	    for(int x = 0; x < prodButton1.length; x++)
	    {
	    	if(e.getSource()==prodButton1[x])
	    	{
	    		numeric.play();
	    		id=prodId[x];
	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);
	    		for(int a = 0; a < prodButton1.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton1.length; y++)
	    			{
	    			    prodButton1[y].setEnabled(false);
	    			}
	    			prodButton1[x].setEnabled(true);
	    			neymField.setText(prodName[x]);
	    			stakField.setText(""+newStocks2s[x]);
	    		}
	    		}

	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }

	    for(int x = 0; x < prodButton2.length; x++)
	    {
	    	if(e.getSource()==prodButton2[x])
	    	{
	    		numeric.play();

                id=prodId[x+4];

	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);

	    	    for(int a = 0; a < prodButton2.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton2.length; y++)
	    			{
	    			    prodButton2[y].setEnabled(false);
	    			}
	    			prodButton2[x].setEnabled(true);
	    			neymField.setText(prodName[x+4]);
	    			stakField.setText(""+newStocks2s[x+4]);

	    		}
	    		}

	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }

	    for(int x = 0; x < prodButton3.length; x++)
	    {
	    	if(e.getSource()==prodButton3[x])
	    	{
	    		numeric.play();
	    		id=prodId[x+8];
	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);

	    	    for(int a = 0; a < prodButton3.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton3.length; y++)
	    			{
	    			    prodButton3[y].setEnabled(false);
	    			}
	    			prodButton3[x].setEnabled(true);
	    			neymField.setText(prodName[x+8]);
	    			stakField.setText(""+newStocks2s[x+8]);
	    		}
	    		}


	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }

	    for(int x = 0; x < prodButton4.length; x++)
	    {
	    	if(e.getSource()==prodButton4[x])
	    	{
	    		numeric.play();
	    		id=prodId[x+13];
	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);

	    		for(int a = 0; a < prodButton4.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton4.length; y++)
	    			{
	    			    prodButton4[y].setEnabled(false);
	    			}
	    			prodButton4[x].setEnabled(true);
	    			neymField.setText(prodName[x+13]);
	    			stakField.setText(""+newStocks2s[x+13]);
	    		}
	    		}

	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }

	    for(int x = 0; x < prodButton5.length; x++)
	    {
	    	if(e.getSource()==prodButton5[x])
	    	{
	    		numeric.play();
	    		id=prodId[x+17];
	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);

	    	    for(int a = 0; a < prodButton5.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton5.length; y++)
	    			{
	    			    prodButton5[y].setEnabled(false);
	    			}
	    			prodButton5[x].setEnabled(true);
	    			neymField.setText(prodName[x+17]);
	    			stakField.setText(""+newStocks2s[x+17]);
	    		}
	    		}

	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }

	    for(int x = 0; x < prodButton6.length; x++)
	    {
	    	if(e.getSource()==prodButton6[x])
	    	{
	    		numeric.play();
	    		id=prodId[x+19];
	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);

	    	    for(int a = 0; a < prodButton6.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton6.length; y++)
	    			{
	    			    prodButton6[y].setEnabled(false);
	    			}
	    			prodButton6[x].setEnabled(true);
	    			neymField.setText(prodName[x+19]);
	    			stakField.setText(""+newStocks2s[x+19]);
	    		}
	    		}

	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }

	    for(int x = 0; x < prodButton7.length; x++)
	    {
	    	if(e.getSource()==prodButton7[x])
	    	{
	    		numeric.play();
	    		id=prodId[x+21];
	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);

	    	    for(int a = 0; a < prodButton7.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton7.length; y++)
	    			{
	    			    prodButton7[y].setEnabled(false);
	    			}
	    			prodButton7[x].setEnabled(true);
	    			neymField.setText(prodName[x+21]);
	    			stakField.setText(""+newStocks2s[x+21]);
	    		}
	    		}

	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }

	    for(int x = 0; x < prodButton8.length; x++)
	    {
	    	if(e.getSource()==prodButton8[x])
	    	{
	    		numeric.play();
	    		id=prodId[x+26];
	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);

	    		for(int a = 0; a < prodButton8.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton8.length; y++)
	    			{
	    			    prodButton8[y].setEnabled(false);
	    			}
	    			prodButton8[x].setEnabled(true);
	    			neymField.setText(prodName[x+26]);
	    			stakField.setText(""+newStocks2s[x+26]);
	    		}
	    		}

	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }

	    for(int x = 0; x < prodButton9.length; x++)
	    {
	    	if(e.getSource()==prodButton9[x])
	    	{
	    		numeric.play();
	    		id=prodId[x+29];
	    		orderField.setEnabled(true);
	    		paymentField.setEnabled(false);

	    		for(int a = 0; a < prodButton9.length; a++)
	    		{
	    		if(x==a)
	    		{
	    			for(int y = 0; y < prodButton9.length; y++)
	    			{
	    			    prodButton9[y].setEnabled(false);
	    			}
	    			prodButton9[x].setEnabled(true);
	    			neymField.setText(prodName[x+29]);
	    			stakField.setText(""+newStocks2s[x+29]);
	    		}
	    		}

	    		for(int z = 0; z <= 13; z++)
	    		{
	    			numericButton[z].setEnabled(true);
	    		}
	    	}
	    }
	    //////////////////////////////////////*****PRODUCTS  BUTTON******////////////////////////////////////////////////

	    //////////////////////////////////////*****NUMERIC BUTTON******////////////////////////////////////////////////
	    for(int x = 0; x <=10; x++)
	    {
	    	if(e.getSource()==numericButton[x])
	    	{
	    		numeric.play();
	    		if(orderField.isEnabled())
		     	{
				    orderField.setText(orderField.getText()+num[x]);
			    }

			    else if(paymentField.isEnabled())
			    {
				    paymentField.setText(paymentField.getText()+num[x]);
			    }
	    	}
	    }
	    //////////////////////////////////////*****NUMERIC BUTTON******////////////////////////////////////////////////


	}



	public void enabledProd()
	{
		for(int z= 0; z < prodButton1.length; z++)
	    	{
	    		prodButton1[z].setEnabled(true);
	    	}

	    	for(int z= 0; z < prodButton2.length; z++)
	    	{
	    		prodButton2[z].setEnabled(true);
	    	}

	    	for(int z= 0; z < prodButton3.length; z++)
	    	{
	    		prodButton3[z].setEnabled(true);
	    	}

	    	for(int z= 0; z < prodButton4.length; z++)
	    	{
	    		prodButton4[z].setEnabled(true);
	    	}

	    	for(int z= 0; z < prodButton5.length; z++)
	    	{
	    		prodButton5[z].setEnabled(true);
	    	}

	    	for(int z= 0; z < prodButton6.length; z++)
	    	{
	    		prodButton6[z].setEnabled(true);
	    	}

	    	for(int z= 0; z < prodButton7.length; z++)
	    	{
	    		prodButton7[z].setEnabled(true);
	    	}

	    	for(int z= 0; z < prodButton8.length; z++)
	    	{
	    		prodButton8[z].setEnabled(true);
	    	}

	    	for(int z= 0; z < prodButton9.length; z++)
	    	{
	    		prodButton9[z].setEnabled(true);
	    	}
	}

    public void clear()
    {

            for(int x=0; x < categoriesButton.length; x++)
            {
            	categoriesButton[x].setEnabled(true);
            }
        	orderField.setEnabled(false);
        	paymentField.setEnabled(false);
        	numericButton[12].setEnabled(false);
        	menuButton[1].setEnabled(false);
        	menuButton[0].setEnabled(false);

        	summaryField.setText("============================================================================================\n\t\t\t    Chandigarh University Food cort\n\t\t\t"+dateFormat.format(date)+"\n\t\t\tOFFICIAL RECEIPT\n============================================================================================\nPROD ID.\t               QTY.\t\t     PRODUCT  \t\tPRICE\t               AMOUNT\n");

            for(int x=0; x < prodId.length; x++)
            {
            	newtimes[x]=newtimes[x]*0;
            }

            total=total*0;
            sum=sum*0;

            orderField.setText("");
            totalField.setText("");
			changeField.setText("");
			paymentField.setText("");
    }

    public void setButtons()
    {
                 prodButton1[0].setText("PHILLY CHEESE STEAK - PHP "+prodPrice[0]);
                 prodButton1[1].setText("BEEF JERKY - PHP "+prodPrice[1]);
                 prodButton1[2].setText("BUFFALO CHICKEN - PHP "+prodPrice[2]);
                 prodButton1[3].setText("CHICKEN TEREYAKI - PHP "+prodPrice[3]);

                 prodButton2[0].setText("BEEF SALPICAO - "+prodPrice[4]);
                 prodButton2[1].setText("CRISPY CHICKEN - PHP "+prodPrice[5]);
                 prodButton2[2].setText("PORK SISIG W/ EGG - PHP "+prodPrice[6]);
                 prodButton2[3].setText("PORK LIEMPO - PHP "+prodPrice[7]);

                 prodButton3[0].setText("PASTA BOLOGNESE - PHP "+prodPrice[8]);
                 prodButton3[1].setText("CREAMY PESTO - PHP "+prodPrice[9]);
                 prodButton3[2].setText("PASTA ALFREDO - PHP "+prodPrice[10]);
                 prodButton3[3].setText("BACON & EGG SANDWICH - PHP "+prodPrice[11]);
                 prodButton3[4].setText("SPAM AND EGG SANDWICH - PHP "+prodPrice[12]);

                 prodButton4[0].setText("MOZZARELLA POTATO BALLS - PHP "+prodPrice[13]);
                 prodButton4[1].setText("MOZZARELLA POCKETS - PHP "+prodPrice[14]);
                 prodButton4[2].setText("CHEESY FRIES - PHP "+prodPrice[15]);
                 prodButton4[3].setText("CHICKEN NUGGETS - PHP "+prodPrice[16]);

                 prodButton5[0].setText("HASHBROWN - PHP "+prodPrice[17]);
                 prodButton5[1].setText("TWISTER FRIES - "+prodPrice[18]);

                 prodButton6[0].setText("SOLO - PHP "+prodPrice[19]);
                 prodButton6[1].setText("UPSIZE - PHP "+prodPrice[20]);

                 prodButton7[0].setText("22OZ ICED TEA - PHP "+prodPrice[21]);
                 prodButton7[1].setText("ICED COFFEE - PHP "+prodPrice[22]);
                 prodButton7[2].setText("ICED COFFEE VANILLA - PHP "+prodPrice[23]);
                 prodButton7[3].setText("ICED MOCHA - PHP "+prodPrice[24]);
                 prodButton7[4].setText("BOTTLED WATER - PHP "+prodPrice[25]);

                 prodButton8[0].setText("PINK PERFECTION - PHP "+prodPrice[26]);
                 prodButton8[1].setText("CHUNKY MONKEY - PHP "+prodPrice[27]);
                 prodButton8[2].setText("MOCHA LOCA - PHP "+prodPrice[28]);

                 prodButton9[0].setText("POTPOTS SOLO - PHP "+prodPrice[29]);
                 prodButton9[1].setText("POTPOTS UPSIZE - PHP "+prodPrice[30]);
    }



	public static void main(String[] args)
	{
		JDialog.setDefaultLookAndFeelDecorated(true);
		MENDOZA_ELGA X = new MENDOZA_ELGA();
		X.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}