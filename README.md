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
- Access Modifier (private, default, protected, public) (Scope: same class, instance same package, instance different package, inheritance same package, inertiance different package)
- Interface

### OOP Concepts
- Encapsulation
- Abstraction
- Polymorphism
- Inheritance

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

- Syntax: [Access modifer] [Modifier] DataType MemberName;

#### Method is a action of object/class;

  - Syntax: [Access Modifer] [Modifier] [Return Type] [Method name]

#### Overloading methods, this machanism occur when two or more methods have the same name and different in parameters (different number or parameters, different types of parameter). They are complement

#### Constructor is a special member which use to initialize value to new object. Constructor execute one time only when creating object

Constructor characteristic
- same name as class name
- mo return type, even void keyword

- Syntax: [Access Modifier] [Constructor Name] ([Parameter list]){
  codes;
}

**Anonymous object** is a nameless object

#### Overloading constructor, the mechanism occure when two or more constructors have the same name and different in parameters (different number of parameters, different type of parameter)

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
  - Final Modifier
    - Class
      - Cannot be extended but can be instantiated

    - Data member
      - It is become constant variable

    -Method
      - Cannot be overriden by subclass

    ```java
      public abstract class Vehicle {
        public final void forward(){
          System.out.println("Vehicle is moving forward");
        }
        public abstract void backward();
      }

      public class Car extends Vehicle {
        public void forward(){
          // Some code
        } // error: forward() has final modifer

        public void backward(){
          System.out.println("Car is moving backward");
        }
      }
    ```

    ```java
      public final class Vehicle {
        public void forward(){
          // some code
        }

        public void backward(){
          // some code
        }
      }

      public class Car extends Vehicle {
        // some code
      } // error vehicle has final modifer
    ```

  - static modifer
    -class (inner class)
    - Data member
      - can access directly by class name
      - share a single value to all object which instantiated from same class

    -method
      - can access directly by class name
      - can only access to static member
  ```java
    public class Person {
      static String name; // class variable
      String sex; // instance variable

      static void run(){
        System.out.println(this.name + " is running");
      }

      void walking(){
        System.out.println(this.name + " is walking");
      }
    }

    public class Main {
      public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Sophanno";
        p2.name = "Sopheak";

        p1.run(); //Sopheak is running
        p2.run(); //Sopheak is running

        Person p3 = new Person();

        p3.run(); //Sopheak is running

        // Person.name = "Testing"; right
        // Person.sex = ""; wrong

        Person.run();
      }
    }
  ```

  - nested class
    - non-static nested class (inner class)
      - Member inner class
      - Anonymous inner class
      - Local inner class
    - static nested class

  ```java
    public class Outer {
      int data;

      void print(){
        System.out.println("Data: " + data);

        Inner obj = new Inner();
        obj.Show();
      }

      class Inner { // member inner class
          void show(){
            System.out.println("Data: " + data);
          }
      }
    }

    public class Main {
      public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        outer.data = 100;

        inner.show(); // 100
      }
    }
  ```

  ```java
    public class Outer {
      int data;

      void print(){
        System.out.println("Data: " + data);

        // Inner obj = new Inner();
        // obj.Show();
        Inner.show();
      }

      static class Inner { // member inner class
          void show(){
            System.out.println("Data: " + data);
          }
      }
    }

    public class Main {
      public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();

        outer.data = 100;

        inner.show(); // 100
      }
    }
  ```

  ```java
    public class Outer {
      int data;

      void print(){
        System.out.println("Data: " + data);

        // Inner obj = new Inner();
        // obj.Show();
        Inner.show();

        Local local = new Local();
        local.show();

        class Local {
          void show(){
            // some code
          }
        }
      }

      static class Inner { // member inner class
          void show(){
            System.out.println("Data: " + data);
          }
      }
    }

    public class Main {
      public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();

        outer.data = 100;

        inner.show(); // 100
      }
    }
  ```
