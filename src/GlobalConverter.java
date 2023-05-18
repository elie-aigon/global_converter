import java.util.Scanner;

public class GlobalConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringToX stringtox = new StringToX();
        System.out.println(stringtox.StringToBinary(CheckInput(str)));
    }
    public static String CheckInput(String input) {
        return input = input.replaceAll("[^a-zA-Z0-9]","");
    }

}
