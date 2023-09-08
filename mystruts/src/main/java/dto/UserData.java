package dto;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Objects;

import com.ConnectionUtility;

public class UserData implements Serializable{
	String uName,uPass;
	int flag;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "User [uName=" + uName + ", uPass=" + uPass + ", flag=" + flag + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(flag, uName, uPass);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserData other = (UserData) obj;
		return flag == other.flag && Objects.equals(uName, other.uName) && Objects.equals(uPass, other.uPass);
	}
	
	
	
	
}
