package com.innovoak.activequest.repo.misc;

import com.innovoak.apps.activequest.model.misc.Message;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Message")
public class MessageRepositoryServlet extends DatabaseRepositoryServlet<Message> {

	private static final long serialVersionUID = 1L;
	
	public MessageRepositoryServlet() {
		super(Message.class);
	}

}
