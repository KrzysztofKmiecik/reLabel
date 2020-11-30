package pl.javastart.hellofx.Utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MyJsonTest {


    @Test
    public void readTest() throws IOException {

        MyJson myJson =new MyJson();

        String expected="28114444";
        String current="";
        Optional<CrossRef> apnToPrint = myJson.read("28112233","src/main/resources/CrossRefFile.json");
        if(apnToPrint.isPresent()){
            current=apnToPrint.get().getNewAPN();

        }

        assertEquals(expected,current);
    }

}