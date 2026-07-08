/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.Controlador;

@WebServlet(name = "svEliminarUsuario", urlPatterns = {"/svEliminarUsuario"})
public class svEliminarUsuario extends HttpServlet {
    
    Controlador controlador = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int id = Integer.parseInt(request.getParameter("id"));
        
        controlador.eliminarUsuario(id);
        
        response.sendRedirect("svUsuario");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
