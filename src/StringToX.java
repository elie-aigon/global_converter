import java.util.Map;

public class StringToX {
    private final Map<Character, String[]> dic = DicASCII.getDic();
    public String StringToBinary(String input) {
        String output = "";
        for(int i = 0; i< input.length(); i++) {
            System.out.println(input.charAt(i));
            output += dic.get(input.charAt(i))[2] + " ";

        }
        return output;
    }
}
