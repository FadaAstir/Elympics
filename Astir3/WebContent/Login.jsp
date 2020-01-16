<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.astir.bean.Utente"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int contatore=0;%>
<%
Utente u = (Utente) request.getSession().getAttribute("utente");
if(u==null){%>
	<p>utente non loggato</p>
	<%
} 
else {
	contatore++;
%>


<p>utente loggato <%=u.getCognome()%> <%=u.getNome()%></p>i
<p>sono loggati: <%=contatore%> utenti</p>

<p>utente loggato ${utente.cognome} ${utente.nome}</p>
<p>sono loggati: ${contatore} utenti</p>
	<%
}
%>
<%=4+5%>
</body>
</html>