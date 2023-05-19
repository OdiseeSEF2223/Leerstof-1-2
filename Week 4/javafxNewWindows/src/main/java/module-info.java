module com.example.javafxnewwindows {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxnewwindows to javafx.fxml;
    exports com.example.javafxnewwindows;
}