package com.innovoak.activequest.repo.db.user;

import com.innovoak.apps.activequest.model.user.Authentication;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class AuthenticationDatabaseRepository extends DatabaseRepository<Authentication> {

	public AuthenticationDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Authentication newInstance() throws Exception {
		return new Authentication();
	}
	
}
