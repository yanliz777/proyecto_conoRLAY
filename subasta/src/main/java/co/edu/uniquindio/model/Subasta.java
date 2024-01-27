package co.edu.uniquindio.model;

import java.util.ArrayList;

public class Subasta
{
    Administrador administrador;
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Administrador> Administradores = new ArrayList<>();

    //constructor:
    public  Subasta(){}
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public ArrayList<Administrador> getAdministradores() {
        return Administradores;
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Vendedor> getVendedores()
    {
        return vendedores;
    }

    public Vendedor registrarVendedor(Vendedor vendedor)
    {
        Vendedor vendedor1 = new Vendedor();//nuevo

        vendedor1.setNombre(vendedor.getNombre());
        vendedor1.setApellidos(vendedor.getApellido());
        vendedor1.setCedula(vendedor.getCedula());
        vendedor1.setEmail(vendedor.getEmail());
        vendedor1.setPassword(vendedor.getPassword());
        vendedor1.setDireccion(vendedor.getDireccion());
        vendedor1.setTelefono(vendedor.getTelefono());
        vendedor1.setTipopersona(vendedor.getTipopersona());

        getVendedores().add(vendedor1);//acá se guarda el producto, es el final de la comunicación entre clases
        //ahora lo retorno ya con los datos settiados y hago lo inverso, devolverme!!
        return vendedor1;
    }

    public Cliente registrarCliente(Cliente cliente) {
        Cliente cliente1 = new Cliente();//nuevo

        cliente1.setNombre(cliente.getNombre());
        cliente1.setApellidos(cliente.getApellido());
        cliente1.setCedula(cliente.getCedula());
        cliente1.setEmail(cliente.getEmail());
        cliente1.setPassword(cliente.getPassword());
        cliente1.setDireccion(cliente.getDireccion());
        cliente1.setTelefono(cliente.getTelefono());
        cliente1.setTipopersona(cliente.getTipopersona());

        getClientes().add(cliente1);//acá se guarda el producto, es el final de la comunicación entre clases
        //ahora lo retorno ya con los datos settiados y hago lo inverso, devolverme!!
        return cliente1;
    }

    public Administrador registrarAdministrador(Administrador administrador) {
        Administrador administrador1 = new Administrador();//nuevo

        administrador1.setNombre(administrador.getNombre());
        administrador1.setApellidos(administrador.getApellido());
        administrador1.setCedula(administrador.getCedula());
        administrador1.setEmail(administrador.getEmail());
        administrador1.setPassword(administrador.getPassword());
        administrador1.setDireccion(administrador.getDireccion());
        administrador1.setTelefono(administrador.getTelefono());
        administrador1.setTipopersona(administrador.getTipopersona());

        getAdministradores().add(administrador1);//acá se guarda el producto, es el final de la comunicación entre clases
        //ahora lo retorno ya con los datos settiados y hago lo inverso, devolverme!!
        return administrador1;
    }

   /* public boolean iniciarSesion(String cedula, String password)
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
        else{
            System.out.println("ERROR!!!!");
        }
       return bandera;
    }

    /**
     *Método que me permite validar los datos de inicio de sección con los
     * objetos Tipo Cliente
     */
   /* public boolean validarSesionCliente(ArrayList<Cliente> lista,String cedula,String password)
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
    }*/
}
