package com.innovoak.activequest.repo.db.food;

import com.innovoak.apps.activequest.model.food.Food;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class FoodDatabaseRepository extends DatabaseRepository<Food> {

	public FoodDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Food newInstance() throws Exception {
		return new Food();
	}

}
