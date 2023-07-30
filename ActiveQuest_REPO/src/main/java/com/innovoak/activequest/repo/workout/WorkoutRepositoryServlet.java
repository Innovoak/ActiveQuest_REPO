package com.innovoak.activequest.repo.workout;

import javax.servlet.annotation.WebServlet;
import com.innovoak.apps.activequest.model.workout.Workout;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;

/**
 * Servlet implementation class WorkoutRepositoryServlet
 */
@WebServlet("/workout")
public class WorkoutRepositoryServlet extends DatabaseRepositoryServlet<Workout> {
	private static final long serialVersionUID = 1L;
       
    /**
     * Default Constructor
     */
    public WorkoutRepositoryServlet() {
        super(Workout.class);
    }


}
