package co.edu.uniquindio.viewController;

import co.edu.uniquindio.controller.LoginController;
import co.edu.uniquindio.enums.TipoUsuario;
import co.edu.uniquindio.subasta.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginViewController
{
    /*Se instancian los siguientes objetos para poder trabajar con los métodos que están
    en estas clases con el operador . "punto"
    */
    private final ObservableList<TipoUsuario> tipoUsuarios = FXCollections.observableArrayList();
    Main ventana = new Main();
    private LoginController  loginController = new LoginController();
    @FXML
    private Button btnRegistar;

    @FXML
    private TextField txtPasswordLogin;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtCedulaLogin;

    @FXML
    void logear(ActionEvent event) throws IOException
    {
        iniciarSesion();

    }

    @FXML
    void registrar(ActionEvent event) throws IOException
    {
        registraNuevasCuentas();
    }


    public void registraNuevasCuentas() throws IOException
    {
        cerrarVentana(btnRegistar);
        ventana.cargarVentanaRegistro();
    }


    public void iniciarSesion() throws IOException
    {
        String cedula = txtCedulaLogin.getText();
        String password = txtPasswordLogin.getText();

        if (loginController.iniciarSesion(cedula,password))
        {
            cerrarVentana(btnLogin);
            ventana.cargarVentanaTabuladores();
        }

    }

    public void cerrarVentana(Button btn)
    {
        //Stage = escenario
        //Scene = escena
        Stage stage = (Stage)btn.getScene().getWindow();
        stage.close();
    }
}
