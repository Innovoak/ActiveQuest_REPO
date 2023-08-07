package com.innovoak.activequest.repo.db.food;

import com.innovoak.apps.activequest.model.food.FoodServing;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class FoodServingDatabaseRepository extends DatabaseRepository<FoodServing> {

	public FoodServingDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected FoodServing newInstance() throws Exception {
		return new FoodServing();
	}

}
