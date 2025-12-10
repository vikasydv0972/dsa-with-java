package Interview_Code;

public class MaxMinArray {
    public static void main(String[] args) {
         int[] arr = {5, 1, 8, 3, 9};
         int max= arr[0];
         int min=arr[0];

         for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
         }

         System.out.println(max);
         System.out.println(min);

    }
}
