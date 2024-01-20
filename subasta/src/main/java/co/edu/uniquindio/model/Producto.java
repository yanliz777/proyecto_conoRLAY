package co.edu.uniquindio.model;
public class Producto
{
    private String codigoIdentificador;
    private String nombreProducto;
    private String foto;
    private String vendedor;
    private String tipoProducto;
    public Producto() {}

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String anunciante) {
        this.vendedor = vendedor;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
