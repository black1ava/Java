package LoopStatement;

import java.util.Scanner;

public class SumFactorialSequence {

  public static int factorial(int number){
    int total = 1;

    for(int i = 1; i <= number; i++){
      total *= i;
    }

    return total;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Calculate: 1! + 2! + 3! + ... + n!");
    System.out.print("n: ");
    int n = input.nextInt();

    int sum = 0;

    for(int i = 1; i <= n; i++){
      sum += factorial(i);
    }

    System.out.print("Total: " + sum);

    input.close();
  }
}
