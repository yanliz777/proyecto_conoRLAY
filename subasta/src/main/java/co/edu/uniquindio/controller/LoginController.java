package co.edu.uniquindio.controller;

public class LoginController
{
    ModelFactoryController modelFactoryController = new ModelFactoryController();

    public LoginController()
    {
        this.modelFactoryController = ModelFactoryController.getInstance();
    }

    public boolean iniciarSesion(String cedula,String password)
    {
        return  modelFactoryController.iniciarSesion(cedula, password);
    }
}
