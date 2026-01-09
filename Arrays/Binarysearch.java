import java.util.*;

public class Binarysearch{
    public static void main(String args[]){

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the element you want to find : ");
        int key = sc.nextInt();

        int n = numbers.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
             int mid = (start + end)/2;

             if(numbers[mid]==key){
                System.out.print("The number is found at position"+ ":" + (mid + 1));
                break;
             }
             else if(numbers[mid]>key){
                end = mid - 1 ;
             }
             else if(numbers[mid]<key){
                start = mid + 1 ;
             }
        }
    }
}