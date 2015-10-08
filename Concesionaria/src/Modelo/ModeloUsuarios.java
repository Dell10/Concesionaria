package Modelo;
import java.sql.Blob;
public class ModeloUsuarios {
    private String nombreUsuario;
    private String passwordUsuario;
    private String nombreImageUsuario;
    private Blob imagenBlobUsuario;
    private String emplCveUsuario;
    public String getNombreUser() {
        return nombreUsuario;
    }
    public void setNombreUser(String nombreUser) {
        this.nombreUsuario = nombreUser;
    }
    public String getPassword() {
        return passwordUsuario;
    }
    public void setPassword(String password) {
        this.passwordUsuario = password;
    }
    public String getNombreImage() {
        return nombreImageUsuario;
    }
    public void setNombreImage(String nombreImage) {
        this.nombreImageUsuario = nombreImage;
    }
    public Blob getImagenBlob() {
        return imagenBlobUsuario;
    }
    public void setImagenBlob(Blob imagenBlob) {
        this.imagenBlobUsuario = imagenBlob;
    }
    public String getEmplCve() {
        return emplCveUsuario;
    }
    public void setEmplCve(String emplCve) {
        this.emplCveUsuario = emplCve;
    }
}