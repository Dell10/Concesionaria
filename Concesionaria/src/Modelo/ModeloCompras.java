package Modelo;
public class ModeloCompras {
    private int numFacturaCompra;
    private String fechaCompra;
    private double precioCompra;
    private boolean aprobacionCompra;
    private String serieAutoCompra;
    private String cveEmpleadoCompra;
    private String cveClienteCompra;
    public int getNumFacturaCompra() {
        return numFacturaCompra;
    }
    public void setNumFacturaCompra(int numFacturaCompra) {
        this.numFacturaCompra = numFacturaCompra;
    }
    public String getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    public boolean isAprobacionCompra() {
        return aprobacionCompra;
    }
    public void setAprobacionCompra(boolean aprobacionCompra) {
        this.aprobacionCompra = aprobacionCompra;
    }
    public String getSerieAutoCompra() {
        return serieAutoCompra;
    }
    public void setSerieAutoCompra(String serieAutoCompra) {
        this.serieAutoCompra = serieAutoCompra;
    }
    public String getCveEmpleadoCompra() {
        return cveEmpleadoCompra;
    }
    public void setCveEmpleadoCompra(String cveEmpleadoCompra) {
        this.cveEmpleadoCompra = cveEmpleadoCompra;
    }
    public String getCveClienteCompra() {
        return cveClienteCompra;
    }
    public void setCveClienteCompra(String cveClienteCompra) {
        this.cveClienteCompra = cveClienteCompra;
    } 
}