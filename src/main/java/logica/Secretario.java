package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import java.util.Date;

@Entity
public class Secretario extends Persona {
    
    // private int id;
    private String sector;
    /* Relación 1 a 1. */
    @OneToOne
    private Usuario usuario;
    
    public Secretario() {
        
    }

    public Secretario(String sector, Usuario usuario, int id, String boleta, String nombres, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, boleta, nombres, apellidos, telefono, direccion, fecha_nacimiento);
        this.sector = sector;
        this.usuario = usuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
