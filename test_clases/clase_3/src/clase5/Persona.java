package clase5;

public class Persona {
    public String nombre;
    public String apellido;
    public String numeroDocumento;

    public String presentacion() {
        return "Mi nombre es " + this.nombre + " " + this.apellido;
    }

}
