## OOP in Java

There are 3 errors:
  1. Syntax error
  2. Login error
  3. Human error

use format #,###.00 :
`
  import java.text.DecimalFormat;

  DecimalFormat formater = new DecimalFormat("R #,###.00");

  System.out.println(formater.format(number));
`

### OOP contents
***
- Object and class
- Instantiation
- Data member
- Method
- Overloading Method
- Constructor and Overloading Constructors
- Inheritance
- Overriding
- Modifiers (Abstract, final, static)
- Access Modifier (private, default, protected, public)
- Interface

#### Object (Instance) and class

- Object is everything around us which we can see, touch, ...
- Each objects have states (Properties) and behaviors (events/actions)

Ex:
Person
  - Properties (Data member): name, sex, dob, age, color (Instance variable)
  - Actions (Method): walk, run, eat

- Class is a blueprint/template that describes the behaviors/state that object

#### Instantation (Instance, object)
  - Instantiation is a way or mechanism to utilize the member of the class
  - Syntax: ClassName objectName = new ClassName();

#### Data member is a property of object/class which use to store value of object/class

#### Method is a action of object/class;

  - Syntax: <Access Modifer> <Modifier> <Return Type> <Method name>

#### Overloading methods, this machanism occur when two or more methods have the same name and different in parameters (different number or parameters, different types of parameter). They are complement

#### Constructor is a special member which use to initialize valueto new object. Constructor execute one time only when creating object

Constructor characteristic
- same name as class name
- mo return type, even void keyword

- Syntax: [Access Modifier] [Constructor Name] ([Parameter list]){
  codes;
}

**Anonymous object** is a nameless object

#### Overloading constructor, the mechanism occure when two or more constructors have the same name and different in parameters (different number of parameters, diffent type of parameter)

#### Inheritance is manichasm in which one object/class acquire all the properties and behavior of a parent object/class

  - inheriance level: Single Level, Multi-Level, Multiple Level

  Single Level

    A  
    ^  
    |  
    B  

    Multi-Level
    A  
    ^  
    |  
    B  
    ^  
    |  
    C  
    Multiple Level

    A    B  
    ^    ^  
    |    |  
    ______  
      |  
      C  
  
Inheritance:
 - Class inheriance: Single, Multi
 - Interface inheritance: Single, Multi, Multiple

#### Constructor in inheritance


    ```java
    public class Animal {
      public Animal(){
        System.out.println("Animal default constructor");
      }
    }

    public class Mammal extends Animal {
      public Mammal(){
        System.out.println("Mammal default constructor");
      }
    }

    public class Cat extends Mammal {
      public Cat(){
        System.out.println("Cat defautl constructor");
      }
    }

    public class Main {
      public static void main(string[] args){
        Cat myCat = new Cat();
      }
    }
    ```

Execute:
> Animal default constructor
> Mammal default constructor
> Cat default constructor

#### Overloading method
- Class
- Inheritance


    ```java
    public class Animal {

      public String type;

      public Animal(){
        System.out.println("Animal default constructor");
      }

      public void eat(){
        System.out.println(type + " is eating");
      }
    }

    public class Mammal extends Animal {
      public Mammal(){
        System.out.println("Mammal default constructor");
      }

      void eat(String sth){
        System.out.println(type + " is eating " + sth); //overloading method
      }
    }

    public class Cat extends Mammal {
      public Cat(){
        System.out.println("Cat defautl constructor");
      }
    }

    public class Main {
      public static void main(string[] args){
        Cat myCat = new Cat();
      }
    }
    ```

#### Overriding method
- happend in inheriance
- in the same class, we call it **duplicating method**. In inheriance, we call it overriding method

**Overriding method, this mechanism occur only in inheritance process, when two**


    ```java
    public class Animal {

      public String type;

      public Animal(){
        System.out.println("Animal default constructor");
      }

      public void eat(){
        System.out.println(type + " is eating");
      }
    }

    public class Mammal extends Animal {
      public Mammal(){
        System.out.println("Mammal default constructor");
      }

      void eat(String sth){
        System.out.println(type + " is eating " + sth); //overloading method
      }

      // overriding method
      void eat(){
        super.eat() // execute super class method
        System.out.println("Mammal is eating");
      }
    }

    public class Cat extends Mammal {
      public Cat(){
        System.out.println("Cat defautl constructor");
      }
    }

    public class Main {
      public static void main(string[] args){
        Cat myCat = new Cat();
        myCat.eat();
      }
    }
    ```

> Mammal is eating

#### Modifier (abstract, final, static)

- abstract modifier
  - Class:
    - cannot be instantiated but can be extended
    - may or may not contain abstract methods
  - Method:
    - Every subclass must implemeneted or overriding abstract method of supperclass, unless subclass also abstract
    - contain only method signature(no mehthod body)


    ```java
    public abstract class Vehicle {
      void forward(){
        System.out.println("Vehicle is driving forward");
      }

      abstract void backward();
    }

    public class Car extends Vehicle {
      void backward(){
        System.out.println("Car is driving backward");
      }
    }
    ```