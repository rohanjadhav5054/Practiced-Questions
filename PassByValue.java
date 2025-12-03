import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(arr));
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeValue(int arr[]){
        int count = 0;
        for(int i = 12;i < 22;i++){
            arr[count++] = i;
        }
    }
}
/*
* In Java There no exist pass by reference only exist pass by value
* pass by reference not exist due to pointers are not available in java
*
* Java Passed the copy of reference not the object itself
* So Modified object affects the original
 * Both the original reference and copied reference point to the same object
*
* Why?
* Because java copies the reference(address) , not the object itself
*  when you pass an object to an method
* - java does not create new object
* - java does not copy the full object
* -- java only copies the memory address of that object
* so the method receives the duplicate adress  - a second reference
* thus both reference point to the same memory location
*  */