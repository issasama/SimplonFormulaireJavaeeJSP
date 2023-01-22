<%-- 
    Document   : reponse
    Created on : 22 janv. 2023, 11:48:12
    Author     : ISSA SAMAKE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String NOM=request.getParameter("nom");
        String PRENOM=request.getParameter("prenom");
        String TEL=request.getParameter("tel");
        String MAIL=request.getParameter("mail");
        
        %>
        <body>
            <form>
			<table align="center">
				<tr>
					<td align="right">Nom : </td>
                                        <td><% out.println(NOM); %></td>
				</tr>
				<tr>
					<td align="right">Preom : </td>
					<td><% out.println(PRENOM); %></td>
				</tr>
				<tr>
					<td align="right">Telephone : </td>
					<td><% out.println(TEL); %></td>
				</tr>
				<tr>
					<td align="right">Email : </td>
					<td><% out.println(MAIL); %></td>
				</tr>
                                <p align="center"><em>Vous etes bien enregistré !</em></p>
				
			</table>
		</form>
        </body>
</html>

