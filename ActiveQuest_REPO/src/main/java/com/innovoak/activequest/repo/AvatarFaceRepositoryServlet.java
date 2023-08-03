package com.innovoak.activequest.repo;

import com.innovoak.apps.activequest.model.avatar.AvatarFace;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GoalRepositoryServlet
 */
@WebServlet("/avatar_face")
public class AvatarFaceRepositoryServlet  extends DatabaseRepositoryServlet<AvatarFace> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AvatarFaceRepositoryServlet() {
		super(AvatarFace.class);
	}

}