package com.innovoak.activequest.repo.avatar;

import com.innovoak.apps.activequest.model.avatar.Avatar;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GoalRepositoryServlet
 */
@WebServlet("/avatar")
public class AvatarRepositoryServlet  extends DatabaseRepositoryServlet<Avatar> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AvatarRepositoryServlet() {
		super(Avatar.class);
	}

}