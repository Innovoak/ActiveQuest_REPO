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
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ImageServletTest extends MessageServlet {
	private static final long serialVersionUID = 1L;

	
	
	
    /**
     * Default constructor. 
     * @return 
     */
    public ImageServletTest() {
    	
    	
    }
    		
	
    @Override
	public Message process(Message arg0) {
		 
		return null;
	}



}