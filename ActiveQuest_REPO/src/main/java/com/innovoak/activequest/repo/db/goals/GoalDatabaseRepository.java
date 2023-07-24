package com.innovoak.activequest.repo.db.goals;

import com.innovoak.apps.activequest.model.goals.Goal;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class GoalDatabaseRepository extends DatabaseRepository<Goal> {

	public GoalDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Goal newInstance() throws Exception {
		return new Goal();
	}

}
