package com.innovoak.activequest.repo.food;

import com.innovoak.apps.activequest.model.food.FoodStats;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GoalRepositoryServlet
 */
@WebServlet("/food-stats")
public class FoodStatsRepositoryServlet  extends DatabaseRepositoryServlet<FoodStats> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FoodStatsRepositoryServlet() {
		super(FoodStats.class);
	}

}