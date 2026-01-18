public class Maxsubarray {

    // The Max subarray
    public static void main(String args[]) {

        int num[] = {1,2,3,4,5,6,7,8,9,10};

        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < num.length; i++) {
            for(int j = i; j < num.length; j++) {

                int sum = 0; 

                for(int k = i; k <= j; k++) {
                    sum += num[k];
                }

                if(sum > maxsum) {
                    maxsum = sum;
                }
            }
        }

        System.out.println("The Maximum Subarray Sum is: " + maxsum);
    }
}
