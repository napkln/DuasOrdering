import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	
	String operations;
	String answer;
	double firstnum;
	double secondnum;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 6, true));
		panel.setBounds(0, 0, 229, 334);
		contentPane.add(panel);
		
		txtDisplay = new JTextField();
		txtDisplay.setBackground(new Color(240, 248, 255));
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(20, 11, 188, 28);
		panel.add(txtDisplay);
		
		
		// ---------------ROW 1-----------------
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_0.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_0.setBounds(10, 271, 45, 45);
		panel.add(button_0);
		
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
		panel.add(button_decimal);
		
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
		panel.add(button_plusorminus);
		
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
		panel.add(button_equals);
		
		
		// ---------------ROW 2-----------------
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_1.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_1.setBounds(10, 215, 45, 45);
		panel.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_2.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_2.setBounds(65, 215, 45, 45);
		panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_3.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_3.setBounds(120, 215, 45, 45);
		panel.add(button_3);
		
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
		panel.add(button_divide);
		
		// ---------------ROW 3-----------------
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_4.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_4.setBounds(10, 159, 45, 45);
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_5.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_5.setBounds(65, 159, 45, 45);
		panel.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_6.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_6.setBounds(120, 159, 45, 45);
		panel.add(button_6);
		
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
		panel.add(button_multiply);
		
		// ---------------ROW 4-----------------
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_7.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_7.setBounds(10, 103, 45, 45);
		panel.add(button_7);
		
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_8.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_8.setBounds(65, 103, 45, 45);
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtDisplay.getText() + button_9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_9.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_9.setBounds(120, 103, 45, 45);
		panel.add(button_9);
		
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
		panel.add(button_subtract);
		
		// ---------------ROW 5-----------------
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

			private StringBuilder newStringBuilder(String text) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		button_backspace.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		button_backspace.setBounds(10, 47, 45, 45);
		panel.add(button_backspace);
		
		
		JButton button_clear = new JButton("C");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtDisplay.setText(null);
			}
		});
		button_clear.setFont(new Font("Trajan Pro", Font.BOLD, 13));
		button_clear.setBounds(65, 48, 45, 45);
		panel.add(button_clear);
		
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
		panel.add(button_remainder);
		
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
		panel.add(button_add);
	}

}
