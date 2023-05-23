public class ToBinary {
    public static String StringToBinary(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(CharToBinary((int) input.charAt(i)));
        }
        return output.toString();
    }
    public static String CharToBinary(int value) {
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
}
