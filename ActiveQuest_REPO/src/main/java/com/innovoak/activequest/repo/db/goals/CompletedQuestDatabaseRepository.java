package com.innovoak.activequest.repo.db.goals;

import com.innovoak.apps.activequest.model.goals.CompletedQuest;
import com.innovoak.apps.activequest.model.goals.Quest;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class CompletedQuestDatabaseRepository extends DatabaseRepository<CompletedQuest> {

	public CompletedQuestDatabaseRepository(DatabaseSession session) {
		super(session);
	}

	@Override
	protected CompletedQuest newInstance() throws Exception {
		return new CompletedQuest();
	}

}
