package myProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import myProject.view.SalesView;

public class SalesController extends Controller implements ActionListener {
	SalesView salesView = new SalesView();

	public SalesController() {
		salesView.btnMenu_Main.addActionListener(this);
		salesView.btnMenu_Members.addActionListener(this);
		salesView.btnMenu_Coupon.addActionListener(this);
		salesView.btnMenu_Sales.addActionListener(this);
		salesView.btnMenu_Option.addActionListener(this);
		salesView.btnMenu_Logout.addActionListener(this);
		salesView.btnMenu_Exit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			
			if(btn == salesView.btnMenu_Main) {
				salesView.setVisible(false);
				new MainController();
			}else if (btn == salesView.btnMenu_Members) {
				salesView.setVisible(false);
				new SalesController();
			}else if (btn == salesView.btnMenu_Coupon) {
				salesView.setVisible(false);
				new CouponController();
			}else if (btn == salesView.btnMenu_Sales) {
				salesView.setVisible(false);
				new SalesController();
			}else if (btn == salesView.btnMenu_Option) {
				salesView.setVisible(false);
				new OptionController();
			}else if (btn == salesView.btnMenu_Logout) {
				salesView.setVisible(false);
				new LoginController();
			}else if (btn == salesView.btnMenu_Exit) {
				JFrame tmpFrame = new JFrame();//팝업창이 항상 위에 뜨게 하기 위한 더미프레임
				tmpFrame.setAlwaysOnTop(true);
				if (JOptionPane.showConfirmDialog(tmpFrame, "Are you sure you want to exit?", "Confirm"
						, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0); 
			}
		}
	}
}
