import java.time.LocalDate;

public class Convencion extends Evento{
    private int cantidadStands;

    public Convencion(LocalDate fecha, int duracion, Organizador organizador, int cantidadStands) {
        super(fecha, duracion, organizador);
        this.cantidadStands = cantidadStands;
    }
}
