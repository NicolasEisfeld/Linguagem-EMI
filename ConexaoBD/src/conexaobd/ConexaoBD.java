/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexaobd;

import javax.swing.JOptionPane;
import java.sql.*;

public class ConexaoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String driver = "com.mysql.cj.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/sys";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, "root", "");
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso");
            connection.close();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado");
        }      
          catch (SQLException e ) {
              JOptionPane.showMessageDialog(null, "Problema de conexão com a fonte de dados");
          }
        
    }
    
}
