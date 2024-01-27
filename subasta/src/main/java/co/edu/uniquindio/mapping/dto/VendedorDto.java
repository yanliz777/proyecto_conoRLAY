package co.edu.uniquindio.mapping.dto;

public record VendedorDto(
        String nombre,
        String apellidos,
        String password,
        String email,
        String cedula,
        String telefono,
        String direccion,
        String tipopersona) {

    @Override
    public String toString() {
        return cedula + "  "  + nombre + "  "  + apellidos;
    }
}
