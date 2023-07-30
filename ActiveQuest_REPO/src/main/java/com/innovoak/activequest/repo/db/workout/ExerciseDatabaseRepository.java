package com.innovoak.activequest.repo.db.workout;
import com.innovoak.apps.activequest.model.workout.Exercise;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class ExerciseDatabaseRepository extends DatabaseRepository<Exercise>{

	public ExerciseDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Exercise newInstance() throws Exception {
		return new Exercise();
	}
	

}
