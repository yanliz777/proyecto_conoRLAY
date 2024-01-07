package co.edu.uniquindio.controller;

import co.edu.uniquindio.enums.TipoUsuario;

public class LoginController
{
    ModelFactoryController modelFactoryController = new ModelFactoryController();

    public LoginController()
    {
        this.modelFactoryController = ModelFactoryController.getInstance();
    }

    public boolean iniciarSesion(String cedula,String password)
    {   //lo comparamos con la cedula porque la cedula es la que me indica el usuario que está ingresando
        if(TipoUsuario.CLIENTE.equals(cedula)) {
            return  modelFactoryController.iniciarSesionCliente(cedula, password);
        }
        else if (TipoUsuario.VENDEDOR.equals(cedula)) {
            return  modelFactoryController.iniciarSesionVendedor(cedula, password);
        }
        else{
            return  modelFactoryController.iniciarSesionAdministrador(cedula, password);
        }
    }
}
