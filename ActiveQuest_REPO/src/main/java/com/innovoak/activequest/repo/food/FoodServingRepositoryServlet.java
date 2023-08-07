package com.innovoak.activequest.repo.food;

import com.innovoak.apps.activequest.model.food.FoodServing;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;


@WebServlet("/food-serving")
public class FoodServingRepositoryServlet  extends DatabaseRepositoryServlet<FoodServing> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FoodServingRepositoryServlet() {
		super(FoodServing.class);
	}

}