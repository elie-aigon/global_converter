public class ToDecimal {
    public static int StringToDecimal(String input) {
        int init = 0;
        for (int i = 0; i< input.length(); i++) {
            char c = input.charAt(i);
            int x = CharToDecimal(c);
            init = init * 10 + x;
        } return init;
    }
    public static int CharToDecimal(char c) {
        if(c >= '0' && c <= '9') {
            return c - '0';
        } else {
            throw new IllegalArgumentException("Wrong char input : " + c);
        }
    }
}
