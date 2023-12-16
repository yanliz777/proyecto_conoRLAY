package co.edu.uniquindio.viewController;

import co.edu.uniquindio.controller.LoginController;
import co.edu.uniquindio.subasta.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController
{
    Main ventana = new Main();
    private LoginController  loginController = new LoginController();//se instancia para poder trabajar con los métodos que esta
    //clase crados con el oprador . "punto"
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
