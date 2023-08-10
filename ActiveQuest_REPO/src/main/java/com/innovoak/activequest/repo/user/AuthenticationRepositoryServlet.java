package com.innovoak.activequest.repo.user;

import com.innovoak.apps.activequest.model.user.Authentication;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class AuthenticationRepositoryServlet
 */
@WebServlet("/auth")
public class AuthenticationRepositoryServlet extends DatabaseRepositoryServlet<Authentication> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public AuthenticationRepositoryServlet() {
		super(Authentication.class);
	}

}
