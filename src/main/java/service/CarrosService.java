package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static connection.Conexao.getConnection;

public class CarrosService {

private Statement statement;


    public CarrosService(){
        try{
            statement = getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consultaTodosCarros(){
        String sql = "SELECT * from carros";
        try{
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("placa: " + resultSet.getInt("placa_carro") +
                        ", modelo: " + resultSet.getString("nome_carro") +
                        ", dono id: " + resultSet.getString("dono_id")
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public String consultaColunaEspecifica(String column){
        String sql = "SELECT " + column + " from carros";
        try{
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                return resultSet.getString(column);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return sql;
    }

    public void inseriCarro( String placaCarro , Long modelo, Long donoId){

        String sql = "INSERT INTO base (placa_carro, nome_carro, dono_id) VALUES ('"+placaCarro+"', '"+modelo+"', '"+donoId+"');";
        try{
            statement.executeUpdate(sql);
            System.out.println("Dado inserido com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizaCampoCarro(Long placaCarro, String campo, String dado){

        String sql = "UPDATE carros set "+ consultaColunaEspecifica(campo) + " = '" + dado + "' where placa_carro = '" + placaCarro +"'";
        try{
            statement.executeUpdate(sql);
            System.out.println("Dado atualizado com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizaTodaBase(Long placaCarro, String modelo, Long donoId){

        String sql = "UPDATE carros set placa_carro, nome_carro, dono_id ='" + placaCarro + "','"+modelo+"','"+donoId+" where placa_carro = '" + placaCarro + "'";

        try{
            statement.executeUpdate(sql);
            System.out.println("Dado atualizado com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deletaDadosCarro(Long id){
        String sql = "DELETE from carros where placa_carro = '" + id + "'";
        try{
            statement.executeUpdate(sql);
            System.out.println("Dado deletado com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
