public class Participante extends Persona {
    private Rol rol;

    public Participante(String nombre, String cedula, String telefono, Rol rol) {
        super(nombre, cedula, telefono);
        this.rol = rol;
    }


}
