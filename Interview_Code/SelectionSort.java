package Interview_Code;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,3,2,1,6,9};
        for(int i=0;i<arr.length-1;i++){
            int min= i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }

        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
