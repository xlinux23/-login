import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InterfazWebDAO {

    public void insertInterface(InterfazWeb myRest, Connection connection) throws SQLException{

        String sql = " ";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, myRest.getNameRest);
        statement.setString(2, myRest.getAddress);
        statement.setString(3, myRest.getEmail);
        statement.setInt(4, myRest.getCel);
        statement.setInt(5, myRest.getRatings);
        statement.setDouble(6, myRest.getStars);

        statement.executeUpdate();

        statement.close();

    }

}
