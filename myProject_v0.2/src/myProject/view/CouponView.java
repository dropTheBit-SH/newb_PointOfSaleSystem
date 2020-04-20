package myProject.view;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CouponView extends View {
	public JPanel mainPanel;
	public JLabel lblExp;
	public JLabel lblCode;
	public JLabel lblDear;
	public JRadioButton rdbtn1;
	public JRadioButton rdbtn2;
	public JRadioButton rdbtn3;
	public JLabel labelCoupon;
	public JTextField textName;
	public JButton btnCoupon;

	public CouponView() {

		mainPanel = new JPanel();
		mainPanel.setBounds(0, 122, 1920, 958);
		content.add(mainPanel);
		mainPanel.setLayout(null);

		JPanel panelCoupon = null;
		try {
			panelCoupon = new JPanelWithBackground("src/myProject/image/00000.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
		panelCoupon.setBounds(500, 200, 1000, 450);
		mainPanel.add(panelCoupon);
		panelCoupon.setBackground(null);
		panelCoupon.setLayout(null);

		labelCoupon = new JLabel("1000 won");
		panelCoupon.add(labelCoupon);
		labelCoupon.setBounds(600, 120, 400, 200);
		labelCoupon.setFont(new Font("dialog", Font.BOLD, 75));
		labelCoupon.setForeground(mycolor2);

		rdbtn1 = new JRadioButton("5000 won");
		rdbtn1.setFont(new Font("dialog", Font.BOLD, 30));
		rdbtn2 = new JRadioButton("3000 won");
		rdbtn2.setFont(new Font("dialog", Font.BOLD, 30));
		rdbtn3 = new JRadioButton("1000 won");
		rdbtn3.setFont(new Font("dialog", Font.BOLD, 30));
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtn1);
		group.add(rdbtn2);
		group.add(rdbtn3);
		mainPanel.add(rdbtn1);
		rdbtn1.setBounds(600, 120, 200, 50);
		mainPanel.add(rdbtn2);
		rdbtn2.setBounds(900, 120, 200, 50);
		mainPanel.add(rdbtn3);
		rdbtn3.setBounds(1200, 120, 200, 50);
		rdbtn1.setBackground(null);
		rdbtn2.setBackground(null);
		rdbtn3.setBackground(null);

		lblExp = new JLabel("Exp. ");
		lblExp.setFont(new Font("dialog", Font.BOLD, 20));
		panelCoupon.add(lblExp);
		lblExp.setBounds(600, 330, 300, 50);

		lblCode = new JLabel("Code. ");
		lblCode.setFont(new Font("dialog", Font.BOLD, 20));
		panelCoupon.add(lblCode);
		lblCode.setBounds(600, 390, 300, 50);

		lblDear = new JLabel("Dear. ");
		lblDear.setFont(new Font("dialog", Font.BOLD, 35));
		panelCoupon.add(lblDear);
		lblDear.setBounds(350, 390, 250, 50);

		textName = new JTextField();
		textName.setText("enter the name");
		textName.setFont(new Font("dialog", Font.ITALIC, 40));
		textName.setHorizontalAlignment(SwingConstants.CENTER);
		textName.setBounds(500, 680, 680, 70);
		mainPanel.add(textName);
		textName.setBackground(null);
		textName.setForeground(Color.GRAY);

		btnCoupon = new JButton("CREATE");
		btnCoupon.setBounds(1200, 680, 300, 70);
		btnCoupon.setFont(new Font("dialog", Font.BOLD, 30));
		mainPanel.add(btnCoupon);
		btnCoupon.setBackground(mycolor2);
	}
}
