public class subarrays{

    // Subarrays //test commit
    public static void main(String args[]){
        
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;

        for(int i=0;i<numbers.length;i++){
            int Start = i;
        for(int j=i;j<numbers.length;j++){
            int End = j;
        for(int k=Start;k<=End;k++){
            System.out.print(numbers[k] + " ");
        }
        count ++;
        System.out.println();
        }
        System.out.println();
        }
        System.out.print("The total number of subarrays are : " + count);
    }
}