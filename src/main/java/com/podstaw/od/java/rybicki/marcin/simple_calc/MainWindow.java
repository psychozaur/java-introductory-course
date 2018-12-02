package com.podstaw.od.java.rybicki.marcin.simple_calc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

	public MainWindow() {

	    JPanel masterPanel = new JPanel();
	    BoxLayout masterLayout = new BoxLayout(masterPanel,BoxLayout.PAGE_AXIS);
	    masterPanel.setLayout(masterLayout);
	    masterPanel.setBorder(new EmptyBorder(new Insets(50,50,50,50)));

		JLabel labelResult = new JLabel("Result:");
		labelResult.setAlignmentX(Component.CENTER_ALIGNMENT);

		JLabel numberOutput = new JLabel("0");
		numberOutput.setAlignmentX(Component.CENTER_ALIGNMENT);

		JTextField numberInput1 = new JTextField("0");
		numberInput1.setMaximumSize( new Dimension(Integer.MAX_VALUE, numberInput1.getPreferredSize().height));

		JTextField numberInput2 = new JTextField("0");
		numberInput2.setMaximumSize( new Dimension(Integer.MAX_VALUE, numberInput2.getPreferredSize().height));


		JPanel panel = new JPanel();
		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);

		JButton button1 = new JButton("+");
		JButton button2 = new JButton("-");
		JButton button3 = new JButton("x");
		JButton button4 = new JButton("/");

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);

		JButton displayButton = new JButton("Display");
		displayButton.setAlignmentX(Component.CENTER_ALIGNMENT);

		JButton quitButton = new JButton("Quit");
		quitButton.setAlignmentX(Component.CENTER_ALIGNMENT);


		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String output = "";
				numberOutput.setText(numberInput1.getText());
			}
		});

		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		masterPanel.add(labelResult);
		masterPanel.add(numberOutput);
		masterPanel.add(numberInput1);
		masterPanel.add(numberInput2);
		masterPanel.add(panel);
		masterPanel.add(displayButton);
		masterPanel.add(quitButton);

		add(masterPanel);
		pack();

		setTitle("Simple calculator");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MainWindow calculator = new MainWindow();
	}
	
	

}
