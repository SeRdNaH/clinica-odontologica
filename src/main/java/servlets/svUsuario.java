package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import logica.Controlador;
import logica.Usuario;

@WebServlet(name = "svUsuario", urlPatterns = {"/svUsuario"})
public class svUsuario extends HttpServlet {
    
    Controlador controlador = new Controlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> usuarios = controlador.consultarUsuarios();
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuarios", usuarios);
        
        System.out.println("Usuario: " + usuarios.get(0));
        
        response.sendRedirect("consultarUsuario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");
        String rol = request.getParameter("rol");
        
        Usuario usuario = new Usuario();
        
        usuario.setNombre(nombre);
        usuario.setContrasena(contrasena);
        usuario.setRol(rol);
        
        controlador.registrarUsuario(usuario);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
