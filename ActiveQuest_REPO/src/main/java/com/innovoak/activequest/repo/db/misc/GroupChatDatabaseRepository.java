package com.innovoak.activequest.repo.db.misc;

import com.innovoak.apps.activequest.model.misc.GroupChat;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class GroupChatDatabaseRepository extends DatabaseRepository<GroupChat> {

	public GroupChatDatabaseRepository(DatabaseSession session) {
		super(session);
		 
	}
	
	@Override
	protected GroupChat newInstance() throws Exception {
		return new GroupChat();
}

}
