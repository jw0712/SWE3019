package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest1 {
	Frame f;
	Button b;
	TextField tf;

	public EventTest1() {
		createGUI();
	}
	
	public void createGUI() {
		f=new Frame("Event Test");
		f.addWindowListener(new MyHandler3());
		b=new Button("��ư�� �����ּ���");
		b.addActionListener(new MyHandler());

		tf=new TextField();
		
		//f.setLayout(new FlowLayout()); 
		//default:BorderLayout
		
		f.add(b, "Center");
		f.add(tf, "South");
		f.setSize(300,300);
		f.setVisible(true);
	}

	
	public static void main(String[] args) {
		new EventTest1();
	}
	
	class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			tf.setText("��ư�� ���Ƚ��ϴ�");
		}	
	}//ActionListener: Click, Enter Key�� ����
	
	class MyHandler3 implements WindowListener{
		public void windowOpened(WindowEvent e) {}
		public void windowClosing(WindowEvent e) {
			System.exit(0); //������ ����
			}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		
	}

}
