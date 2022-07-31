package com.cears.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSlider;

public class HomePage extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		getContentPane().setBackground(new Color(0, 206, 209));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		panel.setBounds(10, 11, 630, 60);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Vaccination Drive");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(47, -12, 498, 72);
		panel.add(lblNewLabel);
		
		JButton login = new JButton("Sign Up");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginIn l1=new LoginIn();
				l1.setVisible(true);
				setVisible(false);
			}
		});
		login.setHorizontalTextPosition(SwingConstants.CENTER);
		login.setBackground(new Color(0, 255, 0));
		login.setBorderPainted(false);
		login.setFont(new Font("Tahoma", Font.BOLD, 20));
		login.setBounds(241, 154, 131, 23);
		getContentPane().add(login);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signup s1=new Signup();
				s1.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(241, 233, 142, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\0.46492900_1621257274_covid-19-vaccine-india.jpg"));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(0, 0, 699, 632);
		getContentPane().add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setBounds(450, 299, 200, 26);
		getContentPane().add(slider);
	}
}
