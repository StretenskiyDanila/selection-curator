public class SecondB {
    public static void main(String[] args) {
        for (int i = 13211; i < 1012010201; i++) {
            double sqrt1 = Math.sqrt(i);
            if (sqrt1 == Math.ceil(sqrt1)) {
                double sqrt2 = Math.sqrt(sqrt1);
                if (sqrt2 == Math.ceil(sqrt2) && isSimpleNumber((int) sqrt2)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isSimpleNumber(int n) {
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
