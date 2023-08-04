package com.innovoak.activequest.repo.db.misc;

import com.innovoak.apps.activequest.model.misc.Message;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class MessageDatabaseRepository  extends DatabaseRepository<Message> {

	public MessageDatabaseRepository(DatabaseSession session) {
		super(session);
		
	}	
		@Override
		protected Message newInstance() throws Exception {
			return new Message();
	}

}

