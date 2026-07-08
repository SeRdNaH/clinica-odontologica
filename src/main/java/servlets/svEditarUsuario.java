package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.Controlador;
import logica.Usuario;

@WebServlet(name = "svEditarUsuario", urlPatterns = {"/svEditarUsuario"})
public class svEditarUsuario extends HttpServlet {

    Controlador controlador = new Controlador();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        Usuario usuario = controlador.consultarUsuario(id);
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuario", usuario);
        
        System.out.println(usuario.getNombre());
        
        response.sendRedirect("editarUsuario.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");
        String rol = request.getParameter("rol");
        
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
        
        usuario.setNombre(nombre);
        usuario.setContrasena(contrasena);
        usuario.setRol(rol);
        
        controlador.editarUsuario(usuario);
        
        response.sendRedirect("svUsuario");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
