
public class Clientes {

    // Variables

    String idCliente;
    String fullname;
    int edad;
    int celular;
    String direccion;
    String correo;

    // Constructor

    public Clientes(String idCliente, String fullname, int edad, int celular,
                    String direccion, String correo){
        this.idCliente = idCliente;
        this.fullname = fullname;
        this.edad = edad;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
    }

    // Métodos getters & setters

    public int getEdad(){
        return edad;
    }

    public int getCelular() {
        return celular;
    }

    public String getIdCliente(){
        return idCliente;
    }

    public String getFullname(){
        return fullname;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getCorreo(){
        return correo;
    }

    // Métodos

    public void mostrarInformacion(){
//        System.out.println("Su código de ingreso es: " + idCliente);
//        System.out.println("Bienvenido " + fullname);
//        System.out.println("Su edad es: " + edad);
//        System.out.println("Su celular es: " + celular);
//        System.out.println("Su dirección es: " + direccion);
//        System.out.println("Su correo es: " + correo);

    }


}

