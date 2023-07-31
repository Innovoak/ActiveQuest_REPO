package com.innovoak.activequest.repo.user;

import com.innovoak.apps.activequest.model.user.Friend;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FriendRepositoryServlet
 */
@WebServlet("/friend")
public class FriendRepositoryServlet extends DatabaseRepositoryServlet<Friend> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public FriendRepositoryServlet() {
		super(Friend.class);
	}

}
