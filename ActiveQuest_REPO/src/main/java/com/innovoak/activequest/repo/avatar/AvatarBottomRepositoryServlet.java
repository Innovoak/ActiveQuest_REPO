package com.innovoak.activequest.repo.avatar;

import com.innovoak.apps.activequest.model.avatar.AvatarBottom;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GoalRepositoryServlet
 */
@WebServlet("/avatar_bottom")
public class AvatarBottomRepositoryServlet  extends DatabaseRepositoryServlet<AvatarBottom> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AvatarBottomRepositoryServlet() {
		super(AvatarBottom.class);
	}

}