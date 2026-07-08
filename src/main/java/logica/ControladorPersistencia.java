package logica;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.HorarioJpaController;
import persistencia.OdontologoJpaController;
import persistencia.PacienteJpaController;
import persistencia.PersonaJpaController;
import persistencia.ResponsableJpaController;
import persistencia.SecretarioJpaController;
import persistencia.TurnoJpaController;
import persistencia.UsuarioJpaController;
import persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {
    
    private HorarioJpaController horarioJpa = new HorarioJpaController();
    private OdontologoJpaController odontologoJpa = new OdontologoJpaController();
    private PacienteJpaController pacienteJpa = new PacienteJpaController();
    private PersonaJpaController personaJpa = new PersonaJpaController();
    private ResponsableJpaController responsableJpa = new ResponsableJpaController();
    private SecretarioJpaController secretarioJpa = new SecretarioJpaController();
    private TurnoJpaController turnoJpa = new TurnoJpaController();
    private UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public ControladorPersistencia() {
        
    }
    
    public void registrarUsuario(Usuario usuario) {
        usuarioJpa.create(usuario);
    }
    
    public List<Usuario> consultarUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }

    void eliminarUsuario(int id) {
        try {
            usuarioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario consultarUsuario(int id) {
        return usuarioJpa.findUsuario(id);
    }

    void editarUsuario(Usuario usuario) {
        try {
            usuarioJpa.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
