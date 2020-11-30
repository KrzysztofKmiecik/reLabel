package pl.javastart.hellofx.Utils;

public class FormatToPrintString {

    public static void main(String[] args) {
        final String input = "V28112233VVVVVVVVVV";
        final String currentAPN = "28112233";
        final String newAPN = "28114444";
        FormatToPrintString formatToPrintString=new FormatToPrintString();
        String output = formatToPrintString.prepareStringToPrint(input, currentAPN, newAPN);

        System.out.println(output);
    }


    public String prepareStringToPrint(final String input,
                                               final String currentAPN,
                                               final String newAPN) {

        return input.replace(currentAPN, newAPN);
    }



}
