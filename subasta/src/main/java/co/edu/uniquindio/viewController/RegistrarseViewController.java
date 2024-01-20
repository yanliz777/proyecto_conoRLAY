package co.edu.uniquindio.viewController;

import co.edu.uniquindio.controller.ModelFactoryController;
import co.edu.uniquindio.controller.RegistroControlador;
import co.edu.uniquindio.enums.TipoUsuario;
import co.edu.uniquindio.model.Administrador;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Vendedor;
import co.edu.uniquindio.subasta.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class RegistrarseViewController
{
    Main ventana = new Main();
    ModelFactoryController modelFactoryController;
    RegistroControlador controladorSecundario = new RegistroControlador();
    private final ObservableList<TipoUsuario> tipoUsuarios = FXCollections.observableArrayList();
    @FXML
    private ComboBox<TipoUsuario> cmbTipoUsuario_registro;
    @FXML
    private Button btnAtrasRegistro;
    @FXML
    private TextField txtApellido_registro;

 /*   @FXML
    private DatePicker txtFechaNaciemiento_registro;*/

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

  /*  public RegistrarseViewController()
    {
        mostrarTiposUsuarios();
    }*/


    @FXML
    void atras(ActionEvent event) throws IOException
    {
        cerrarVentana(btnAtrasRegistro);
        ventana.volverAinicio();
    }

    /**
     *Método que me permite registrar un usuario que no está registrado en mi
     * sistema
     */
    @FXML
    void registrar(ActionEvent event)
    {
        String nombre = txtNombre_registro.getText();
        String apellido = txtApellido_registro.getText();
        String email = txtEmail_registro.getText();
        String password = txtPassword_registro.getText();
        String cedula = txtCedula_registro.getText();
        String telefono = txtTelefono_registro.getText();
       // LocalDate fechaCaducidad = txtFechaNaciemiento_registro.getValue();
        String dirección = txtDireccion_registro.getText();
        TipoUsuario tipo = cmbTipoUsuario_registro.getSelectionModel().getSelectedItem();

        if(TipoUsuario.VENDEDOR.equals(tipo)) {
            Vendedor vendedor = new Vendedor();
            vendedor.setNommbre(nombre);
            vendedor.setApellidos(apellido);
            vendedor.setEmail(email);
            vendedor.setContraseña(password);
            vendedor.setCedula(cedula);
            vendedor.setTelefono(telefono);
            vendedor.setDireccion(dirección);
            vendedor.setTipopersona(tipo);
            Vendedor vendedor2 = controladorSecundario.registrarUsuario(vendedor);
            System.out.println("guardado vendededor");
            try {
                ventana.cargarVentanaTabuladores();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else if (TipoUsuario.CLIENTE.equals(tipo)) {
            Cliente cliente = new Cliente();
            cliente.setNommbre(nombre);
            cliente.setApellidos(apellido);
            cliente.setEmail(email);
            cliente.setContraseña(password);
            cliente.setCedula(cedula);
            cliente.setTelefono(telefono);
            cliente.setDireccion(dirección);
            cliente.setTipopersona(tipo);
            Cliente cliente2 = controladorSecundario.registrarUsuario(cliente);
            System.out.println("guardado cliente");
            try {
                ventana.cargarVentanaTabuladores();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else if (TipoUsuario.ADMINISTRADOR.equals(tipo)) {
            Administrador administrador = new Administrador();
            administrador.setNommbre(nombre);
            administrador.setApellidos(apellido);
            administrador.setEmail(email);
            administrador.setContraseña(password);
            administrador.setCedula(cedula);
            administrador.setTelefono(telefono);
            administrador.setDireccion(dirección);
            administrador.setTipopersona(tipo);
            Administrador administrador2 = controladorSecundario.registrarUsuario(administrador);;
            System.out.println("guardado administrador");
            try {
                ventana.cargarVentanaTabuladores();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Me permite mostrar en el combo box los Tipos de Producto:
     */
    public void mostrarTiposUsuarios()//para mostrar en el combo box
    {
        tipoUsuarios.add(TipoUsuario.CLIENTE);
        tipoUsuarios.add(TipoUsuario.VENDEDOR);
        tipoUsuarios.add(TipoUsuario.ADMINISTRADOR);
        //cargamos los tipos de productos en el combo box:
        cmbTipoUsuario_registro.setItems(tipoUsuarios);
    }

    public void cerrarVentana(Button btn)
    {
        //Stage = escenario
        //Scene = escena
        Stage stage = (Stage)btn.getScene().getWindow();
        stage.close();
    }
}

