package net.yassine.jeetp3part1ex2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/UtilisateurValide")
public class UtilisateurValide extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String section = (String) request.getAttribute("section");

        response.setContentType("text/html");
        response.getWriter().println("<h2>Bonjour, vous etes dans la section " + section + "</h2>");
    }
}