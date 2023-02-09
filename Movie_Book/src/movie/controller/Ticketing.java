package movie.controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ticketing extends JFrame implements ActionListener {

	Color BGColor = new Color(23, 28, 45);
	Color back = new Color(37, 66, 82);
	
	JPanel p = new JPanel();
	String[] place = {" 지점선택 ", " 강남 ", " 노량진 ", " 종로 ", " 건대 "};
	String[] movie = {" 영화선택 ", " 아바타 ", " 바빌론 ", " 교섭 ", " 슬램덩크 "};
	String[] date = {" 날짜선택 ", " 2월 18일 ", " 2월 19일 ", " 2월 20일 ", " 2월 21일 "};
	String[] time = {" 시간선택 ", " 09:00 ~ 11:00 ", " 11:30 ~ 13:30 ", " 14:00 ~ 16:00 ", " 16:30 ~ 18:30 ", " 19:00 ~ 21:00 "};
	String[] count = {" 인원선택 ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 "};
	JComboBox placeCom = new JComboBox(place);
	JComboBox movieCom = new JComboBox(movie);
	JComboBox dateCom = new JComboBox(date);
	JComboBox timeCom = new JComboBox(time);
	JComboBox countCom = new JComboBox(count);
	
	public Ticketing() {
		
		p.setPreferredSize(new Dimension(1280, 40));
		p.setBackground(back);
		p.add(movieCom); p.add(placeCom); p.add(dateCom); p.add(timeCom); p.add(countCom);
		
		add(p, "North");
		
		
		setTitle("영화 예매");
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(BGColor);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ticketing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
