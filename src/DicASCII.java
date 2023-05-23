import java.util.HashMap;
import java.util.Map;

public class DicASCII {
    private static Map<Character, String[]> dic = new HashMap<>();

    static {
        ToOctal TO = new ToOctal();
        ToBinary TB = new ToBinary();
        ToDecimal TD = new ToDecimal();
        ToHexa TH = new ToHexa();
        for (int i = 48; i <= 122; i++) {
            String c = ""+ (char) i;
            if (Character.isLetterOrDigit(c)){
                String decimal = TD.StringToDecimal(c);
                String hexadecimal = TH.StringToHex(c);
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
