package co.edu.uniquindio.mapping.dto;

import co.edu.uniquindio.enums.TipoProducto;

public record ProductoDto(
        String codigoIdentificador,
        String nombreProducto,
        String foto,
        String vendedor,
        String tipoProducto) {

    @Override
    public String toString() {
        return codigoIdentificador + "  "  + nombreProducto;
    }

}
