import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        System.out.println("enter a number :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int rev=0;
        int result=0;
        int temp=n;
        for(int i=0;n>0;i++){
            rev=n%10;
            result=result*10+rev;
            n=n/10;
        }
        System.out.println(result);
        if(temp==result){
            System.out.println("yes");
        }
        else{
            System.out.println("NOT");
        }
        }
    }

