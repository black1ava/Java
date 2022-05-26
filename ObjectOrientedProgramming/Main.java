package ObjectOrientedProgramming;

class Animal {
  public String type;

  public void eat(){
    System.out.println(this.type + " is eating");
  }
}

class Mammal extends Animal {
  public void run() {
    System.out.println(this.type + " is running");
  }
}

class Cat extends Mammal {
  public String name;
  public String gender;

  public Cat(String type){
    this.type = type;
  }

  public void walk(){
    System.out.println(this.type + " is walking");
  }
}

public class Main {
  public static void main(String[] args){
    Cat c1 = new Cat("Tiger");
    c1.walk();
    c1.run();
    c1.eat();
  }
}