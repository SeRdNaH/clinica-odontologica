package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int id;
    private String boleta;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    public Persona() {
    
    }

    public Persona(int id, String boleta, String nombres, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        this.id = id;
        this.boleta = boleta;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
