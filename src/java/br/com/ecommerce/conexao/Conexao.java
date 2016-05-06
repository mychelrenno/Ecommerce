/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mychel Rennó
 */
public class Conexao {
    
    private final String url = "jdbc:postgresql://localhost/ecommercedb";
    private final String user = "postgres";
    private final String pass = "xxxx";
    private Connection connection;
    
    public Conexao(){
        
    }
    
    public Connection getConnection() throws SQLException{
        connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }
}
