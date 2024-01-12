package co.edu.uniquindio.controller;

import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Producto;
import co.edu.uniquindio.model.Subasta;
import co.edu.uniquindio.model.Vendedor;
import co.edu.uniquindio.utils.Persistencia;

import java.io.IOException;
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
        cargarDatosDesdeArchivos();
    }

    public void cargarDatosDesdeArchivos() {
        this.subasta = new Subasta();
        try {
            ArrayList<Vendedor> vendedores;
            ArrayList<Cliente> compradores;
            /*ArrayList<Producto> productos;
            ArrayList<Compra>compras;*/

            vendedores = persistencia.leerVendedor();
            compradores = persistencia.leerClientes();
            /*productos = persistencia.leerProductos();
            compras = persistencia.leerCompra();*/

            getSubasta().getVendedores().addAll(vendedores);
            getSubasta().getClientes().addAll(compradores);
            /*getSubasta().getProductos().addAll(productos);
            getSubasta().getListaCompras().addAll(compras);*/

        }catch (IOException e){
            e.printStackTrace();
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
            try {
                bandera = true;
                persistencia.guardarVendedor(getSubasta().getVendedores());
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else if(validarSesionCliente(subasta.getClientes(),cedula,password))
        {
            try {
                bandera = true;
                persistencia.guardarClientes(getSubasta().getClientes());
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
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
}
