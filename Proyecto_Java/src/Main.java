import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
    /*
       // Objeto nuevo - clase Clientes
        Clientes myClient = new Clientes("12345", "Jhojan Chalarca", 23, 123456,
                "Barrio Trinidad, Medellín", "jhojan@gmail.com");

        // Instancia - clase Clientes
        myClient.mostrarInformacion();

        //Objeto nuevo - clase InterfazWeb
        InterfazWeb pagWeb = new InterfazWeb("Frisby", 2597, 4.8,
                1234567, "frisby@hotmail.com",
                "El Poblado, Medellín");

        // Instancia - clase InterfazWeb
        pagWeb.mostrarDatosRestaurante();

        // Objeto nuevo - clase Servicio

        Servicio myRequest = new Servicio("La página es excelente, me ayudó a encontrar un" +
                " Frisby cerca a mi hotel.", 5.0, "No",
                "Su opinión se envió correctamente.", "Solicitud finalizada.");

        // Instancia - clase Servicio

        myRequest.mostrarServicio(); */



        MySQLConnection.connect();

    }

}


