package AbstractModiferQuiz;

abstract class Vehicle {
  public abstract void forward();
  public abstract void backward();
}

class Car extends Vehicle {
  public void forward(){
    System.out.println("Car is driving forward");
  }

  public void backward(){
    System.out.println("Car is driving forward");
  }
}

class Bike extends Vehicle {
  public void forward(){
    System.out.println("Bike is riding forward");
  }

  public void backward() {
    System.out.println("Bike is riding backward");
  }
}

public class Main {
  public static void main(String[] args){
    Car car = new Car();
    car.forward();
  
    Bike bike = new Bike();
    bike.forward();
  }
}
