import java.util.*;

// Smallest element in a array 

public class Smallestinaarray{
    public static int smallinarray(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
            return smallest;
    }
    public static void main(String args[]){

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        int result = smallinarray(numbers);
        System.out.print("The smallest in an element : " + result);

    }
}