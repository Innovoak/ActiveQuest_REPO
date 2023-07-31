package com.innovoak.activequest.repo.db.workout;
import com.innovoak.apps.activequest.model.workout.WorkoutRecord;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class WorkoutRecordDatabaseRepository extends DatabaseRepository<WorkoutRecord>{

	public WorkoutRecordDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected WorkoutRecord newInstance() throws Exception {
		return new WorkoutRecord();
	}
	

}
