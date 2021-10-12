module com.mycompany.week_7_java_fxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.week_7_java_fxml to javafx.fxml;
    exports com.mycompany.week_7_java_fxml;
}
