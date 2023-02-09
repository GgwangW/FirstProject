package movie.controller;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Receipt extends JFrame implements ActionListener {

	// 이미지
	Container cPane;
	// 로고
	ImageIcon LogoRicon; JLabel LogoR;
	ImageIcon banerRicon; JLabel banerR;

	public Receipt() {

		setTitle("영수증");
		setSize(344, 612);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 화면 가운데 출력시키기
		setResizable(false);
		
		getContentPane().setBackground(Color.white);

		// 이미지
		cPane = getContentPane();
		cPane.setLayout(null);

		// 로고
		LogoRicon = new ImageIcon("./images/logo/logoR.png");
		LogoR = new JLabel(LogoRicon);
		LogoR.setBounds(0, -260, getWidth(), getHeight());
		cPane.add(LogoR);

		banerRicon = new ImageIcon("./images/ex/banerR.png");
		banerR = new JLabel(banerRicon);
		banerR.setBounds(0, -315, getWidth(), getHeight());
		cPane.add(banerR);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 338, 583);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel booking = new JLabel("영화입장권");
		booking.setFont(new Font("돋움", Font.BOLD, 28));
		booking.setBounds(94, 100, 160, 45);
		panel.add(booking);

		// 예약한 시간 저장하기
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		String t= f.format(c.getTime()); // 현재날짜를 전달.

		JLabel timeLabel = new JLabel(t);
		timeLabel.setBounds(12, 193, 118, 15);
		panel.add(timeLabel);
		
		JLabel theatherLabel = new JLabel("MOVIE BOOK");
		theatherLabel.setBounds(12, 175, 160, 15);
		panel.add(theatherLabel);
		
		JLabel theatherLabel_1 = new JLabel("02-3673-5300");
		theatherLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		theatherLabel_1.setBounds(182, 175, 133, 15);
		panel.add(theatherLabel_1);

		JLabel label2 = new JLabel("영화관/POS: 2021-212");
		label2.setBounds(193, 193, 133, 15);
		panel.add(label2);

		JLabel lineLabel = new JLabel("===========================================");
		lineLabel.setBounds(12, 211, 314, 24);
		panel.add(lineLabel);

		JLabel lineLabel_1 = new JLabel("===========================================");
		lineLabel_1.setBounds(12, 502, 314, 24);
		panel.add(lineLabel_1);


		setVisible(true);


	}

	public static void main(String[] args) {
		new Receipt();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
