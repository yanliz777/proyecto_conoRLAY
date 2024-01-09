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

    public boolean iniciarSesion(String cedula, String password)
    {
        boolean bandera = false;
        if (validarSesionVendedor(getVendedores(),cedula,password))
        {
            bandera = true;
        }
        else if(validarSesionCliente(getClientes(),cedula,password))
        {
            bandera = true;
        }
       return bandera;
    }

    /**
     *Método que me permite validar los datos de inicio de sección con los
     * objetos Tipo Cliente
     */
    public boolean validarSesionCliente(ArrayList<Cliente> lista,String cedula,String password)
    {
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
        return bandera;
    }

    public boolean validarSesionVendedor(ArrayList<Vendedor> lista,String cedula,String password)
    {
        boolean bandera = false;
        for (Vendedor vendedor: getVendedores())
        {
            if (vendedor.getCedula().equals(cedula) &&
                    vendedor.getContraseña().equals(password))
            {
                bandera = true;
                break;
            }
        }
        return bandera;
    }
}
