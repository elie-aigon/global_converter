public class XToString {
//    Hexa
    public String HexaToString(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i+= 2){
            int value = getHexValue(input.charAt(i)) * 16 + getHexValue(input.charAt(i+1));
            output.append((char) value);
        }
        return output.toString();
    }
    private static int getHexValue(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        } else if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        } else {
            throw new IllegalArgumentException("Bad char : " + c);
        }
    }
//  Octal
    public String OctalToString(String[] input) {
        StringBuilder output = new StringBuilder();
        for(String octal : input) {
            output.append((char) GetOctalValue(octal));
        }
        return output.toString();
    }
    public static int GetOctalValue(String octal) {
        int result = 0;
        int base = 1;
        for (int i = octal.length() - 1; i >= 0; i--) {
            result += (octal.charAt(i) - '0') * base;
            base *= 8;
        }
        return result;
    }
//    Binary
    public String BinaryToString(String[] input) {
        StringBuilder output = new StringBuilder();
        for (String binary : input) {
            output.append((char) GetBinaryValue(binary));
        }
        return output.toString();
    }
    private static int GetBinaryValue(String binary) {
        int result = 0;
        int base = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            result += (binary.charAt(i) - '0') * base;
            base *= 2;
        }
        return result;
    }
    public String DecimalToString(String[] input) {
        StringBuilder output = new StringBuilder();
        for (String x : input) {
            output.append((char) Integer.parseInt(x));
        }
        return output.toString();
    }
}
