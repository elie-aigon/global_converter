import java.util.HashMap;
import java.util.Map;

public class GlobalConverter {
    private static Map<Character, String> DicFirstStep = new HashMap<>();
    private static Map<Character, String> DicFinalStep = new HashMap<>();

    public static void main(String[] args) {
        String input = CheckInput(args[0]);
        String output1;
        String output2;
        output1 = ConvertFirstStep(input, args[1]);
        output2 = ConvertFinalStep(output1, args[2]);
        System.out.println("Output : " + output2);
    }
    public static String CheckInput(String input) {
        return input.replaceAll("[^a-zA-Z0-9 ]","");
    }
    public static String ConvertFirstStep(String input, String args1) {
        StringBuilder output = new StringBuilder();
        switch(args1) {
            case "-h":
            case "hexadecimal":
                DicFirstStep = Dic.GetDicHexa();
                for (String x : input.split(" ")) {
                    for (Map.Entry<Character, String> entry : DicFirstStep.entrySet()) {
                        if (entry.getValue().equals(x)) {
                            output.append(entry.getKey());
                        }
                    }
                }return output.toString();
            case "-o":
            case "octal":
                DicFirstStep = Dic.GetDicOctal();
                for (String x : input.split(" ")) {
                    for (Map.Entry<Character, String> entry : DicFirstStep.entrySet()) {
                        if (entry.getValue().equals(x)) {
                            output.append(entry.getKey());
                        }
                    }
                }return output.toString();
            case "-b":
            case "binary":
                DicFirstStep = Dic.GetDicBinary();
                for (String x : input.split(" ")) {
                    for (Map.Entry<Character, String> entry : DicFirstStep.entrySet()) {
                        if (entry.getValue().equals(x)) {
                            output.append(entry.getKey());
                        }
                    }
                }return output.toString();
            case "-d":
            case "decimal":
                DicFirstStep = Dic.GetDicDecimal();
                for (String x : input.split(" ")) {
                    for (Map.Entry<Character, String> entry : DicFirstStep.entrySet()) {
                        if (entry.getValue().equals(x)) {
                            output.append(entry.getKey());
                        }
                    }
                }return output.toString();
            default:
                return input;
        }
    }
    public static String ConvertFinalStep(String input, String args2) {
        StringBuilder output = new StringBuilder();
        switch(args2) {
            case "-h":
            case "hexadecimal":
                DicFinalStep = Dic.GetDicHexa();
                for (int i = 0; i< input.length(); i++) {
                    output.append(DicFinalStep.get(input.charAt(i)) + " ");
                }return output.toString();
            case "-o":
            case "octal":
                DicFinalStep = Dic.GetDicOctal();
                for (int i = 0; i< input.length(); i++) {
                    output.append(DicFinalStep.get(input.charAt(i)) + " ");
                }return output.toString();
            case "-b":
            case "binary":
                DicFinalStep = Dic.GetDicBinary();
                for (int i = 0; i< input.length(); i++) {
                    output.append(DicFinalStep.get(input.charAt(i)) + " ");
                }return output.toString();
            case "-d":
            case "decimal":
                DicFinalStep = Dic.GetDicDecimal();
                for (int i = 0; i< input.length(); i++) {
                    output.append(DicFinalStep.get(input.charAt(i)) + " ");
                }return output.toString();
            default:
                output.append(input);
                return output.toString();
        }
    }
}

