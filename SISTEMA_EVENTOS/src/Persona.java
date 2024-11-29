public abstract class Persona {
    protected String nombre;
    protected String cedula;
    protected String telefono;

    public Persona(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
}
