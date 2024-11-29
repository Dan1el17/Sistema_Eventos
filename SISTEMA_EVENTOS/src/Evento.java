import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Evento implements InteraccionParticipante{
    private LocalDate fecha;
    private int duracion;
    private List<Participante> participantes;
    private Organizador organizador;
    public Evento(LocalDate fecha, int duracion, Organizador organizador) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.participantes = new ArrayList<>();
        this.organizador = organizador;
        System.out.println("Se creo un evento para la fecha "+ fecha.toString()+" con una duracion de "+duracion);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void registrarParticipantes(Participante participante){
        participantes.add(participante);
    };

    @Override
    public void entregarCertificado(Participante participante) {
        System.out.printf("-> Entregar certificado al participante "+participante.getNombre());
    }

    @Override
    public void ofrecerCatering() {
        for(Participante participante : participantes){
            System.out.println("-> Ofrecer comida al participante "+participante.getNombre());
        }
    }
}
