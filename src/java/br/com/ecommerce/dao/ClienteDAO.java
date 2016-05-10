/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mychel Rennó
 */
public class ClienteDAO {
    
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public ClienteDAO(){
        
    }
    
    public void create(Object object) {
        connection = new Conexao().getConnection();
        
        try {
            PreparedStatement ps = connection
                    .prepareStatement("INSERT INTO PESSOA (ID, NOME) VALUES (?, ?)");
            ps.setInt(1, 1);
            ps.setString(2, "Hugo");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void read(Object object) {
        try {
            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM PESSOA");
                while (resultSet.next()) {
                        int id = resultSet.getInt(1);
                        String nome = resultSet.getString("nome");
                        System.out.println(id + " " + nome);
                }
            } finally {
                if (statement != null) statement.close();
                if (resultSet != null) resultSet.close();
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }

    }

    private void update(Object object) {

            String sql = "UPDATE PESSOA SET ID = ?, NOME = ? WHERE ID = ?";
    }

    private void delete(Object object) {

            String sql = "DELETE FROM PESSOA WHERE ID = ?";

    }
}
