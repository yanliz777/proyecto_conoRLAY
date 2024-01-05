package co.edu.uniquindio.model;

import java.util.ArrayList;

public class Subasta
{
    Administrador administrador;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Cliente> clientes;
    //constructor:
    public  Subasta(){}
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Vendedor> getVendedores()
    {
        return vendedores;
    }

    public boolean iniciarSesion(String cedula,String password)
    {
        boolean bandera = false;
        return  bandera;
    }

    public boolean iniciarSesionCliente(String cedula, String password) {
        boolean bandera = false;
        for (Cliente cliente : getClientes())
        {
            if (cliente.getCedula().equals(cedula) &&
                    cliente.getContraseña().equals(password))
            {
                bandera = true;
                break;
            }
        }
        return  bandera;
    }

    public boolean iniciarSesionVendedor(String cedula, String password) {
        boolean bandera = false;
        for (Vendedor vendedor : getVendedores())
        {
            if (vendedor.getCedula().equals(cedula) &&
                    vendedor.getContraseña().equals(password))
            {
                bandera = true;
                break;
            }
        }
        return  bandera;
    }

    public boolean iniciarSesionAdministrador(String cedula, String password) {
        boolean bandera = false;
        if(administrador.getCedula().equals(cedula) &&
                administrador.getPersona().equals(password)) {
            bandera = true;
        }
        return  bandera;
    }
}
