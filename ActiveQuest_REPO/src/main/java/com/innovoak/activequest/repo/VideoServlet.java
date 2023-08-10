package com.innovoak.activequest.repo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.innovoak.util.webhelpers.Message;
import com.innovoak.util.webhelpers.Message.MessageBuilder;
import com.innovoak.util.webhelpers.server.MessageServlet;

/**
 * Servlet implementation class VideoServlet
 */
@WebServlet("/VideoServlet")
public class VideoServlet extends MessageServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public Message process(Message arg0) {
		//Get video file name from message
		String videoFileName = (String) arg0.getContent();
		
		// Create new message 
        Message message = new Message();
        
        //Find the video file's server location
        final File videoFile = new File(getServletContext().getRealPath("/videos/" + videoFileName));

        byte[] videoBytes;
		try {
			//Read the video file into a byte array
			videoBytes = Files.readAllBytes(videoFile.toPath());
			
			//Set message fields for success
		    message.setName("success");
		    message.setAction("success");
		    message.setContent(videoBytes);
		} catch (IOException e) {
			e.printStackTrace();
			
			//Set message fields for error
			message.setName("ERROR");
			message.setAction("ERROR");
			message.setDescription("Video not found");
			
		}
		//Return message
		return message;



	}

	
}
    
 