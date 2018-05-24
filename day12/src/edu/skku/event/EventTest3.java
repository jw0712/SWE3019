package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest3 {
	Frame f;
	Button b;
	TextField tf;

	public EventTest3() {
		createGUI();
	}
	
	public void createGUI() {
		f=new Frame("Event Test");
		f.addWindowListener(new MyHandler3());
		b=new Button("버튼을 클릭해 주세요");
		
		//미완성이라 new가 안되니까 만드셈!
		ActionListener h = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("버튼이 클릭되었습니다");
			}
		};

		b.addActionListener(h);

		tf=new TextField();
		
		//f.setLayout(new FlowLayout()); 
		//default:BorderLayout
		
		f.add(b, "Center");
		f.add(tf, "South");
		f.setSize(300,300);
		f.setVisible(true);
	}

	
	public static void main(String[] args) {
		new EventTest3();
	}

	//ActionListener: Click, Enter Key에 반응
	
	class MyHandler3 implements WindowListener{
		public void windowOpened(WindowEvent e) {}
		public void windowClosing(WindowEvent e) {
			System.exit(0); //정상적으로 시스템 종료
			}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		
	}

}
