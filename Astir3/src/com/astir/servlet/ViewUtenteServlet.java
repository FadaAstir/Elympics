package com.astir.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.astir.bean.Utente;

/**
 * Servlet implementation class ViewUtenteServlet
 */
@WebServlet("/view")
public class ViewUtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Utente u = (Utente) request.getSession().getAttribute("utente");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter w = response.getWriter();
		
		w.append("<b>PRofilo utente</p>");
		
		if (u != null) {
			
			w.append("<table border=\"1\" style=\"background-color:red;\">"); 
	
			w.append("<tr><td>username</td>"   + "<td>" + u.getUsername()  + "</td>");
	
			w.append("<tr><td>nome</td>"   + "<td>" + u.getNome()  + "</td>");
			w.append("<tr><td>cognome</td>"   + "<td>" + u.getCognome()  + "</td>");
			
			w.append("</table>");		
			
			w.append("<a href=\"http://localhost:8080/Astir3/logout\">logout</a>");
			

		} else {
			w.append("<p>utente non in sessione, contenuto riservato agli utenti registrati</p>");		
			
			w.append("<a href=\"http://localhost:8080/Astir3/loginCss.jsp\">login</a>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
