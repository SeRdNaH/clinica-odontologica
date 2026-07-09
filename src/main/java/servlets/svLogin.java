package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.Controlador;

@WebServlet(name = "svLogin", urlPatterns = {"/svLogin"})
public class svLogin extends HttpServlet {
    
    Controlador controlador = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        
        boolean validacion = false;
        
        validacion = controlador.validarInicioSesion(usuario, contrasena);
        
        if (validacion) {
            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("usuario", usuario);
            response.sendRedirect("index.jsp");
        
        } else {
            response.sendRedirect("loginError.jsp");
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
