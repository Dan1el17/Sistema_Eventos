import java.time.LocalDate;

public class Deportivo extends Evento{
    private String deporte;

    public Deportivo(LocalDate fecha, int duracion, Organizador organizador, String deporte) {
        super(fecha, duracion, organizador);
        this.deporte = deporte;
    }
}
