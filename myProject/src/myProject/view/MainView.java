package myProject.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.SwingConstants;

public class MainView extends View {
	public JPanel mainPanel;
	public JTable table;
	public JTabbedPane tabbedPane;
	public JButton btnMenu1_1;
	public JButton btnMenu1_2;
	public JButton btnMenu1_3;
	public JButton btnMenu1_4;
	public JButton btnMenu1_5;
	public JButton btnMenu1_6;
	public JButton btnMenu1_7;
	public JButton btnMenu1_8;
	public JButton btnMenu1_9;
	public JButton btnMenu1_10;
	public JButton btnMenu1_11;
	public JButton btnMenu1_12;
	public JButton btnMenu1_13;
	public JButton btnMenu1_14;
	public JButton btnMenu1_15;
	public JButton btnMenu1_16;
	public JButton btnMenu1_17;
	public JButton btnMenu1_18;
	public JButton btnMenu1_19;
	public JButton btnMenu1_20;
	public JButton btnMenu2_1;
	public JButton btnMenu2_2;
	public JButton btnMenu2_3;
	public JButton btnMenu2_4;
	public JButton btnMenu2_5;
	public JButton btnMenu2_6;
	public JButton btnMenu2_7;
	public JButton btnMenu2_8;
	public JButton btnMenu2_9;
	public JButton btnMenu2_10;
	public JButton btnMenu2_11;
	public JButton btnMenu2_12;
	public JButton btnMenu2_13;
	public JButton btnMenu2_14;
	public JButton btnMenu2_15;
	public JButton btnMenu2_16;
	public JButton btnMenu2_17;
	public JButton btnMenu2_18;
	public JButton btnMenu2_19;
	public JButton btnMenu2_20;
	public JButton btnMenu3_1;
	public JButton btnMenu3_2;
	public JButton btnMenu3_3;
	public JButton btnMenu3_4;
	public JButton btnMenu3_5;
	public JButton btnMenu3_6;
	public JButton btnMenu3_7;
	public JButton btnMenu3_8;
	public JButton btnMenu3_9;
	public JButton btnMenu3_10;
	public JButton btnMenu3_11;
	public JButton btnMenu3_12;
	public JButton btnMenu3_13;
	public JButton btnMenu3_14;
	public JButton btnMenu3_15;
	public JButton btnMenu3_16;
	public JButton btnMenu3_17;
	public JButton btnMenu3_18;
	public JButton btnMenu3_19;
	public JButton btnMenu3_20;

	public DefaultTableModel dm;
	public JLabel lblTotal;
	public JButton btnNumPlu1;
	public JButton btnNumPlu5;
	public JButton btnNumPlu10;
	public JButton btnNumMin1;
	public JButton btnNumMin10;
	public JButton btnNumMin5;
	public JButton btnPayCard;
	public JButton btnPayCash;
	public JButton btnPayReceipt;
	public JButton btnPayCoupon;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	public MainView() {
		mainPanel = new JPanel();
		mainPanel.setBounds(0, 122, 1920, 958);
		content.add(mainPanel);
		mainPanel.setLayout(new GridLayout(1, 2, 0, 0));

		JPanel panelList = new JPanel();
		panelList.setBounds(0, 118, 1920 / 2, 961);
		mainPanel.add(panelList);
		panelList.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		panelList.add(scrollPane);
		scrollPane.setBounds(0, 0, 1920 / 2, 961);

		JPanel panelBtn = new JPanel();
		panelBtn.setBounds(653, 118, 1267, 962);
		mainPanel.add(panelBtn);
		panelBtn.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panelBtnN = new JPanel();
		panelBtn.add(panelBtnN);
		panelBtnN.setLayout(new GridLayout(0, 1, 0, 0));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panelBtnN.add(tabbedPane);

		JPanel panelTab1 = new JPanel();
		tabbedPane.addTab("COFFEE", null, panelTab1, null);
		panelTab1.setLayout(new GridLayout(4, 5, 0, 0));
		btnMenu1_1 = new JButton("Espresso(H)", new ImageIcon("src/myProject/image/1.jpg"));
		panelTab1.add(btnMenu1_1);
		btnMenu1_2 = new JButton("Americano(H)", new ImageIcon("src/myProject/image/1.jpg"));
		panelTab1.add(btnMenu1_2);
		btnMenu1_3 = new JButton("Mocha(H)", new ImageIcon("src/myProject/image/1.jpg"));
		panelTab1.add(btnMenu1_3);
		btnMenu1_4 = new JButton("Latte(H)", new ImageIcon("src/myProject/image/1.jpg"));
		panelTab1.add(btnMenu1_4);
		btnMenu1_5 = new JButton("Cappuccino(H)", new ImageIcon("src/myProject/image/1.jpg"));
		panelTab1.add(btnMenu1_5);
		btnMenu1_6 = new JButton("Espresso(I)", new ImageIcon("src/myProject/image/6.jpg"));
		panelTab1.add(btnMenu1_6);
		btnMenu1_7 = new JButton("Americano(I)", new ImageIcon("src/myProject/image/6.jpg"));
		panelTab1.add(btnMenu1_7);
		btnMenu1_8 = new JButton("Mocha(I)", new ImageIcon("src/myProject/image/6.jpg"));
		panelTab1.add(btnMenu1_8);
		btnMenu1_9 = new JButton("Latte(I)", new ImageIcon("src/myProject/image/6.jpg"));
		panelTab1.add(btnMenu1_9);
		btnMenu1_10 = new JButton("Cappuccino(I)", new ImageIcon("src/myProject/image/6.jpg"));
		panelTab1.add(btnMenu1_10);
		btnMenu1_11 = new JButton("");
		panelTab1.add(btnMenu1_11);
		btnMenu1_12 = new JButton("");
		panelTab1.add(btnMenu1_12);
		btnMenu1_13 = new JButton("");
		panelTab1.add(btnMenu1_13);
		btnMenu1_14 = new JButton("");
		panelTab1.add(btnMenu1_14);
		btnMenu1_15 = new JButton("");
		panelTab1.add(btnMenu1_15);
		btnMenu1_16 = new JButton("");
		panelTab1.add(btnMenu1_16);
		btnMenu1_17 = new JButton("");
		panelTab1.add(btnMenu1_17);
		btnMenu1_18 = new JButton("");
		panelTab1.add(btnMenu1_18);
		btnMenu1_19 = new JButton("");
		panelTab1.add(btnMenu1_19);
		btnMenu1_20 = new JButton("");
		panelTab1.add(btnMenu1_20);

		JPanel panelTab2 = new JPanel();
		tabbedPane.addTab("DRINK", null, panelTab2, null);
		panelTab2.setLayout(new GridLayout(4, 5, 0, 0));
		btnMenu2_1 = new JButton("BananaMilk", new ImageIcon("src/myProject/image/11.jpg"));
		panelTab2.add(btnMenu2_1);
		btnMenu2_2 = new JButton("KiwiMilk", new ImageIcon("src/myProject/image/12.jpg"));
		panelTab2.add(btnMenu2_2);
		btnMenu2_3 = new JButton("StrawberryMilk", new ImageIcon("src/myProject/image/13.jpg"));
		panelTab2.add(btnMenu2_3);
		btnMenu2_4 = new JButton("FreshMilk", new ImageIcon("src/myProject/image/14.jpg"));
		panelTab2.add(btnMenu2_4);
		btnMenu2_5 = new JButton("");
		panelTab2.add(btnMenu2_5);
		btnMenu2_6 = new JButton("CocaCola", new ImageIcon("src/myProject/image/15.jpg"));
		panelTab2.add(btnMenu2_6);
		btnMenu2_7 = new JButton("Water", new ImageIcon("src/myProject/image/16.jpg"));
		panelTab2.add(btnMenu2_7);
		btnMenu2_8 = new JButton("");
		panelTab2.add(btnMenu2_8);
		btnMenu2_9 = new JButton("");
		panelTab2.add(btnMenu2_9);
		btnMenu2_10 = new JButton("");
		panelTab2.add(btnMenu2_10);
		btnMenu2_11 = new JButton("");
		panelTab2.add(btnMenu2_11);
		btnMenu2_12 = new JButton("");
		panelTab2.add(btnMenu2_12);
		btnMenu2_13 = new JButton("");
		panelTab2.add(btnMenu2_13);
		btnMenu2_14 = new JButton("");
		panelTab2.add(btnMenu2_14);
		btnMenu2_15 = new JButton("");
		panelTab2.add(btnMenu2_15);
		btnMenu2_16 = new JButton("");
		panelTab2.add(btnMenu2_16);
		btnMenu2_17 = new JButton("");
		panelTab2.add(btnMenu2_17);
		btnMenu2_18 = new JButton("");
		panelTab2.add(btnMenu2_18);
		btnMenu2_19 = new JButton("");
		panelTab2.add(btnMenu2_19);
		btnMenu2_20 = new JButton("");
		panelTab2.add(btnMenu2_20);

		JPanel panelTab3 = new JPanel();
		tabbedPane.addTab("BREAD", null, panelTab3, null);
		panelTab3.setLayout(new GridLayout(4, 5, 0, 0));
		btnMenu3_1 = new JButton("EggBacon", new ImageIcon("src/myProject/image/51.jpg"));
		panelTab3.add(btnMenu3_1);
		btnMenu3_2 = new JButton("Egg", new ImageIcon("src/myProject/image/52.jpg"));
		panelTab3.add(btnMenu3_2);
		btnMenu3_3 = new JButton("Ham", new ImageIcon("src/myProject/image/53.jpg"));
		panelTab3.add(btnMenu3_3);
		btnMenu3_4 = new JButton("Jam", new ImageIcon("src/myProject/image/54.jpg"));
		panelTab3.add(btnMenu3_4);
		btnMenu3_5 = new JButton("");
		panelTab3.add(btnMenu3_5);
		btnMenu3_6 = new JButton("Croissant", new ImageIcon("src/myProject/image/55.jpg"));
		panelTab3.add(btnMenu3_6);
		btnMenu3_7 = new JButton("Doughnut", new ImageIcon("src/myProject/image/56.jpg"));
		panelTab3.add(btnMenu3_7);
		btnMenu3_8 = new JButton("");
		panelTab3.add(btnMenu3_8);
		btnMenu3_9 = new JButton("");
		panelTab3.add(btnMenu3_9);
		btnMenu3_10 = new JButton("");
		panelTab3.add(btnMenu3_10);
		btnMenu3_11 = new JButton("EventMenu", new ImageIcon("src/myProject/image/61.jpg"));
		panelTab3.add(btnMenu3_11);
		btnMenu3_12 = new JButton("");
		panelTab3.add(btnMenu3_12);
		btnMenu3_13 = new JButton("");
		panelTab3.add(btnMenu3_13);
		btnMenu3_14 = new JButton("");
		panelTab3.add(btnMenu3_14);
		btnMenu3_15 = new JButton("");
		panelTab3.add(btnMenu3_15);
		btnMenu3_16 = new JButton("");
		panelTab3.add(btnMenu3_16);
		btnMenu3_17 = new JButton("");
		panelTab3.add(btnMenu3_17);
		btnMenu3_18 = new JButton("");
		panelTab3.add(btnMenu3_18);
		btnMenu3_19 = new JButton("");
		panelTab3.add(btnMenu3_19);
		btnMenu3_20 = new JButton("");
		panelTab3.add(btnMenu3_20);

		btnMenu1_1.setBackground(Color.white);
		btnMenu1_2.setBackground(Color.white);
		btnMenu1_3.setBackground(Color.white);
		btnMenu1_4.setBackground(Color.white);
		btnMenu1_5.setBackground(Color.white);
		btnMenu1_6.setBackground(Color.white);
		btnMenu1_7.setBackground(Color.white);
		btnMenu1_8.setBackground(Color.white);
		btnMenu1_9.setBackground(Color.white);
		btnMenu1_10.setBackground(Color.white);
		btnMenu1_11.setBackground(Color.white);
		btnMenu1_12.setBackground(Color.white);
		btnMenu1_13.setBackground(Color.white);
		btnMenu1_14.setBackground(Color.white);
		btnMenu1_15.setBackground(Color.white);
		btnMenu1_16.setBackground(Color.white);
		btnMenu1_17.setBackground(Color.white);
		btnMenu1_18.setBackground(Color.white);
		btnMenu1_19.setBackground(Color.white);
		btnMenu1_20.setBackground(Color.white);
		btnMenu2_1.setBackground(Color.white);
		btnMenu2_2.setBackground(Color.white);
		btnMenu2_3.setBackground(Color.white);
		btnMenu2_4.setBackground(Color.white);
		btnMenu2_5.setBackground(Color.white);
		btnMenu2_6.setBackground(Color.white);
		btnMenu2_7.setBackground(Color.white);
		btnMenu2_8.setBackground(Color.white);
		btnMenu2_9.setBackground(Color.white);
		btnMenu2_10.setBackground(Color.white);
		btnMenu2_11.setBackground(Color.white);
		btnMenu2_12.setBackground(Color.white);
		btnMenu2_13.setBackground(Color.white);
		btnMenu2_14.setBackground(Color.white);
		btnMenu2_15.setBackground(Color.white);
		btnMenu2_16.setBackground(Color.white);
		btnMenu2_17.setBackground(Color.white);
		btnMenu2_18.setBackground(Color.white);
		btnMenu2_19.setBackground(Color.white);
		btnMenu2_20.setBackground(Color.white);
		btnMenu3_1.setBackground(Color.white);
		btnMenu3_2.setBackground(Color.white);
		btnMenu3_3.setBackground(Color.white);
		btnMenu3_4.setBackground(Color.white);
		btnMenu3_5.setBackground(Color.white);
		btnMenu3_6.setBackground(Color.white);
		btnMenu3_7.setBackground(Color.white);
		btnMenu3_8.setBackground(Color.white);
		btnMenu3_9.setBackground(Color.white);
		btnMenu3_10.setBackground(Color.white);
		btnMenu3_11.setBackground(Color.white);
		btnMenu3_12.setBackground(Color.white);
		btnMenu3_13.setBackground(Color.white);
		btnMenu3_14.setBackground(Color.white);
		btnMenu3_15.setBackground(Color.white);
		btnMenu3_16.setBackground(Color.white);
		btnMenu3_17.setBackground(Color.white);
		btnMenu3_18.setBackground(Color.white);
		btnMenu3_19.setBackground(Color.white);
		btnMenu3_20.setBackground(Color.white);

		JPanel panelBtnS = new JPanel();
		panelBtn.add(panelBtnS);
		panelBtnS.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel panelLblSum = new JPanel();
		panelBtnS.add(panelLblSum);
		panelLblSum.setLayout(new BorderLayout(0, 0));
		panelLblSum.setBackground(mycolor1);
		
		lblNewLabel_1 = new JLabel("  TOTAL  ");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		panelLblSum.add(lblNewLabel_1, BorderLayout.WEST);
		lblNewLabel_1.setForeground(mycolor6);

		lblTotal = new JLabel("0");
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 60));
		lblTotal.setHorizontalAlignment(SwingConstants.TRAILING);
		panelLblSum.add(lblTotal);
		lblTotal.setForeground(mycolor2);

		lblNewLabel_2 = new JLabel("    WON  ");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		panelLblSum.add(lblNewLabel_2, BorderLayout.EAST);
		lblNewLabel_2.setForeground(mycolor6);

		JPanel panel_1 = new JPanel();
		panelBtnS.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));

		btnNumPlu1 = new JButton(new ImageIcon("src/myProject/image/101.jpg"));
		btnNumPlu1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNumPlu1.setBackground(Color.white);
		panel_3.add(btnNumPlu1);

		btnNumPlu5 = new JButton(new ImageIcon("src/myProject/image/103.jpg"));
		btnNumPlu5.setBackground(Color.white);
		panel_3.add(btnNumPlu5);

		btnNumPlu10 = new JButton(new ImageIcon("src/myProject/image/105.jpg"));
		btnNumPlu10.setBackground(Color.white);
		panel_3.add(btnNumPlu10);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_2 = new JPanel();
		panelBtnS.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 0, 0));

		btnNumMin1 = new JButton(new ImageIcon("src/myProject/image/102.jpg"));
		btnNumMin1.setBackground(Color.white);
		panel_5.add(btnNumMin1);

		btnNumMin5 = new JButton(new ImageIcon("src/myProject/image/104.jpg"));
		btnNumMin5.setBackground(Color.white);
		panel_5.add(btnNumMin5);

		btnNumMin10 = new JButton(new ImageIcon("src/myProject/image/106.jpg"));
		btnNumMin10.setBackground(Color.white);
		panel_5.add(btnNumMin10);

		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		btnPayCash = new JButton(new ImageIcon("src/myProject/image/1001.jpg"));
		btnPayCash.setBackground(mycolor3);
		panel_4.add(btnPayCash);

		btnPayCard = new JButton(new ImageIcon("src/myProject/image/1002.jpg"));
		btnPayCard.setBackground(mycolor3);
		panel_4.add(btnPayCard);

		btnPayCoupon = new JButton(new ImageIcon("src/myProject/image/1003.jpg"));
		btnPayCoupon.setBackground(mycolor3);
		panel_6.add(btnPayCoupon);

		btnPayReceipt = new JButton(new ImageIcon("src/myProject/image/1004.jpg"));
		btnPayReceipt.setBackground(mycolor3);
		panel_6.add(btnPayReceipt);

		Object[] colArr = { "NAME", "PRICE", "QUANTITY", "SUM" };
		dm = new DefaultTableModel(1, 4) {
			//테이블 수정금지
			public boolean isCellEditable(int i, int c){ return false;}
		};
		
		dm.setColumnIdentifiers(colArr);
		table = new JTable(dm);
		table.setFont(new Font("Dialog", Font.BOLD, 20));
		table.setForeground(mycolor6);
		table.setRowHeight(25);
		JTableHeader header = table.getTableHeader();
		header.setBackground(mycolor4);
		header.setForeground(mycolor1);
		header.setFont(new Font("Dialog", Font.BOLD, 22));
		table.setRowSelectionAllowed(true);
		
		mainPanel.setBackground(mycolor1);
		panelList.setBackground(mycolor1);
		scrollPane.setBackground(mycolor1);
		scrollPane.setViewportView(table);
		panelBtnN.setBackground(mycolor1);
		tabbedPane.setForeground(mycolor1);
		tabbedPane.setBackground(mycolor2);
		getContentPane().setLayout(new BorderLayout(0, 0));
		mainPanel.setVisible(true);
	}
}
