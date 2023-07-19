public class SecondA {
    public static void main(String[] args) {
        for (int i = 13211; i < 98342; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt == Math.ceil(sqrt) && isNumberGood(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isNumberGood(int n) {
        int c = 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) c += 2;
            if (c > 3) return false;
        }
        return c == 3;
    }
}
