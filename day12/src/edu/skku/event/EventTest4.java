package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest4 {
	Frame f;
	Button b;
	TextField tf;

	public EventTest4() {
		createGUI();
	}
	
	public void createGUI() {
		f=new Frame("Event Test");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); //정상적으로 시스템 종료
			}
		});
		b=new Button("버튼을 클릭해 주세요");
		


		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf.setText("버튼이 클릭되었습니다");
			}
		});

		tf=new TextField();
		
		//f.setLayout(new FlowLayout()); 
		//default:BorderLayout
		
		f.add(b, "Center");
		f.add(tf, "South");
		f.setSize(300,300);
		f.setVisible(true);
	}

	
	public static void main(String[] args) {
		new EventTest4();
	}

}
