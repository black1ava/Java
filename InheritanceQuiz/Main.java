package InheritanceQuiz;

class Animal {
  public String type;
  public Animal(){
    System.out.println("Animal constructor is calling");
  }
  public void eating(){
    System.out.println(this.type + " is eating");
  }
}

class Mammal extends Animal {
  public Mammal(){
    System.out.println("Mammal constructor is calling");
  }

  public void eating(){
    System.out.println(this.type + " is eating sth");
  }
}

class Cat extends Mammal {
  public Cat(){
    System.out.println("Cat constructor is calling");
  }
}

public class Main {
  public static void main(String[] args){
    Cat myCat = new Cat();
    myCat.type = "Tiger";
    myCat.eating();
  }
}
