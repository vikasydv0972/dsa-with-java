package Math;

public class GCDAndHCF {
    public static void main(String[] args) {
        int n1=20;
        int n2=12;

        // BruteFOrce 

        // for(int i=1;i<=Math.min(n1, n2);i++){
        //     if(n1 % i==0 && n2%i==0){
        //         System.out.println(i);
                
        //     }
        // }

        gcd(n1,n2);
        
    }
    //Euclidean Algorithms

    public static void gcd(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;

            }
            else{
                n2=n2%n1;
          }

        }
                    if(n1==0){
                System.out.println(n2);
            }
            else{
                System.out.println(n1);
            }

    }


}
