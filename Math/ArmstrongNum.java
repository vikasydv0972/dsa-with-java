package Math;

public class ArmstrongNum {

    public static void main(String[] args) {
        int num=153;
        int duplicate=num;
        int sum=0;

        while(num>0){
            int lastDigit=num%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            num=num/10;
        }

        System.out.println(sum);
        if(duplicate==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
    }
}