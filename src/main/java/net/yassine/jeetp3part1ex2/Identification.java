package net.yassine.jeetp3part1ex2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Identification")
public class Identification extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String section = request.getParameter("section");


        if ("admin".equals(login) && "admin".equals(password)) {
            request.setAttribute("section", section);
            RequestDispatcher rd = request.getRequestDispatcher("UtilisateurValide");
            rd.forward(request, response);
        } else {
            request.setAttribute("login", login);
            request.setAttribute("password", password);
            RequestDispatcher rd = request.getRequestDispatcher("UtilisateurNonValide");
            rd.forward(request, response);
        }
    }
}