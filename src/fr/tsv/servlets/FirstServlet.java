package fr.tsv.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tsv.beans.Hero;

public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	
		String hero = req.getParameter("hero");
		req.setAttribute("message", "Bye bye " + hero);
		
		
		Hero mori = new Hero ();
		
		mori.setNom("Jin");
		mori.setPrenom("Mori");
		mori.setGenius(true);
		
		req.setAttribute("mori", mori);
		
		this.dispatch("/WEB-INF/Hello.jsp", req, resp);
	}
	
	public void dispatch(String viewPath, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(viewPath).forward(req, resp);

	}

}
