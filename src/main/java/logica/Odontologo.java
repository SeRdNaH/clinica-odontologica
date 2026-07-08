package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Odontologo extends Persona implements Serializable {
    
    // private int id;
    private String especialidad;
    /* Relación 1 a N. */
    @OneToMany(mappedBy="odontologo")
    private List<Turno> turnos;
    /* Relación 1 a 1. */
    @OneToOne
    private Usuario usuario;
    /* Relación 1 a 1. */
    @OneToOne
    private Horario horario;

    public Odontologo() {
    
    }

    public Odontologo(String especialidad, List<Turno> turnos, Usuario usuario, Horario horario, int id, String boleta, String nombres, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, boleta, nombres, apellidos, telefono, direccion, fecha_nacimiento);
        this.especialidad = especialidad;
        this.turnos = turnos;
        this.usuario = usuario;
        this.horario = horario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
