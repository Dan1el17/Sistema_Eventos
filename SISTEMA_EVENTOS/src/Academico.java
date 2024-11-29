import java.time.LocalDate;

public class Academico extends Evento{
    private String nivelEducativo;

    public Academico(LocalDate fecha, int duracion, Organizador organizador, String nivelEducativo) {
        super(fecha, duracion, organizador);
        this.nivelEducativo = nivelEducativo;
    }
}
