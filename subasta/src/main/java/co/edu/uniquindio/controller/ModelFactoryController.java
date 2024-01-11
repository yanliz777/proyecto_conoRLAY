package co.edu.uniquindio.controller;

import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Subasta;
import co.edu.uniquindio.model.Vendedor;
import co.edu.uniquindio.utils.Persistencia;
import co.edu.uniquindio.utils.subastaUtil;

import java.util.ArrayList;

public class ModelFactoryController
{
    private Persistencia persistencia = new Persistencia();
    public Subasta subasta = new Subasta();
    private static class SingletonHolder
    {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance()
    {
        return SingletonHolder.eINSTANCE;
    }

    //constructor:
    public ModelFactoryController() {
        cargarDatosBase();
        guardarRecursosXML(subasta);
        if(subasta == null)
        {
            cargarDatosBase();
            guardarRecursosXML(subasta);
        }
    }
    public Subasta getSubasta()
    {
        return subasta;
    }

    /*
    Método que me permite validar los datos a qué Objeto
    pertenecen, puede ser cliente o vendedor
     */
    public boolean iniciarSesion(String cedula, String password) {
        boolean bandera = false;
        if (validarSesionVendedor(subasta.getVendedores(),cedula,password))
        {
            bandera = true;
        }
        else if(validarSesionCliente(subasta.getClientes(),cedula,password))
        {
            bandera = true;
        }
        else{
            System.out.println("ERROR!!!!");
        }
        return bandera;
        //return getSubasta().iniciarSesion(cedula,password);
    }

    /**
     *Método que me permite validar los datos de inicio de sección con los
     * objetos Tipo Cliente
     */
    public boolean validarSesionCliente(ArrayList<Cliente> lista,String cedula,String password)
    {
        boolean bandera = false;
        for (Cliente cliente : subasta.getClientes())
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

    public boolean validarSesionVendedor(ArrayList<Vendedor> lista, String cedula, String password)
    {
        boolean bandera = false;
        for (Vendedor vendedor: subasta.getVendedores())
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

    public void cargarDatosBase()
    {
        subasta = subastaUtil.InicializarDatos();
    }

    public void guardarRecursosXML(Subasta subasta)
    {
        Persistencia.guardarArchivoXML(subasta);
    }
}
