package co.edu.uniquindio.mapping.dto;

public record VendedorDto(
        String nombre,
        String apellidos,
        String direccion,
        String cedula,
        String correo,
        String password) {

    @Override
    public String toString() {
        return cedula + "  "  + nombre + "  "  + apellidos;
    }
}
