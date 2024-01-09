package co.edu.uniquindio.subasta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * Acá vamos a tener varios métodos que se van a encargar de abrir
 * las diferentes ventanas.
 */
public class Main extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 480);
        stage.setTitle("Proyecto subasta");
        stage.setScene(scene);
        stage.show();
    }

    public void cargarVentanaRegistro() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("registrarse.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.centerOnScreen();
        stage2.setTitle("ventana registro");
        stage2.setScene(scene);
        stage2.setResizable(false);//para tener un tamaño unico
        stage2.show();
    }

    public void volverAinicio() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.centerOnScreen();
        stage2.setTitle("ventana registro");
        stage2.setScene(scene);
        stage2.setResizable(false);//para tener un tamaño unico
        stage2.show();
    }

    public void cargarVentanaTabuladores() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tabuladores.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.centerOnScreen();
        stage2.setTitle("ventana tabuladores");
        stage2.setScene(scene);
        stage2.setResizable(false);//para tener un tamaño unico
        stage2.show();
    }

    public static void main(String[] args) {
        launch();
    }
}