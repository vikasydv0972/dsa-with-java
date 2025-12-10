package Interview_Code;
import java.util.*;

// find missing  number 
public class MissingArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int sum2=0;
        int n= arr.length+1;      
        int sum1= n*(n+1)/2;

    
        for(int x: arr){
            sum2= sum2+x;
            
        }
        int missingNum= sum1-sum2;
        System.out.println(missingNum);

    }
}
