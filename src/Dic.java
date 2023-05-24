import java.util.HashMap;
import java.util.Map;

public class Dic {
    private static Map<Character, String> dic = new HashMap<>();
//    Dic Creation
    public static Map<Character, String> GetDicHexa() {
        for (int i = 32; i <= 122;i++) {
            dic.put((char) i ,CharToHex((char) i));
        }
        return dic;
    }
    public static Map<Character, String> GetDicBinary() {
        for (int i = 32; i <= 122;i++) {
            dic.put((char) i ,CharToBinary(i));
        }
        return dic;
    }
    public static Map<Character, String> GetDicDecimal() {
        for (int i = 32; i <= 122;i++) {
            dic.put((char) i ,String.valueOf(i));
        }
        return dic;
    }
    public static Map<Character, String> GetDicOctal() {
        for (int i = 32; i <= 122;i++) {
            dic.put((char) i ,CharToOctal(i));
        }
        return dic;
    }

//    Octal
    public static String CharToOctal(int value) {
        StringBuilder output = new StringBuilder();
        while (value > 0) {
            int reste = value % 8;
            output.insert(0, reste);
            value = value/8;
        }
        return output.toString();
    }
//    Binary
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
//    Hexadecimal
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