package com.innovoak.activequest.repo.goals;

import com.innovoak.apps.activequest.model.goals.Quest;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GoalRepositoryServlet
 */
@WebServlet("/goal")
public class QuestRepositoryServlet extends DatabaseRepositoryServlet<Quest> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public QuestRepositoryServlet() {
		super(Quest.class);
	}

}
