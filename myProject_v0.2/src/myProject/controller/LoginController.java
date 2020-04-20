package myProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import myProject.model.DAO;
import myProject.view.LoginView;

public class LoginController extends Controller implements ActionListener {
	LoginView loginView = new LoginView();
	
	public LoginController(){
		loginView.btnExit.addActionListener(this);
		loginView.btnLogin.addActionListener(this);
		loginView.chckbxID.addActionListener(this);
		loginView.chckbxPW.addActionListener(this);
		if(DAO.getInstance().logInfoFile.exists()){
			String[] logInfo = DAO.getInstance().adminSetInfo();
			loginView.textField.setText(logInfo[0]);
			loginView.passwordField.setText(logInfo[1]);
		}
	}
	
	@Override
	public void service(String btn) {
		switch (btn) {
		case "exit": System.exit(0); break;
			
		case "login":
			String id = loginView.textField.getText();
			@SuppressWarnings("all") String pw = loginView.passwordField.getText();
			
			//로그인 버튼 눌렸을 때 체크박스 상태에 따라 정보 기억
			boolean rememberID = loginView.chckbxID.isSelected();
			boolean rememberPW = loginView.chckbxPW.isSelected();
			JSONObject logInfo = new JSONObject();
			if(rememberID || rememberPW) {
				if(rememberID && rememberPW) {
					logInfo.put("ID", id);
					logInfo.put("PW", pw);
				}else if(rememberID) {
					logInfo.put("ID", id);
					logInfo.put("PW", "");
				}
			}else {
				logInfo.put("ID", "");
				logInfo.put("PW", "");
			}
			DAO.getInstance().adminRemeberInfo(logInfo);
			
			//id, pw 확인
			if(resultCheckAdmin(id, pw)) {
				loginView.setVisible(false);
				new MainController();
			}else {
				JFrame tmpFrame = new JFrame();//팝업창이 항상 위에 뜨게 하기 위한 더미프레임
				tmpFrame.setAlwaysOnTop(true);
				JOptionPane.showMessageDialog(tmpFrame, "wrong", "Fail", JOptionPane.ERROR_MESSAGE);
			}
			break;
		}
	}

	//id, pw 확인
	public boolean resultCheckAdmin(String id, String pw) { 
		if(DAO.getInstance().adminLogin(id, pw)==true) return true;
		else return false;
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JCheckBox) { //pw만 체크되지 않도록 제어
			JCheckBox ckbx = (JCheckBox) e.getSource();
			if(ckbx == loginView.chckbxPW){
				if(!loginView.chckbxID.isSelected())
					loginView.chckbxID.setSelected(true);
			}else if(ckbx == loginView.chckbxID) {
				if(loginView.chckbxPW.isSelected())
					loginView.chckbxPW.setSelected(false);
			}
		}
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			if (btn == loginView.btnExit) {
				if (JOptionPane.showConfirmDialog(loginView.btnExit, "Are you sure you want to exit?", "Confirm"
						, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					service("exit");
			} else if (btn == loginView.btnLogin) {
				service("login");
			} 
		}

	}
}
