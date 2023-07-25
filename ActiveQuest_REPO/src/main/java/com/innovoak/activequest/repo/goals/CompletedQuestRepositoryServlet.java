package com.innovoak.activequest.repo.goals;

import com.innovoak.apps.activequest.model.goals.CompletedQuest;
import com.innovoak.apps.activequest.model.goals.Quest;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GoalRepositoryServlet
 */
@WebServlet("/completed-quest")
public class CompletedQuestRepositoryServlet extends DatabaseRepositoryServlet<CompletedQuest> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CompletedQuestRepositoryServlet() {
		super(CompletedQuest.class);
	}

}
