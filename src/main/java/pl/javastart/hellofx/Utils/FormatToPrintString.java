package pl.javastart.hellofx.Utils;

import java.io.IOException;
import java.util.Optional;

public class FormatToPrintString {

    private String currentAPN;
    private String newAPN;

    public static void main(String[] args) {
        final String input = "V28112233VVVVVVVVVV";
        final String currentAPN = "28112233";
        final String newAPN = "28114444";
        FormatToPrintString formatToPrintString = new FormatToPrintString();
        String output = formatToPrintString.prepareStringToPrint(input);

        System.out.println(output);
    }


    public String prepareStringToPrint(final String input) {

        currentAPN = input.substring(0, 8);

        CrossRef newApn = this.getNewApn(currentAPN);
        newAPN = newApn.getNewAPN();

        return input.replace(currentAPN, newAPN);
    }


    private CrossRef getNewApn(final String currentAPN) {

        MyJson myJson = new MyJson();
        String path = "src/main/resources/CrossRefFile.json";
        Optional<CrossRef> readOptionalCrossRef = myJson.read(currentAPN, path);
        if (readOptionalCrossRef.isPresent()) {
            return readOptionalCrossRef.get();
        }

        return null;
    }

    public String getCurrentAPN() {
        return currentAPN;
    }

    public String getNewAPN() {
        return newAPN;
    }
}
