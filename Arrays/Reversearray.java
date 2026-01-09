// Revers an Array

import java.util.* ; 
public class Reversearray{
    public static void main(String args[]){

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int Start = 0;
        int End = (numbers.length - 1);

        while(Start<End){

            int temp = numbers[Start];
            numbers[Start] = numbers[End];
            numbers[End]=temp;
            Start ++ ;
            End --;

        }

        for(int i = 0; i < numbers.length; i++){
        System.out.print(numbers[i] + " ");
}


          

    }
}