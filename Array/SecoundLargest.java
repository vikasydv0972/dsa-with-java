package Array;
import java.util.*;

public class SecoundLargest {
    public static void main(String[] args) {
        int arr[]={99,12,54,2,5,7,9,32};
        int largest= Integer.MIN_VALUE;
        int Secound=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                Secound=largest;
                largest=arr[i];
            }
            else if(arr[i]>Secound && arr[i]!=largest){
                Secound=arr[i];
            }
        }
        System.out.println(Secound);
        System.out.println(largest);

    }
}
