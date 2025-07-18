import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int a=sc.nextInt();
        if(a>255 || a<0){
            throw new ArithmeticException("enter number in range 0 to 255");
        }
        else{
            String res=Integer.toBinaryString(a);
            int l=res.length();
            
            StringBuilder s=new StringBuilder();

            if(l<8){
                
                for(int i=0;i<=(8-l-1);i++){
                    s.append("0");
                                       
                }
            }
            StringBuilder result=new StringBuilder(res);
            
            System.out.println("the binary representation of corresponding nuber is "+s.append(result));
            
        }
    }
}
