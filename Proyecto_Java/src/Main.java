import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        // Importar datos con librería Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su código de acceso: ");
        String idClient = scanner.nextLine();

        System.out.println("Ingrese su nombre completo: ");
        String fullname = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese su celular: ");
        int celular = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese su dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese su correo: ");
        String correo = scanner.nextLine();

        // Objetos de la clase clientes

        Clientes myClient = new Clientes(idClient, fullname, edad, celular, direccion, correo);
        myClient.mostrarInformacion();

        // Obtener la conexión de base de datos

        Connection connection = MySQLConnection.connect();

        // Crear objeto ClienteDAO para sincronizar base de datos

        ClienteDAO clienteDAO = new ClienteDAO();

        clienteDAO.insertClient(myClient,connection);

        connection.close();

        scanner.close();

        MySQLConnection.connect();


    }

}













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

// No borrar comentario de código por si acaso


