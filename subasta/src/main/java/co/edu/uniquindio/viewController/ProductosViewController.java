package co.edu.uniquindio.viewController;

import co.edu.uniquindio.controller.ProductoController;
import co.edu.uniquindio.mapping.dto.ProductoDto;
import co.edu.uniquindio.mapping.dto.VendedorDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ProductosViewController {

    ProductoController productoControllerService;
    ObservableList<ProductoDto> listaProductos = FXCollections.observableArrayList();
    ObservableList<VendedorDto> listaVendedores = FXCollections.observableArrayList();
    ObservableList<String> listaTipoProducto = FXCollections.observableArrayList();
    VendedorDto vendedorDtoSeleccionado;
    ProductoDto productoDtoSeleccionado;
    String foto;


    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnCrear;

    @FXML
    private Button btnEliminar;

    @FXML
    private ImageView imagen;

    @FXML
    private ComboBox<VendedorDto> cmbVendedor;

    @FXML
    private ComboBox<String> cmbTipoProducto;

    @FXML
    private TableColumn<ProductoDto, String> colVendedor;

    @FXML
    private TableColumn<ProductoDto, String> colCodigo;

    @FXML
    private TableColumn<ProductoDto, String> colNombreProducto;

    @FXML
    private TableColumn<ProductoDto, String> colTipoProducto;

    @FXML
    private TableView<ProductoDto> tblProductos;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombreProducto;

    @FXML
    void EliminarProducto(ActionEvent event) {

    }

    @FXML
    void actualizarProducto(ActionEvent event) {

    }

    @FXML
    void buscarProducto(ActionEvent event) {

    }

    @FXML
    void cancelarBusqueda(ActionEvent event) {

    }

    @FXML
    void crearProducto(ActionEvent event) {

    }

    @FXML
    void initialize(){
        productoControllerService = new ProductoController();
    }

}
