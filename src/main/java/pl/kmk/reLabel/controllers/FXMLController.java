package pl.kmk.reLabel.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pl.javastart.hellofx.Utils.IpClient;

public class FXMLController {

    @FXML
    private Button startButton;

    @FXML
    public void initialize(){
        startButton.setText("sendToFIS");
    }

    @FXML
    public void sendToFis(ActionEvent actionEvent) {
        System.out.println("SEND TO FIS " + actionEvent.getClass().getCanonicalName());

       try(IpClient ipClient = new IpClient()) {
           final String actual = ipClient.sendAndReceiveIPMessage("10.235.241.235", 24364, "HandleGETSTATIONLIST|");

           System.out.println("FIS Response : " + actual);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
