package com.innovoak.activequest.repo.workout;

import javax.servlet.annotation.WebServlet;
import com.innovoak.apps.activequest.model.workout.Exercise;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;

/**
 * Servlet implementation class ExerciseRepositoryServlet
 */
@WebServlet("/exercise")
public class ExerciseRepositoryServlet extends DatabaseRepositoryServlet<Exercise> {
	private static final long serialVersionUID = 1L;
       
    /**
     * Default Constructor
     */
    public ExerciseRepositoryServlet() {
        super(Exercise.class);
    }

}
