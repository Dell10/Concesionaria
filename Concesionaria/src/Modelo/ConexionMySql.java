package Modelo;
import Vista.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ConexionMySql {
    public static Connection getConexion(String ip, String puerto, String usuarioBD, String contraseniaBD){
        Connection cn = null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           cn = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + puerto + "/micar", usuarioBD, contraseniaBD);
            System.out.println("Conexion exitosa");
        }
        catch (SQLException ex) {
            System.out.println("Error de conexion en la BD");
            JOptionPane.showMessageDialog(null, "Posibles errores: \n\t-Datos de configuracion de la base de datos incorrectos."
                    + "\n\t-Verificar conexión del servidor", "Mensaje de error", JOptionPane.WARNING_MESSAGE);            
        }
        catch (Exception ex) {
            System.out.println("Error de conexion en la BD");
            JOptionPane.showMessageDialog(null, "Posibles errores: \n\t-Datos de configuracion de la base de datos incorrectos."
                    + "\n\t-Verificar conexión del servidor", "Mensaje de error", JOptionPane.WARNING_MESSAGE);            
        }
        return cn;
    }
    public static boolean probarConexion(VistaConfiguracionBDD frame, String ip, String puerto, String usuarioBD, String contraseniaBD){
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + puerto + "/micar", usuarioBD, contraseniaBD);
            System.out.println("Conexion exitosa");
            return true;            
        }
        catch (SQLException ex) {
            System.out.println("Error de conexion en la BD");
            JOptionPane.showMessageDialog(frame, "Posibles errores: \n\t-Datos de configuracion de la base de datos incorrectos."
                    + "\n\t-Verificar conexión del servidor", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
        }
        catch (Exception ex) {
            System.out.println("Error de conexion en la BD");
            JOptionPane.showMessageDialog(frame, "Posibles errores: \n\t-Datos de configuracion de la base de datos incorrectos."
                    + "\n\t-Verificar conexión del servidor", "Mensaje de error", JOptionPane.WARNING_MESSAGE);            
        }
        return false;
    }
}