public class Parse {
    public static boolean isRome = false;

    public static int[] parse(String[] parts) throws Exception {
        int numb1;
        int numb2;
        try {
            numb1 = Roman.valueOf(parts[0]).getValue();
            numb2 = Roman.valueOf(parts[2]).getValue();
            isRome = true;
        } catch (IllegalArgumentException e) {
            try {
                numb1 = Integer.parseInt(parts[0]);
                numb2 = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e2) {
                throw new Exception("Некорректные данные");
            }

        }
        if (numb1 > 10 || numb2 > 10 || numb1 < 1 || numb2 < 1) {
            throw new Exception("Некорректные данные");
        }
        return new int[]{numb1, numb2};
    }
}
