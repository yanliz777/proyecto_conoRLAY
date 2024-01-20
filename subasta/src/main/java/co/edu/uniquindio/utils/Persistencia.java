package co.edu.uniquindio.utils;

import co.edu.uniquindio.model.Administrador;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Producto;
import co.edu.uniquindio.model.Vendedor;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {

    private ArchivoUtil archivoUtil = new ArchivoUtil();

    //----------------------------------Orlay----------------------------------------------------------------

    public static final String rutaVendedor = "src/main/resources/co/edu/uniquindio/subasta/archivos/Vendedores.txt";

    public static final String rutaCompras = "src/main/resources/co/edu/uniquindio/subasta/archivos/Compras.txt";

    public static final String rutaProductos = "src/main/resources/co/edu/uniquindio/subasta/archivos/Productos.txt";
    public static final String rutaClientes = "src/main/resources/co/edu/uniquindio/subasta/archivos/Clientes.txt";

    public static final String rutaAdministradores = "src/main/resources/co/edu/uniquindio/subasta/archivos/Administradores.txt";

    //-----------------------------------FRANCO---------------------------------------------------------------

    /*public static final String rutaVendedor = "C:\\Users\\YAN FRANCO\\OneDrive\\Documentos" +
            "\\Trabajos_con_orlay\\subasta\\src\\main\\java\\co\\edu\\uniquindio\\Archivos\\Vendedores.txt";

    public static final String rutaCompras = "C:\\Users\\YAN FRANCO\\OneDrive\\Documentos" +
            "\\Trabajos_con_orlay\\subasta\\src\\main\\java\\co\\edu\\uniquindio\\Archivos\\Compras.txt";

    public static final String rutaProductos = "C:\\Users\\YAN FRANCO\\OneDrive\\Documentos" +
            "\\Trabajos_con_orlay\\subasta\\src\\main\\java\\co\\edu\\uniquindio\\Archivos\\Productos.txt";

    public static final String rutaClientes = "C:\\Users\\YAN FRANCO\\OneDrive\\Documentos" +
            "\\Trabajos_con_orlay\\subasta\\src\\main\\java\\co\\edu\\uniquindio\\Archivos\\Clientes.txt";*/

    public void guardarVendedor(ArrayList<Vendedor>listaVendedores) throws IOException {
        StringBuilder datos  = new StringBuilder();
        for (Vendedor v: listaVendedores) {
            datos.append(v.getNommbre()).append("!!").
                    append(v.getApellido()).append("!!").
                    append(v.getDireccion()).append("!!").
                    append(v.getCedula()).append("!!").
                    append(v.getEmail()).append("!!").
                    append(v.getContraseña()).append("!!").
                    append(v.getTelefono()).append("\n");
        }
        archivoUtil.guardarArchivo(rutaVendedor, datos.toString(), false );
    }
    public ArrayList<Vendedor> leerVendedor()throws IOException{
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        ArrayList<String>datos = archivoUtil.leerArchivo(rutaVendedor);
        String cadena;
        for (String t: datos) {
            cadena = t;
            Vendedor vendedor = new Vendedor();
            vendedor.setNommbre(cadena.split("!!")[0]);
            vendedor.setApellidos(cadena.split("!!")[1]);
            vendedor.setDireccion(cadena.split("!!")[2]);
            vendedor.setCedula(cadena.split("!!")[3]);
            vendedor.setEmail(cadena.split("!!")[4]);
            vendedor.setContraseña(cadena.split("!!")[5]);
            vendedores.add(vendedor);
        }
        return vendedores;
    }

    public void guardarClientes(ArrayList<Cliente>listaClientes)throws IOException{

        StringBuilder datosCliente  =new StringBuilder();

        for (Cliente c: listaClientes) {

            datosCliente.append(c.getNommbre()).append("!!").
                    append(c.getApellido()).append("!!").
                    append(c.getDireccion()).append("!!").
                    append(c.getCedula()).append("!!").
                    append(c.getEmail()).append("!!").
                    append(c.getContraseña()).append("!!").
                    append(c.getTelefono()).append("\n");
        }
        archivoUtil.guardarArchivo(rutaClientes, datosCliente.toString(), false );

    }
    public ArrayList<Cliente> leerClientes()throws IOException{
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<String>datos = archivoUtil.leerArchivo(rutaClientes);
        String cadena;
        for (String t: datos) {
            cadena = t;
            Cliente cliente = new Cliente();
            cliente.setNommbre(cadena.split("!!")[0]);
            cliente.setApellidos(cadena.split("!!")[1]);
            cliente.setDireccion(cadena.split("!!")[2]);
            cliente.setCedula(cadena.split("!!")[3]);
            cliente.setEmail(cadena.split("!!")[4]);
            cliente.setContraseña(cadena.split("!!")[5]);
            clientes.add(cliente);
        }
        return clientes;
    }

    public void guardarAdministrador(ArrayList<Administrador> administradores) throws IOException {
        StringBuilder datosAdministrador  =new StringBuilder();

        for (Administrador administrador: administradores) {

            datosAdministrador.append(administrador.getNommbre()).append("!!").
                    append(administrador.getApellido()).append("!!").
                    append(administrador.getDireccion()).append("!!").
                    append(administrador.getCedula()).append("!!").
                    append(administrador.getEmail()).append("!!").
                    append(administrador.getContraseña()).append("!!").
                    append(administrador.getTelefono()).append("\n");
        }
        archivoUtil.guardarArchivo(rutaAdministradores, datosAdministrador.toString(), false );
    }

    public ArrayList<Administrador> leerAdministradores()throws IOException{
        ArrayList<Administrador> administradors = new ArrayList<>();
        ArrayList<String>datos = archivoUtil.leerArchivo(rutaAdministradores);
        String cadena;
        for (String t: datos) {
            cadena = t;
            Administrador administrador = new Administrador();
            administrador.setNommbre(cadena.split("!!")[0]);
            administrador.setApellidos(cadena.split("!!")[1]);
            administrador.setDireccion(cadena.split("!!")[2]);
            administrador.setCedula(cadena.split("!!")[3]);
            administrador.setEmail(cadena.split("!!")[4]);
            administrador.setContraseña(cadena.split("!!")[5]);
            administradors.add(administrador);
        }
        return administradors;
    }
}

