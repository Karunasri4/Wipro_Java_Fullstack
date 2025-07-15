import java.util.*;
class Animal{
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("eat and bark...");
    }
    void bark(){
        System.out.println("barking....");
    }
}
public class MethodOverringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog a=new Dog();
        a.eat();
        a.bark();
        
        
        
        
    }
}
