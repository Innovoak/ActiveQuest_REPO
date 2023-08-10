package com.innovoak.activequest.repo.misc;

import com.innovoak.apps.activequest.model.misc.GroupChatMember;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;


@WebServlet("/group-chat-member")
public class GroupChatMemberRepositoryServlet extends DatabaseRepositoryServlet<GroupChatMember> {
	private static final long serialVersionUID = 1L;
	
	public GroupChatMemberRepositoryServlet() {
		super(GroupChatMember.class);
	}

}
