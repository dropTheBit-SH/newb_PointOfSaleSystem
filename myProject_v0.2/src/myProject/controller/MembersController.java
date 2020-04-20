package myProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import myProject.model.DAO;
import myProject.model.Member;
import myProject.view.MembersView;

public class MembersController extends Controller implements ActionListener, MouseListener {
	MembersView membersView = new MembersView();
	public int selectedRow = -1;
	
	public MembersController() {
		membersView.btnMenu_Main.addActionListener(this);
		membersView.btnMenu_Members.addActionListener(this);
		membersView.btnMenu_Coupon.addActionListener(this);
		membersView.btnMenu_Sales.addActionListener(this);
		membersView.btnMenu_Admin.addActionListener(this);
		membersView.btnMenu_Logout.addActionListener(this);
		membersView.btnMenu_Exit.addActionListener(this);
		
		membersView.btnMemAdd.addActionListener(this);
		membersView.btnMemDel.addActionListener(this);
		membersView.btnMemUpd.addActionListener(this);
		
		membersView.table.addMouseListener(this);
		
		listRefresh();
	}

	public void listRefresh() {
		Vector<Vector> memberList = DAO.getInstance().membersSelectAll();
		if(memberList != null) {
			while(membersView.dm.getRowCount() > 0) 
				membersView.dm.removeRow(0);
			for(Vector rowData : memberList) 
				membersView.dm.addRow(rowData);
		}
		membersView.textField_No.setText(String.valueOf(DAO.getInstance().memberCount()));
	}
	
	public Member insert() {
		Member member = new Member();
		member.setName(membersView.textField_Name.getText());
		member.setPhone(membersView.textField_Phone.getText());
		member.setFavorite(membersView.textField_Favorite.getText());
		member.setMileage(Integer.valueOf(membersView.textField_Mileage.getText()));
		member.setGrade((String)membersView.spinner.getValue());
		return member;
	}
	
	public void selectOne() {
		Member member = new Member();
		if(selectedRow != -1) {
			member = DAO.getInstance().membersSelect(selectedRow);
			membersView.textField_No.setText(String.valueOf(member.getNo()));
			membersView.textField_Name.setText(member.getName());
			membersView.textField_Phone.setText(member.getPhone());
			membersView.textField_Favorite.setText(member.getFavorite());
			membersView.textField_Mileage.setText(String.valueOf(member.getMileage()));
			membersView.spinner.setValue(member.getGrade());
		}else {
			JFrame tmpFrame = new JFrame();
			tmpFrame.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(tmpFrame, "Please select a row", "Fail", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			
			if(btn == membersView.btnMenu_Main) {
				membersView.setVisible(false);
				new MainController();
			}else if (btn == membersView.btnMenu_Members) {
				membersView.setVisible(false);
				new MembersController();
			}else if (btn == membersView.btnMenu_Coupon) {
				membersView.setVisible(false);
				new CouponController();
			}else if (btn == membersView.btnMenu_Sales) {
				membersView.setVisible(false);
				new SalesController();
			}else if (btn == membersView.btnMenu_Admin) {
				membersView.setVisible(false);
				new AdminController();
			}else if (btn == membersView.btnMenu_Logout) {
				membersView.setVisible(false);
				new LoginController();
			}else if (btn == membersView.btnMenu_Exit) {
				JFrame tmpFrame = new JFrame();//팝업창이 항상 위에 뜨게 하기 위한 더미프레임
				tmpFrame.setAlwaysOnTop(true);
				if (JOptionPane.showConfirmDialog(tmpFrame, "Are you sure you want to exit?", "Confirm"
						, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0); 
			}
			
			if(btn == membersView.btnMemAdd) {
				DAO.getInstance().membersInsert(insert());
				listRefresh();
			}else if(btn == membersView.btnMemDel) {
				DAO.getInstance().membersDelete(selectedRow);
				listRefresh();
			}else if(btn == membersView.btnMemUpd) {
				DAO.getInstance().membersUpdate(selectedRow, insert());
				listRefresh();
			}
		}
	}
	
	public void mouseClicked(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}
	
	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {
		tableMouseRelesed(e);
	}
	
	public void mouseReleased(MouseEvent e) {}
	
	private void tableMouseRelesed(MouseEvent e) {
		selectedRow = membersView.table.getSelectedRow() +1;
		selectOne();
	}
}
