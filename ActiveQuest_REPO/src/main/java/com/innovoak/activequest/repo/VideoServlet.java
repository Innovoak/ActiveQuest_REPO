package com.innovoak.activequest.repo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VideoServlet
 */
@WebServlet("/VideoServlet")
public class VideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final String videoFileName = request.getParameter("videoFileName");
        
        final File videoFile = new File(getServletContext().getRealPath("/videos/" + videoFileName));

        final byte[] videoBytes = Files.readAllBytes(videoFile.toPath());

        response.setContentType("video/mp4");
        response.setContentLength(videoBytes.length);
        response.getOutputStream().write(videoBytes);

        response.getOutputStream().close();
    }
}
    
 