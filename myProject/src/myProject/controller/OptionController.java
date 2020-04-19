package myProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import myProject.view.OptionView;

public class OptionController extends Controller implements ActionListener {
	OptionView optionView = new OptionView();

	public OptionController() {
		optionView.btnMenu_Main.addActionListener(this);
		optionView.btnMenu_Members.addActionListener(this);
		optionView.btnMenu_Coupon.addActionListener(this);
		optionView.btnMenu_Sales.addActionListener(this);
		optionView.btnMenu_Option.addActionListener(this);
		optionView.btnMenu_Logout.addActionListener(this);
		optionView.btnMenu_Exit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			
			if(btn == optionView.btnMenu_Main) {
				optionView.setVisible(false);
				new MainController();
			}else if (btn == optionView.btnMenu_Members) {
				optionView.setVisible(false);
				new OptionController();
			}else if (btn == optionView.btnMenu_Coupon) {
				optionView.setVisible(false);
				new CouponController();
			}else if (btn == optionView.btnMenu_Sales) {
				optionView.setVisible(false);
				new SalesController();
			}else if (btn == optionView.btnMenu_Option) {
				optionView.setVisible(false);
				new OptionController();
			}else if (btn == optionView.btnMenu_Logout) {
				optionView.setVisible(false);
				new LoginController();
			}else if (btn == optionView.btnMenu_Exit) {
				JFrame tmpFrame = new JFrame();//팝업창이 항상 위에 뜨게 하기 위한 더미프레임
				tmpFrame.setAlwaysOnTop(true);
				if (JOptionPane.showConfirmDialog(tmpFrame, "Are you sure you want to exit?", "Confirm"
						, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0); 
			}
		}
	}
}
