
public class Clientes {

    // Variables

    String idCliente;
    int edad;
    int celular;
    String direccion;
    String correo;

    // Constructor

    public Clientes(String idCliente, String direccion,
                    String correo, int edad, int celular){
        this.idCliente = idCliente;
        this.edad = edad;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
    }

    // Métodos

    public void mostrarInformacion(){
        System.out.println("Su código de ingreso es: " + idCliente);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su celular es: " + celular);
        System.out.println("Su dirección es: " + direccion);
        System.out.println("Su correo es: " + correo);
    }


}
