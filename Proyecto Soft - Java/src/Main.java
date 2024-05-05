
public class Main {

    public static void main(String[] args) {

        // Objeto nuevo - clase Clientes
        Clientes myClient = new Clientes("1234", "La tablaza, Caldas",
                "jhojan@gmail.com", 23, 123456);

        // Instancia - clase Clientes
        myClient.mostrarInformacion();

        //Objeto nuevo - clase InterfazWeb
        InterfazWeb pagWeb = new InterfazWeb("Frisby", 2597, 4.8,
                1234567, "frisby@hotmail.com",
                "El Poblado, Cra 15 #10, Medellín");

        // Instancia - clase InterfazWeb
        pagWeb.mostrarDatosRestaurante();

    }

}

