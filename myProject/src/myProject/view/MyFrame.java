package myProject.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public Color mycolor1 = new Color(255,255,255);
	public Color mycolor2 = new Color(255,90,0);
	public Color mycolor3 = new Color(121,54,81);
	public Color mycolor4 = new Color(132,201,192);
	public Color mycolor5 = new Color(242,208,145);
	public Color mycolor6 = new Color(51,51,51);
	public Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	public JPanel content;
	
	public MyFrame() {
		getContentPane().setLayout(null);
		content = (JPanel) getContentPane();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// 전체화면
//		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//		GraphicsDevice gd = ge.getDefaultScreenDevice();
//		setUndecorated(true);
//		gd.setFullScreenWindow(this);
		
		content.setBackground(mycolor1);
		setSize(dim.width, dim.height);
	}
}

class JPanelWithBackground extends JPanel {

	 private Image backgroundImage;

	 public JPanelWithBackground(String fileName) throws IOException {
		 backgroundImage = ImageIO.read(new File(fileName));
	 }

	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.drawImage(backgroundImage, 0, 0, null);
	 }
}


