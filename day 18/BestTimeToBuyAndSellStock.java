public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int prices[] = {2,3,8,4,5,1,6,7,2};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; 
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        System.out.println(maxProfit);
        
     }
}


