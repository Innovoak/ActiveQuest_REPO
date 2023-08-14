package com.innovoak.activequest.repo;

import javax.servlet.annotation.WebServlet;

import com.innovoak.util.webhelpers.Message;
import com.innovoak.util.webhelpers.data.DatabaseService;
import com.innovoak.util.webhelpers.data.DatabaseSession;
import com.innovoak.util.webhelpers.data.Query;
import com.innovoak.util.webhelpers.data.query.SelectQuery;
import com.innovoak.util.webhelpers.server.MessageServlet;

@WebServlet("/query")
public class QueryServlet extends MessageServlet {

	@Override
	public Message process(Message arg0) {
		Query query = (Query) arg0.getContent();

		DatabaseService dataBase = DatabaseService.getInstance();
		try (DatabaseSession dataBaseSession = dataBase.createSession()) {
			query.execute(dataBaseSession);

			if (query instanceof SelectQuery) {
				SelectQuery selectQuery = (SelectQuery) query;
				Object results = selectQuery.getResult();
				return new Message("success", "success", "success", results);
			} else {
				return new Message("success", "success", "success", "sucess");
			}
		} catch (Exception e) {
			return new Message("Error", "Error", "Error", e.getClass().getSimpleName() + ": " + e.getMessage());
		}

	}

}
