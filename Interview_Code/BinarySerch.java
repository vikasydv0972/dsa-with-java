package Interview_Code;

public class BinarySerch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,45,55,67,89};
        int key=5;
        int start=0;
        int end=arr.length-1;
      
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                return;
            }
            if(key> arr[mid]){
                start= mid+1;
            }
            else{
                end=mid-1;

            }
            
        }


    }
    
}
