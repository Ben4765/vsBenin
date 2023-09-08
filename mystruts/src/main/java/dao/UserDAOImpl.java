package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ConnectionUtility;

import dto.UserData;

public class UserDAOImpl implements UserDAOInter {
	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
	static {
		try {
			con = ConnectionUtility.getConnection();
			ps = con.prepareStatement("select * from userdetails");
			rs = ps.executeQuery();
		} catch (Exception e) {}
		
	}

	@Override
	public String valid(String name, String pass) throws SQLException {
		String userName = null;
		String password = null;
		if(rs.next()) {
			userName = rs.getString("uname");
			password = rs.getString("upass");
		}
		if (userName.equals(name)) {
			if(password.equals(pass))
				return "login.success";
			else{
				con.close();
				return"login.incorrect";
			}

		} else {
			con.close();
			return "login.register";
		}
		
	}

	@Override
	public void create(UserData user) throws SQLException {
		ps =con.prepareStatement("insert into table userdetails values ?,?");
		ps.setString(1, user.getuName());
		ps.setString(2, user.getuPass());
		ps.execute();
		con.close();

	}

	@Override
	public void setActivity(int i) {
		// TODO Auto-generated method stub

	}

}
