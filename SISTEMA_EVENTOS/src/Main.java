import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Av 18","Calle 20","Sector Centro");
        Salon salon = new Salon(30,direccion);
        Organizador organizador1 = new Organizador("Juan", "1107469560", "0954789370");
        Organizador organizador2 = new Organizador("Carlos", "1103547890", "0967859281");
        organizador2.crearEventoSocial(LocalDate.now(),4,"Formal");
        organizador1.crearEventoDeportivo(LocalDate.now(),3,"Futbol");
        organizador2.crearEventoCultural(LocalDate.now(),4,"Salsa Choke");
        Participante participante1 = new Participante("Jose", "1108967340","0986659069",Rol.PONENTE);
        Participante participante2 = new Participante("María", "1104587632", "0986543210",Rol.VOLUNTARIO);
        Participante participante3 = new Participante("Ivan", "1107865432", "0987123456",Rol.INVITADO_ESPECIAL);
        Participante participante4 = new Participante("Ana", "1103456789", "0987685943",Rol.ASISTENTE);
        Participante participante5 = new Participante("Luis", "1109876543", "0987765432",Rol.ASISTENTE);
        Participante participante6 = new Participante("Sofía", "1101234567", "0987654321",Rol.PONENTE);
        organizador1.visualizarEventosCreados();
        organizador2.visualizarEventosCreados();
    }
}