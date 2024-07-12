import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    public ClienteDAO(String idClient, String newEmail, String nuevoNombre) {
    }
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


    // Actualizar datos en base de datos

    public void actualizarCliente()
     throws  SQLException{

    String sql = /*Texto del script mysql*/
            "UPDATE clients SET name = '?', '?' , email WHERE idClient = ?"
        ;

    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1,nuevoNombre);
    statement.setString(2, newEmail);
    statement.setString(3, idCliente);

    // Ejecutar la actualización - Ejecutar el statement

    int rowsUpdated = statement.executeUpdate();

    if (rowsUpdated > 0){
        System.out.println("Cliente actualizado exitosamente");

    }

    // Cerrar el statement para finalizar proceso de actualización

    statement.close();

    // Código para ejecutar en Workbench mysql

        /* UPDATE clients SET name = "Daniel", 'daniel@gmail.com' , email WHERE idClient = 123 */

    }
}
