package com.innovoak.activequest.repo.db.workout;
import com.innovoak.apps.activequest.model.workout.Workout;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class WorkoutDatabaseRepository extends DatabaseRepository<Workout>{

	public WorkoutDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Workout newInstance() throws Exception {
		return null;
	}
	

}
