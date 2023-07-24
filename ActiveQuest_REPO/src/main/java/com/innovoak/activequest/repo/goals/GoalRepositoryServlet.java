package com.innovoak.activequest.repo.goals;

import com.innovoak.apps.activequest.model.goals.Goal;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GoalRepositoryServlet
 */
@WebServlet("/goal")
public class GoalRepositoryServlet extends DatabaseRepositoryServlet<Goal> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public GoalRepositoryServlet() {
		super(Goal.class);
	}

}
