package com.innovoak.activequest.repo.workout;

import javax.servlet.annotation.WebServlet;
import com.innovoak.apps.activequest.model.workout.Routine;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;
/**
 * Servlet implementation class RoutineRepositoryServlet
 */
@WebServlet("/routine")
public class RoutineRepositoryServlet extends DatabaseRepositoryServlet<Routine> {
	private static final long serialVersionUID = 1L;
       
    /**
     * Default Constructor
     */
    public RoutineRepositoryServlet() {
        super(Routine.class);
    }
}
