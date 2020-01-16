package com.astir.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.astir.dao.UtenteDAO;
import com.astir.manager.UtenteManager;
import com.astir.bean.Utente;

@WebServlet("/check_login")
public class CheckLoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	int contatore = 0; 
	int numeroTentativi = 0; 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UtenteManager manager = new UtenteManager();
		Utente u = manager.getUtente(username, password);
	
		if (u==null){
			PrintWriter w = response.getWriter();
			response.setContentType("text/html; charset=UTF-8");			
			
			if (manager.existUsername(username)) {
				w.append("<b>Password errata, reinserire con attenzione max 3 tentativi!</p>");
				w.append("<b>numero di tentativi già effettuati: "+ numeroTentativi + "</p>");
				numeroTentativi++;
			}
			else {
				w.append("<b>Inserire nuovamente login e password!</p>");
			}
			
            if (numeroTentativi<=3) {
				w.append("<form");
				w.append(" action=\"http://localhost:8080/Astir3/check_login\">");
				w.append("<input type=\"text\" name=\"username\">");
				w.append("<input type=\"password\" name=\"password\">");
				w.append("<input type=\"submit\" value=\"invio POST\">");
				w.append("</form>");
            }
            else {
            	w.append("<b>Utenza bloccata (scrivere ad admin@astir3.com per rispistinare l'account)!</p>");
            	manager.bloccaUtente(username);
            }
		} 
		else {
			numeroTentativi=0;
			PrintWriter w = response.getWriter();
					
			response.setContentType("text/html; charset=UTF-8");
			w.append("<b>Elenco di tutti valori dell'header della HTTP</p>");
			w.append("<table border=\"1\" style=\"background-color:red;\">"); 
			
			String s = "";
			Enumeration<String> enums = request.getHeaderNames(); 
			String name = enums.nextElement(); 
			while(name!=null) {
				s = "<tr style=\"width:50%;\">"
				  +		"<td> Header:" + name +"</td>" 
			   	  +		"<td>" + request.getHeader(name) +"</td>"
				  +"</tr>"; 
				w.append(s);
				name = enums.nextElement();
			}
			
			w.append("<tr><td>ContextPath:</td>" + "<td>" + request.getContextPath()+ "</td>");
			w.append("<tr><td>LocalAdress:</td>" + "<td>" + request.getLocalAddr()  + "</td>");
			w.append("<tr><td>LocalName:</td>"   + "<td>" + request.getLocalName()  + "</td>");
			w.append("<tr><td>LocalPort:</td>"   + "<td>" + request.getLocalPort()  + "</td>");
			w.append("<tr><td>Method(GET/POST):</td>"   + "<td>" + request.getMethod()  + "</td>");
			
			w.append("<tr><td>contatore</td>"   + "<td>" + contatore++  + "</td>");
	
			w.append("<tr><td>username</td>"   + "<td>" + username  + "</td>");
			w.append("<tr><td>password</td>"   + "<td>" + password  + "</td>");
			w.append("<tr><td>nome</td>"   + "<td>" + u.getNome()  + "</td>");
			w.append("<tr><td>cognome</td>"   + "<td>" + u.getCognome()  + "</td>");
			
			w.append("</table>");
			
			w.append("<a href=\"http://localhost:8080/Astir3/view\">vedi profilo </a>");
			u.setUsername(username);
			request.getSession().setAttribute("utente",u);
		}
		}	
	
	    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    	PrintWriter w = res.getWriter();
			
			res.setContentType("text/html; charset=UTF-8");
			w.append("<p>Sei passato dalla POST</p>");
			
	    	this.doGet(req,res);
	    }
}
