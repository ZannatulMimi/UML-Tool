module com.example.uml_tool {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uml_tool to javafx.fxml;
    exports com.example.uml_tool;
}