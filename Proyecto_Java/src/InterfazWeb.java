
public class InterfazWeb {

    // Variables

    public String nameRest;
    public int ratings;
    public double stars;
    private int cel;
    private String correo;
    public String direccion;

    // Constructor

    public InterfazWeb(String nameRest, int ratings, double stars,
                       int cel, String correo, String direccion){
        this.nameRest = nameRest;
        this.ratings = ratings;
        this.stars = stars;
        this.cel = cel;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Method

    public void mostrarDatosRestaurante(){
        System.out.println("Restaurante: " + nameRest);
        System.out.println("Reseñas totales: " + ratings);
        System.out.println("Puntuación: " + stars);
        System.out.println("Numero de contacto: " + cel);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Ubicación: " + direccion);
    }


}