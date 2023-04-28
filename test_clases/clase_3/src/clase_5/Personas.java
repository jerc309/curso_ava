package clase_5;

import java.security.PublicKey;

public class Personas {
    private String nombre;
    private String apellido;
    private String numeroDocumento;

    public Personas(String nombre, String apellido, String numDoc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numDoc;
    }

    public String muestraPersona() {
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " Numero doculento: " + this.numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
