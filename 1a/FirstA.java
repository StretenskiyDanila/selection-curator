public class FirstA {
    public static void main(String[] args) {
        for (int i = 2000; i < 2024; i++) {
            int[] num = getDel(i);
            if (num != null) System.out.println(i + " " + num[0] + " " + num[1]);
        }
    }

    public static int[] getDel(int n) {
        int c = 0;
        int[] del = new int[2];
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                if (c >= 2) return null;
                del[c++] = i;
            }
        }
        return c < 2 ? null : del;
    }
}
