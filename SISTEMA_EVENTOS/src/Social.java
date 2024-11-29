import java.time.LocalDate;

public class Social extends Evento{
    private String codigoVestimenta;

    public Social(LocalDate fecha, int duracion, Organizador organizador, String codigoVestimenta) {
        super(fecha, duracion, organizador);
        this.codigoVestimenta = codigoVestimenta;
    }
}
