import java.time.LocalDate;

public class Corporativo extends Evento{
    private String nombreEmpresa;

    public Corporativo(LocalDate fecha, int duracion, Organizador organizador, String nombreEmpresa) {
        super(fecha, duracion, organizador);
        this.nombreEmpresa = nombreEmpresa;
    }
}
