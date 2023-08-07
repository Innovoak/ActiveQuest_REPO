package com.innovoak.activequest.repo.db.avatar;

import com.innovoak.apps.activequest.model.avatar.AvatarBottom;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class AvatarBottomDatabaseRepository extends DatabaseRepository<AvatarBottom> {

	public AvatarBottomDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected AvatarBottom newInstance() throws Exception {
		return new AvatarBottom();
	}

}
