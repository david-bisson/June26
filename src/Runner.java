import  animals.Dog;
import  animals.Puppy;
public class Runner {
    public static void main(String[] args) {
//1
//        Horse horse1 = new Horse("Good-Will",7,"Brown");
//        System.out.println("horse1 name is: " + horse1.getName());

//2     Answer is: Sam
//        Person person = new Person("Josh");
//        person.setName("Sam");
//        person.printName(person.getName());

//3     Answer: The out put will remain Josh and will not be changed to sam
//      Because the when person is greated the global variable name is Josh,
//      In the "setter" because there is no "this" the new name is not a global variable.

//4+5   WhitePony pony1 = new WhitePony();
//        pony1.bite();
//        System.out.println(pony1.getColor());

//6    Extends can be only from one class

//7     it will fail because its not in the same package, we need to import animals.Dog;

//8     'bark()' has protected access in 'animals.Dog', fix: change bark() to public void

//9     Output will be "woof - puppy"
//        Dog rexi = new Puppy();
//        rexi.bark();

//10    Encapsulation:
//      make sure that "sensitive" data is hidden from users.
//      To achieve this, we must:
//       declare class variables/attributes as private.
//       provide public get and set methods to access and update the value of
//          a private variable.

// 11   https://arxiv.org/ftp/arxiv/papers/1301/1301.6260.pdf
//  Cyclic inheritance is not supperted in java
//        The use of inheritance in Java inner classes potentially leads to the  difficulty of program comprehension and maintenance
//        In
//        Java, cyclic inheritance is not allowed if a class, be it inner or
//        outer, attempts to inherits from itself. Cyclic inheritance is
//        absurd conceptually because it implies that a class is its
//                superclass and subclass at the same time. Use of inheritance at
//        inner class potentially results in detected or undetected cyclic
//                inheritance where an inner class attempts to inherit from itself
//                through its outer class or other external class
//
//
//
//
// 12
        ACMEBicycle bicycle = new ACMEBicycle();
        bicycle.printStates();

        Kid newKid = new Kid();
        newKid.walk();
        newKid.stop();



    }

}
