package myProject.view;

import java.awt.GridLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class View extends MyFrame {
	private static final long serialVersionUID = 1209268136746433472L;
	public JButton btnMenu_Main;
	public JButton btnMenu_Members;
	public JButton btnMenu_Coupon;
	public JButton btnMenu_Sales;
	public JButton btnMenu_Admin;
	public JButton btnMenu_Logout;
	public JButton btnMenu_Exit;

	public View() {
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 1920, 119);
		content.add(panelMenu);
		panelMenu.setLayout(new GridLayout(1, 8, 0, 0));
		JPanel panMenu_1 = new JPanel();
		panelMenu.add(panMenu_1);
		panMenu_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("SUHEE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.ITALIC, 20));
		lblNewLabel.setBackground(mycolor1);
		lblNewLabel.setForeground(mycolor6);
		panMenu_1.add(lblNewLabel);
		JPanel panMenu_2 = new JPanel();
		panelMenu.add(panMenu_2);
		panMenu_2.setLayout(new BorderLayout(0, 0));

		btnMenu_Main = new JButton("MAIN");
		btnMenu_Main.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panMenu_2.add(btnMenu_Main, BorderLayout.CENTER);
		JPanel panMenu_3 = new JPanel();
		panelMenu.add(panMenu_3);
		panMenu_3.setLayout(new BorderLayout(0, 0));

		btnMenu_Members = new JButton("MEMBERS");
		btnMenu_Members.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panMenu_3.add(btnMenu_Members, BorderLayout.CENTER);
		JPanel panMenu_4 = new JPanel();
		panelMenu.add(panMenu_4);
		panMenu_4.setLayout(new BorderLayout(0, 0));

		btnMenu_Coupon = new JButton("COUPON");
		btnMenu_Coupon.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panMenu_4.add(btnMenu_Coupon, BorderLayout.CENTER);
		JPanel panMenu_5 = new JPanel();
		panelMenu.add(panMenu_5);
		panMenu_5.setLayout(new BorderLayout(0, 0));

		btnMenu_Sales = new JButton("SALES");
		btnMenu_Sales.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panMenu_5.add(btnMenu_Sales, BorderLayout.CENTER);
		JPanel panMenu_6 = new JPanel();
		panelMenu.add(panMenu_6);
		panMenu_6.setLayout(new BorderLayout(0, 0));

		btnMenu_Admin = new JButton("ADMIN");
		btnMenu_Admin.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panMenu_6.add(btnMenu_Admin, BorderLayout.CENTER);
		JPanel panMenu_7 = new JPanel();
		panelMenu.add(panMenu_7);
		panMenu_7.setLayout(new BorderLayout(0, 0));

		btnMenu_Logout = new JButton("LOGOUT");
		btnMenu_Logout.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panMenu_7.add(btnMenu_Logout, BorderLayout.CENTER);
		JPanel panMenu_8 = new JPanel();
		panelMenu.add(panMenu_8);
		panMenu_8.setLayout(new BorderLayout(0, 0));

		btnMenu_Exit = new JButton("EXIT");
		btnMenu_Exit.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panMenu_8.add(btnMenu_Exit, BorderLayout.CENTER);

		btnMenu_Coupon.setBackground(mycolor6);
		btnMenu_Exit.setBackground(mycolor6);
		btnMenu_Logout.setBackground(mycolor6);
		btnMenu_Main.setBackground(mycolor6);
		btnMenu_Members.setBackground(mycolor6);
		btnMenu_Admin.setBackground(mycolor6);
		btnMenu_Sales.setBackground(mycolor6);
		btnMenu_Coupon.setForeground(mycolor1);
		btnMenu_Exit.setForeground(mycolor1);
		btnMenu_Logout.setForeground(mycolor1);
		btnMenu_Main.setForeground(mycolor1);
		btnMenu_Members.setForeground(mycolor1);
		btnMenu_Admin.setForeground(mycolor1);
		btnMenu_Sales.setForeground(mycolor1);

		setVisible(true);
	}
}
