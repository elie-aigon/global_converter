import java.util.HashMap;
import java.util.Map;

public class DicASCII {
    private static Map<Character, String[]> dic = new HashMap<>();

    static {

        for (int i = 48; i <= 122; i++) {
            char caractere = (char) i;
            if (Character.isLetterOrDigit(caractere)){
                String decimal = Integer.toString(i);
                String hexadecimal = Integer.toHexString(i);
                String binaire = Integer.toBinaryString(i);
                String octal = Integer.toOctalString(i);
                String[] trads = { decimal, hexadecimal, binaire, octal };
                dic.put(caractere, trads);
            }
        }
    }
    public static Map<Character, String[]> getDic() {
        return dic;
    }
}
