package com.innovoak.activequest.repo.misc;

import com.innovoak.apps.activequest.model.misc.GroupChat;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;


@WebServlet("/group-chat")
public class GroupChatRepositoryServlet extends DatabaseRepositoryServlet<GroupChat> {
	private static final long serialVersionUID = 1L;

	public GroupChatRepositoryServlet() {
		super(GroupChat.class);
	}
}
