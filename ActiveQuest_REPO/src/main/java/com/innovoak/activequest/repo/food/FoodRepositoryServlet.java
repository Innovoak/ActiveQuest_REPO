package com.innovoak.activequest.repo.food;

import com.innovoak.apps.activequest.model.food.Food;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

@WebServlet("/food")
public class FoodRepositoryServlet  extends DatabaseRepositoryServlet<Food> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FoodRepositoryServlet() {
		super(Food.class);
	}

}
