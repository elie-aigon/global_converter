public class ToDecimal {
    public static String StringToDecimal(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i< input.length(); i++) {
            int init = 0;
            int c = (int) input.charAt(i);
            init = init * 10 + c;
            output.append(init + " ");
        } return output.toString();
    }
}
