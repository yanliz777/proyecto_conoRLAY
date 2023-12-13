package co.edu.uniquindio.model;

public abstract class Persona
{
    protected String nommbres,apellidos,contraseña,email,cedula,telefono,direccion;

    public Persona(String nommbres, String apellidos, String contraseña, String email, String cedula)
    {
        this.nommbres = nommbres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.email = email;
        this.cedula = cedula;
    }

    public Persona(){}

    public String getNommbres() {
        return nommbres;
    }

    public void setNommbres(String nommbres) {
        this.nommbres = nommbres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
