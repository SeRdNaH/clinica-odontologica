package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Paciente extends Persona implements Serializable {
    
    // private int id;
    private boolean tieneSeguro;
    private String tipoSangre;
    /* Relación 1 a 1. */
    @OneToOne
    private Responsable responsable;
    /* Relación 1 a N. */
    @OneToMany(mappedBy="paciente")
    private List<Turno> turnos;

    public Paciente() {
    
    }

    public Paciente(boolean tieneSeguro, String tipoSangre, Responsable responsable, List<Turno> turnos, int id, String boleta, String nombres, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, boleta, nombres, apellidos, telefono, direccion, fecha_nacimiento);
        this.tieneSeguro = tieneSeguro;
        this.tipoSangre = tipoSangre;
        this.responsable = responsable;
        this.turnos = turnos;
    }

    public boolean isTieneSeguro() {
        return tieneSeguro;
    }

    public void setTieneSeguro(boolean tieneSeguro) {
        this.tieneSeguro = tieneSeguro;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
}
