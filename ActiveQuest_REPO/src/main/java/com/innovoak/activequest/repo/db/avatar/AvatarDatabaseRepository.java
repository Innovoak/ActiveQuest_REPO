package com.innovoak.activequest.repo.db.avatar;

import com.innovoak.apps.activequest.model.avatar.Avatar;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class AvatarDatabaseRepository extends DatabaseRepository<Avatar> {

	public AvatarDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Avatar newInstance() throws Exception {
		return new Avatar();
	}

}
