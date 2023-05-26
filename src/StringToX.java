public class StringToX {
    //    Octal
    public String StringToOctal(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(CharToOctal((int) input.charAt(i)) + " ");
            output.append(CharToOctal((int) input.charAt(i)) + " ");
        }
        return output.toString();
    }
    public String CharToOctal(int value) {
        StringBuilder output = new StringBuilder();
        while (value > 0) {
            int reste = value % 8;
            output.insert(0, reste);
            value = value/8;
        }
        if (output.length() < 3) {
            output.insert(0, "0");
        }
        return output.toString();
    }
    //    Binary
    public String StringToBinary(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(CharToBinary((int) input.charAt(i)) + " ");
        }
        return output.toString();
    }
    public String CharToBinary(int value) {
        StringBuilder output = new StringBuilder();
        int reste = 0;
        while (value > 0) {
            reste = value % 2;
            output.insert(0, reste);
            value /= 2;
        }
        while (output.length() < 8) {
            output.insert(0, "0");
        }
        return output.toString();
    }
    //    Hexadecimal
    public String StringToHexa(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(CharToHex((int) input.charAt(i)) + " ");
        }
        return output.toString();
    }

    public String CharToHex(int value) {
        StringBuilder output = new StringBuilder();
        int reste;
        while(value > 0) {
            reste = value % 16;
            output.insert(0, getHex(reste));
            value = value/16;
        }
        return output.toString();
    }
    public static char getHex(int i) {
        if (i >= 0 && i <= 9) {
            return (char) ('0' + i);
        } else {
            return (char) ('A' + (i-10));
        }
    }
//    Decimal
    public String StringToDecimal(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append((int) input.charAt(i) + " ");
        }
        return output.toString();
    }
}
