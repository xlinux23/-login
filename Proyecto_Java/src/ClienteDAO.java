import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    // Interacción con la base de datos

    public void insertClient(Clientes myClient, Connection connection) throws SQLException{

        // Traer comando de MySQL y añadirlo a la variable String sql para que se puedan enviar datos

        String sql = "INSERT INTO clients (idclient, age, phone, email, address, fullname) VALUE (?,?,?,?,?,?);";

        // Para atraer los métodos get

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, myClient.getEdad());
        statement.setInt(2, myClient.getCelular());
        statement.setString(3, myClient.getIdCliente());
        statement.setString(4, myClient.getFullname());
        statement.setString(5, myClient.getDireccion());
        statement.setString(6, myClient.getCorreo());

        statement.executeUpdate();

        statement.close();

    }

}
