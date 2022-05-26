package LoopStatement;

import java.util.Scanner;

public class CheckBoard {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter number for symbol (#): ");
    int number = input.nextInt();

    for(int i = 0; i < number; i++){

      if(i % 2 == 0){
        System.out.print(" ");
      }

      for(int j = 0; j < number; j++){
        System.out.print("# ");
      }

      System.out.println();
    }

    input.close();
  }
}
