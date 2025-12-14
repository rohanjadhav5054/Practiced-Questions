public class SquareRoot {
    public static void main(String[] args) {
        int number = 35;
        int squareRoot = findSquareRoot(number);

        System.out.println("Square Root Of the Number Is :- "+squareRoot);
        System.out.println("Square Root using Binary Search Approach :- "+findSquareRootBS(number));
    }

    //linear Search Approach
    static int findSquareRoot(int n){
        int no = 0;
        for(int i = 0;i < n; i++){
            no = i * i;
            if(no == n){
                return i;
            }else if (no > n){
                return i - 1;
            }else{
                no = 0;
            }
        }
        return 0;
    }
    //binary search approach
    static int findSquareRootBS(int x){
        int maxAns = 1;
        int start = 0;
        int end = x;

        while(start <= end){
            int mid = start + (end - start) / 2;
            long sq = (long)mid * mid;
            if(sq == x){
                return mid;
            } else if (sq <= x) {
                start = mid + 1;
                maxAns = Math.max(mid , maxAns);
            }else {
                end = mid - 1;
            }
        }
        return maxAns;
    }
}
