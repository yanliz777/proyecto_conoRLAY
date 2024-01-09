package co.edu.uniquindio.model;

import co.edu.uniquindio.enums.TipoUsuario;

public abstract class Persona
{
    protected String nombre,apellido,contraseña,email,cedula,telefono,direccion;
    protected TipoUsuario tipopersona;

    public Persona(String nombre, String apellido, String contraseña, String email
            , String cedula,String telefono,String direccion,TipoUsuario persona)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.email = email;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipopersona = persona;
    }

    public Persona(){}

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoUsuario getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(TipoUsuario tipopersona) {
        this.tipopersona = tipopersona;
    }

    public String getNommbre() {
        return nombre;
    }

    public void setNommbre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
