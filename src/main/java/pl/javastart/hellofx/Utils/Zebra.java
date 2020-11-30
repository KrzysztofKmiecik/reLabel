package pl.javastart.hellofx.Utils;

import java.util.concurrent.TimeoutException;

public class Zebra {

    private String zpl;
    private RS232 rs232;
    private char terminator = Character.LINE_SEPARATOR;
    private char timeout;

    public Zebra(String zpl, RS232 rs232) {
        this.zpl = zpl;
        this.rs232 = rs232;

    }

    public void close() {
        rs232.close();
    }

    public String sendAndReceiveData(String dataToSend) {
        zpl.replace("<dataToSend>", dataToSend);
        return sendAndReceive(zpl);


    }

    public String sendAndReceivedCommand(String command) {
        return sendAndReceive(command);
    }

    private String sendAndReceive(String command) {
        String receivedStr = "";
        try {
            receivedStr = rs232.writeAndRead(command, terminator, timeout);
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());

        }
        return receivedStr;
    }


}
