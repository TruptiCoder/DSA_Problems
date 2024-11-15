public class Stocks {

    public static int BuyStocks(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxP = 0;
        for (int i = 0; i < arr.length; i++) {
            int sp = i;
            if(buyPrice < sp) {
                int p = sp - buyPrice;
                maxP = Math.max(p, maxP);
            }   
            else {
                buyPrice = sp;
            }
        }
        return maxP;
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum profit is " + BuyStocks(prices));
    }
}