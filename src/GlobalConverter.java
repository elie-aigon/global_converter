
public class GlobalConverter {
    public static void main(String[] args) {
        long start = System.nanoTime();
        XToString XToStr = new XToString();
        StringToX StrToX = new StringToX();
        String output1;
        String output2;
        args[0] = args[0].replaceAll("[^a-zA-Z0-9 ]", "");
//        First Step
        switch(args[1]) {
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
}
