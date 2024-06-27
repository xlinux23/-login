public class Servicio {

    // Variables

    String calificar;
    double puntuar;
    String ayuda;
    String calificacionEnviada;
    String servicioFinalizado;

    // Constructor

    public Servicio(String calificar, double puntuar, String ayuda,
                    String calificacionEnviada /*String servicioFinalizado*/){
        this.calificar = calificar;
        this.puntuar = puntuar;
        this.ayuda = ayuda;
        this.calificacionEnviada = calificacionEnviada;
        /*this.servicioFinalizado = servicioFinalizado; */
    }

    // Getters

    public String getCalificar() {
        return calificar;
    }

    public double getPuntuar() {
        return puntuar;
    }

    public String getAyuda() {
        return ayuda;
    }

    public String getCalificacionEnviada() {
        return calificacionEnviada;
    }

    public String getServicioFinalizado() {
        return servicioFinalizado;
    }


    // Method

    public void mostrarServicio(){
//        System.out.println("Describa su opinión sobre el servicio: " + calificar);
//        System.out.println("Puntúe el servicio realizado: " + puntuar);
//        System.out.println("¿Requiere ayuda sobre el servicio realizado? " + ayuda);
//        System.out.println("Estado de calificación: " + calificacionEnviada);
//        System.out.println("¡Gracias por usar nuestros servicios," +
//                " lo invitamos a seguir con nosotros! " + servicioFinalizado);
    }
}
