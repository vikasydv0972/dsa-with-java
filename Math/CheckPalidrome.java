package Math;

public class CheckPalidrome {
    public static void main(String[] args) {
        int num=13131;
        int rev=0;
        int temp=num;
        while (num>0){
            int ld=num%10;
            rev=rev*10+ld;
            num=num/10;

        }

        if(rev==temp){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

         

    }
}
