module co.edu.uniquindio.subasta//maneja toda la parte gráfica del proyecto
{
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.subasta to javafx.fxml;
    exports co.edu.uniquindio.subasta;
    opens co.edu.uniquindio.viewController to javafx.fxml;
    exports co.edu.uniquindio.viewController;

}