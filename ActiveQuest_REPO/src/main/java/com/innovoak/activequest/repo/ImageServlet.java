package com.innovoak.activequest.repo;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.innovoak.util.webhelpers.Message;
import com.innovoak.util.webhelpers.server.MessageServlet;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JFrame;

/**
 * Servlet implementation class ImageServlet
 */
@WebServlet("/image")
public class ImageServlet extends MessageServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 * 
	 * @return
	 */
	public ImageServlet() {

	}

	@Override
	public Message process(Message arg0) {

		// check whether the message action is to upload or download
		// 3 conditions: 1. upload, 2. download, 3. error => invalid

		if (arg0.getAction().equals("Upload")) {

			// First condition (Upload): Get binary data (content of message) in byte array

			byte[] bytes = (byte[]) arg0.getContent();

			// ImageIO => verify if proper image
			BufferedImage image;
			try {
				image = ImageIO.read(new ByteArrayInputStream(bytes));
			} catch (IOException e) {
				e.printStackTrace();
				e.getMessage();
				return new Message("Error", "Error", "Error", e.getMessage());

			}

			// Get File path: in description

			final File imageFile = new File(getServletContext().getRealPath("/image/" + arg0.getDescription()));

			// Get binary data and write it to file path on the server

			try {
				Files.write(imageFile.toPath(), bytes, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
			} catch (IOException e) {

				// catch (content on byte array, invalid message sent) & IO exception.
				e.printStackTrace();
				e.getMessage();
				return new Message("Error", "Error", "Error", e.getMessage());
			}

			// If successful then success message, if exception, catch exception: class
			return new Message("Success", "Success", "Success", "Success");

		}

		else if (arg0.getAction().equals("Download")) {

			// Second condition (download): Get the path in the description

			final File imageFile = new File(getServletContext().getRealPath("/image/" + arg0.getDescription()));

			final byte[] imageBytes;

			// Get the the image from the file (binary data = bytes)
			try {
				imageBytes = Files.readAllBytes(imageFile.toPath());

				// If any errors => send error message
			} catch (IOException e) {

				e.printStackTrace();
				e.getMessage();
				return new Message("Error", "Error", "Error", e.getMessage());
			}

			// Create message => content of message is the bytes (byte array) => success
			// Then return the message
			return new Message("Success", "Success", "Success", imageBytes);

		} else {

			return new Message("Invalid Image", "Invalid Image", "Invalid Image", "Invalid Image");

		}

	}

}