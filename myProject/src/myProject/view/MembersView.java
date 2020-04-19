package myProject.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JComboBox;


public class MembersView extends View {
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	public JPanel mainPanel;
	public JTable table;
	public JLabel textField_No;
	public JTextField textField_Name;
	public JTextField textField_Phone;
	public JTextField textField_Favorite;
	public JTextField textField_Mileage;
	public JSpinner spinner;
	public JButton btnMemAdd;
	public JButton btnMemDel;
	public JButton btnMemUpd;
	public DefaultTableModel dm;
	public Object[] colArr = { "No", "Name", "Phone", "Favorite", "Mileage", "Grade" };

	public MembersView() {
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

		JPanel panel_enroll = new JPanel();
		panel_enroll.setBackground(mycolor6);
		panel_enroll.setBounds(653, 118, 1267, 962);
		mainPanel.add(panel_enroll);
		panel_enroll.setLayout(new GridLayout(9, 1, 0, 0));
		
		JPanel paneltitle = new JPanel();
		paneltitle.setBackground(mycolor6);
		panel_enroll.add(paneltitle);
		paneltitle.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblMemTitle = new JLabel("MEMBERSHIP");
		lblMemTitle.setBackground(mycolor6);
		lblMemTitle.setFont(new Font("Dialog", Font.BOLD, 30));
		lblMemTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemTitle.setForeground(mycolor4);
		paneltitle.add(lblMemTitle);
		
		JPanel panel_1 = new JPanel();
		panel_enroll.add(panel_1);
		panel_1.setLayout(null);
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNumber.setForeground(mycolor1);
		lblNumber.setBounds(33, 20, 177, 37);
		panel_1.add(lblNumber);
		textField_No = new JLabel();
		textField_No.setBounds(222, 20, 642, 40);
		panel_1.add(textField_No);
		textField_No.setBackground(mycolor1);
		textField_No.setForeground(mycolor1);
		
		JPanel panel_2 = new JPanel();
		panel_enroll.add(panel_2);
		panel_2.setLayout(null);
		JLabel lblName = new JLabel("Name(*)");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Dialog", Font.BOLD, 20));
		lblName.setForeground(mycolor1);
		lblName.setBounds(33, 20, 177, 37);
		panel_2.add(lblName);
		textField_Name = new JTextField();
		textField_Name.setBounds(222, 20, 642, 40);
		panel_2.add(textField_Name);
		textField_Name.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_enroll.add(panel_3);
		panel_3.setLayout(null);
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPhone.setForeground(mycolor1);
		lblPhone.setBounds(33, 20, 177, 37);
		panel_3.add(lblPhone);
		textField_Phone = new JTextField();
		textField_Phone.setBounds(222, 20, 642, 40);
		panel_3.add(textField_Phone);
		textField_Phone.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_enroll.add(panel_7);
		panel_7.setLayout(null);
		JLabel lblLike = new JLabel("Like");
		lblLike.setHorizontalAlignment(SwingConstants.CENTER);
		lblLike.setFont(new Font("Dialog", Font.BOLD, 20));
		lblLike.setForeground(mycolor1);
		lblLike.setBounds(33, 20, 177, 37);
		panel_7.add(lblLike);
		textField_Favorite = new JTextField();
		textField_Favorite.setBounds(222, 20, 642, 40);
		panel_7.add(textField_Favorite);
		textField_Favorite.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_enroll.add(panel_8);
		panel_8.setLayout(null);
		JLabel lblMileage = new JLabel("Mileage");
		lblMileage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMileage.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMileage.setForeground(mycolor1);
		lblMileage.setBounds(33, 20, 177, 37);
		panel_8.add(lblMileage);
		textField_Mileage = new JTextField();
		textField_Mileage.setBounds(222, 20, 642, 40);
		textField_Mileage.setText("0");
		panel_8.add(textField_Mileage);
		textField_Mileage.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_enroll.add(panel_9);
		panel_9.setLayout(null);
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrade.setFont(new Font("Dialog", Font.BOLD, 20));
		lblGrade.setForeground(mycolor1);
		lblGrade.setBounds(33, 20, 177, 37);
		panel_9.add(lblGrade);
		
		textField_Favorite.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_Mileage.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_Name.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_No.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_Phone.setFont(new Font("Dialog", Font.BOLD, 20));
		
		String[] spinnerList = new String[] {"SILVER", "GOLD", "VIP" };
		spinner = new JSpinner(new RolloverSpinnerListModel(spinnerList));
		spinner.setFont(new Font("Dialog", Font.PLAIN, 20));
		spinner.setBounds(222, 20, 642, 40);
		panel_9.add(spinner);
		
		panel_1.setBackground(mycolor6);
		panel_2.setBackground(mycolor6);
		panel_3.setBackground(mycolor6);
		panel_7.setBackground(mycolor6);
		panel_8.setBackground(mycolor6);
		panel_9.setBackground(mycolor6);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(mycolor6);
		panel_enroll.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 7, 0, 0));
		
		JPanel btn1 = new JPanel();
		panel_10.add(btn1);
		btn1.setBackground(null);
		
		btnMemDel = new JButton("Delete");
		btnMemDel.setFont(new Font("Dialog", Font.BOLD, 25));
		btnMemDel.setBackground(mycolor4);
		btnMemDel.setForeground(mycolor1);
		panel_10.add(btnMemDel);
		
		JPanel btn2 = new JPanel();
		panel_10.add(btn2);
		btn2.setBackground(null);
		
		btnMemUpd = new JButton("Update");
		btnMemUpd.setFont(new Font("Dialog", Font.BOLD, 25));
		btnMemUpd.setBackground(mycolor4);
		btnMemUpd.setForeground(mycolor1);
		panel_10.add(btnMemUpd);
		
		JPanel btn3 = new JPanel();
		panel_10.add(btn3);
		btn3.setBackground(null);
		
		btnMemAdd = new JButton("Add");
		btnMemAdd.setFont(new Font("Dialog", Font.BOLD, 25));
		btnMemAdd.setBackground(mycolor4);
		btnMemAdd.setForeground(mycolor1);
		panel_10.add(btnMemAdd);
		
		JPanel btn4 = new JPanel();
		panel_10.add(btn4);
		btn4.setBackground(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(mycolor6);
		panel_enroll.add(panel);
		
		dm = new DefaultTableModel(1, 4) {
			//테이블 수정금지
			public boolean isCellEditable(int i, int c){ return false;}
		};
		
		dm.setColumnIdentifiers(colArr);
		table = new JTable(dm);
		table.setFont(new Font("Dialog", Font.BOLD, 15));
		table.setForeground(mycolor6);
		table.setRowHeight(25);
		JTableHeader header = table.getTableHeader();
		header.setBackground(mycolor3);
		header.setForeground(mycolor1);
		header.setFont(new Font("Dialog", Font.BOLD, 22));
		table.setRowSelectionAllowed(true);
		
		mainPanel.setBackground(mycolor6);
		panelList.setBackground(mycolor6);
		scrollPane.setBackground(mycolor6);
		scrollPane.setViewportView(table);
		
		mainPanel.setVisible(true);
		
	}
}

class RolloverSpinnerListModel extends SpinnerListModel {

	  public RolloverSpinnerListModel(Object[] items) {
	    super(items);
	  }

	  public RolloverSpinnerListModel(List items) {
	    super(items);
	  }

	  public Object getNextValue() {
	    Object nv = super.getNextValue();
	    if (nv != null) {
	      return nv;
	    }
	    return getList().get(0);
	  }

	  public Object getPreviousValue() {
	    Object pv = super.getPreviousValue();
	    if (pv != null) {
	      return pv;
	    }
	    List l = getList();
	    return l.get(l.size() - 1);
	  }
}