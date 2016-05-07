/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public Connection getConnection(){
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
