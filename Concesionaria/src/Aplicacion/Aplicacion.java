package Aplicacion;
import Vista.*;
import Modelo.*;
import Controlador.*;
import java.sql.Connection;
public class Aplicacion {
    static Control_JFLogin contrLogin;
    static Connection cn;
    public static void main(String[] args){
        try{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //ModeloConfiguracion.configDefault("123456", "localhost", "3306", "root", "ricardo");
        getConexion(ModeloConfiguracion.getConfiguracion());
        contrLogin = new Control_JFLogin(cn);
    }
    
    private static void getConexion(ModeloConfiguracion config){
        cn = ConexionMySql.getConexion(config.getIp(), config.getPuerto(), config.getUsuarioBD(), config.getContraseniaBD());
    }
    public static void init(){
        getConexion(ModeloConfiguracion.getConfiguracion());
        contrLogin = new Control_JFLogin(cn);
    }
}