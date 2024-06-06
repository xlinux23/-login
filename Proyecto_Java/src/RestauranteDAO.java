import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RestauranteDAO {

    public void insertRestInfo(Restaurante restInfo, Connection connection) throws SQLException{

        // Traer comando de MySQL y añadirlo a la variable String sql para que se puedan enviar datos

        String sql = "";

        // Para atraer los métodos get

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, restInfo.getIdRestaurante());
        statement.setInt(2, restInfo.getCelularRestaurante());
        statement.setString(3, restInfo.getFullnameRest());
        statement.setString(4, restInfo.getDireccionRestaurante());
        statement.setString(5, restInfo.getCorreoRestaurante());
        statement.setString(6, restInfo.getTipoComida());

        statement.executeUpdate();

        statement.close();

    }

}
