package com.innovoak.activequest.repo;

import com.innovoak.apps.activequest.model.avatar.AvatarTop;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;


@WebServlet("/avatar_top")
public class AvatarTopRepositoryServlet  extends DatabaseRepositoryServlet<AvatarTop> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AvatarTopRepositoryServlet() {
		super(AvatarTop.class);
	}

}