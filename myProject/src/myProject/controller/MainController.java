package myProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.SingleSelectionModel;
import javax.swing.event.MenuEvent;

import myProject.model.DAO;
import myProject.view.MainView;

public class MainController extends Controller implements ActionListener, MouseListener{
	MainView mainView = new MainView();
	public int selectedRow = -1;

	public MainController() {
		mainView.btnMenu_Main.addActionListener(this);
		mainView.btnMenu_Members.addActionListener(this);
		mainView.btnMenu_Coupon.addActionListener(this);
		mainView.btnMenu_Sales.addActionListener(this);
		mainView.btnMenu_Option.addActionListener(this);
		mainView.btnMenu_Logout.addActionListener(this);
		mainView.btnMenu_Exit.addActionListener(this);
		
		mainView.btnMenu1_1.addActionListener(this);
		mainView.btnMenu1_2.addActionListener(this);
		mainView.btnMenu1_3.addActionListener(this);
		mainView.btnMenu1_4.addActionListener(this);
		mainView.btnMenu1_5.addActionListener(this);
		mainView.btnMenu1_6.addActionListener(this);
		mainView.btnMenu1_7.addActionListener(this);
		mainView.btnMenu1_8.addActionListener(this);
		mainView.btnMenu1_9.addActionListener(this);
		mainView.btnMenu1_10.addActionListener(this);
		mainView.btnMenu2_1.addActionListener(this);
		mainView.btnMenu2_2.addActionListener(this);
		mainView.btnMenu2_3.addActionListener(this);
		mainView.btnMenu2_4.addActionListener(this);
		mainView.btnMenu2_6.addActionListener(this);
		mainView.btnMenu2_7.addActionListener(this);
		mainView.btnMenu3_1.addActionListener(this);
		mainView.btnMenu3_2.addActionListener(this);
		mainView.btnMenu3_3.addActionListener(this);
		mainView.btnMenu3_4.addActionListener(this);
		mainView.btnMenu3_6.addActionListener(this);
		mainView.btnMenu3_7.addActionListener(this);
		mainView.btnMenu3_11.addActionListener(this);
		
		mainView.btnNumPlu1.addActionListener(this);
		mainView.btnNumPlu5.addActionListener(this);
		mainView.btnNumPlu10.addActionListener(this);
		mainView.btnNumMin1.addActionListener(this);
		mainView.btnNumMin5.addActionListener(this);
		mainView.btnNumMin10.addActionListener(this);
		
		mainView.btnPayCard.addActionListener(this);
		mainView.btnPayCash.addActionListener(this);
		mainView.btnPayCoupon.addActionListener(this);
		mainView.btnPayReceipt.addActionListener(this);
		
		mainView.table.addMouseListener(this);
		
		listRefresh();
	}
	
	public void listRefresh() {
		Vector<Vector> cartList = DAO.getInstance().cartSelectAll();
		if(cartList != null) {
			while(mainView.dm.getRowCount() > 0) 
				mainView.dm.removeRow(0);
			for(Vector rowData : cartList) 
				mainView.dm.addRow(rowData);
		}
		mainView.lblTotal.setText(DAO.getInstance().moneyType((DAO.getInstance().cartSum())));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			
			if(btn == mainView.btnMenu_Main) {
				mainView.setVisible(false);
				new MainController();
			}else if (btn == mainView.btnMenu_Members) {
				mainView.setVisible(false);
				new MembersController();
			}else if (btn == mainView.btnMenu_Coupon) {
				mainView.setVisible(false);
				new CouponController();
			}else if (btn == mainView.btnMenu_Sales) {
				mainView.setVisible(false);
				new SalesController();
			}else if (btn == mainView.btnMenu_Option) {
				mainView.setVisible(false);
				new OptionController();
			}else if (btn == mainView.btnMenu_Logout) {
				mainView.setVisible(false);
				new LoginController();
			}else if (btn == mainView.btnMenu_Exit) {
				JFrame tmpFrame = new JFrame();//팝업창이 항상 위에 뜨게 하기 위한 더미프레임
				tmpFrame.setAlwaysOnTop(true);
				if (JOptionPane.showConfirmDialog(tmpFrame, "Are you sure you want to exit?", "Confirm"
						, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0); 
			}
			while(true) {
				if(btn == mainView.btnMenu1_1) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_1.getText());
				}else if(btn == mainView.btnMenu1_2) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_2.getText());
				}else if(btn == mainView.btnMenu1_3) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_3.getText());
				}else if(btn == mainView.btnMenu1_4) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_4.getText());
				}else if(btn == mainView.btnMenu1_5) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_5.getText());
				}else if(btn == mainView.btnMenu1_6) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_6.getText());
				}else if(btn == mainView.btnMenu1_7) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_7.getText());
				}else if(btn == mainView.btnMenu1_8) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_8.getText());
				}else if(btn == mainView.btnMenu1_9) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_9.getText());
				}else if(btn == mainView.btnMenu1_10) {
					DAO.getInstance().cartInsert(mainView.btnMenu1_10.getText());
				}else if(btn == mainView.btnMenu2_1) {
					DAO.getInstance().cartInsert(mainView.btnMenu2_1.getText());
				}else if(btn == mainView.btnMenu2_2) {
					DAO.getInstance().cartInsert(mainView.btnMenu2_2.getText());
				}else if(btn == mainView.btnMenu2_3) {
					DAO.getInstance().cartInsert(mainView.btnMenu2_3.getText());
				}else if(btn == mainView.btnMenu2_4) {
					DAO.getInstance().cartInsert(mainView.btnMenu2_4.getText());
				}else if(btn == mainView.btnMenu2_6) {
					DAO.getInstance().cartInsert(mainView.btnMenu2_6.getText());
				}else if(btn == mainView.btnMenu2_7) {
					DAO.getInstance().cartInsert(mainView.btnMenu2_7.getText());
				}else if(btn == mainView.btnMenu3_1) {
					DAO.getInstance().cartInsert(mainView.btnMenu3_1.getText());
				}else if(btn == mainView.btnMenu3_2) {
					DAO.getInstance().cartInsert(mainView.btnMenu3_2.getText());
				}else if(btn == mainView.btnMenu3_3) {
					DAO.getInstance().cartInsert(mainView.btnMenu3_3.getText());
				}else if(btn == mainView.btnMenu3_4) {
					DAO.getInstance().cartInsert(mainView.btnMenu3_4.getText());
				}else if(btn == mainView.btnMenu3_6) {
					DAO.getInstance().cartInsert(mainView.btnMenu3_6.getText());
				}else if(btn == mainView.btnMenu3_7) {
					DAO.getInstance().cartInsert(mainView.btnMenu3_7.getText());
				}else if(btn == mainView.btnMenu3_11) {
					DAO.getInstance().cartInsert(mainView.btnMenu3_11.getText());
				}
				listRefresh();
				break;
			}
			while(true) {
				if(btn == mainView.btnNumPlu1) {
					DAO.getInstance().changeQuantity(+1, selectedRow);
				}else if(btn == mainView.btnNumPlu5) {
					DAO.getInstance().changeQuantity(+5, selectedRow);
				}else if(btn == mainView.btnNumPlu10) {
					DAO.getInstance().changeQuantity(+10, selectedRow);
				}else if(btn == mainView.btnNumMin1) {
					DAO.getInstance().changeQuantity(-1, selectedRow);
				}else if(btn == mainView.btnNumMin5) {
					DAO.getInstance().changeQuantity(-5, selectedRow);
				}else if(btn == mainView.btnNumMin10) {
					DAO.getInstance().changeQuantity(-10, selectedRow);
				}
				listRefresh();
				break;	
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
		selectedRow = mainView.table.getSelectedRow() +1;
	}
}

