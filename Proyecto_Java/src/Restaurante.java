public class Restaurante {

    // Variables

    public int idRestaurante;
    public String fullnameRest;
    public int celularRestaurante;
    public String direccionRestaurante;
    public String correoRestaurante;
    public String tipoComida;
//    String infoCompleted;

    // Constructor

    public Restaurante(int idRestaurante, String fullnameRest, int celularRestaurante,
                       String direccionRestaurante, String correoRestaurante, String tipoComida)

                       /*String infoCompleted */{
        this.idRestaurante = idRestaurante;
        this.fullnameRest = fullnameRest;
        this.celularRestaurante = celularRestaurante;
        this.direccionRestaurante = direccionRestaurante;
        this.correoRestaurante = correoRestaurante;
        this.tipoComida = tipoComida;
//        this.infoCompleted = infoCompleted;
    }

    // Getters deben tener return para que funcione, si no tiene return, no lo va a tomar la clase Main
    // correspondiente

    public int getIdRestaurante(){
                           return idRestaurante;
    }

    public String getFullnameRest(){
                           return fullnameRest;
    }

    public int getCelularRestaurante(){
                           return celularRestaurante;
    }

    public String getDireccionRestaurante(){
                           return direccionRestaurante;
    }

    public String getCorreoRestaurante(){
                           return correoRestaurante;
    }

    public String getTipoComida(){
                           return tipoComida;
    }

    // Métodos

    public void mostrarInformacionGeneral(){
//        System.out.println("Su código de ingreso es: " + idRestaurante);
//        System.out.println("Bienvenido restaurante " + fullnameRest);
//        System.out.println("Su especialidad de comida es: " + tipoComida);
//        System.out.println("El celular de contacto del restaurante es: " + celularRestaurante);
//        System.out.println("La dirección del restaurante que será visible para el cliente es: " + direccionRestaurante);
//        System.out.println("El correo electrónico que será visible para el cliente es: " + correoRestaurante);
//        System.out.println(infoCompleted);

    }
}
