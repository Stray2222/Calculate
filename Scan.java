import java.util.Scanner;
public class Scan {
    public static String[] sc() throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        if (parts.length > 3) {
            throw new Exception("Принимаются выражения только с двумя аргументами");
        }
        return parts;
    }
}
