package logica;

import jakarta.persistence.Entity;
import java.util.Date;

@Entity
public class Responsable extends Persona {
    
    // private int id;
    private String responsabilidad;
    
    public Responsable() {
        
    }

    public Responsable(String responsabilidad, int id, String boleta, String nombres, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, boleta, nombres, apellidos, telefono, direccion, fecha_nacimiento);
        this.responsabilidad = responsabilidad;
    }
    
    public String getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }
}
