module com.example.csci2020u_groupproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csci2020u_groupproject to javafx.fxml;
    exports com.example.csci2020u_groupproject;
}