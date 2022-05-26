package ObjectOrientedProgramming;

class Person {
  public String name ;
  public String gender;

  Person(){
    this.name = "Test";
  }

  Person(String name){
    this.name = name;
  }

  Person(String name, String gender){
    this.name = name;
    this.gender = gender;
  }

  public void walk(){
    System.out.println(this.name + " is walking");
  }

  public void run(){
    System.out.println(this.name + " is running");
  }
}

public class PersonClass {
  public static void main(String[] args){
    Person p1 = new Person();
    p1.walk();
  }
}
