package myProject.view;

import java.awt.GridLayout;
import javax.swing.JPanel;

public class SalesView extends View {

	public SalesView() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 122, 1920, 958);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
	}

}
