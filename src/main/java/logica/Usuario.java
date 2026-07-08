package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String contrasena;
    private String rol;

    public Usuario() {
        
    }
    
    public Usuario(int id, String nombre, String contrasena, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
