import java.awt.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection {

    public static void connect() throws SQLException{

        // URL DataBase

        String url = "jdbc:mysql://localhost:3306/apprestaurante";
        String user = "root";
        String password = "123456789";

        // Carga de Driver MySQL y establecer conexión

        Connection connection = DriverManager.getConnection(url, user, password);

        // Mensaje de conexión exitosa

        System.out.println("Conexión exitosa");

        // Para cerrar la conexión

        connection.close();

    }

}
