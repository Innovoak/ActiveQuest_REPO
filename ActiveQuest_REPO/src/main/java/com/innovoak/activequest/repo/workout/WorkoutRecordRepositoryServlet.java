package com.innovoak.activequest.repo.workout;

import javax.servlet.annotation.WebServlet;
import com.innovoak.apps.activequest.model.workout.WorkoutRecord;
import com.innovoak.util.webhelpers.server.DatabaseRepositoryServlet;

/**
 * Servlet implementation class WorkoutRepositoryServlet
 */
@WebServlet("/workout-record")
public class WorkoutRecordRepositoryServlet extends DatabaseRepositoryServlet<WorkoutRecord> {
	private static final long serialVersionUID = 1L;
       
    /**
     * Default Constructor
     */
    public WorkoutRecordRepositoryServlet() {
        super(WorkoutRecord.class);
    }


}
