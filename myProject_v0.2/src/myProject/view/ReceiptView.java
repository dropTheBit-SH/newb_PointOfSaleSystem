package myProject.view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ReceiptView extends JFrame{
	public Color mycolor1 = new Color(255,255,255);
	public Color mycolor2 = new Color(255,90,0);
	public Color mycolor3 = new Color(121,54,81);
	public Color mycolor4 = new Color(132,201,192);
	public Color mycolor5 = new Color(242,208,145);
	public Color mycolor6 = new Color(51,51,51);
	public JPanel content;
	public JPanel panelLeft;
	public JPanel panelDiscount;
	public JButton btn_p1_1;
	public JButton btn_p1_2;
	public JButton btn_p2_1;
	public JButton btn_p2_2;
	public JButton btn_p2_3;
	public JButton btn_p3_1;
	public JButton btn_p3_2;
	public JButton btn_p3_3;
	public JButton btn_pd;
	public JButton btn_pd_check;
	public JButton btn_mile;
	public JButton btn_useMile1;
	public JButton btn_useMile2;
	public JTextField tf_code;
	public JTextField tf_mile;
	public JTextField tf_useMile;
	public JTextField tf_cash;
	public JPanel panel_page1;
	public JPanel panel_page2;
	public JPanel panel_page3;
	public JPanel panel_page_Discount;
	public JPanel panel_page_earnMileage;
	public JPanel panel_page_useMileage;
	public JPanel panel_page_payBoth;
	public JLabel lbl_pd_1;
	public JLabel lbl_pd_2;
	public JLabel lbl_pd_3;
	public JLabel lbl_pd_4;
	public JLabel lbl_mile_1;
	public JLabel lbl_mile_2;
	public JLabel lbl_mile_3;
	public JButton btn_payBoth;
	
	public CardLayout cl = new CardLayout();
	
	public ReceiptView() {
		content = (JPanel) getContentPane();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		content.setBackground(mycolor1);
		getContentPane().setLayout(new GridLayout(1, 2, 0, 0));
		setSize(1000, 800);
		
		panelLeft = new JPanel();
		getContentPane().add(panelLeft);
		panelLeft.setLayout(cl);
		
		panel_page1 = new JPanel(); 
		panelLeft.add(panel_page1, "page1");
		panel_page1.setLayout(new GridLayout(3, 1, 0, 0));
		JLabel lbl_p1 = new JLabel("Do you have a coupon(voucher)?");
		panel_page1.add(lbl_p1);
		btn_p1_1 = new JButton("Yes!");
		panel_page1.add(btn_p1_1);
		btn_p1_2 = new JButton("(Next)");
		panel_page1.add(btn_p1_2);

		panel_page2 = new JPanel();
		panelLeft.add(panel_page2, "page2");
		panel_page2.setLayout(new GridLayout(4, 1, 0, 0));
		JLabel lbl_p2 = new JLabel("~ MILEAGE ~");
		panel_page2.add(lbl_p2);
		btn_p2_1 = new JButton("Earn Mileage?");
		panel_page2.add(btn_p2_1);
		btn_p2_2 = new JButton("use Mileage?");
		panel_page2.add(btn_p2_2);
		btn_p2_3 = new JButton("Next!");
		panel_page2.add(btn_p2_3);
		
		panel_page3 = new JPanel();
		panelLeft.add(panel_page3, "page3");
		panel_page3.setLayout(new GridLayout(4, 1, 0, 0));
		JLabel lbl_p3 = new JLabel("~ PAYMENT ~");
		panel_page3.add(lbl_p3);
		btn_p3_1 = new JButton("Card?");
		panel_page3.add(btn_p3_1);
		btn_p3_2 = new JButton("Cash?");
		panel_page3.add(btn_p3_2);
		btn_p3_3 = new JButton("Cash & Card?");
		panel_page3.add(btn_p3_3);
		
		panel_page_Discount = new JPanel();
		panelLeft.add(panel_page_Discount, "discount");
		panel_page_Discount.setLayout(new GridLayout(8, 1, 0, 0));
		JLabel lbl_p4 = new JLabel("What is coupon's code?");
		panel_page_Discount.add(lbl_p4);
		tf_code = new JTextField();
		panel_page_Discount.add(tf_code);
		btn_pd_check = new JButton("Check");
		panel_page_Discount.add(btn_pd_check);
		lbl_pd_1 = new JLabel("Exp");
		lbl_pd_2 = new JLabel("");
		lbl_pd_3 = new JLabel("Code");
		lbl_pd_4 = new JLabel("");
		btn_pd = new JButton("Ok");
		panel_page_Discount.add(btn_pd);
		panel_page_Discount.add(lbl_pd_1);
		panel_page_Discount.add(lbl_pd_2);
		panel_page_Discount.add(lbl_pd_3);
		panel_page_Discount.add(lbl_pd_4);
		
		panel_page_earnMileage = new JPanel();
		panelLeft.add(panel_page_earnMileage, "earnMileage");
		panel_page_earnMileage.setLayout(new GridLayout(5, 1, 0, 0));
		JLabel lbl_p5 = new JLabel("~ MILEAGE ~");
		panel_page_earnMileage.add(lbl_p5);
		tf_mile = new JTextField();
		panel_page_earnMileage.add(tf_mile);
		btn_mile = new JButton("Check");
		panel_page_earnMileage.add(btn_mile);
		lbl_mile_1 = new JLabel("Mileage");
		lbl_mile_2 = new JLabel("");
		panel_page_earnMileage.add(lbl_mile_1);
		panel_page_earnMileage.add(lbl_mile_2);
		
		panel_page_useMileage = new JPanel();
		panelLeft.add(panel_page_useMileage, "useMileage");
		panel_page_useMileage.setLayout(new GridLayout(8, 1, 0, 0));
		JLabel lbl_p6 = new JLabel("~ MILEAGE ~");
		panel_page_useMileage.add(lbl_p6);
		tf_mile = new JTextField();
		panel_page_useMileage.add(tf_mile);
		btn_useMile1 = new JButton("Check");
		panel_page_useMileage.add(btn_useMile1);
		lbl_mile_1 = new JLabel("Mileage");
		lbl_mile_2 = new JLabel("");
		panel_page_useMileage.add(lbl_mile_1);
		panel_page_useMileage.add(lbl_mile_2);
		lbl_mile_3 = new JLabel("How much?");
		tf_useMile = new JTextField();
		btn_useMile2 = new JButton("Confirm");
		panel_page_useMileage.add(lbl_mile_3);
		panel_page_useMileage.add(tf_useMile);
		panel_page_useMileage.add(btn_useMile2);
		
		panel_page_payBoth = new JPanel();
		panelLeft.add(panel_page_payBoth, "payBoth");
		panel_page_payBoth.setLayout(new GridLayout(5, 1, 0, 0));
		JLabel lbl_p7 = new JLabel("~ PAYMENT ~");
		panel_page_payBoth.add(lbl_p7);
		tf_cash = new JTextField();
		panel_page_payBoth.add(tf_cash);
		btn_payBoth = new JButton("Confirm");
		panel_page_payBoth.add(btn_payBoth);

		JPanel panelRight = new JPanel();
		getContentPane().add(panelRight);
		
		setVisible(true);
	}
}
