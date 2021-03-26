package calculatorinjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JButton;

public class Buttons implements ActionListener {
	
	int nextOperation;
	double nextOperated;
	double repeatOperator;

	// 1st Line
	public static JButton moduloOperator = new JButton();
	public static JButton ce = new JButton();
	public static JButton c = new JButton();
	public static JButton backSpace = new JButton();

	// 2nd Line
	public static JButton inverse = new JButton();
	public static JButton square = new JButton();
	public static JButton rootSquare = new JButton();
	public static JButton divide = new JButton();

	// 3rd Line
	public static JButton seven = new JButton();
	public static JButton eight = new JButton();
	public static JButton nine = new JButton();
	public static JButton multiply = new JButton();

	// 4th Line
	public static JButton four = new JButton();
	public static JButton five = new JButton();
	public static JButton six = new JButton();
	public static JButton subtract = new JButton();

	// 5th Line
	public static JButton one = new JButton();
	public static JButton two = new JButton();
	public static JButton three = new JButton();
	public static JButton add = new JButton();

	// 6th Line
	public static JButton plusMinus = new JButton();
	public static JButton zero = new JButton();
	public static JButton dot = new JButton();
	public static JButton equal = new JButton();

	public Buttons() {
		// 1ST LINE
		moduloOperator = new JButton();
		moduloOperator.addActionListener(this);
		moduloOperator.setFont(new Font("Impact", Font.BOLD, 16));
		moduloOperator.setText("J F Z M");
		moduloOperator.setForeground(Color.black);
		moduloOperator.setBackground(Color.yellow);
		moduloOperator.setFocusable(false);
		moduloOperator.setVisible(true);
		ce = new JButton();
		ce.addActionListener(this);
		ce.setFont(new Font("Impact", Font.BOLD, 20));
		ce.setText("CE");
		ce.setForeground(Color.white);
		ce.setBackground(Color.black);
		ce.setFocusable(false);
		ce.setVisible(true);
		c = new JButton();
		c.addActionListener(this);
		c.setFont(new Font("Impact", Font.BOLD, 20));
		c.setText("C");
		c.setForeground(Color.white);
		c.setBackground(Color.black);
		c.setFocusable(false);
		c.setVisible(true);
		backSpace = new JButton();
		backSpace.addActionListener(this);
		backSpace.setFont(new Font("Impact", Font.BOLD, 10));
		backSpace.setText("\u232b");
		backSpace.setForeground(Color.white);
		backSpace.setBackground(Color.black);
		backSpace.setFocusable(false);
		backSpace.setVisible(true);
		
		// 2ND LINE
		inverse = new JButton();
		inverse.addActionListener(this);
		inverse.setFont(new Font("Impact", Font.BOLD, 20));
		inverse.setText("1 / X");
		inverse.setForeground(Color.white);
		inverse.setBackground(Color.black);
		inverse.setFocusable(false);
		inverse.setVisible(true);
		square = new JButton();
		square.addActionListener(this);
		square.setFont(new Font("Impact", Font.BOLD, 20));
		square.setText("x²");
		square.setForeground(Color.white);
		square.setBackground(Color.black);
		square.setFocusable(false);
		square.setVisible(true);
		rootSquare = new JButton();
		rootSquare.addActionListener(this);
		rootSquare.setFont(new Font("Impact", Font.BOLD, 20));
		rootSquare.setText("\u221A²");
		rootSquare.setForeground(Color.white);
		rootSquare.setBackground(Color.black);
		rootSquare.setFocusable(false);
		rootSquare.setVisible(true);
		divide = new JButton();
		divide.addActionListener(this);
		divide.setFont(new Font("Impact", Font.BOLD, 20));
		divide.setText("/");
		divide.setForeground(Color.white);
		divide.setBackground(Color.black);
		divide.setFocusable(false);
		divide.setVisible(true);

		// 3RD LINE
		seven = new JButton();
		seven.addActionListener(this);
		seven.setFont(new Font("Impact", Font.BOLD, 20));
		seven.setText("7");
		seven.setForeground(Color.white);
		seven.setBackground(Color.black);
		seven.setFocusable(false);
		seven.setVisible(true);
		eight = new JButton();
		eight.addActionListener(this);
		eight.setFont(new Font("Impact", Font.BOLD, 20));
		eight.setText("8");
		eight.setForeground(Color.white);
		eight.setBackground(Color.black);
		eight.setFocusable(false);
		eight.setVisible(true);
		nine = new JButton();
		nine.addActionListener(this);
		nine.setFont(new Font("Impact", Font.BOLD, 20));
		nine.setText("9");
		nine.setForeground(Color.white);
		nine.setBackground(Color.black);
		nine.setFocusable(false);
		nine.setVisible(true);
		multiply = new JButton();
		multiply.addActionListener(this);
		multiply.setFont(new Font("Impact", Font.BOLD, 20));
		multiply.setText("x");
		multiply.setForeground(Color.white);
		multiply.setBackground(Color.black);
		multiply.setFocusable(false);
		multiply.setVisible(true);

		// 4TH LINE
		four = new JButton();
		four.addActionListener(this);
		four.setFont(new Font("Impact", Font.BOLD, 20));
		four.setText("4");
		four.setForeground(Color.white);
		four.setBackground(Color.black);
		four.setFocusable(false);
		four.setVisible(true);
		five = new JButton();
		five.addActionListener(this);
		five.setFont(new Font("Impact", Font.BOLD, 20));
		five.setText("5");
		five.setForeground(Color.white);
		five.setBackground(Color.black);
		five.setFocusable(false);
		five.setVisible(true);
		six = new JButton();
		six.addActionListener(this);
		six.setFont(new Font("Impact", Font.BOLD, 20));
		six.setText("6");
		six.setForeground(Color.white);
		six.setBackground(Color.black);
		six.setFocusable(false);
		six.setVisible(true);
		subtract = new JButton();
		subtract.addActionListener(this);
		subtract.setFont(new Font("Impact", Font.BOLD, 20));
		subtract.setText("-");
		subtract.setForeground(Color.white);
		subtract.setBackground(Color.black);
		subtract.setFocusable(false);
		subtract.setVisible(true);

		// 5TH LINE
		one = new JButton();
		one.addActionListener(this);
		one.setFont(new Font("Impact", Font.BOLD, 20));
		one.setText("1");
		one.setForeground(Color.white);
		one.setBackground(Color.black);
		one.setFocusable(false);
		one.setVisible(true);
		two = new JButton();
		two.addActionListener(this);
		two.setFont(new Font("Impact", Font.BOLD, 20));
		two.setText("2");
		two.setForeground(Color.white);
		two.setBackground(Color.black);
		two.setFocusable(false);
		two.setVisible(true);
		three = new JButton();
		three.addActionListener(this);
		three.setFont(new Font("Impact", Font.BOLD, 20));
		three.setText("3");
		three.setForeground(Color.white);
		three.setBackground(Color.black);
		three.setFocusable(false);
		three.setVisible(true);
		add = new JButton();
		add.addActionListener(this);
		add.setFont(new Font("Impact", Font.BOLD, 20));
		add.setText("+");
		add.setForeground(Color.white);
		add.setBackground(Color.black);
		add.setFocusable(false);
		add.setVisible(true);

		// 6TH LINE
		plusMinus = new JButton();
		plusMinus.addActionListener(this);
		plusMinus.setFont(new Font("Impact", Font.BOLD, 20));
		plusMinus.setText("+/-");
		plusMinus.setForeground(Color.white);
		plusMinus.setBackground(Color.black);
		plusMinus.setFocusable(false);
		plusMinus.setVisible(true);
		zero = new JButton();
		zero.addActionListener(this);
		zero.setFont(new Font("Impact", Font.BOLD, 20));
		zero.setText("0");
		zero.setForeground(Color.white);
		zero.setBackground(Color.black);
		zero.setFocusable(false);
		zero.setVisible(true);
		dot = new JButton();
		dot.addActionListener(this);
		dot.setFont(new Font("Impact", Font.BOLD, 20));
		dot.setText(".");
		dot.setForeground(Color.white);
		dot.setBackground(Color.black);
		dot.setFocusable(false);
		dot.setVisible(true);
		equal = new JButton();
		equal.addActionListener(this);
		equal.setFont(new Font("Impact", Font.BOLD, 20));
		equal.setText("=");
		equal.setForeground(Color.black);
		equal.setBackground(Color.yellow);
		equal.setFocusable(false);
		equal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Decimal Format
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("en", "Us"));
		dfs.setDecimalSeparator('.');
		dfs.setGroupingSeparator(',');
		String defaultFormat = "#.##########";
		DecimalFormat df = new DecimalFormat(defaultFormat, dfs);

		if (e.getSource() == moduloOperator) {

		}

		// Numbers
		if (e.getSource() == one) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "1");

		}

		if (e.getSource() == two) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "2");
		}

		if (e.getSource() == three) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "3");
		}

		if (e.getSource() == four) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "4");
		}

		if (e.getSource() == five) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "5");
		}

		if (e.getSource() == six) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "6");
		}

		if (e.getSource() == seven) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "7");
		}

		if (e.getSource() == eight) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "8");
		}

		if (e.getSource() == nine) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "9");
		}

		if (e.getSource() == zero) {
			if (Gui.visor2.getText().equals("0")) {
				Gui.visor2.setText("");
			}
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + "0");
		}

		if (e.getSource() == dot) {
			String visorString = Gui.visor2.getText();
			Gui.visor2.setText(visorString + ".");
		}

		if (e.getSource() == plusMinus) {
			String visorString = Gui.visor2.getText();
			if (Double.parseDouble(visorString) > 0) {
				Gui.visor2.setText("-" + visorString);
			} else if (Double.parseDouble(visorString) < 0) {
				double positiveVersion = Double.parseDouble(visorString) * -1;
				Gui.visor2.setText(df.format(positiveVersion));
			}
		}
		// Numbers

		// instant operations
		if (e.getSource() == rootSquare) {
			String visorString = Gui.visor2.getText();
			Gui.visor.setText("\u221A² of " + visorString + " =");
			double visorDouble = Double.parseDouble(visorString);
			visorDouble = Math.sqrt(visorDouble);
			Gui.visor2.setText(df.format(visorDouble));
		}

		if (e.getSource() == square) {
			String visorString = Gui.visor2.getText();
			Gui.visor.setText(visorString + "^2 =");
			double visorDouble = Double.parseDouble(visorString);
			visorDouble = (visorDouble * visorDouble);
			Gui.visor2.setText(df.format(visorDouble));
		}

		if (e.getSource() == inverse) {
			String visorString = Gui.visor2.getText();
			Gui.visor.setText("1/(" + visorString + ") =");
			double visorDouble = Double.parseDouble(visorString);
			visorDouble = (1 / visorDouble);
			Gui.visor2.setText(df.format(visorDouble));
		}
		// instant operations

		// C, CE and Backspace
		if (e.getSource() == ce) {
			Gui.visor.setText("");
			Gui.visor2.setText("0");
		}

		if (e.getSource() == c) {
			Gui.visor2.setText("0");
		}

		if (e.getSource() == backSpace) {
			String visor2String = Gui.visor2.getText();
			String newstr = visor2String.substring(0, (visor2String.length() - 1)) + visor2String.substring((visor2String.length() - 1) + 1);
			Gui.visor2.setText(newstr);
			if (newstr.equals("")) {
				Gui.visor2.setText("0");
			}
		}
		// C, CE and Backspace

		// basic operators
		if (e.getSource() == divide) {
			String visorString = Gui.visor2.getText();
			nextOperated = Double.parseDouble(visorString);
			nextOperation = 1;
			Gui.visor.setText(visorString + " /");
			Gui.visor2.setText("0");
		}

		if (e.getSource() == multiply) {
			String visorString = Gui.visor2.getText();
			nextOperated = Double.parseDouble(visorString);
			nextOperation = 2;
			Gui.visor.setText(visorString + " x");
			Gui.visor2.setText("0");
		}

		if (e.getSource() == add) {
			String visorString = Gui.visor2.getText();
			nextOperated = Double.parseDouble(visorString);
			nextOperation = 3;
			Gui.visor.setText(visorString + " +");
			Gui.visor2.setText("0");
		}

		if (e.getSource() == subtract) {
			String visorString = Gui.visor2.getText();
			nextOperated = Double.parseDouble(visorString);
			nextOperation = 4;
			Gui.visor.setText(visorString + " -");
			Gui.visor2.setText("0");
		}

		if (e.getSource() == equal) {
			String visor2String = Gui.visor2.getText();
			Double visor2Double = Double.parseDouble(visor2String);

			if (nextOperation == 1) {
				String newVisorString = Gui.visor.getText() + " " + visor2String + " =";
				Gui.visor.setText(newVisorString);
				Double result = nextOperated / visor2Double;
				Gui.visor2.setText(df.format(result));
				repeatOperator = visor2Double;
				nextOperation = 5;
			} else if (nextOperation == 5) {
				String visorString = Gui.visor2.getText();
				nextOperated = Double.parseDouble(visorString);
				Gui.visor.setText(visorString + " /" + df.format(repeatOperator) + "=");
				Double result = visor2Double / repeatOperator;
				Gui.visor2.setText(df.format(result));
			}

			if (nextOperation == 2) {
				String newVisorString = Gui.visor.getText() + " " + visor2String + " =";
				Gui.visor.setText(newVisorString);
				Double result = nextOperated * visor2Double;
				Gui.visor2.setText(df.format(result));
				repeatOperator = visor2Double;
				nextOperation = 6;
			} else if (nextOperation == 6) {
				String visorString = Gui.visor2.getText();
				nextOperated = Double.parseDouble(visorString);
				Gui.visor.setText(visorString + " x" + df.format(repeatOperator) + "=");
				Double result = visor2Double * repeatOperator;
				Gui.visor2.setText(df.format(result));
			}

			if (nextOperation == 3) {
				String newVisorString = Gui.visor.getText() + " " + visor2String + " =";
				Gui.visor.setText(newVisorString);
				Double result = nextOperated + visor2Double;
				Gui.visor2.setText(df.format(result));
				repeatOperator = visor2Double;
				nextOperation = 7;
			} else if (nextOperation == 7) {
				String visorString = Gui.visor2.getText();
				nextOperated = Double.parseDouble(visorString);
				Gui.visor.setText(visorString + " +" + df.format(repeatOperator) + "=");
				Double result = visor2Double + repeatOperator;
				Gui.visor2.setText(df.format(result));
			}

			if (nextOperation == 4) {
				String newVisorString = Gui.visor.getText() + " " + visor2String + " =";
				Gui.visor.setText(newVisorString);
				Double result = nextOperated - visor2Double;
				Gui.visor2.setText(df.format(result));
				repeatOperator = visor2Double;
				nextOperation = 8;
			} else if (nextOperation == 8) {
				String visorString = Gui.visor2.getText();
				nextOperated = Double.parseDouble(visorString);
				Gui.visor.setText(visorString + " -" + df.format(repeatOperator) + "=");
				Double result = visor2Double - repeatOperator;
				Gui.visor2.setText(df.format(result));
			}

		}

	}

}
