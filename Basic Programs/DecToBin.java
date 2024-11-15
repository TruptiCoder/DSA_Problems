public class DecToBin {
    public static void main(String args[]) {
        int dec = 10;
        int bin = 0, pow = 0;

        while(dec > 0) {
            int dig = dec % 2;
            bin = (int) (bin + (dig * Math.pow(10, pow)));
            pow++;
            dec = dec/2;
        }

        System.out.println(bin);
    }
}