package com.innovoak.activequest.repo.db.user;

import com.innovoak.apps.activequest.model.user.Friend;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class FriendDatabaseRepository extends DatabaseRepository<Friend> {

	public FriendDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Friend newInstance() throws Exception {
		return new Friend();
	}
	
}
