package com.innovoak.activequest.repo.db.misc;

import com.innovoak.apps.activequest.model.misc.GroupChatMember;
import com.innovoak.util.webhelpers.data.DatabaseRepository;
import com.innovoak.util.webhelpers.data.DatabaseSession;

public class GroupChatMemberDatabaseRepository extends DatabaseRepository<GroupChatMember> {

	public GroupChatMemberDatabaseRepository(DatabaseSession session) {
		super(session);
		 
	}

	@Override
	protected GroupChatMember newInstance() throws Exception {
		return new GroupChatMember();
	}

}
