package com.innovoak.activequest.repo.workout;

import javax.servlet.annotation.WebServlet;
import com.innovoak.apps.activequest.model.workout.WorkoutSet;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;

/**
 * Servlet implementation class WorkoutRepositoryServlet
 */
@WebServlet("/workout-set")
public class WorkoutSetRepositoryServlet extends DatabaseRepositoryServlet<WorkoutSet> {
	private static final long serialVersionUID = 1L;
       
    /**
     * Default Constructor
     */
    public WorkoutSetRepositoryServlet() {
        super(WorkoutSet.class);
    }


}
