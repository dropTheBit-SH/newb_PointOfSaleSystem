package myProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.plaf.OptionPaneUI;

import myProject.model.DAO;
import myProject.view.CouponView;

public class CouponController extends Controller implements ActionListener {
	CouponView couponView = new CouponView();

	public CouponController() {
		couponView.btnMenu_Main.addActionListener(this);
		couponView.btnMenu_Members.addActionListener(this);
		couponView.btnMenu_Coupon.addActionListener(this);
		couponView.btnMenu_Sales.addActionListener(this);
		couponView.btnMenu_Admin.addActionListener(this);
		couponView.btnMenu_Logout.addActionListener(this);
		couponView.btnMenu_Exit.addActionListener(this);
		
		couponView.rdbtn1.addActionListener(this);
		couponView.rdbtn2.addActionListener(this);
		couponView.rdbtn3.addActionListener(this);
		
		couponView.btnCoupon.addActionListener(this);
		couponView.textName.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			
			if(btn == couponView.btnMenu_Main) {
				couponView.setVisible(false);
				new MainController();
			}else if (btn == couponView.btnMenu_Members) {
				couponView.setVisible(false);
				new MembersController();
			}else if (btn == couponView.btnMenu_Coupon) {
				couponView.setVisible(false);
				new CouponController();
			}else if (btn == couponView.btnMenu_Sales) {
				couponView.setVisible(false);
				new SalesController();
			}else if (btn == couponView.btnMenu_Admin) {
				couponView.setVisible(false);
				new AdminController();
			}else if (btn == couponView.btnMenu_Logout) {
				couponView.setVisible(false);
				new LoginController();
			}else if (btn == couponView.btnMenu_Exit) {
				JFrame tmpFrame = new JFrame();//팝업창이 항상 위에 뜨게 하기 위한 더미프레임
				tmpFrame.setAlwaysOnTop(true);
				if (JOptionPane.showConfirmDialog(tmpFrame, "Are you sure you want to exit?", "Confirm"
						, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
					System.exit(0); 
				}
			}
			
			if(btn == couponView.btnCoupon && couponView.btnCoupon.getText().equals("CREATE")){
				String memName = couponView.textName.getText();
				couponView.lblDear.setText("Dear. "+memName);
				couponView.lblExp.setText("Exp. "+DAO.getInstance().couponGetDate());
				couponView.lblCode.setText("Code. "+DAO.getInstance().couponGetCode());
				couponView.btnCoupon.setText("SEND");
			}else if(btn == couponView.btnCoupon && couponView.btnCoupon.getText().equals("SEND")){
				String memName = couponView.textName.getText();
				if(DAO.getInstance().checkMember(memName)){
					String memPhone = DAO.getInstance().getPhone(memName);
					String message = "Do you want to send the coupon? ["+memName+", "+memPhone+"]";
					JFrame tmpFrame = new JFrame();//팝업창이 항상 위에 뜨게 하기 위한 더미프레임
					tmpFrame.setAlwaysOnTop(true);
					if(JOptionPane.showConfirmDialog(tmpFrame, message, "Confirm"
							, JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
						JOptionPane.showMessageDialog(tmpFrame, "Complete");
						couponView.btnCoupon.setText("CREATE");
					}
				}
			}
		}
		if (e.getSource() instanceof JRadioButton) {
			JRadioButton btn = (JRadioButton) e.getSource();
			
			if(btn == couponView.rdbtn1) {
				couponView.labelCoupon.setText(couponView.rdbtn1.getText());
			} else if(btn == couponView.rdbtn2) {
				couponView.labelCoupon.setText(couponView.rdbtn2.getText());
			} else if(btn == couponView.rdbtn3) {
				couponView.labelCoupon.setText(couponView.rdbtn3.getText());
			}
		}
	}
}
