import java.util.ArrayList;
import java.util.List;

public class Salon {
    private Direccion direccion;
    private List <Evento> eventos;
    private int capacidad;

    public Salon(int capacidad, Direccion direccion) {
        this.capacidad = capacidad;
        this.direccion = direccion;
        this.eventos = new ArrayList<Evento>();
    }


}
