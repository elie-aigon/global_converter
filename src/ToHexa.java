public class ToHexa {
    public static String StringToHex(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            output.append(CharToHex(c) + " ");
        }
        return output.toString();
    }
    public static String CharToHex(char c) {
        StringBuilder output = new StringBuilder();
        int value = (int) c;
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
}