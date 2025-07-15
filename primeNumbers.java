import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        //prime numbers from 1 to 100
        Scanner input=new Scanner(System.in);
        int i=0;
        System.out.println("enter the value of n");
        int n=input.nextInt();
       
        for(i=2;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j<i;j++){
                if (i%j==0){
                    isprime=false;
                    break;                   

                }

            }
            if(isprime){
                System.out.print(i+" ");
            }
        }
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = input.nextInt();
        
        System.out.println("Prime numbers from 1 to " + n + " are:");
        
        for (int i = 2; i <= n; i++) {  // Start from 2 since 1 is not prime
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {  // Optimization: Only check up to sqrt(i)
                if (i % j == 0) {
                    isPrime = false;
                    break;  // Exit early if a divisor is found
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        input.close();*/
        
    }
    
}
