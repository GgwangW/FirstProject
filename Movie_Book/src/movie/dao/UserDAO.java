package movie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import movie.dto.UserDTO;


public class UserDAO {

	String driver="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@192.168.104.105:1521:xe";
	String user="team2";
	String password="56789";

	Connection con=null; // DB연결
	PreparedStatement pt=null;//쿼리수행
	String sql=null;//쿼리저장
	ResultSet rs=null; // select 레코드검색후 저장

	public List<UserDTO> getidCheck(String user_id) {
		List<UserDTO> search = new ArrayList<>();

		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			sql="select user_id from userinfo where user_id=?";
			pt=con.prepareStatement(sql);
			pt.setString(1, user_id);
			rs=pt.executeQuery();
			while(rs.next()) {
				UserDTO id = new UserDTO();
				id.setUser_id(rs.getString(1));

				search.add(id);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return search;
	}// 중복확인

	public int userSign(UserDTO userdto) {
		int result=0; 

		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			sql="insert into userinfo values(?,?,?,?,?,?)";
			pt=con.prepareStatement(sql);
			pt.setString(1, userdto.getUser_id());
			pt.setString(2, userdto.getUser_name());
			pt.setString(3, userdto.getUser_pwd());
			pt.setString(4, userdto.getUser_phone());
			pt.setString(5, userdto.getUser_email());
			pt.setString(6, userdto.getUser_gender());

			result=pt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return result;
	} // 회원가입

	public List<UserDTO> userLogin(String id, String pwd) {
		List<UserDTO> search = new ArrayList<>();
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			sql="select User_ID,user_pwd from userinfo where User_ID=? and User_Pwd=?";
			pt=con.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pwd);
			rs=pt.executeQuery();
			while(rs.next()) {
				UserDTO login = new UserDTO();
				login.setUser_id(rs.getString(1));

				search.add(login);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return search;
	}// 로그인
	
	public List<UserDTO> getName(String user_id) {
		List<UserDTO> lst = new ArrayList<UserDTO>();
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			sql = "select user_name from userinfo where user_id =?";
			pt=con.prepareStatement(sql);
			pt.setString(1, user_id);
			
			rs = pt.executeQuery();
			while(rs.next()) {
				UserDTO vo = new UserDTO();
				vo.setUser_name(rs.getString(1));
				
				lst.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return lst;
	} // 메인페이지 우측 상단 이름변화
}
