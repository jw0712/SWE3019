package edu.skku.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class UITest {
	public static void main(String[] args) {
		Button b1 = new Button("ok1");
		Label b2 = new Label("ok2");
		TextField b3 = new TextField("ok3");
		Frame f=new Frame("Test");
		f.add(b1);//frame + button
		f.add(b2);
		f.add(b3);
		f.setLayout(new FlowLayout()); //layout change. 가운데 정렬
		
		//Showing. 보여주기
		f.setSize(300,200); //가로,세로
		f.setVisible(true);
		

	}

}
