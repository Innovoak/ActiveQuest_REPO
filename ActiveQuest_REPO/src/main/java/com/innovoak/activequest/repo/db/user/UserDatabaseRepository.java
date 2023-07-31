package com.innovoak.activequest.repo.db.user;

import com.innovoak.apps.activequest.model.user.User;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class UserDatabaseRepository extends DatabaseRepository<User> {

	public UserDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected User newInstance() throws Exception {
		return new User();
	}
	
}
