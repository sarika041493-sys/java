package lab4;

//Superclass
class Animal {

 void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog
class Dog extends Animal {

 @Override
 void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat
class Cat extends Dog {

 @Override
 void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Main class
public class AnimalDemo {

 public static void main(String[] args) {

     // Animal object
     Animal a = new Animal();
     a.makeSound();

     // Dog object
     Dog d = new Dog();
     d.makeSound();

     // Cat object
     Cat c = new Cat();
     c.makeSound();
 }
}