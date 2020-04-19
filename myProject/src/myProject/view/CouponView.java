package myProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class CouponView extends View {
	public JPanel mainPanel;
	public JButton btnCreate; 
	public JButton btnSend;
	public JLabel lblExpValue;
	public JLabel lblCodeValue;
	public JLabel lblMemValue;
	public JRadioButton rdbtn1;
	public JRadioButton rdbtn2;
	public JRadioButton rdbtn3;
	public JLabel labelCoupon;
	
	public CouponView() {
		
		mainPanel = new JPanel();
		mainPanel.setBounds(0, 122, 1920, 958);
		content.add(mainPanel);
		mainPanel.setLayout(null);

		JPanel panelCenter= new JPanel();
		panelCenter.setBounds(200, 100, 1520, 708);
		mainPanel.add(panelCenter);
		panelCenter.setBackground(null);
		panelCenter.setLayout(null);
		
		JPanel panelCoupon = null;
		try {
			panelCoupon = new JPanelWithBackground("src/myProject/image/00000.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		panelCoupon.setBounds(50,100,1000,800);
		panelCenter.add(panelCoupon);
		panelCoupon.setBackground(null);
		panelCoupon.setLayout(null);
		
		labelCoupon = new JLabel("1000 won");
		panelCoupon.add(labelCoupon);
		labelCoupon.setBounds(620,120,1000,200);
		labelCoupon.setFont(new Font("dialog", Font.BOLD, 75));
		labelCoupon.setForeground(mycolor2);
		
		JPanel pan1 = new JPanel();
		pan1.setBounds(50, 30, 1000, 50);
		panelCenter.add(pan1);
		rdbtn1 = new JRadioButton("5000 won");
		rdbtn1.setFont(new Font("dialog", Font.BOLD, 20));
		rdbtn2 = new JRadioButton("3000 won");
		rdbtn2.setFont(new Font("dialog", Font.BOLD, 20));
		rdbtn3 = new JRadioButton("1000 won");
		rdbtn3.setFont(new Font("dialog", Font.BOLD, 20));
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtn1);
		group.add(rdbtn2);
		group.add(rdbtn3);
		pan1.setLayout(new GridLayout(1,5,0,0));
		JPanel pantmp1 = new JPanel();
		JPanel pantmp2 = new JPanel();
		pan1.add(pantmp1);
		pan1.add(rdbtn1);
		pan1.add(rdbtn2);
		pan1.add(rdbtn3);
		pan1.add(pantmp2);
		pan1.setBackground(null);
		pantmp1.setBackground(null);
		rdbtn1.setBackground(null);
		rdbtn2.setBackground(null);
		rdbtn3.setBackground(null);
		pantmp2.setBackground(null);

		JPanel pan2 = new JPanel();
		panelCoupon.add(pan2);
		pan2.setBackground(Color.white);
		pan2.setBounds(630, 320, 500, 50);
		JLabel lblExpName = new JLabel("Exp. ");
		lblExpValue = new JLabel("2020.07.20");
		lblExpName.setFont(new Font("dialog", Font.BOLD, 20));
		lblExpValue.setFont(new Font("dialog", Font.BOLD, 20));
		lblExpValue.setBackground(null);
		lblExpName.setBackground(null);
		pan2.add(lblExpName);
		pan2.add(lblExpValue);
		
		JPanel pan3 = new JPanel();
		panelCoupon.add(pan3);
		pan3.setBackground(Color.white);
		pan3.setBounds(600, 370, 500, 50);
		JLabel lblCodeName = new JLabel("Code . ");
		lblCodeValue = new JLabel("0720-5125-0874");
		lblCodeName.setFont(new Font("dialog", Font.BOLD, 20));
		lblCodeValue.setFont(new Font("dialog", Font.BOLD, 20));
		lblCodeName.setBackground(null);
		lblCodeValue.setBackground(null);
		pan3.add(lblCodeName);
		pan3.add(lblCodeValue);
		
		JPanel pan4 = new JPanel();
		panelCoupon.add(pan4);
		pan4.setBackground(Color.white);
		pan4.setBounds(250, 360, 500, 50);
		JLabel lblMemName = new JLabel("Owner. ");
		lblMemValue = new JLabel("김회원");
		lblMemName.setFont(new Font("dialog", Font.BOLD, 30));
		lblMemValue.setFont(new Font("dialog", Font.BOLD, 30));
		lblMemName.setBackground(null);
		lblMemValue.setBackground(null);
		pan4.add(lblMemName);
		pan4.add(lblMemValue);
		
		JPanel panelBtn = new JPanel();
		panelBtn.setBackground(null);
		panelBtn.setBounds(1150, 50, 300, 590);
		panelCenter.add(panelBtn);
		panelBtn.setLayout(null);
		
		btnCreate = new JButton("생성");
		btnCreate.setBounds(20, 100, 150, 100);
		panelBtn.add(btnCreate);
		
		btnSend = new JButton("전송");
		btnSend.setBounds(20, 350, 150, 100);
		panelBtn.add(btnSend);
	}
}
