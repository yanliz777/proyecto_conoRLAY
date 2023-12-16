package co.edu.uniquindio.viewController;

import co.edu.uniquindio.subasta.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrarseViewController
{
    Main ventana = new Main();
    @FXML
    private Button btnAtrasRegistro;
    @FXML
    private TextField txtApellido_registro;

    @FXML
    private TextField txtFechaNaciemiento_registro;

    @FXML
    private TextField txtPassword_registro;

    @FXML
    private TextField txtEmail_registro;

    @FXML
    private TextField txtCedula_registro;

    @FXML
    private TextField txtDireccion_registro;

    @FXML
    private TextField txtNombre_registro;

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField txtTelefono_registro;


    @FXML
    void atras(ActionEvent event) throws IOException
    {
        cerrarVentana(btnAtrasRegistro);
        ventana.volverAinicio();
    }

    @FXML
    void registrar(ActionEvent event) {

    }

    public void cerrarVentana(Button btn)
    {
        //Stage = escenario
        //Scene = escena
        Stage stage = (Stage)btn.getScene().getWindow();
        stage.close();
    }
}

