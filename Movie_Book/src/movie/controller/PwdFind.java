package movie.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PwdFind extends JFrame implements ActionListener{
	
	JFrame f=new JFrame();
	JLabel title=new JLabel("비밀번호 찾기");
	JLabel id=new JLabel("아이디");
	JTextField idField = new JTextField(20);
	JLabel name=new JLabel("이름");
	JTextField nameField = new JTextField(20);
	JLabel phone=new JLabel("핸드폰 번호");
	JTextField phoneField = new JTextField(20);
	JLabel CertificationNumber=new JLabel("인증 번호");
	JTextField CertificationNumberField = new JTextField(20);
	
	JButton Btn01 = new JButton("비밀번호 찾기");
	JButton Btn02 = new JButton("인증 요청");
	JButton Btn03 = new JButton("인증 확인");

	
	public PwdFind() {
		Color BGColor = new Color(23, 28, 45);
		Color btnColor = new Color(37, 66, 82);
		
		setTitle("비밀번호 찾기");
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(BGColor);
		setLocationRelativeTo(null);
		
		//비밀번호 찾기
		setLayout(null);
		title.setFont(new Font("돋음",Font.BOLD,40));
		add(title).setBounds(290, 50, 300, 50);
		title.setForeground(Color.white);
		
		//이름
		name.setFont(new Font("견고딕",Font.BOLD,20));
		add(name).setBounds(150,150,300,50);
		add(nameField).setBounds(300,160,250,30);
		name.setForeground(Color.white);
		nameField.setFont(new Font("견고딕",Font.BOLD,20));
		
		//아이디
		id.setFont(new Font("견고딕",Font.BOLD,20));
		add(id).setBounds(150,230,300,50);
		add(idField).setBounds(300,240,250,30);
		id.setForeground(Color.white);
		idField.setFont(new Font("견고딕",Font.BOLD,20));
		
		//전화번호
		phone.setFont(new Font("견고딕",Font.BOLD,20));
		add(phone).setBounds(150,310,300,50);
		add(phoneField).setBounds(300,320,250,30);
		phone.setForeground(Color.white);
		phoneField.setFont(new Font("견고딕",Font.BOLD,20));
		
		//전화번호 인증 요청
		Btn03.setFont(new Font("견고딕",Font.BOLD,15));
		add(Btn03).setBounds(570,320,100,30);
		Btn03.setForeground(Color.white);
		Btn03.setBackground(btnColor);
		
		//인증번호
		CertificationNumber.setFont(new Font("견고딕",Font.BOLD,20));
		add(CertificationNumber).setBounds(150,390,300,50);
		add(CertificationNumberField).setBounds(300,400,250,30);
		CertificationNumber.setForeground(Color.white);
		CertificationNumberField.setFont(new Font("견고딕",Font.BOLD,20));
		
		//인증번호 인증 요청
		Btn02.setFont(new Font("돋음",Font.BOLD,15));
		add(Btn02).setBounds(570,400,100,30);
		Btn02.setForeground(Color.white);
		Btn02.setBackground(btnColor);
		
		//비밀번호 찾기 버튼
		Btn01.setFont(new Font("돋음",Font.BOLD,20));
		add(Btn01).setBounds(300,470,170,35);
		Btn01.setForeground(Color.white);
		Btn01.setBackground(btnColor);		
		
	}//생성자
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {		
		new PwdFind();
	}
}
