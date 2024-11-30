package net.yassine.jeetp3part1ex2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/UtilisateurNonValide")
public class UtilisateurNonValide extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = (String) request.getAttribute("login");
        String password = (String) request.getAttribute("password");

        response.setContentType("text/html");
        response.getWriter().println("<h2>Echec d'identification : Vous avez saisi le login \""
                + login + "\" et le mot de passe \"" + password + "\"</h2>");
        response.getWriter().println("<a href=\"identification.html\">Retour à la page d'identification</a>");
    }
}