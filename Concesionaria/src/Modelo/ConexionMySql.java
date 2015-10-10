package Modelo;
import Vista.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ConexionMySql {
    public static Connection getConexion(String ip, String puerto, String usuarioBD, String contraseniaBD){
        Connection cn = null;
//        System.out.println("ip " + ip);
//        System.out.println("puerto " + puerto);
//        System.out.println("usuarioBD " + usuarioBD);
//        System.out.println("contraseniaBD " + contraseniaBD);
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
        System.out.println("probarconexxion");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("probarconexxion");
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