package com.innovoak.activequest.repo.db.avatar;

import com.innovoak.apps.activequest.model.avatar.AvatarFace;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class AvatarFaceDatabaseRepository extends DatabaseRepository<AvatarFace> {

	public AvatarFaceDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected AvatarFace newInstance() throws Exception {
		return new AvatarFace();
	}

}
