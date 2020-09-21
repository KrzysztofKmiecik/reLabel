package pl.javastart.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainPane = FXMLLoader.load(getClass().getResource("/FXML/MainView.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);


        //  stage.setFullScreen(true);
        stage.setResizable(false);
        stage.initStyle(StageStyle.DECORATED);
        stage.setOpacity(1);

        stage.setTitle("reLabel");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
