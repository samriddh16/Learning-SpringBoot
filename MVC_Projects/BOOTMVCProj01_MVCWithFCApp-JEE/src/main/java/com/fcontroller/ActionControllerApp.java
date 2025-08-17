package com.fcontroller;

import java.io.IOException;
import com.controller.HandlerApp;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/test/*")
public class ActionControllerApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HandlerApp controller;

	public void init(ServletConfig config) throws ServletException {
		controller = new HandlerApp();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Performing Navigation Management
		// LVN - Logical View Name
		String lvn = null;
		if (request.getRequestURI().endsWith("/wishMsg")) {
			lvn = controller.wishMsg(request);

		} else if (request.getRequestURI().endsWith("/locInfo")) {
			lvn = controller.locInfo(request);
		}

		// Performing View Management
		String targetPage = null;
		if (lvn.equalsIgnoreCase("WM")) {
			targetPage = "/Wish_Message.jsp";
		} else if (lvn.equalsIgnoreCase("LI")) {
			targetPage = "/Locale_Information.jsp";
		}

		// Performing Request Dispatching To Target Page
		RequestDispatcher rd = request.getRequestDispatcher(targetPage);
		rd.forward(request, response);

	}

}
