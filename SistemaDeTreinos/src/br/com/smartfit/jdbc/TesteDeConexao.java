/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartfit.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class TesteDeConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Connection con = new ConnectionFactory().getConnection();
        System.out.println("Conexao Open!");
        con.close();
        
        
    }
    
}
