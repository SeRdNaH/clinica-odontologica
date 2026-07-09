package logica;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    
    private ControladorPersistencia controlador = new ControladorPersistencia();
    
    public void registrarUsuario(Usuario usuario) {
        controlador.registrarUsuario(usuario);
    }
    
    public List<Usuario> consultarUsuarios() {
        return controlador.consultarUsuarios();
    }

    public void eliminarUsuario(int id) {
        controlador.eliminarUsuario(id);
    }

    public Usuario consultarUsuario(int id) {
        return controlador.consultarUsuario(id);
    }

    public void editarUsuario(Usuario usuario) {
        controlador.editarUsuario(usuario);
    }

    public boolean validarInicioSesion(String nombre, String contrasena) {
        boolean ingreso = false;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        usuarios = controlador.consultarUsuarios();
        
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                if (usuario.getContrasena().equals(contrasena)) {
                    ingreso = true;
                }
            }
        }
        
        return ingreso;
    }
}
