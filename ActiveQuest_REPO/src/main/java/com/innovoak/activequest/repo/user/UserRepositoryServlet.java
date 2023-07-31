package com.innovoak.activequest.repo.user;

import com.innovoak.apps.activequest.model.user.User;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class UserRepositoryServlet
 */
@WebServlet("/user")
public class UserRepositoryServlet extends DatabaseRepositoryServlet<User> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public UserRepositoryServlet() {
		super(User.class);
	}

}
