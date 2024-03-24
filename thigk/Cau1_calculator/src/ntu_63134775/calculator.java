package ntu_63134775;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	
	private JFrame frame;
	private JTextField txt;
	private JButton btn_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "7");
			}
		});
		btn_7.setBounds(31, 98, 63, 32);
		frame.getContentPane().add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "4");
			}
		});
		btn_4.setBounds(31, 139, 63, 32);
		frame.getContentPane().add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "1");
			}
		});
		btn_1.setBounds(31, 175, 63, 32);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "2");
			}
		});
		btn_2.setBounds(104, 175, 63, 32);
		frame.getContentPane().add(btn_2);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "5");
			}
		});
		btn_5.setBounds(104, 139, 63, 32);
		frame.getContentPane().add(btn_5);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "8");
			}
		});
		btn_8.setBounds(104, 98, 63, 32);
		frame.getContentPane().add(btn_8);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "0");
			}
		});
		btn_0.setBounds(31, 218, 63, 32);
		frame.getContentPane().add(btn_0);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "9");
			}
		});
		btn_9.setBounds(177, 98, 63, 32);
		frame.getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "6");
			}
		});
		btn_6.setBounds(177, 139, 63, 32);
		frame.getContentPane().add(btn_6);
		
		btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "3");
			}
		});
		btn_3.setBounds(177, 175, 63, 32);
		frame.getContentPane().add(btn_3);
		
		JButton btn_cham = new JButton(".");
		btn_cham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + ".");
			}
		});
		btn_cham.setBounds(104, 218, 63, 32);
		frame.getContentPane().add(btn_cham);
		
		JButton btn_chia = new JButton("/");
		btn_chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "/");
			}
		});
		btn_chia.setBounds(324, 98, 63, 32);
		frame.getContentPane().add(btn_chia);
		
		JButton btn_nhan = new JButton("*");
		btn_nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "*");
			}
		});
		btn_nhan.setBounds(250, 98, 63, 32);
		frame.getContentPane().add(btn_nhan);
		
		JButton btn_tru = new JButton("-");
		btn_tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "-");
			}
		});
		btn_tru.setBounds(250, 139, 63, 32);
		frame.getContentPane().add(btn_tru);
		
		JButton btn_cong = new JButton("+");
		btn_cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "+");
			}
		});
		btn_cong.setBounds(250, 175, 63, 32);
		frame.getContentPane().add(btn_cong);
		
		JButton btn_bang = new JButton("=");
		btn_bang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuly();
			}
		});
		btn_bang.setBounds(250, 218, 63, 32);
		frame.getContentPane().add(btn_bang);
		
		txt = new JTextField();
		txt.setBounds(31, 36, 314, 45);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		JButton btn_mu = new JButton("^");
		btn_mu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText() + "^");
			}
		});
		btn_mu.setBounds(324, 139, 63, 32);
		frame.getContentPane().add(btn_mu);
		
		JButton btn_del = new JButton("Del");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoa();
			}
		});
		btn_del.setBounds(177, 218, 63, 32);
		frame.getContentPane().add(btn_del);
		
		JButton btn_xoa = new JButton("C");
		btn_xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoatatca();
			}
		});
		btn_xoa.setBounds(355, 42, 63, 32);
		frame.getContentPane().add(btn_xoa);
	}
	void xuly() {
	    String expression = txt.getText();
	    double result = 0;

	    char operator = findOperator(expression);
	    if (operator != ' ') {
	        String[] operands = expression.split("\\" + operator);
	        double operand1 = Double.parseDouble(operands[0]);
	        double operand2 = Double.parseDouble(operands[1]);

	        switch (operator) {
	            case '+':
	                result = operand1 + operand2;
	                break;
	            case '-':
	                result = operand1 - operand2;
	                break;
	            case '*':
	                result = operand1 * operand2;
	                break;
	            case '/':
	                result = operand1 / operand2;
	                break;
	            case '^':
	                result = Math.pow(operand1, operand2);
	                break;
	            
	        }
	    } else {
	    	try {
	            result = Double.parseDouble(expression);
	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	        }
	    }

	    txt.setText(Double.toString(result));
	}

	private char findOperator(String expression) {
	    if (expression.contains("+")) {
	        return '+';
	    } else if (expression.contains("-")) {
	        return '-';
	    } else if (expression.contains("*")) {
	        return '*';
	    } else if (expression.contains("/")) {
	        return '/';
	    } else if (expression.contains("^")) {
	        return '^';
	    } else {
	        return ' ';
	    }
	}
	void xoa() {
		String text = txt.getText();
	    if (!text.isEmpty()) {
	        text = text.substring(0, text.length() - 1);
	        txt.setText(text);
	    }
	}
	void xoatatca() {
		 txt.setText("");
	}
}