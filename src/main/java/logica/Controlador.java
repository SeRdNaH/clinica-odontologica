package logica;

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
}
