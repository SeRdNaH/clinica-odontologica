package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Turno implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String horario;
    private String afeccion;
    
    @ManyToOne
    @JoinColumn(name="id_odontologo")
    private Odontologo odontologo;
    
    @ManyToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;
    
    public Turno() {
        
    }

    public Turno(int id, Date fecha, String horario, String afeccion) {
        this.id = id;
        this.fecha = fecha;
        this.horario = horario;
        this.afeccion = afeccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }
}
