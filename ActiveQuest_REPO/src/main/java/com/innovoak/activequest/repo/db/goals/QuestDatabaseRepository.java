package com.innovoak.activequest.repo.db.goals;

import com.innovoak.apps.activequest.model.goals.Quest;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class QuestDatabaseRepository extends DatabaseRepository<Quest> {

	public QuestDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected Quest newInstance() throws Exception {
		return new Quest();
	}

}
