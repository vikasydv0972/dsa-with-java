package Interview_Code;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {4,1,5,2,3};

        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }               
            }            
        }
       for(int x: arr){
        System.out.print(x+" ");
       }
    }   
}
