package Interview_Code;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
         int[] arr = {1,2,3,2,1,4,5};

         Set<Integer> set= new LinkedHashSet<>();
         for(int n: arr){
            set.add(n);
         }
         System.out.println(set);
    }
}
