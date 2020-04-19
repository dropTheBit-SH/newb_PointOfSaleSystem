package myProject.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LoginView extends MyFrame {
	
	public JTextField textField;
	public JPasswordField passwordField;
	public JButton btnExit;
	public JButton btnLogin;
	public JCheckBox chckbxID;
	public JCheckBox chckbxPW;
	
	public LoginView() {
		JPanel panelCenter = new JPanel();
		panelCenter.setBounds(dim.width/2 - 450, dim.height/2 -300, 900, 400);
		content.add(panelCenter);
		panelCenter.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel panelC_1 = new JPanel();
		panelCenter.add(panelC_1);
		panelC_1.setLayout(new BorderLayout(0, 0));
		JLabel lblTitle = new JLabel("POS System");
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 45));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panelC_1.add(lblTitle);
		
		JPanel panelC_2 = new JPanel();
		panelCenter.add(panelC_2);
		panelC_2.setLayout(null);
		JLabel lblID = new JLabel("I      D");
		lblID.setFont(new Font("Dialog", Font.BOLD, 22));
		lblID.setBounds(116, 30, 80, 15);
		panelC_2.add(lblID);
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 20));
		textField.setBounds(260, 15, 600, 48);
		panelC_2.add(textField);
		textField.setColumns(10);
		
		JPanel panelC_3 = new JPanel();
		panelCenter.add(panelC_3);
		panelC_3.setLayout(null);
		JLabel lblPW = new JLabel("P     W");
		lblPW.setFont(new Font("Dialog", Font.BOLD, 22));
		lblPW.setBounds(116, 30, 80, 15);
		panelC_3.add(lblPW);
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Dialog", Font.BOLD, 20));
		passwordField.setBounds(260, 15, 600, 48);
		panelC_3.add(passwordField);
		
		JPanel panelC_4 = new JPanel();
		panelCenter.add(panelC_4);
		panelC_4.setLayout(new GridLayout(1, 2, 0, 0));
		chckbxID = new JCheckBox("Remember_ID");
		chckbxID.setVerticalAlignment(SwingConstants.TOP);
		chckbxID.setFont(new Font("Dialog", Font.BOLD, 15));
		chckbxID.setHorizontalAlignment(SwingConstants.TRAILING);
		panelC_4.add(chckbxID);
		chckbxPW = new JCheckBox("Remember_PW");
		chckbxPW.setVerticalAlignment(SwingConstants.TOP);
		chckbxPW.setFont(new Font("Dialog", Font.BOLD, 15));
		panelC_4.add(chckbxPW);
		
		JPanel panelC_5 = new JPanel();
		panelCenter.add(panelC_5);
		panelC_5.setLayout(new GridLayout(1, 2, 0, 0));
		btnExit = new JButton("EXIT");
		
		btnExit.setFont(new Font("Dialog", Font.BOLD, 30));
		panelC_5.add(btnExit);
		btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 30));
		panelC_5.add(btnLogin);
		
		btnExit.setBackground(mycolor6);
		btnLogin.setBackground(mycolor6);
		lblTitle.setForeground(mycolor6);
		lblID.setForeground(mycolor1);
		lblPW.setForeground(mycolor1);
		chckbxID.setForeground(mycolor1);
		chckbxPW.setForeground(mycolor1);
		btnExit.setForeground(mycolor1);
		btnLogin.setForeground(mycolor1);
		content.setBackground(mycolor1);
		panelCenter.setBackground(mycolor2);
		panelC_1.setBackground(null);
		panelC_2.setBackground(null);
		panelC_3.setBackground(null);
		panelC_4.setBackground(null);
		chckbxID.setBackground(null);
		chckbxPW.setBackground(null);
		
		setVisible(true);
	}
}
