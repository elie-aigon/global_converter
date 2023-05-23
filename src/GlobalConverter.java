import java.util.Scanner;

public class GlobalConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        ToHexa th = new ToHexa();
        String output = th.StringToHex(str);
        System.out.println(output);
    }
    public static String CheckInput(String input) {
        return input = input.replaceAll("[^a-zA-Z0-9]","");
    }

}
