module co.edu.uniquindio.subasta {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.subasta to javafx.fxml;
    exports co.edu.uniquindio.subasta;
}