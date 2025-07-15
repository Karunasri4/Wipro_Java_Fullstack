import java.util.*;
abstract class Animal{
    //abstract method
    abstract void eat();
    
    //concrete method
    void sleep(){
        System.out.println("animals sleep...");
    }
}
class Dog extends Animal{
    
    void eat(){
        System.out.println("eat and bark...");
    }
    
}
public class AbtractionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a=new Dog();
        a.eat();
        a.sleep();
        
    }
}
