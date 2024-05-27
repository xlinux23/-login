public class Restaurante {

    // Variables

    int idRestaurante;
    String fullnameRest;
    int celularRestaurante;
    String direccionRestaurante;
    String correoRestaurante;
    String tipoComida;
    String infoCompleted;

    // Constructor

    public Restaurante(int idRestaurante, String fullnameRest,int celularRestaurante,
                       String direccionRestaurante, String correoRestaurante, String tipoComida,
                       String infoCompleted){
        this.idRestaurante = idRestaurante;
        this.fullnameRest = fullnameRest;
        this.celularRestaurante = celularRestaurante;
        this.direccionRestaurante = direccionRestaurante;
        this.correoRestaurante = correoRestaurante;
        this.tipoComida = tipoComida;
        this.infoCompleted = infoCompleted;
    }

    // Métodos

    public void mostrarInformacionGeneral(){
        System.out.println("Su código de ingreso es: " + idRestaurante);
        System.out.println("Bienvenido restaurante " + fullnameRest);
        System.out.println("Su especialidad de comida es: " + tipoComida);
        System.out.println("El celular de contacto del restaurante es: " + celularRestaurante);
        System.out.println("La dirección del restaurante que será visible para el cliente es: " + direccionRestaurante);
        System.out.println("El correo electrónico que será visible para el cliente es: " + correoRestaurante);
        System.out.println(infoCompleted);

    }
}
