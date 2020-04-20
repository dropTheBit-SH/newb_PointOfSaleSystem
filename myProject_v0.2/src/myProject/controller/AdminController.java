package myProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import myProject.view.AdminView;

public class AdminController extends Controller implements ActionListener {
	AdminView adminView = new AdminView();

	public AdminController() {
		adminView.btnMenu_Main.addActionListener(this);
		adminView.btnMenu_Members.addActionListener(this);
		adminView.btnMenu_Coupon.addActionListener(this);
		adminView.btnMenu_Sales.addActionListener(this);
		adminView.btnMenu_Admin.addActionListener(this);
		adminView.btnMenu_Logout.addActionListener(this);
		adminView.btnMenu_Exit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();

			if (btn == adminView.btnMenu_Main) {
				adminView.setVisible(false);
				new MainController();
			} else if (btn == adminView.btnMenu_Members) {
				adminView.setVisible(false);
				new MembersController();
			} else if (btn == adminView.btnMenu_Coupon) {
				adminView.setVisible(false);
				new CouponController();
			} else if (btn == adminView.btnMenu_Sales) {
				adminView.setVisible(false);
				new SalesController();
			} else if (btn == adminView.btnMenu_Admin) {
				adminView.setVisible(false);
				new AdminController();
			} else if (btn == adminView.btnMenu_Logout) {
				adminView.setVisible(false);
				new LoginController();
			} else if (btn == adminView.btnMenu_Exit) {
				JFrame tmpFrame = new JFrame();// 팝업창이 항상 위에 뜨게 하기 위한 더미프레임
				tmpFrame.setAlwaysOnTop(true);
				if (JOptionPane.showConfirmDialog(tmpFrame, "Are you sure you want to exit?", "Confirm",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		}
	}
}
