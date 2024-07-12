import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainUserWeb{

    public static void main(String[] args) throws SQLException {

        // Librería Scanner

        Scanner myRate = new Scanner(System.in);

        System.out.println("Nombre del restaurante: ");
        String nameRest = myRate.nextLine();

        System.out.println("Ingrese correo: ");
        String email = myRate.nextLine();

        System.out.println("Ingrese su dirección: ");
        String address = myRate.nextLine();

        System.out.println("Ingrese su número de contacto: ");
        int cel = Integer.parseInt(myRate.nextLine());

        System.out.println("Del 1 al 5 que te pareció el servicio: ");
        int ratings = Integer.parseInt(myRate.nextLine());

        System.out.println("Califique de 1 a 5 estrellas: ");
        double stars = Double.parseDouble(myRate.nextLine());

        InterfazWeb myService = new InterfazWeb(nameRest, email, address, cel, ratings, stars);
        myService.mostrarDatosRestaurante();

        // Conexión con la DB

        Connection connection = MySQLConnection.connect();

        InterfazWebDAO interfazWebDAO = new InterfazWebDAO();

        interfazWebDAO.insertInterface(myService, connection);

        myRate.close();

        connection.close();

        MySQLConnection.connect();

    }
}
