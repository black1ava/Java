package Condition;

import java.util.Scanner;

public class ConditionInJava {
  public static void main(String[] args){
    System.out.print("Please enther your age: ");
    Scanner input = new Scanner(System.in);

    int age = input.nextInt();

    if(age >= 18){
      System.out.println("You're an adult");
    }else{
      System.out.println("You're a kid");
    }

    input.close();
  }
}
