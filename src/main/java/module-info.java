module reLabel {

    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires nrjavaserial;
    requires com.google.gson;

    exports pl.javastart.hellofx to javafx.graphics;
    exports pl.kmk.reLabel.controllers to javafx.fxml;

    opens pl.kmk.reLabel.controllers to javafx.fxml;
    opens pl.javastart.hellofx.Utils to com.google.gson;
}