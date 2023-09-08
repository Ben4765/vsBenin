package dao;

import java.sql.SQLException;


import dto.UserData;

interface UserDAOInter {
	String valid(String name, String pass)throws SQLException;
	void create(UserData user)throws SQLException;
	void setActivity(int i);
	
}
