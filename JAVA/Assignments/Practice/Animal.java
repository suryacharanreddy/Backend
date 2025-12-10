abstract class Animal{
    public abstract void makeSound();
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
class Cow extends Animal{
    public void makeSound(){
        System.out.println("Moo");
    }
}
class Sounds{
    public static void main(String []args){
        Dog d1=new Dog();
        d1.makeSound();
        Cat c1=new Cat();
        c1.makeSound();
        Cow co1=new Cow();
        co1.makeSound();
    }
}