package Modelo;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ModeloConfiguracion implements Serializable{
    String usuario = "admin@carshop";
    String password;
    String ip;
    String puerto;
    String usuarioBD;
    String passwordBD;
    public ModeloConfiguracion(String password, String ip, String puerto, String usuarioBD, String passwordBD) {
        this.password = password;
        this.ip = ip;
        this.puerto = puerto;
        this.usuarioBD = usuarioBD;
        this.passwordBD = passwordBD;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getPuerto() {
        return puerto;
    }
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
    public String getUsuarioBD() {
        return usuarioBD;
    }
    public void setUsuarioBD(String usuarioBD) {
        this.usuarioBD = usuarioBD;
    }
    public String getPasswordBD() {
        return passwordBD;
    }
    public void setPasswordBD(String passwordBD) {
        this.passwordBD = passwordBD;
    }
    public void guardarConfigBD(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File archivoBD = new File("src//AjustesBD//ajustesBD.dat");
        try{
            fos = new FileOutputStream(archivoBD);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            System.out.println("Archivo escrito en ajustesBD.dat");
            
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(fos != null & oos != null){
                    fos.close();
                    oos.close();
                }
            }
            catch (IOException ex) {
                Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static ModeloConfiguracion getConfiguracion(){
        ModeloConfiguracion config = null;
        ObjectInputStream ois = null;
        try{
            File archivo = new File("src//AjustesBD//ajustesBD.dat");
            FileInputStream fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            config = (ModeloConfiguracion) ois.readObject();
            return config;
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(ois != null){
                    ois.close();
                }
            }
            catch (IOException ex) {
                Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return config;
    }
    public static void configDefault(String contrasenia, String ip, String puerto, String usuarioBD, String contraseniaBD){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ModeloConfiguracion config = new ModeloConfiguracion(contrasenia, ip, puerto, usuarioBD, contraseniaBD);
        File archivo = new File("src//AjustesBD//ajustesBD.dat");
        try{
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(config);
            System.out.println("Configuracion guardada por default");
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                if(fos != null & oos != null){
                    fos.close();
                    oos.close();
                }
            }
            catch (IOException ex) {
                Logger.getLogger(ModeloConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}