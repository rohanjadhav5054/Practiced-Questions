import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class HashSetPractice {
    public static void main(String[] args) {

        int arr[] = {1,5,7,8};
        Set<Integer> hs = new HashSet<>();
        List<Integer> ls = new ArrayList<>();

        for(int n : arr){
            hs.add(n);
        }
        System.out.println(hs);

        for(int i = 1;i < arr[arr.length - 1];i++){
            if(!hs.contains(i)){
                ls.add(i);
            }
        }

        System.out.println(ls);


        System.out.println(ls.get(3) - 1);


    }
}
