package movie.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import movie.dao.UserDAO;
import movie.dto.UserDTO;

public class IdFind extends JFrame implements ActionListener{

	JLabel title=new JLabel("아이디 찾기");
	JLabel name=new JLabel("이름");
	JTextField nameField = new JTextField(20);
	JLabel email=new JLabel("이메일");
	JTextField emailField = new JTextField(20);
	JLabel phone=new JLabel("핸드폰 번호");
	JTextField phoneField = new JTextField(20);

	JButton idBtn = new JButton("아이디 찾기");
	JButton pwdBtn = new JButton("비밀번호 찾기");

	public IdFind() {
		Color BGColor = new Color(23, 28, 45);
		Color btnColor = new Color(37, 66, 82);
		
		setTitle("아이디 찾기");
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(BGColor);
		setLocationRelativeTo(null);


		setLayout(null);
		title.setFont(new Font("돋음",Font.BOLD,40));
		add(title).setBounds(305, 50, 300, 50);
		title.setForeground(Color.white);

		//이름
		name.setFont(new Font("견고딕",Font.BOLD,20));
		add(name).setBounds(190,150,300,50);
		add(nameField).setBounds(320,160,300,30);
		name.setForeground(Color.white);
		nameField.setFont(new Font("견고딕",Font.BOLD,20));

		//생년월일
		email.setFont(new Font("견고딕",Font.BOLD,20));
		add(email).setBounds(190,250,300,50);
		add(emailField).setBounds(320,260,300,30);
		email.setForeground(Color.white);
		emailField.setFont(new Font("견고딕",Font.BOLD,20));

		//전화번호
		phone.setFont(new Font("견고딕",Font.BOLD,20));
		add(phone).setBounds(190,350,300,50);
		add(phoneField).setBounds(320,360,300,30);
		phone.setForeground(Color.white);
		phoneField.setFont(new Font("견고딕",Font.BOLD,20));

		//아이디 찾기 버튼
		idBtn.setFont(new Font("견고딕",Font.BOLD,20));
		add(idBtn).setBounds(190,470,170,30);//중앙  (350,400,170,30)
		idBtn.setForeground(Color.white);
		idBtn.setBackground(btnColor);

		//비밀번호 찾기 버튼
		pwdBtn.setFont(new Font("견고딕",Font.BOLD,20));
		add(pwdBtn).setBounds(450,470,170,30);
		pwdBtn.setForeground(Color.white);
		pwdBtn.setBackground(btnColor);



	}//생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		
		if(btn.equals("아이디 찾기")) {
			if(nameField.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "이름을 입력하세요.");
			}else if(emailField.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "이메일을 입력하세요.");
			}else if(phoneField.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "핸드폰 번호를 입력하세요.");
			}else {
				UserDTO userdto = new UserDTO();
				userdto.setUser_name(nameField.getText());
				userdto.setUser_email(emailField.getText());
				userdto.setUser_phone(phoneField.getText());
				
				UserDAO userdao = new UserDAO();
				int result=userdao.userIdFind(userdto);
				
				if(result > 0) {
					JOptionPane.showMessageDialog(this, "");
				}
			}
		}
	}

	public static void main(String[] args) {		
		new IdFind();
	}
}