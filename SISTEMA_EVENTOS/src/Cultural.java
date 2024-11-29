import java.time.LocalDate;

public class Cultural extends Evento{
    private String generoArtisitico;

    public Cultural(LocalDate fecha, int duracion, Organizador organizador, String generoArtisitico) {
        super(fecha, duracion, organizador);
        this.generoArtisitico = generoArtisitico;
    }
}
