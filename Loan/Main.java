package Loan;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

  public static void generateLine(){
    for(int i = 0; i < 100; i++){
      System.out.print("-");
    }

    System.out.println();
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("R #,###.00");

    generateLine();
    System.out.println("Please enter loan information");
    generateLine();
    System.out.println();

    System.out.print("Loan Amount (Riel): ");
    double loanAmount = input.nextDouble();

    System.out.print("Yearly Rate (%): ");
    double yearlyRate = input.nextDouble();

    System.out.print("Duration (Year): ");
    int duration = input.nextInt();

    System.out.println();

    generateLine();;
    System.out.println("Repayment Schedule");
    generateLine();

    System.out.println();

    System.out.println("Period \t Beginning Balance \t Principle \t Interest \t Payment \t Ending Balance");
    generateLine();

    int period = duration * 12;
    double monthlyRate = yearlyRate / 12;

    double beginningBalance = loanAmount;
    double principle = loanAmount / period;
    double interest = beginningBalance * monthlyRate / 100;
    double payment = principle + interest;
    double endingBalance = beginningBalance - payment;

    for(int i = 0; i < period; i++){
      int _duration = i + 1;
      System.out.println(_duration + " \t " + formatter.format(beginningBalance) + " \t\t " + formatter.format(principle) + " \t " + formatter.format(interest) + " \t " + formatter.format(payment) + " \t " + formatter.format(endingBalance));

      beginningBalance = endingBalance;
      interest = beginningBalance * monthlyRate / 100;
      payment = principle + interest;
      double calcualtedEndingBalance = beginningBalance - payment;
      endingBalance = calcualtedEndingBalance <= 0 ? 0 : calcualtedEndingBalance;
    }

    generateLine();

    input.close();
  }
}
