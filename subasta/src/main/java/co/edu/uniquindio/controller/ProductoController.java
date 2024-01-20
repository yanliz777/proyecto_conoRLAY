package co.edu.uniquindio.controller;

import co.edu.uniquindio.model.Producto;

public class ProductoController {

    ModelFactoryController modelFactoryController;
    public ProductoController(){
        modelFactoryController = ModelFactoryController.getInstance();
    }
}
