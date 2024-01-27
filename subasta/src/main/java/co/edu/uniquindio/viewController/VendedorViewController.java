package co.edu.uniquindio.viewController;

import co.edu.uniquindio.controller.VendedorController;
import co.edu.uniquindio.enums.TipoUsuario;
import co.edu.uniquindio.mapping.dto.VendedorDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class VendedorViewController {

    VendedorController vendedorControllerService;
    ObservableList<VendedorDto> listaVendedores = FXCollections.observableArrayList();
    ObservableList<String> listaTipoUsuario = FXCollections.observableArrayList();
    VendedorDto vendedorDtoSeleccionado;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnCambiarPassword;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnCrear;

    @FXML
    private Button btnEliminar;

    @FXML
    private ComboBox<String> cmbTipoUsuario;

    @FXML
    private TableColumn<VendedorDto, String> colApellidos;

    @FXML
    private TableColumn<VendedorDto, String> colCedula;

    @FXML
    private TableColumn<VendedorDto, String> colDireccion;

    @FXML
    private TableColumn<VendedorDto, String> colEmail;

    @FXML
    private TableColumn<VendedorDto, String> colNombres;

    @FXML
    private TableColumn<VendedorDto, String> colTelefono;

    @FXML
    private TableView<VendedorDto> tblVendedores;

    @FXML
    private TextField txfApellidos;

    @FXML
    private TextField txfCedula;

    @FXML
    private TextField txfDireccion;

    @FXML
    private TextField txfEmail;

    @FXML
    private TextField txfNombres;

    @FXML
    private TextField txfTelefono;

    @FXML
    void EliminarVendedor(ActionEvent event) {

    }

    @FXML
    void actualizarVendedor(ActionEvent event) {

    }

    @FXML
    void buscarVendedor(ActionEvent event) {

    }

    @FXML
    void cancelarBusqueda(ActionEvent event) {
        limpiarCamposVendedores();
    }

    @FXML
    void crearVendedor(ActionEvent event) {

    }

    @FXML
    void initialize(){
        vendedorControllerService = new VendedorController();
        initView();
    }

    private void initView(){
        initDataBinding();
        obtenerVendedores();
        mostrarTipoUsuario();
        listenerSelection();
    }

    private void initDataBinding(){
        colNombres.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        colApellidos.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellidos()));
        colEmail.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().email()));
        colCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));
        colTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().telefono()));
        colDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion()));
    }

    private void listenerSelection() {
        tblVendedores.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            vendedorDtoSeleccionado = newSelection;

            mostrarInformacionVendedor(vendedorDtoSeleccionado);
        });
    }

    private void mostrarTipoUsuario(){
        listaTipoUsuario.add(String.valueOf(TipoUsuario.ADMINISTRADOR));
        listaTipoUsuario.add(String.valueOf(TipoUsuario.CLIENTE));
        listaTipoUsuario.add(String.valueOf(TipoUsuario.VENDEDOR));
        cmbTipoUsuario.setItems(listaTipoUsuario);
    }

    private void obtenerVendedores() {
        listaVendedores.addAll(vendedorControllerService.obtenerVendedores());
    }

    private void mostrarInformacionVendedor(VendedorDto vendedorDtoSeleccionado) {
        if(vendedorDtoSeleccionado != null){
            txfNombres.setText(vendedorDtoSeleccionado.nombre());
            txfApellidos.setText(vendedorDtoSeleccionado.apellidos());
            txfCedula.setText(vendedorDtoSeleccionado.cedula());
            txfTelefono.setText(vendedorDtoSeleccionado.telefono());
            txfDireccion.setText(vendedorDtoSeleccionado.direccion());
            txfEmail.setText(vendedorDtoSeleccionado.email());
        }
    }

    private void limpiarCamposVendedores() {
        txfNombres.setText("");
        txfApellidos.setText("");
        txfCedula.setText("");
        txfTelefono.setText("");
        txfDireccion.setText("");
        txfEmail.setText("");
    }

    private boolean mostrarMensajeConfirmacion(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText(mensaje);
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }
    }

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }

}
