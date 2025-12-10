package Interview_Code;

public class RevString {
    public static void main(String[] args) {

        //revStr();

        String str= "hello";
        String rev="";
        for (int i= str.length()-1;i>=0;i--){
            rev= rev+str.charAt(i);

        }
        System.out.println(rev);

        
    }

    //using two pointer


    // public static void revStr(){
    //     String s="vikas";
    //     char[] arr=s.toCharArray();
        

    //     int l=0;
    //     int r=s.length()-1;
    //     while(l<r){
            
    //         arr[l]=arr[l]^arr[r];
    //         arr[r]=arr[l]^arr[r];
    //         l=l^r;

    //         l++;
    //         r--;
    //     }
    //     System.out.println(new String(s));

    // }
}
