package com.innovoak.activequest.repo.db.workout;
import com.innovoak.apps.activequest.model.workout.WorkoutSet;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class WorkoutSetDatabaseRepository extends DatabaseRepository<WorkoutSet>{

	public WorkoutSetDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected WorkoutSet newInstance() throws Exception {
		return new WorkoutSet();
	}
	

}
