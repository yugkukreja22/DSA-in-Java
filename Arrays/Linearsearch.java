import java.util.*;
public class Linearsearch{
    public static int linearsearch(int Marks[], int key){
        for(int i=0;i<Marks.length;i++){
            if(Marks[i]==key)
                return i;
            }
            return -1;
        }
               
    
    public static void main(String args[]){
        
        int Marks[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number you want to find out : ");
        int key = sc.nextInt();

        int Index = linearsearch(Marks,key);

        if(Index==-1){
            System.out.print("Not Found");
        }
        else{
            System.out.print("The Index of the number is : " + Index);
        }

    }
}
