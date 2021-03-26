package calculatorinjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame {

	static JTextField visor;
	static JTextField visor2;

	public Gui() {

		this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource(""))));
		this.setBackground(Color.blue);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
	
		// ImageIcon icon = new ImageIcon(Gui.class.getResource("icon.png"));
		//this.setIconImage(icon.getImage());
		this.setTitle("Calculator");
		this.setResizable(false);
		this.setSize(335, 540);
		//this.getRootPane().setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.blue));
		this.setMinimumSize(new Dimension(335, 540));


		visor = new JTextField();
		visor.setBackground(Color.black);
		visor.setForeground(Color.white);
		visor.setFont(new Font("Impact", Font.BOLD, 21));
		visor.setFocusable(false);
		visor.setColumns(19);
		JPanel visorPanel = new JPanel();
		visorPanel.setPreferredSize(new Dimension(335, 35));
		visorPanel.add(visor);
		this.add(visorPanel, BorderLayout.NORTH);

		visor2 = new JTextField();
		visor2.setBackground(Color.black);
		visor2.setForeground(Color.white);
		visor2.setFont(new Font("Impact", Font.BOLD, 30));
		visor2.setColumns(13);
		visor2.setText("0");
		JPanel visor2Panel = new JPanel();
		visor2Panel.add(visor2);
		this.add(visor2Panel, BorderLayout.CENTER);

		Buttons buttons = new Buttons();
		JPanel buttonsPanel = new JPanel();
			buttonsPanel.setLayout(new GridLayout(6, 4));
			buttonsPanel.setPreferredSize(new Dimension(335, 415));
			buttonsPanel.add(buttons.moduloOperator);
			buttonsPanel.add(buttons.ce);
			buttonsPanel.add(buttons.c);
			buttonsPanel.add(buttons.backSpace);
	
			buttonsPanel.add(buttons.inverse);
			buttonsPanel.add(buttons.square);
			buttonsPanel.add(buttons.rootSquare);
			buttonsPanel.add(buttons.divide);
	
			buttonsPanel.add(buttons.seven);
			buttonsPanel.add(buttons.eight);
			buttonsPanel.add(buttons.nine);
			buttonsPanel.add(buttons.multiply);
	
			buttonsPanel.add(buttons.four);
			buttonsPanel.add(buttons.five);
			buttonsPanel.add(buttons.six);
			buttonsPanel.add(buttons.subtract);
	
			buttonsPanel.add(buttons.one);
			buttonsPanel.add(buttons.two);
			buttonsPanel.add(buttons.three);
			buttonsPanel.add(buttons.add);
	
			buttonsPanel.add(buttons.plusMinus);
			buttonsPanel.add(buttons.zero);
			buttonsPanel.add(buttons.dot);
			buttonsPanel.add(buttons.equal);

			this.add(buttonsPanel, BorderLayout.SOUTH);

		this.pack();
		this.setVisible(true);
	}

}
