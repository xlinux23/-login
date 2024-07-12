import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection {

    public static Connection connect() throws SQLException{

        // URL, usuario y contraseña DataBase

        String url = "jdbc:mysql://localhost:3306/apprestaurante";
        String user = "root";
        String password = "123456789";

        // Carga de Driver MySQL y establecer conexión

        Connection connection = DriverManager.getConnection(url, user, password);

        // Mensaje de conexión exitosa

        System.out.println("Conexión exitosa en la base de datos");

        // Retornar conexión

        return connection;

        }

    }

