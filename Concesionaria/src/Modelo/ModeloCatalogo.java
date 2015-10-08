package Modelo;
import java.sql.Blob;
public class ModeloCatalogo {
    private String numSerieCatalogo;
    private String marcaCatalogo;
    private String tipoCatalogo;
    private String modeloCatalogo;
    private int numPasajCatalogo;
    private int cilindrosCatalogo;
    private String colorCatalogo;
    private String detalleCatalogo;
    private int certifMecaCatalogo;
    private double precioVentaCatalogo;
    private double precioCompraCatalogo;
    private Blob imagenBlobCatalogo;
    private String nombreImagenCatalogo;
    private String estadoCatalogo;
    public String getNumSerieCatalogo() {
        return numSerieCatalogo;
    }
    public void setNumSerieCatalogo(String numSerieCatalogo) {
        this.numSerieCatalogo = numSerieCatalogo;
    }
    public String getMarcaCatalogo() {
        return marcaCatalogo;
    }
    public void setMarcaCatalogo(String marcaCatalogo) {
        this.marcaCatalogo = marcaCatalogo;
    }
    public String getTipoCatalogo() {
        return tipoCatalogo;
    }
    public void setTipoCatalogo(String tipoCatalogo) {
        this.tipoCatalogo = tipoCatalogo;
    }
    public String getModeloCatalogo() {
        return modeloCatalogo;
    }
    public void setModeloCatalogo(String modeloCatalogo) {
        this.modeloCatalogo = modeloCatalogo;
    }
    public int getNumPasajCatalogo() {
        return numPasajCatalogo;
    }
    public void setNumPasajCatalogo(int numPasajCatalogo) {
        this.numPasajCatalogo = numPasajCatalogo;
    }
    public int getCilindrosCatalogo() {
        return cilindrosCatalogo;
    }
    public void setCilindrosCatalogo(int cilindrosCatalogo) {
        this.cilindrosCatalogo = cilindrosCatalogo;
    }
    public String getColorCatalogo() {
        return colorCatalogo;
    }
    public void setColorCatalogo(String colorCatalogo) {
        this.colorCatalogo = colorCatalogo;
    }
    public String getDetalleCatalogo() {
        return detalleCatalogo;
    }
    public void setDetalleCatalogo(String detalleCatalogo) {
        this.detalleCatalogo = detalleCatalogo;
    }
    public int getCertifMecaCatalogo() {
        return certifMecaCatalogo;
    }
    public void setCertifMecaCatalogo(int certifMecaCatalogo) {
        this.certifMecaCatalogo = certifMecaCatalogo;
    }
    public double getPrecioVentaCatalogo() {
        return precioVentaCatalogo;
    }
    public void setPrecioVentaCatalogo(double precioVentaCatalogo) {
        this.precioVentaCatalogo = precioVentaCatalogo;
    }
    public double getPrecioCompraCatalogo() {
        return precioCompraCatalogo;
    }
    public void setPrecioCompraCatalogo(double precioCompraCatalogo) {
        this.precioCompraCatalogo = precioCompraCatalogo;
    }
    public Blob getImagenBlobCatalogo() {
        return imagenBlobCatalogo;
    }
    public void setImagenBlobCatalogo(Blob imagenBlobCatalogo) {
        this.imagenBlobCatalogo = imagenBlobCatalogo;
    }
    public String getNombreImagenCatalogo() {
        return nombreImagenCatalogo;
    }
    public void setNombreImagenCatalogo(String nombreImagenCatalogo) {
        this.nombreImagenCatalogo = nombreImagenCatalogo;
    }
    public String getEstadoCatalogo() {
        return estadoCatalogo;
    }
    public void setEstadoCatalogo(String estadoCatalogo) {
        this.estadoCatalogo = estadoCatalogo;
    }   
}