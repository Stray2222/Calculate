
public class Main {
    public static void main(String[] args) throws Exception {
        String[] parts = Scan.sc();
        int[] nums = Parse.parse(parts);
        char op = parts[1].charAt(0);
        int result = Calc.calc(nums[0], nums[1], op);
        if (Parse.isRome) {
            System.out.println(Convert.convertArabianToRoman(result));
        }
        if (Parse.isRome & result < 1) {
            throw new Exception("Недопустимая операция");
        } else {
            System.out.println(result);
        }
    }

    private static Main Calc;
    public static int calc(int number1, int number2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Некорректная операция");
        }
        return result;
    }

}