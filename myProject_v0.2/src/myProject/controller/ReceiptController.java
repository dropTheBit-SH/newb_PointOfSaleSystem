package myProject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import myProject.view.ReceiptView;
/*

       영수증
------------------------
총 	10,000원
할인	1,000원
결제금액	9,000원

마일리지	2,200원
현금결제	800원
카드결제	6,000원

적립예정금 200원
------------------------
20/04/20 15:53:02
 */
public class ReceiptController implements ActionListener{
	ReceiptView receiptView = new ReceiptView();
	
	public ReceiptController(){
		receiptView.btn_p1_1.addActionListener(this);
		receiptView.btn_p1_2.addActionListener(this);
		receiptView.btn_p2_1.addActionListener(this);
		receiptView.btn_p2_2.addActionListener(this);
		receiptView.btn_p2_3.addActionListener(this);
		receiptView.btn_p3_3.addActionListener(this);
		
		receiptView.btn_pd.addActionListener(this);
		receiptView.btn_mile.addActionListener(this);
		receiptView.btn_useMile1.addActionListener(this);
		receiptView.btn_useMile2.addActionListener(this);
		receiptView.btn_payBoth.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();

			if(btn == receiptView.btn_p1_1) {
				receiptView.cl.show(receiptView.panelLeft, "discount");
			}else if(btn == receiptView.btn_p1_2) {
				receiptView.cl.show(receiptView.panelLeft, "page2");
			}else if(btn == receiptView.btn_p2_1) {	
				receiptView.cl.show(receiptView.panelLeft, "earnMileage");
			}else if(btn == receiptView.btn_p2_2) {	
				receiptView.cl.show(receiptView.panelLeft, "useMileage");
			}else if(btn == receiptView.btn_p2_3) {		
				receiptView.cl.next(receiptView.panelLeft);
			}else if(btn == receiptView.btn_p3_1) {		
			}else if(btn == receiptView.btn_p3_1) {		
			}else if(btn == receiptView.btn_p3_3) {	
				receiptView.cl.show(receiptView.panelLeft, "payBoth");
			}else if(btn == receiptView.btn_pd) {
				receiptView.cl.show(receiptView.panelLeft, "page2");
			}else if(btn == receiptView.btn_mile) {
				receiptView.cl.show(receiptView.panelLeft, "page3");
			}else if(btn == receiptView.btn_useMile2) {
				receiptView.cl.show(receiptView.panelLeft, "page3");
			}
		}
	}
}
