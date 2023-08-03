package com.innovoak.activequest.repo;

import com.innovoak.apps.activequest.model.nutrition.Food;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class foodDatabaseRepository extends DatabaseRepository<Food>{
	
	public foodDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Food newInstance() throws Exception {
		return new Food();
	}

}
