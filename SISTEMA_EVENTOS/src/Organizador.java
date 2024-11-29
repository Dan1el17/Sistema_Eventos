import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Organizador extends Persona {
    private List <Evento> eventos;

    public Organizador(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
        this.eventos = new ArrayList<>();
    }

    public void crearEventoAcademico(LocalDate fecha, int duracion, String nivelEducativo){
        Academico academico = new Academico(fecha,duracion,this,nivelEducativo);
        eventos.add(academico);
    }
    public void crearEventoSocial(LocalDate fecha, int duracion, String codigoVestimenta){
        Social social = new Social(fecha,duracion,this,codigoVestimenta);
        eventos.add(social);
    }
    public void crearEventoDeportivo(LocalDate fecha, int duracion, String deporte){
        Deportivo deportivo = new Deportivo(fecha,duracion,this,deporte);
        eventos.add(deportivo);
    }
    public void crearEventoConvencion(LocalDate fecha, int duracion, int cantidadStands){
        Convencion convencion = new Convencion(fecha,duracion,this,cantidadStands);
        eventos.add(convencion);
    }
    public void crearEventoCultural(LocalDate fecha, int duracion, String generoArtisitico){
        Cultural cultural = new Cultural(fecha,duracion,this,generoArtisitico);
        eventos.add(cultural);
    }
    public void crearEventoCorporativo(LocalDate fecha, int duracion, String nombreEmpresa){
        Corporativo corporativo = new Corporativo(fecha,duracion,this,nombreEmpresa);
        eventos.add(corporativo);
    }
    public void visualizarEventosCreados(){
        for(Evento evento : eventos){
            System.out.println("Fecha: "+evento.getFecha().toString()+" Duracion: "+evento.getDuracion());
        }
    }

}
