
public class GlobalConverter {
    public static void main(String[] args) {
        long start = System.nanoTime();
        XToString XToStr = new XToString();
        StringToX StrToX = new StringToX();
        String output1;
        String output2;
//        First Step
        switch(args[0]) {
            case "-h":
            case "hexadecimal":
                output1 = XToStr.HexaToString(args[0].replace(" ",""));
                break;
            case "-o":
            case "octal":
                output1 = XToStr.OctalToString(args[0].split(" "));
                break;
            case "-b":
            case "binary":
                output1 = XToStr.BinaryToString(args[0].split(" "));
                break;
            case "-d":
            case "decimal":
                output1 = XToStr.DecimalToString(args[0].split(" "));
                break;
            default:
                output1 = args[0];
                break;
        }
        switch(args[2]) {
            case "-h":
            case "hexadecimal":
                output2 = StrToX.StringToHexa(output1);
                break;
            case "-o":
            case "octal":
                output2 = StrToX.StringToOctal(output1);
                break;
            case "-b":
            case "binary":
                output2 = StrToX.StringToBinary(output1);
                break;
            case "-d":
            case "decimal":
                output2 = StrToX.StringToDecimal(output1);
                break;
            default:
                output2 = output1;
                break;
        }
        float delta = System.nanoTime() - start;
        System.out.println("Output : " + output2);
        System.out.println("Time : " + delta/1000000 + " ms");
    }
    public static String GetTypeInput(String input) {
        if (input.matches("^([0-1]{8}\s)*$")) {
            System.out.println("1a");
            return "-b";
        } else if (input.matches("^([0][0-7]{3}\s)*$")) {
            System.out.println("2a");
            return "-o";
        } else if (input.matches("^([0-9]+\s)*$")) {
            System.out.println("3a");
            return "-d";            
        } else if (input.matches("^([0-9|A-F]{2}\s)*$")) {
            System.out.println("4a");
            return "-h";
        } else if (input.matches("[0-9a-zA-Z ]")) {
            System.out.println("5a");
            return "-t";
        } else {
            System.out.println("a");
            return "";
        }
    }
}
