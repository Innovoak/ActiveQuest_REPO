package com.innovoak.activequest.repo.db.food;

import com.innovoak.apps.activequest.model.food.FoodStats;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class FoodStatsDatabaseRepository extends DatabaseRepository<FoodStats> {

	public FoodStatsDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected FoodStats newInstance() throws Exception {
		return new FoodStats();
	}

}
