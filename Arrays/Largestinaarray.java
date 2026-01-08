// The code is for the Largest element in an Array


public class Largestinaarray{
    public static int largeinarray(int numbers[]){

        int largest = 0;
        for(int i=0;i<numbers.length;i++){

            if(numbers[i]>largest){
                largest = numbers[i];
            }

        }
                return largest;
    }

    public static void main(String args[]){

        int numbers[] = {1,2,3,4,5654,6,767,876,5};

        int result = largeinarray(numbers);

        System.out.print("The Largest Element of the Array is : " + result);
    }
}