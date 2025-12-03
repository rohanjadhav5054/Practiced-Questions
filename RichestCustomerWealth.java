public class RichestCustomerWealth {
    /*
    * Leetcode Problem 1672 - Richest Customer Wealth
    * {{12,3,4},{2,3,4}}
    * output :
    * coustomer 1 -> 12 + 3 + 4 = 19
    * customer 2 -> 2 + 3 + 4 = 9
    *
    * More richest is customer 1 wealth is 19 -> output = 19
    * */
    public static void main(String[] args) {
        int nums[][] = {
                {1,2,3},
                {4,5,6},
                {2,3,4}
        };
        System.out.println(maximumWealth(nums));
    }
    static int maximumWealth(int accounts[][]){
        int maxAmount = 0;
        int amount = 0;
        for(int person = 0;person < accounts.length;person++){
            //whenevr starting from the new column get the new sum
            amount = 0;
            for(int account = 0;account < accounts[person].length;account++){
                amount += accounts[person][account];
            }
//            if(amount > maxAmount){
//                maxAmount = amount;
//            }

            //Optimization of above method
            maxAmount = Math.max(maxAmount,amount);//calculation the maximum
        }
        return maxAmount;
    }

}
