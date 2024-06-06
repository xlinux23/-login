import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class MainRestaurante {

    public static void main(String[] args) throws SQLException {

        // Librería Scanner

        Scanner requestInfo = new Scanner(System.in);

        System.out.println("Nombre del restaurante: ");
        int idRestaurante = Integer.parseInt(requestInfo.nextLine());

        System.out.println("Ingrese correo: ");
        String fullnameRest = requestInfo.nextLine();

        System.out.println("Ingrese su número de contacto: ");
        int celularRestaurante = Integer.parseInt(requestInfo.nextLine());

        System.out.println("Ingrese su dirección: ");
        String direccionRestaurante = requestInfo.nextLine();

        System.out.println("Ingrese su dirección: ");
        String correoRestaurante = requestInfo.nextLine();

        System.out.println("Ingrese su dirección: ");
        String tipoComida = requestInfo.nextLine();

        Restaurante myRestaurant = new Restaurante(idRestaurante, fullnameRest, celularRestaurante,
                direccionRestaurante, correoRestaurante, tipoComida);

        myRestaurant.mostrarInformacionGeneral();

        // Conexión con la DB

        Connection connection = MySQLConnection.connect();

        RestauranteDAO restauranteDAO = new RestauranteDAO();

        restauranteDAO.insertRestInfo(myRestaurant, connection);

        requestInfo.close();

        connection.close();

        MySQLConnection.connect();

    }

}
