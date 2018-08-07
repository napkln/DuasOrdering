import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Timestamp;


import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class DuasOrdering {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtDisplay;
	
	String operations;
	String answer;
	double firstnum;
	double secondnum;
	double result;
	private JTextField textTax;
	private JTextField textSubtotal;
	private JTextField textTotal;
	private JTextField textFriedEggRollsQty;
	private JTextField textSpringRollsQty;
	private JTextField textHousePhoQty;
	private JTextField textShrimpPhoQty;
	private JTextField textChickenPhoQty;
	private JTextField textBeefPhoQty;
	private JTextField textPorkMixaoQty;
	private JTextField textChickenMixaoQty;
	private JTextField textTofuMixaoQty;
	private JTextField textShrimpMixaoQty;
	private JTextField textSteakSaladQty;
	private JTextField textChickenSaladQty;
	private JTextField textLemongrassTofuSaladQty;
	private JTextField textShrimpSaladQty;
	private JTextField textWaterQty;
	private JTextField textCokeQty;
	private JTextField textTeaQty;

	double friedeggrolls = 3.25;
	double springrolls = 3.75;
	double housepho = 8.75;
	double shrimppho = 10.75;
	double chickenpho = 8.75;
	double beefpho = 8.75;
	double porkmixao = 8.75;
	double chickenmixao = 8.75;
	double tofumixao = 8.25;
	double shrimpmixao = 10.75;
	double steaksalad = 10.75;
	double chickensalad = 8.75;
	double lemongrasstofusalad = 8.25;
	double shrimpsalad = 10.75;
	double water = .75;
	double coke = 1.75;
	double tea = 2.75;
	double tax = 7.0;
	
	double friedeggrollscount = 100; 		// 2 per order
	double springrollscount = 100;			// 2 per order
	double phobrothcount = 500;				// 1 per order
	double mixaoingredientscount = 100;		// 1 per order
	double saladingredientscount = 100;		// 1 per order
	double chickenbreastcount = 300;		// 2 per order
	double steakcount = 300;				// 2 per order
	double porkcount = 200;					// 2 per order
	double tofucount = 5000;				// 15 per order
	double shrimpcount = 5000;				// 15 per order
	double watercount = 200;				// 1 per order
	double cokecount = 100;					// 1 per order
	double teacount = 50;					// 1 per order
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DuasOrdering window = new DuasOrdering();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the application.
	 */
	public DuasOrdering() {
		initialize();
	}


	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBorder(new LineBorder(new Color(128, 0, 0), 6, true));
		panel_menu.setBounds(10, 11, 337, 589);
		frame.getContentPane().add(panel_menu);
		panel_menu.setLayout(null);
		
		/*
		 * -------------------CREATOR NAME---------------------
		 */
		JLabel lblMemberName1 = new JLabel("Trent Bucy");
		lblMemberName1.setForeground(new Color(128, 0, 0));
		lblMemberName1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 9));
		lblMemberName1.setBounds(82, 546, 180, 14);
		panel_menu.add(lblMemberName1);

		

		
		/*
		 * ----------------DUA VIETNAMESE NOODLE SOUP------------------
		 */
		JLabel Dua1 = new JLabel("Dua");
		Dua1.setBounds(357, 21, 229, 123);
		frame.getContentPane().add(Dua1);
		Dua1.setForeground(new Color(0, 0, 0));
		Dua1.setHorizontalAlignment(SwingConstants.CENTER);
		Dua1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 86));
		
		JLabel Dua2 = new JLabel("Dua");
		Dua2.setHorizontalAlignment(SwingConstants.CENTER);
		Dua2.setForeground(new Color(128, 0, 0));
		Dua2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 86));
		Dua2.setBounds(367, 11, 219, 142);
		frame.getContentPane().add(Dua2);
		
		JLabel lblVietnameseNoodleSoup = new JLabel("Vietnamese Noodle Soup");
		lblVietnameseNoodleSoup.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblVietnameseNoodleSoup.setForeground(new Color(128, 0, 0));
		lblVietnameseNoodleSoup.setBounds(379, 131, 193, 14);
		frame.getContentPane().add(lblVietnameseNoodleSoup);
		
		
		
		
		/*
		 * ----------------MENU HEADERS------------------
		 */
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(123, 11, 96, 42);
		lblMenu.setFont(new Font("Tempus Sans ITC", Font.BOLD, 36));
		panel_menu.add(lblMenu);
		
		JLabel lblAppetizers = new JLabel("Appetizers");
		lblAppetizers.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblAppetizers.setBounds(23, 54, 89, 22);
		panel_menu.add(lblAppetizers);
		
		JLabel lblPho = new JLabel("Pho");
		lblPho.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblPho.setBounds(23, 124, 42, 22);
		panel_menu.add(lblPho);
		
		JLabel lblMixao = new JLabel("Mixao");
		lblMixao.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblMixao.setBounds(23, 229, 53, 22);
		panel_menu.add(lblMixao);
		
		JLabel lblSalads = new JLabel("Salads");
		lblSalads.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblSalads.setBounds(23, 337, 53, 22);
		panel_menu.add(lblSalads);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblDrinks.setBounds(23, 445, 67, 22);
		panel_menu.add(lblDrinks);
		
		JLabel lblQty = new JLabel("Qty.");
		lblQty.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblQty.setBounds(280, 54, 47, 22);
		panel_menu.add(lblQty);
		
		
		/*
		 * ----------------APPETIZERS------------------
		 */
		JLabel lblFriedEggrolls = new JLabel("Fried Eggrolls (2)");
		lblFriedEggrolls.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblFriedEggrolls.setForeground(new Color(128, 0, 0));
		lblFriedEggrolls.setBounds(44, 81, 120, 14);
		panel_menu.add(lblFriedEggrolls);
		
		JLabel label_FriedEggRollsPrice = new JLabel("$3.25");
		label_FriedEggRollsPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_FriedEggRollsPrice.setBounds(209, 81, 42, 14);
		panel_menu.add(label_FriedEggRollsPrice);
		
		JLabel lblSpringRolls = new JLabel("Spring Rolls (2)");
		lblSpringRolls.setForeground(new Color(128, 0, 0));
		lblSpringRolls.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblSpringRolls.setBounds(44, 99, 120, 14);
		panel_menu.add(lblSpringRolls);
		
		JLabel label_SpringRollsPrice = new JLabel("$3.75");
		label_SpringRollsPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_SpringRollsPrice.setBounds(209, 98, 42, 14);
		panel_menu.add(label_SpringRollsPrice);
		
		
		/*
		 * ----------------PHO------------------
		 */
		JLabel lblChickenPho = new JLabel("Chicken Pho");
		lblChickenPho.setForeground(new Color(128, 0, 0));
		lblChickenPho.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblChickenPho.setBounds(44, 186, 120, 22);
		panel_menu.add(lblChickenPho);
		
		JLabel label_ChickenPhoPrice = new JLabel("$8.75");
		label_ChickenPhoPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_ChickenPhoPrice.setBounds(209, 190, 42, 14);
		panel_menu.add(label_ChickenPhoPrice);
		
		JLabel lblShrimpPho = new JLabel("Shrimp Pho");
		lblShrimpPho.setForeground(new Color(128, 0, 0));
		lblShrimpPho.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblShrimpPho.setBounds(44, 165, 120, 22);
		panel_menu.add(lblShrimpPho);
		
		JLabel label_ShrimpPhoPrice = new JLabel("$10.75");
		label_ShrimpPhoPrice.setHorizontalAlignment(SwingConstants.CENTER);
		label_ShrimpPhoPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_ShrimpPhoPrice.setBounds(198, 169, 53, 14);
		panel_menu.add(label_ShrimpPhoPrice);
		
		JLabel lblHousePho = new JLabel("House Pho");
		lblHousePho.setForeground(new Color(128, 0, 0));
		lblHousePho.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblHousePho.setBounds(44, 144, 120, 22);
		panel_menu.add(lblHousePho);
		
		JLabel label_HousePhoPrice = new JLabel("$8.75");
		label_HousePhoPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_HousePhoPrice.setBounds(209, 148, 42, 14);
		panel_menu.add(label_HousePhoPrice);
		
		JLabel lblBeefPho = new JLabel("Beef Pho");
		lblBeefPho.setForeground(new Color(128, 0, 0));
		lblBeefPho.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblBeefPho.setBounds(44, 206, 120, 22);
		panel_menu.add(lblBeefPho);
		
		JLabel label_BeefPhoPrice = new JLabel("$8.75");
		label_BeefPhoPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_BeefPhoPrice.setBounds(209, 210, 42, 14);
		panel_menu.add(label_BeefPhoPrice);
		
		
		/*
		 * ----------------MIXAO------------------
		 */
		JLabel lblPorkMixao = new JLabel("Pork Mixao");
		lblPorkMixao.setForeground(new Color(128, 0, 0));
		lblPorkMixao.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblPorkMixao.setBounds(44, 251, 120, 22);
		panel_menu.add(lblPorkMixao);
		
		JLabel label_PorkMixaoPrice = new JLabel("$8.75");
		label_PorkMixaoPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_PorkMixaoPrice.setBounds(209, 254, 42, 14);
		panel_menu.add(label_PorkMixaoPrice);
		
		JLabel lblChickenMixao = new JLabel("Chicken Mixao");
		lblChickenMixao.setForeground(new Color(128, 0, 0));
		lblChickenMixao.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblChickenMixao.setBounds(44, 273, 120, 22);
		panel_menu.add(lblChickenMixao);
		
		JLabel label_ChickenMixaoPrice = new JLabel("$8.75");
		label_ChickenMixaoPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_ChickenMixaoPrice.setBounds(209, 277, 42, 14);
		panel_menu.add(label_ChickenMixaoPrice);
		
		JLabel lblTofuMixao = new JLabel("Tofu Mixao");
		lblTofuMixao.setForeground(new Color(128, 0, 0));
		lblTofuMixao.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblTofuMixao.setBounds(44, 293, 120, 22);
		panel_menu.add(lblTofuMixao);
		
		JLabel label_TofuMixaoPrice = new JLabel("$8.25");
		label_TofuMixaoPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_TofuMixaoPrice.setBounds(209, 297, 42, 14);
		panel_menu.add(label_TofuMixaoPrice);
		
		JLabel lblShrimpMixao = new JLabel("Shrimp Mixao");
		lblShrimpMixao.setForeground(new Color(128, 0, 0));
		lblShrimpMixao.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblShrimpMixao.setBounds(44, 314, 120, 22);
		panel_menu.add(lblShrimpMixao);
		
		JLabel label_ShrimpMixaoPrice = new JLabel("$10.75");
		label_ShrimpMixaoPrice.setHorizontalAlignment(SwingConstants.CENTER);
		label_ShrimpMixaoPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_ShrimpMixaoPrice.setBounds(198, 317, 53, 14);
		panel_menu.add(label_ShrimpMixaoPrice);
		
		
		/*
		 * ---------------SALADS-------------------
		 */
		JLabel lblSteak = new JLabel("Steak");
		lblSteak.setForeground(new Color(128, 0, 0));
		lblSteak.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblSteak.setBounds(44, 359, 120, 22);
		panel_menu.add(lblSteak);
		
		JLabel label_SteakSaladPrice = new JLabel("$10.75");
		label_SteakSaladPrice.setHorizontalAlignment(SwingConstants.CENTER);
		label_SteakSaladPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_SteakSaladPrice.setBounds(198, 363, 53, 14);
		panel_menu.add(label_SteakSaladPrice);
		
		JLabel lblChicken = new JLabel("Chicken");
		lblChicken.setForeground(new Color(128, 0, 0));
		lblChicken.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblChicken.setBounds(44, 380, 120, 22);
		panel_menu.add(lblChicken);
		
		JLabel label_ChickenSaladPrice = new JLabel("$8.75");
		label_ChickenSaladPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_ChickenSaladPrice.setBounds(209, 384, 42, 14);
		panel_menu.add(label_ChickenSaladPrice);
		
		JLabel lblLemongrassTofu = new JLabel("Lemongrass Tofu");
		lblLemongrassTofu.setForeground(new Color(128, 0, 0));
		lblLemongrassTofu.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblLemongrassTofu.setBounds(44, 402, 120, 22);
		panel_menu.add(lblLemongrassTofu);
		
		JLabel label_LemongrassTofuSaladPrice = new JLabel("$8.25");
		label_LemongrassTofuSaladPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_LemongrassTofuSaladPrice.setBounds(209, 406, 42, 14);
		panel_menu.add(label_LemongrassTofuSaladPrice);
		
		JLabel lblShrimp = new JLabel("Shrimp");
		lblShrimp.setForeground(new Color(128, 0, 0));
		lblShrimp.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblShrimp.setBounds(44, 424, 120, 22);
		panel_menu.add(lblShrimp);
		
		JLabel label_ShrimpSaladPrice = new JLabel("$10.75");
		label_ShrimpSaladPrice.setHorizontalAlignment(SwingConstants.CENTER);
		label_ShrimpSaladPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_ShrimpSaladPrice.setBounds(198, 428, 53, 14);
		panel_menu.add(label_ShrimpSaladPrice);
		
		
		/*
		 * -----------------DRINKS-------------------
		 */
		JLabel lblWater = new JLabel("Water");
		lblWater.setForeground(new Color(128, 0, 0));
		lblWater.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblWater.setBounds(44, 467, 120, 22);
		panel_menu.add(lblWater);
		
		JLabel label_WaterPrice = new JLabel("$.75");
		label_WaterPrice.setHorizontalAlignment(SwingConstants.CENTER);
		label_WaterPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_WaterPrice.setBounds(209, 471, 42, 14);
		panel_menu.add(label_WaterPrice);
		
		JLabel lblCoke = new JLabel("Coke");
		lblCoke.setForeground(new Color(128, 0, 0));
		lblCoke.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblCoke.setBounds(44, 489, 120, 22);
		panel_menu.add(lblCoke);
		
		JLabel label_CokePrice = new JLabel("$1.75");
		label_CokePrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_CokePrice.setBounds(209, 493, 42, 14);
		panel_menu.add(label_CokePrice);
		
		JLabel lblTea = new JLabel("Tea");
		lblTea.setForeground(new Color(128, 0, 0));
		lblTea.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblTea.setBounds(44, 513, 120, 22);
		panel_menu.add(lblTea);
		
		JLabel label_TeaPrice = new JLabel("$2.75");
		label_TeaPrice.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_TeaPrice.setBounds(209, 517, 42, 14);
		panel_menu.add(label_TeaPrice);
		
		

		
		textFriedEggRollsQty = new JTextField();
		textFriedEggRollsQty.setText("0");
		textFriedEggRollsQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFriedEggRollsQty.setBounds(280, 81, 47, 17);
		panel_menu.add(textFriedEggRollsQty);
		textFriedEggRollsQty.setColumns(10);
		
		textSpringRollsQty = new JTextField();
		textSpringRollsQty.setText("0");
		textSpringRollsQty.setHorizontalAlignment(SwingConstants.CENTER);
		textSpringRollsQty.setColumns(10);
		textSpringRollsQty.setBounds(280, 99, 47, 17);
		panel_menu.add(textSpringRollsQty);
		
		textHousePhoQty = new JTextField();
		textHousePhoQty.setText("0");
		textHousePhoQty.setHorizontalAlignment(SwingConstants.CENTER);
		textHousePhoQty.setColumns(10);
		textHousePhoQty.setBounds(280, 145, 47, 17);
		panel_menu.add(textHousePhoQty);
		
		textShrimpPhoQty = new JTextField();
		textShrimpPhoQty.setText("0");
		textShrimpPhoQty.setHorizontalAlignment(SwingConstants.CENTER);
		textShrimpPhoQty.setColumns(10);
		textShrimpPhoQty.setBounds(280, 166, 47, 17);
		panel_menu.add(textShrimpPhoQty);
		
		textChickenPhoQty = new JTextField();
		textChickenPhoQty.setText("0");
		textChickenPhoQty.setHorizontalAlignment(SwingConstants.CENTER);
		textChickenPhoQty.setColumns(10);
		textChickenPhoQty.setBounds(280, 187, 47, 17);
		panel_menu.add(textChickenPhoQty);
		
		textBeefPhoQty = new JTextField();
		textBeefPhoQty.setText("0");
		textBeefPhoQty.setHorizontalAlignment(SwingConstants.CENTER);
		textBeefPhoQty.setColumns(10);
		textBeefPhoQty.setBounds(280, 207, 47, 17);
		panel_menu.add(textBeefPhoQty);
		
		textPorkMixaoQty = new JTextField();
		textPorkMixaoQty.setText("0");
		textPorkMixaoQty.setHorizontalAlignment(SwingConstants.CENTER);
		textPorkMixaoQty.setColumns(10);
		textPorkMixaoQty.setBounds(280, 252, 47, 17);
		panel_menu.add(textPorkMixaoQty);
		
		textChickenMixaoQty = new JTextField();
		textChickenMixaoQty.setText("0");
		textChickenMixaoQty.setHorizontalAlignment(SwingConstants.CENTER);
		textChickenMixaoQty.setColumns(10);
		textChickenMixaoQty.setBounds(280, 274, 47, 17);
		panel_menu.add(textChickenMixaoQty);
		
		textTofuMixaoQty = new JTextField();
		textTofuMixaoQty.setText("0");
		textTofuMixaoQty.setHorizontalAlignment(SwingConstants.CENTER);
		textTofuMixaoQty.setColumns(10);
		textTofuMixaoQty.setBounds(280, 294, 47, 17);
		panel_menu.add(textTofuMixaoQty);
		
		textShrimpMixaoQty = new JTextField();
		textShrimpMixaoQty.setText("0");
		textShrimpMixaoQty.setHorizontalAlignment(SwingConstants.CENTER);
		textShrimpMixaoQty.setColumns(10);
		textShrimpMixaoQty.setBounds(280, 315, 47, 17);
		panel_menu.add(textShrimpMixaoQty);
		
		textSteakSaladQty = new JTextField();
		textSteakSaladQty.setText("0");
		textSteakSaladQty.setHorizontalAlignment(SwingConstants.CENTER);
		textSteakSaladQty.setColumns(10);
		textSteakSaladQty.setBounds(280, 361, 47, 17);
		panel_menu.add(textSteakSaladQty);
		
		textChickenSaladQty = new JTextField();
		textChickenSaladQty.setText("0");
		textChickenSaladQty.setHorizontalAlignment(SwingConstants.CENTER);
		textChickenSaladQty.setColumns(10);
		textChickenSaladQty.setBounds(280, 381, 47, 17);
		panel_menu.add(textChickenSaladQty);
		
		textLemongrassTofuSaladQty = new JTextField();
		textLemongrassTofuSaladQty.setText("0");
		textLemongrassTofuSaladQty.setHorizontalAlignment(SwingConstants.CENTER);
		textLemongrassTofuSaladQty.setColumns(10);
		textLemongrassTofuSaladQty.setBounds(280, 403, 47, 17);
		panel_menu.add(textLemongrassTofuSaladQty);
		
		textShrimpSaladQty = new JTextField();
		textShrimpSaladQty.setText("0");
		textShrimpSaladQty.setHorizontalAlignment(SwingConstants.CENTER);
		textShrimpSaladQty.setColumns(10);
		textShrimpSaladQty.setBounds(280, 425, 47, 17);
		panel_menu.add(textShrimpSaladQty);
		
		textWaterQty = new JTextField();
		textWaterQty.setText("0");
		textWaterQty.setHorizontalAlignment(SwingConstants.CENTER);
		textWaterQty.setColumns(10);
		textWaterQty.setBounds(280, 468, 47, 17);
		panel_menu.add(textWaterQty);
		
		textCokeQty = new JTextField();
		textCokeQty.setText("0");
		textCokeQty.setHorizontalAlignment(SwingConstants.CENTER);
		textCokeQty.setColumns(10);
		textCokeQty.setBounds(280, 490, 47, 17);
		panel_menu.add(textCokeQty);
		
		textTeaQty = new JTextField();
		textTeaQty.setText("0");
		textTeaQty.setHorizontalAlignment(SwingConstants.CENTER);
		textTeaQty.setColumns(10);
		textTeaQty.setBounds(280, 514, 47, 17);
		panel_menu.add(textTeaQty);
		
		
		
		
		
		/*
		 * ----------------LOGIN PANEL--------------------
		 */
		JPanel panel_login = new JPanel();
		panel_login.setBorder(new LineBorder(new Color(128, 0, 0), 6, true));
		panel_login.setBounds(357, 155, 229, 107);
		frame.getContentPane().add(panel_login);
		panel_login.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblUsername.setBounds(18, 17, 77, 17);
		panel_login.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblPassword.setBounds(18, 46, 77, 22);
		panel_login.add(lblPassword);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnClear.setBounds(20, 79, 89, 17);
		panel_login.add(btnClear);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if (username.contains("TSM") && password.contains("cis3260")) {
					
					txtPassword.setText(null);
					txtUsername.setText(null);
					
					JOptionPane.showMessageDialog(null, "Login Succesful", "Login Succesful",JOptionPane.INFORMATION_MESSAGE);
					
					textSpringRollsQty.setText("1");
					textPorkMixaoQty.setText("1");
					textWaterQty.setText("1");
				}
				
				else if (username.contains("trentbucy") && password.contains("forkfunk6")) {
					
					txtPassword.setText(null);
					txtUsername.setText(null);
					
					JOptionPane.showMessageDialog(null, "Login Succesful", "Login Succesful",JOptionPane.INFORMATION_MESSAGE);
					
					textFriedEggRollsQty.setText("3");
					textHousePhoQty.setText("1");
					textTeaQty.setText("1");
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null, "Invalid login details", "Login Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(119, 79, 89, 17);
		panel_login.add(btnLogin);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(105, 17, 110, 18);
		panel_login.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(105, 48, 110, 18);
		panel_login.add(txtPassword);
		
		
		
		
		/*
		 * ---------------RECEIPT PANEL-------------------
		 */
		JPanel panel_receiptlayout = new JPanel();
		panel_receiptlayout.setBorder(new LineBorder(new Color(128, 0, 0), 6, true));
		panel_receiptlayout.setBounds(596, 11, 278, 431);
		frame.getContentPane().add(panel_receiptlayout);
		panel_receiptlayout.setLayout(null);
		
		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblReceipt.setBounds(10, 11, 258, 33);
		panel_receiptlayout.add(lblReceipt);
		
		JPanel panel_receipt = new JPanel();
		panel_receipt.setBounds(10, 43, 258, 377);
		panel_receiptlayout.add(panel_receipt);
		panel_receipt.setLayout(null);
		
		JTextArea textReceipt = new JTextArea();
		textReceipt.setFont(new Font("Monospaced", Font.BOLD, 10));
		textReceipt.setBounds(0, 0, 258, 377);
		panel_receipt.add(textReceipt);

		
		
		/*
		 * ---------------BUTTONS PANEL------------------
		 */
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 6, true));
		panel_3.setBounds(596, 560, 278, 40);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				textFriedEggRollsQty.setText("0");
				textSpringRollsQty.setText("0");
				textHousePhoQty.setText("0");
				textShrimpPhoQty.setText("0");
				textChickenPhoQty.setText("0");
				textBeefPhoQty.setText("0");
				textPorkMixaoQty.setText("0");
				textChickenMixaoQty.setText("0");
				textTofuMixaoQty.setText("0");
				textShrimpMixaoQty.setText("0");
				textSteakSaladQty.setText("0");
				textChickenSaladQty.setText("0");
				textLemongrassTofuSaladQty.setText("0");
				textShrimpSaladQty.setText("0");
				textWaterQty.setText("0");
				textCokeQty.setText("0");
				textTeaQty.setText("0");
				
				txtUsername.setText(null);
				txtPassword.setText(null);
				
				txtDisplay.setText(null);
				
				textReceipt.setText(null);
				
				textTax.setText(null);
				textSubtotal.setText(null);
				textTotal.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 10));

		btnReset.setBounds(20, 11, 67, 17);
		panel_3.add(btnReset);
		
		JButton button_Total = new JButton("Total");
		button_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double friedeggrollstotal = friedeggrolls * Double.parseDouble(textFriedEggRollsQty.getText());
				double springrollstotal = springrolls * Double.parseDouble(textSpringRollsQty.getText());
				double housephototal = housepho * Double.parseDouble(textHousePhoQty.getText());
				double shrimpphototal = shrimppho * Double.parseDouble(textShrimpPhoQty.getText());
				double chickenphototal = chickenpho * Double.parseDouble(textChickenPhoQty.getText());
				double beefphototal = beefpho * Double.parseDouble(textBeefPhoQty.getText());
				double porkmixaototal = porkmixao * Double.parseDouble(textPorkMixaoQty.getText());
				double chickenmixaototal = chickenmixao * Double.parseDouble(textChickenMixaoQty.getText());
				double tofumixaototal = tofumixao * Double.parseDouble(textTofuMixaoQty.getText());
				double shrimpmixaototal = shrimpmixao * Double.parseDouble(textShrimpMixaoQty.getText());
				double steaksaladtotal = steaksalad * Double.parseDouble(textSteakSaladQty.getText());
				double chickensaladtotal = chickensalad * Double.parseDouble(textChickenSaladQty.getText());
				double lemongrasstofusaladtotal = lemongrasstofusalad * Double.parseDouble(textLemongrassTofuSaladQty.getText());
				double shrimpsaladtotal = shrimpsalad * Double.parseDouble(textShrimpSaladQty.getText());
				double watertotal = water * Double.parseDouble(textWaterQty.getText());
				double coketotal = coke * Double.parseDouble(textCokeQty.getText());
				double teatotal = tea * Double.parseDouble(textTeaQty.getText());
				
				double subTotal = friedeggrollstotal + springrollstotal + housephototal + shrimpphototal + chickenphototal + beefphototal + porkmixaototal + chickenmixaototal +
					tofumixaototal	+ shrimpmixaototal + steaksaladtotal + chickensaladtotal + lemongrasstofusaladtotal + shrimpsaladtotal + watertotal + coketotal + teatotal;
				
				double taxTotal = (tax*subTotal)/100;
		
				
				String S = String.format("$ %.2f", subTotal);
				textSubtotal.setText(S);
			
				String T = String.format("$ %.2f", taxTotal);
				textTax.setText(T);
				
				double sumTotal = subTotal + taxTotal;
				
				String FinalTotal = String.format("$ %.2f", sumTotal);
				textTotal.setText(FinalTotal);
				
			}
		});
		button_Total.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		button_Total.setBounds(97, 11, 57, 17);
		panel_3.add(button_Total);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double friedeggrollstotal = friedeggrolls * Double.parseDouble(textFriedEggRollsQty.getText());
				double springrollstotal = springrolls * Double.parseDouble(textSpringRollsQty.getText());
				double housephototal = housepho * Double.parseDouble(textHousePhoQty.getText());
				double shrimpphototal = shrimppho * Double.parseDouble(textShrimpPhoQty.getText());
				double chickenphototal = chickenpho * Double.parseDouble(textChickenPhoQty.getText());
				double beefphototal = beefpho * Double.parseDouble(textBeefPhoQty.getText());
				double porkmixaototal = porkmixao * Double.parseDouble(textPorkMixaoQty.getText());
				double chickenmixaototal = chickenmixao * Double.parseDouble(textChickenMixaoQty.getText());
				double tofumixaototal = tofumixao * Double.parseDouble(textTofuMixaoQty.getText());
				double shrimpmixaototal = shrimpmixao * Double.parseDouble(textShrimpMixaoQty.getText());
				double steaksaladtotal = steaksalad * Double.parseDouble(textSteakSaladQty.getText());
				double chickensaladtotal = chickensalad * Double.parseDouble(textChickenSaladQty.getText());
				double lemongrasstofusaladtotal = lemongrasstofusalad * Double.parseDouble(textLemongrassTofuSaladQty.getText());
				double shrimpsaladtotal = shrimpsalad * Double.parseDouble(textShrimpSaladQty.getText());
				double watertotal = water * Double.parseDouble(textWaterQty.getText());
				double coketotal = coke * Double.parseDouble(textCokeQty.getText());
				double teatotal = tea * Double.parseDouble(textTeaQty.getText());
				
				double subTotal = friedeggrollstotal + springrollstotal + housephototal + shrimpphototal + chickenphototal + beefphototal + porkmixaototal + chickenmixaototal +
					tofumixaototal	+ shrimpmixaototal + steaksaladtotal + chickensaladtotal + lemongrasstofusaladtotal + shrimpsaladtotal + watertotal + coketotal + teatotal;
				
				double taxTotal = (tax*subTotal)/100;
		
				String S = String.format("$ %.2f", subTotal);
				String T = String.format("$ %.2f", taxTotal);
	
				
				double sumTotal = subTotal + taxTotal;
				
				String FinalTotal = String.format("$ %.2f", sumTotal);
				
				String fileName = "receipt.txt";
				try {
					PrintWriter outputStream = new PrintWriter(fileName);
				
				
				
				textReceipt.setText("*******************************************\n");
				outputStream.println("*******************************************");
				textReceipt.setText(textReceipt.getText() + "*****   DUA VIETNAMESE NOODLE SOUP    *****");
				outputStream.println("*****   DUA VIETNAMESE NOODLE SOUP    *****");
				textReceipt.setText(textReceipt.getText() + "\n*******************************************\n");
				outputStream.println("*******************************************");
				textReceipt.setText(textReceipt.getText() + "\n\t\t  Receipt \n\t  ");
				outputStream.println("		   Receipt");
		        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				textReceipt.setText(textReceipt.getText() + timestamp + "\n\n");
				outputStream.println("	   " + timestamp);
				outputStream.println("");

				
				
				if (friedeggrollstotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textFriedEggRollsQty.getText()) + " Fried Egg Rolls \t $ " + 
					friedeggrolls*Integer.parseInt(textFriedEggRollsQty.getText()) + "\n");
					int i = Integer.parseInt(textFriedEggRollsQty.getText());
					friedeggrollscount = friedeggrollscount - i*2;
					outputStream.println(Integer.parseInt(textFriedEggRollsQty.getText()) + " Fried Egg Rolls \t $ " + 
					friedeggrolls*Integer.parseInt(textFriedEggRollsQty.getText()) + "\n");
				}

				if (springrollstotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textSpringRollsQty.getText()) + " Spring Rolls \t\t $ " +
					springrolls*Integer.parseInt(textSpringRollsQty.getText()) + "\n");
					int i = Integer.parseInt(textSpringRollsQty.getText());
					springrollscount = springrollscount - i*2;
					outputStream.println(Integer.parseInt(textSpringRollsQty.getText()) + " Spring Rolls \t\t $ " +
					springrolls*Integer.parseInt(textSpringRollsQty.getText()) + "\n");
				}
				
				
				
				if (housephototal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textHousePhoQty.getText()) + " House Pho\t\t $ " + 
					housepho*Integer.parseInt(textHousePhoQty.getText()) + "\n");
					int i = Integer.parseInt(textHousePhoQty.getText());
					phobrothcount = phobrothcount - i;
					chickenbreastcount = chickenbreastcount - i;
					steakcount = steakcount - i;
					outputStream.println(Integer.parseInt(textHousePhoQty.getText()) + " House Pho \t\t $ " + 
					housepho*Integer.parseInt(textHousePhoQty.getText()) + "\n");
				}
				
				if (shrimpphototal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textShrimpPhoQty.getText()) + " Shrimp Pho \t\t $ " + 
					shrimppho*Integer.parseInt(textShrimpPhoQty.getText()) + "\n");
					int i = Integer.parseInt(textShrimpPhoQty.getText());
					phobrothcount = phobrothcount - i;
					shrimpcount = shrimpcount - i*15;
					outputStream.println(Integer.parseInt(textShrimpPhoQty.getText()) + " Shrimp Pho \t\t $ " + 
					shrimppho*Integer.parseInt(textShrimpPhoQty.getText()) + "\n");
				}
				
				if (chickenphototal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textChickenPhoQty.getText()) + " Chicken Pho \t\t $ " + 
					chickenpho*Integer.parseInt(textChickenPhoQty.getText()) + "\n");
					int i = Integer.parseInt(textChickenPhoQty.getText());
					phobrothcount = phobrothcount - i;
					chickenbreastcount = chickenbreastcount - i*2;
					outputStream.println(Integer.parseInt(textChickenPhoQty.getText()) + " Chicken Pho \t\t $ " + 
					chickenpho*Integer.parseInt(textChickenPhoQty.getText()) + "\n");
				}
				
				if (beefphototal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textBeefPhoQty.getText()) + " Beef Pho \t\t $ " + 
					beefpho*Integer.parseInt(textBeefPhoQty.getText()) + "\n");
					int i = Integer.parseInt(textBeefPhoQty.getText());
					phobrothcount = phobrothcount - i;
					steakcount = steakcount - i*2;
					outputStream.println(Integer.parseInt(textBeefPhoQty.getText()) + " Beef Pho \t\t $ " + 
					beefpho*Integer.parseInt(textBeefPhoQty.getText()) + "\n");
				}
				
				
				
				if (porkmixaototal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textPorkMixaoQty.getText()) + " Pork Mixao \t\t $ " + 
					porkmixao*Integer.parseInt(textPorkMixaoQty.getText()) + "\n");
					int i = Integer.parseInt(textPorkMixaoQty.getText());
					mixaoingredientscount = mixaoingredientscount - i;
					porkcount = porkcount - i*2;
					outputStream.println(Integer.parseInt(textPorkMixaoQty.getText()) + " Pork Mixao \t\t $ " + 
					porkmixao*Integer.parseInt(textPorkMixaoQty.getText()) + "\n");
				}
				
				
				if (chickenmixaototal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textChickenMixaoQty.getText()) + " Chicken Mixao \t $ " + 
					chickenmixao*Integer.parseInt(textChickenMixaoQty.getText()) + "\n");
					int i = Integer.parseInt(textChickenMixaoQty.getText());
					mixaoingredientscount = mixaoingredientscount - i;
					chickenbreastcount = chickenbreastcount - i*2;
					outputStream.println(Integer.parseInt(textChickenMixaoQty.getText()) + " Chicken Mixao \t $ " + 
					chickenmixao*Integer.parseInt(textChickenMixaoQty.getText()) + "\n");
				}
				
				
				if (tofumixaototal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textTofuMixaoQty.getText()) + " Tofu Mixao \t\t $ " + 
					tofumixao*Integer.parseInt(textTofuMixaoQty.getText()) + "\n");
					int i = Integer.parseInt(textTofuMixaoQty.getText());
					mixaoingredientscount = mixaoingredientscount - i;
					tofucount = tofucount - i*15;
					outputStream.println(Integer.parseInt(textTofuMixaoQty.getText()) + " Tofu Mixao \t\t $ " + 
					tofumixao*Integer.parseInt(textTofuMixaoQty.getText()) + "\n");
				}
				
				
				if (shrimpmixaototal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textShrimpMixaoQty.getText()) + " Shrimp Mixao \t\t $ " + 
					shrimpmixao*Integer.parseInt(textShrimpMixaoQty.getText()) + "\n");
					int i = Integer.parseInt(textShrimpMixaoQty.getText());
					mixaoingredientscount = mixaoingredientscount - i;
					shrimpcount = shrimpcount - i*15;
					outputStream.println(Integer.parseInt(textShrimpMixaoQty.getText()) + " Shrimp Mixao \t\t $ " + 
					shrimpmixao*Integer.parseInt(textShrimpMixaoQty.getText()) + "\n");
				}
				
				
				
				if (steaksaladtotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textSteakSaladQty.getText()) + " Steak Salad \t\t $ " + 
					steaksalad*Integer.parseInt(textSteakSaladQty.getText()) + "\n");
					int i = Integer.parseInt(textSteakSaladQty.getText());
					saladingredientscount = saladingredientscount - i;
					steakcount = steakcount - i*2;
					outputStream.println(Integer.parseInt(textSteakSaladQty.getText()) + " Steak Salad \t\t $ " + 
					steaksalad*Integer.parseInt(textSteakSaladQty.getText()) + "\n");
				}
				
				
				if (chickensaladtotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textChickenSaladQty.getText()) + " Chicken Salad \t $ " + 
					chickensalad*Integer.parseInt(textChickenSaladQty.getText()) + "\n");
					int i = Integer.parseInt(textChickenSaladQty.getText());
					saladingredientscount = saladingredientscount - i;
					chickenbreastcount = chickenbreastcount - i*2;
					outputStream.println(Integer.parseInt(textChickenSaladQty.getText()) + " Chicken Salad \t $ " + 
					chickensalad*Integer.parseInt(textChickenSaladQty.getText()) + "\n");
				}
				
				
				if (lemongrasstofusaladtotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textLemongrassTofuSaladQty.getText()) + " Lemongrass Tofu Salad  $ " + 
					lemongrasstofusalad*Integer.parseInt(textLemongrassTofuSaladQty.getText()) + "\n");
					int i = Integer.parseInt(textLemongrassTofuSaladQty.getText());
					saladingredientscount = saladingredientscount - i;
					tofucount = tofucount - i*15;
					outputStream.println(Integer.parseInt(textLemongrassTofuSaladQty.getText()) + " Chicken Salad \t $ " + 
					chickensalad*Integer.parseInt(textLemongrassTofuSaladQty.getText()) + "\n");
				}
				
				
				if (shrimpsaladtotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textShrimpSaladQty.getText()) + " Shrimp Salad \t\t $ " +
					shrimpsalad*Integer.parseInt(textShrimpSaladQty.getText()) + "\n");
					int i = Integer.parseInt(textShrimpSaladQty.getText());
					saladingredientscount = saladingredientscount - i;
					shrimpcount = shrimpcount - i*15;
					outputStream.println(Integer.parseInt(textShrimpSaladQty.getText()) + " Shrimp Salad \t\t $ " +
					shrimpsalad*Integer.parseInt(textShrimpSaladQty.getText()) + "\n");
				}
				
				
				
				if (watertotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textWaterQty.getText()) + " Water \t\t $ " + 
					water*Integer.parseInt(textWaterQty.getText()) + "\n");
					int i = Integer.parseInt(textWaterQty.getText());
					watercount = watercount - i;
					outputStream.println(Integer.parseInt(textWaterQty.getText()) + " Water \t\t $ " + 
					water*Integer.parseInt(textWaterQty.getText()) + "\n");
				}
				
				
				if (coketotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textCokeQty.getText()) + " Coke \t\t\t $ " + 
					coke*Integer.parseInt(textCokeQty.getText()) + "\n");
					int i = Integer.parseInt(textCokeQty.getText());
					cokecount = cokecount - i;
					outputStream.println(Integer.parseInt(textCokeQty.getText()) + " Coke \t\t\t $ " + 
					coke*Integer.parseInt(textCokeQty.getText()) + "\n");
				}
				
				
				if (teatotal > 0) {
					textReceipt.setText(textReceipt.getText() + Integer.parseInt(textTeaQty.getText()) + " Tea \t\t\t $ " + 
					tea*Integer.parseInt(textTeaQty.getText()) + "\n");
					int i = Integer.parseInt(textTeaQty.getText());
					teacount = teacount - i;
					outputStream.println(Integer.parseInt(textTeaQty.getText()) + " Tea \t\t\t $ " + 
					tea*Integer.parseInt(textTeaQty.getText()) + "\n");
				}
				
				
				
				
				/*
				 * ------------------INVENTORY CHECK------------------
				 */
				if (friedeggrollscount < 10 && friedeggrollscount > 0) {
					JOptionPane.showMessageDialog(null, "Inventory of fried egg rolls is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				else if (friedeggrollscount == 0) {
					JOptionPane.showMessageDialog(null, "EGG ROLLS NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (springrollscount < 10 && springrollscount > 0) {
					JOptionPane.showMessageDialog(null, "Inventory of spring rolls is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (springrollscount == 0) {
					JOptionPane.showMessageDialog(null, "SPRING ROLLS NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (phobrothcount < 5 && phobrothcount > 0) {
					JOptionPane.showMessageDialog(null, "Inventory of pho broth is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}	
				if (phobrothcount == 0) {
					JOptionPane.showMessageDialog(null, "PHO BROTH NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (mixaoingredientscount < 5 && mixaoingredientscount > 0) {
					JOptionPane.showMessageDialog(null, "Inventory of mixao ingredients is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (mixaoingredientscount == 0) {
					JOptionPane.showMessageDialog(null, "MIXAO INGREDIENTS NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (saladingredientscount < 5) {
					JOptionPane.showMessageDialog(null, "Inventory of salad ingredients is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (saladingredientscount == 0) {
					JOptionPane.showMessageDialog(null, "SALAD INGREDIENTS NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (chickenbreastcount < 10) {
					JOptionPane.showMessageDialog(null, "Inventory of chicken breasts is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (chickenbreastcount == 0) {
					JOptionPane.showMessageDialog(null, "CHICKEN BREAST NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (steakcount < 10) {
					JOptionPane.showMessageDialog(null, "Inventory of steak is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (steakcount == 0) {
					JOptionPane.showMessageDialog(null, "STEAK NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (tofucount < 100) {
					JOptionPane.showMessageDialog(null, "Inventory of tofu is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (tofucount == 0) {
					JOptionPane.showMessageDialog(null, "TOFU NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (shrimpcount < 100) {
					JOptionPane.showMessageDialog(null, "Inventory of shrimp is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (shrimpcount == 0) {
					JOptionPane.showMessageDialog(null, "SHRIMP NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (watercount < 5) {
					JOptionPane.showMessageDialog(null, "Inventory of water is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (watercount == 0) {
					JOptionPane.showMessageDialog(null, "WATER NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (cokecount < 5) {
					JOptionPane.showMessageDialog(null, "Inventory of coke is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}	
				if (cokecount == 0) {
					JOptionPane.showMessageDialog(null, "COKE NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
	
				
				if (teacount < 5) {
					JOptionPane.showMessageDialog(null, "Inventory of tea is running low.", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				if (teacount == 0) {
					JOptionPane.showMessageDialog(null, "TEA NO LONGER IN STOCK", "Inventory alert",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				textReceipt.setText(textReceipt.getText() + "\n");
				outputStream.println("\n");
				
				textReceipt.setText(textReceipt.getText() + "Subtotal:   \t\t" + S + "\n");
				outputStream.println("Subtotal:   \t\t" + S + "\n");
				textReceipt.setText(textReceipt.getText() + "Tax:        \t\t" + T + "\n");
				outputStream.println("Tax:        \t\t" + T + "\n");
				textReceipt.setText(textReceipt.getText() + "Total:      \t\t" + FinalTotal);
				outputStream.println("Total:      \t\t" + FinalTotal);
				
				outputStream.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPlaceOrder.setBounds(165, 11, 97, 17);
		panel_3.add(btnPlaceOrder);
		
		
		
		
		/*
		 * ------------------CALCULATOR PANEL------------------
		 */
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(354, 273, 240, 403);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 6, true));
		panel_1.setBounds(0, 0, 236, 327);
		panel.add(panel_1);
		
		txtDisplay = new JTextField();
		txtDisplay.setColumns(10);
		txtDisplay.setBackground(new Color(240, 248, 255));
		txtDisplay.setBounds(27, 11, 188, 28);
		panel_1.add(txtDisplay);
		
		
		// ---------------CALCULATOR ROW 1-----------------
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_0.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_0.setBounds(10, 271, 45, 45);
		panel_1.add(button_0);
		
		JButton button_decimal = new JButton(".");
		button_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (! txtDisplay.getText().contains("."))
				{
					txtDisplay.setText(txtDisplay.getText() + button_decimal.getText());
				}
				
			}
		});
		button_decimal.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_decimal.setBounds(65, 271, 45, 45);
		panel_1.add(button_decimal);
		
		JButton button_plusorminus = new JButton("\u00B1");
		button_plusorminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
			ops = ops * (-1);
			txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		button_plusorminus.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_plusorminus.setBounds(120, 271, 45, 45);
		panel_1.add(button_plusorminus);
		
		JButton button_equals = new JButton("=");
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		button_equals.setFont(new Font("Trajan Pro", Font.BOLD, 16));
		button_equals.setBounds(175, 271, 45, 45);
		panel_1.add(button_equals);
		
		// ---------------CALCULATOR ROW 2-----------------
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_1.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_1.setBounds(10, 215, 45, 45);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_2.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_2.setBounds(65, 215, 45, 45);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_3.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_3.setBounds(120, 215, 45, 45);
		panel_1.add(button_3);
		
		JButton button_divide = new JButton("/");
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
				
			}
		});
		button_divide.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_divide.setBounds(175, 215, 45, 45);
		panel_1.add(button_divide);
		
		// ---------------CALCULATOR ROW 4-----------------
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_4.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_4.setBounds(10, 159, 45, 45);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_5.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_5.setBounds(65, 159, 45, 45);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_6.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_6.setBounds(120, 159, 45, 45);
		panel_1.add(button_6);
		
		JButton button_multiply = new JButton("*");
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
				
			}
		});
		button_multiply.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_multiply.setBounds(175, 159, 45, 45);
		panel_1.add(button_multiply);
		
		
		// ---------------CALCULATOR ROW 5-----------------
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_7.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_7.setBounds(10, 103, 45, 45);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_8.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_8.setBounds(65, 103, 45, 45);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_9.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_9.setBounds(120, 103, 45, 45);
		panel_1.add(button_9);
		
		JButton button_subtract = new JButton("-");
		button_subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
				
			}
		});
		button_subtract.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_subtract.setBounds(175, 103, 45, 45);
		panel_1.add(button_subtract);
		
		
		// ---------------CALCULATOR ROW 5-----------------
		JButton button_backspace = new JButton("\u00AB");
		button_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace=null;
				
				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
			}

		});
		button_backspace.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_backspace.setBounds(10, 47, 45, 45);
		panel_1.add(button_backspace);
		
		JButton button_clear = new JButton("C");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtDisplay.setText(null);
			}
		});
		button_clear.setFont(new Font("Trajan Pro", Font.BOLD, 13));
		button_clear.setBounds(65, 48, 45, 45);
		panel_1.add(button_clear);
		
		JButton button_remainder = new JButton("%");
		button_remainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
				
			}
		});
		button_remainder.setFont(new Font("Trajan Pro", Font.BOLD, 12));
		button_remainder.setBounds(120, 48, 45, 45);
		panel_1.add(button_remainder);
		
		JButton button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		button_add.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_add.setBounds(175, 47, 45, 45);
		panel_1.add(button_add);
		
		
		
		
		/*
		 * ----------------TOTAL PANEL-----------------
		 */
		JPanel panel_total = new JPanel();
		panel_total.setLayout(null);
		panel_total.setBorder(new LineBorder(new Color(128, 0, 0), 6, true));
		panel_total.setBounds(596, 453, 278, 100);
		frame.getContentPane().add(panel_total);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblTax.setBounds(10, 22, 33, 14);
		panel_total.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblSubtotal.setBounds(116, 22, 67, 14);
		panel_total.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblTotal.setBounds(56, 56, 67, 22);
		panel_total.add(lblTotal);
		
		textTax = new JTextField();
		textTax.setHorizontalAlignment(SwingConstants.LEFT);
		textTax.setBounds(46, 19, 60, 24);
		panel_total.add(textTax);
		textTax.setColumns(10);
		
		textSubtotal = new JTextField();
		textSubtotal.setHorizontalAlignment(SwingConstants.LEFT);
		textSubtotal.setColumns(10);
		textSubtotal.setBounds(193, 19, 67, 24);
		panel_total.add(textSubtotal);
		
		textTotal = new JTextField();
		textTotal.setHorizontalAlignment(SwingConstants.LEFT);
		textTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		textTotal.setColumns(10);
		textTotal.setBounds(116, 56, 80, 22);
		panel_total.add(textTotal);

		
	}
}
		
	