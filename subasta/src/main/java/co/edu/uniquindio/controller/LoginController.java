package co.edu.uniquindio.controller;

import co.edu.uniquindio.enums.TipoUsuario;

public class LoginController
{
    ModelFactoryController modelFactoryController;

    public LoginController()
    {
        this.modelFactoryController = ModelFactoryController.getInstance();
    }

    public boolean iniciarSesion(String cedula,String password)
    {
        return  modelFactoryController.iniciarSesion(cedula, password);

    }
}
