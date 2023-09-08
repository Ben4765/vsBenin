package action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAOImpl;
import dto.UserData;

public class RegisterAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		UserDAOImpl userDetail= new UserDAOImpl();
		UserData user=new UserData();
		user.setuName(request.getParameter("uname"));
		user.setuPass(request.getParameter("upass"));
		user.setFlag(0);
		userDetail.create(user);
		return "action.LoginAction";
	}
}
