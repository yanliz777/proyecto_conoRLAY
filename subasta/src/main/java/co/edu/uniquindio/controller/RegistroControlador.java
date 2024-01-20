package co.edu.uniquindio.controller;

import co.edu.uniquindio.model.Administrador;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Subasta;
import co.edu.uniquindio.model.Vendedor;

public class RegistroControlador
{
    private Subasta tienda = new Subasta();
    private ModelFactoryController modelFactory;

    public RegistroControlador()
    {
        this.modelFactory = ModelFactoryController.getInstance();
    }

    public Vendedor registrarUsuario(Vendedor vendedor)
    {
        return modelFactory.registrarVendedor(vendedor);
    }

    public Cliente registrarUsuario(Cliente cliente)
    {
        return modelFactory.registrarCliente(cliente);
    }

    public Administrador registrarUsuario(Administrador administrador)
    {
        return modelFactory.registrarAdministrador(administrador);
    }
}
