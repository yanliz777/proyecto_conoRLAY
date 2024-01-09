package co.edu.uniquindio.utils;

import co.edu.uniquindio.enums.TipoUsuario;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Subasta;
import co.edu.uniquindio.model.Vendedor;

public class subastaUtil {
    public static Subasta InicializarDatos()
    {
        Subasta subasta = new Subasta();
        Vendedor vendedor = new Vendedor();
        vendedor.setNommbre("Orlay");
        vendedor.setApellidos("Molina");
        vendedor.setCedula("12345");
        vendedor.setContraseña("Orlay");
        vendedor.setDireccion("calle 36 #20-133");
        vendedor.setEmail("molina@gmail.com");
        vendedor.setTelefono("3104454312");
        vendedor.setTipopersona(TipoUsuario.VENDEDOR);

        subasta.getVendedores().add(vendedor);//se agrega el vendedor

        Cliente cliente = new Cliente();
        cliente.setNommbre("Yan");
        cliente.setApellidos("Gómez");
        cliente.setCedula("54321");
        cliente.setContraseña("Yan");
        cliente.setDireccion("calle 36 #20-133");
        cliente.setEmail("yan@gmail.com");
        cliente.setTelefono("3104454312");
        cliente.setTipopersona(TipoUsuario.CLIENTE);

        subasta.getClientes().add(cliente);

        return subasta;
    }
}
