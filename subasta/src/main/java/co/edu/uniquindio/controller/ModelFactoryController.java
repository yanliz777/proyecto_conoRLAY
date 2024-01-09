package co.edu.uniquindio.controller;

import co.edu.uniquindio.model.Subasta;

public class ModelFactoryController
{
    private Subasta subasta = new Subasta();
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
    public ModelFactoryController() {}

    public Subasta getSubasta()
    {
        return subasta;
    }

    public boolean iniciarSesion(String cedula, String password) {
        return getSubasta().iniciarSesion(cedula,password);
    }
}
