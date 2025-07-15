import java.util.*;
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add(float a,int b){
        return a+b;
    }
}


public class MethodOverloadingEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //method overloading
        Calculator obj=new Calculator();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(2.3f,4));
        
    }
}
