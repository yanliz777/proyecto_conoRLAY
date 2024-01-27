package co.edu.uniquindio.controller;

import co.edu.uniquindio.mapping.dto.VendedorDto;

import java.util.List;

public class VendedorController {

    ModelFactoryController modelFactoryController;
    public VendedorController(){
        modelFactoryController = ModelFactoryController.getInstance();
    }

    public List<VendedorDto> obtenerVendedores() {
        return modelFactoryController.obtenerVendedores();
    }
}
