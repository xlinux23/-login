public class Servicio {

    // Variables

    String calificar;
    double puntuar;
    String ayuda;
    String calificacionEnviada;
    String servicioFinalizado;

    // Constructor

    public Servicio(String calificar, double puntuar, String ayuda,
                    String calificacionEnviada, String servicioFinalizado){
        this.calificar = calificar;
        this.puntuar = puntuar;
        this.ayuda = ayuda;
        this.calificacionEnviada = calificacionEnviada;
        this.servicioFinalizado = servicioFinalizado;
    }

    // Method

    public void mostrarServicio(){
        System.out.println("Describa su opinión sobre el servicio: " + calificar);
        System.out.println("Puntúe el servicio realizado: " + puntuar);
        System.out.println("¿Requiere ayuda sobre el servicio realizado? " + ayuda);
        System.out.println("Estado de calificación: " + calificacionEnviada);
        System.out.println("¡Gracias por usar nuestros servicios," +
                " lo invitamos a seguir con nosotros! " + servicioFinalizado);
    }
}
