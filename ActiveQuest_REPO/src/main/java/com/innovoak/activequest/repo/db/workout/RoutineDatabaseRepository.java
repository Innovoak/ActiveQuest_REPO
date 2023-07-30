package com.innovoak.activequest.repo.db.workout;
import com.innovoak.apps.activequest.model.workout.Routine;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class RoutineDatabaseRepository extends DatabaseRepository<Routine>{

	public RoutineDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Routine newInstance() throws Exception {
		return new Routine(); 
	}

}
