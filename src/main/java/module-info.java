module reLabel {

    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires nrjavaserial;

    exports pl.javastart.hellofx to javafx.graphics;
    exports pl.kmk.reLabel.controllers to javafx.fxml;

    opens pl.kmk.reLabel.controllers to javafx.fxml;
}