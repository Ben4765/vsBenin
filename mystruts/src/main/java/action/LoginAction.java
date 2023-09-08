package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAOImpl;

public class LoginAction extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		UserDAOImpl user = new UserDAOImpl();

		return user.valid(name, pass);

	}
}
