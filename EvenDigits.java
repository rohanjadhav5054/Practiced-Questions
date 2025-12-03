public class EvenDigits {
    /*
    * 1295 Leetcode Find Numbers with even no of digits .
    * Approach 1: Using StringBuilder
    * Approach 2: */
    public static void main(String[] args) {
        find1(new int[]{1, 2, 3, 4, 5, 6, 23, 67, 1234});
        System.out.println(findNumbers(new int[]{1, 2, 3, 4, 5, 6, 23, 67, 1234}));
    }
    //Using StringBuilder
    static void find1(int nums[]){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < nums.length;i++){
            sb.append(nums[i]);
            if(sb.length() % 2 == 0){
                count++;
            }
            sb.setLength(0);
        }
        System.out.println(count);
    }

    /*
    * Approach 2 using counting the digits
    * */

    static int findNumbers(int[] nums){
        int count = 0;
        for(int no : nums){
            if(even(no)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int number){
//        if(countNumber(number) % 2 == 0){
//            return true;
//        }
//        return false;
        return countNumber1(number) % 2 == 0;
    }

    static int countNumber(int number){
        int count = 0;
        if(number < 0){
            number =  number * -1;
        }
        if(number == 0){
            return 1;
        }
        while(number > 0){
            number = number / 10;
            count++;
        }
        return count;
    }

    //optimizing the counting the numbers
    static int countNumber1(int number){
        return (int)(Math.log10(number)+1);
    }

}
