package Math;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=9;
        int count=0;
        if (num==1){
            System.out.println("not prime");
        }
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }

        System.out.println(isPrime(num));

    }

    //in sqrt n 
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }   
  
        }
        return true;

    }
}
