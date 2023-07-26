package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://database-2.car2qha01asq.sa-east-1.rds.amazonaws.com:5432/postgres",
                    "postgres", "12345678");
            return connection;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
