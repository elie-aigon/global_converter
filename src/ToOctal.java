public class ToOctal {
    public static String StringToOctal(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(CharToOctal((int) input.charAt(i)) + " ");
        }
        return output.toString();
    }
    public static String CharToOctal(int value) {
        StringBuilder output = new StringBuilder();
        while (value > 0) {
            int reste = value % 8;
            output.insert(0, reste);
            value = value/8;
        } return output.toString();
    }
}
