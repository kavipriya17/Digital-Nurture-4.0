class Animal{
 public void makeSound(){
    System.out.println("Making Sound...");
 }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }

}
public class Inheritance {
    public static void main(String x[]){
  Dog d=new Dog();
  Animal a=new Animal();
  a.makeSound();
  d.makeSound();
}
}
