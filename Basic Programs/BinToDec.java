public class BinToDec {
    public static void main(String[] args) {
        int bin = 1101001;
        int dec = 0, pow = 0;

        int n = bin;

        while(bin > 0) {
            int dig = bin % 10;
            dec = (int) (dec + (dig * Math.pow(2, pow)));
            pow++;
            bin = bin / 10;
        }

        System.out.println(n + " = " + dec);
    }
}