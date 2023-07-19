public class ThirdA {
    public static void main(String[] args) {
        String s = "2?953*6";
        for (int i = 16386304; i < 299539997; i += 2024) {
            String tempI = String.valueOf(i);
            if (i % 10 == 6 && tempI.charAt(0) == s.charAt(0) && tempI.substring(2, 5).equals(s.substring(2,5)) && i % 552 == 0) {
                System.out.println(i);
            }
        }
    }
}
