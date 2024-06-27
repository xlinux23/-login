import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainServicio {

    public static void main(String[] args) throws SQLException {

        // Importar datos con librería Scanner

        Scanner scannerServicio = new Scanner(System.in);

        System.out.println("Pais: ");
        String calificar = scannerServicio.nextLine();

        System.out.println("Restaurante: ");
        double puntuar = Double.parseDouble(scannerServicio.nextLine());

        System.out.println("X: ");
        String ayuda = scannerServicio.nextLine();

        System.out.println("Y: ");
        String calificacionEnviada = scannerServicio.nextLine();

        // Objetos de la clase clientes

        Servicio showInformation = new Servicio (calificar, puntuar, ayuda, calificacionEnviada);
        showInformation.mostrarServicio();

        // Obtener la conexión de base de datos

        Connection connection = MySQLConnection.connect();

        // Crear objeto ServicioDAO para sincronizar base de datos

        ServicioDAO servicioDAO = new ServicioDAO();

        servicioDAO.showInfo(showInformation,connection);

        connection.close();

        scannerServicio.close();

        MySQLConnection.connect();

    }
}
