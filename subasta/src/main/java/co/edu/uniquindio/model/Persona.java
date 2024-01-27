package co.edu.uniquindio.model;

import co.edu.uniquindio.enums.TipoUsuario;

public abstract class Persona
{
    protected String nombre,apellido,password,email,cedula,telefono,direccion,tipopersona;

    public Persona(String nombre, String apellido, String password, String email
            , String cedula,String telefono,String direccion,String tipopersona)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.email = email;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipopersona = tipopersona;
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

    public String getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
