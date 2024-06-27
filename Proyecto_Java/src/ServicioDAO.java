import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServicioDAO {

    public void showInfo(Servicio showInformation, Connection connection) throws SQLException{

        // Traer comando de MySQL y añadirlo a la variable String sql para que se puedan enviar datos

        String sql = "INSERT INTO clients (idclient, age, phone, email, address, fullname) VALUE (?,?,?,?,?,?);";

        // Para atraer los métodos get

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, showInformation.getCalificar());
        statement.setDouble(2, showInformation.getPuntuar());
        statement.setString(3, showInformation.getAyuda());
        statement.setString(4, showInformation.getCalificacionEnviada());
        statement.setString(5, showInformation.getServicioFinalizado());

        statement.executeUpdate();

        statement.close();

    }

}
