import java.io.OutputStream;
import java.util.Scanner;

public class GlobalConverter {
    public static void main(String[] args) {
        String str = args[1];
        String ouput;
        switch (args[0]) {
            case "-h":
            case "hexadecimal":
                ToHexa TH = new ToHexa();
                ouput = TH.StringToHex(CheckInput(str));
                System.out.println(ouput);
                break;
            case "-d":
            case "decimal":
                ToDecimal TD = new ToDecimal();
                ouput = TD.StringToDecimal(CheckInput(str));
                System.out.println(ouput);
                break;
            case "-o":
            case "octal":
                ToOctal TO = new ToOctal();
                ouput = TO.StringToOctal(CheckInput(str));
                System.out.println(ouput);
                break;
            case "-b":
            case "binary":
                ToBinary TB = new ToBinary();
                ouput = TB.StringToBinary(CheckInput(str));
                System.out.println(ouput);
                break;
            case "-t":
            case "text":

            default:
                System.out.println("Wrong options spelling.\n" +
                        "First argument spelling :\n" +
                        "'-h' = convert to hexadecimal.\n" +
                        "'-o' = convert to octal.\n" +
                        "'-b' = convert to binary.\n" +
                        "'-d' = convert to decimal.\n" +
                        "Make sure to quote your string correctly.");
        }
    }
    public static String CheckInput(String input) {
        return input.replaceAll("[^a-zA-Z0-9 ]","");
    }


}
