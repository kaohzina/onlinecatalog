import java.util.*;
public class studentloancalculator{
  public static void main(String[] args) {
Scanner user_input = new Scanner(System.in);
double Principal, Rate, Term, MonthlyTerm, DailyInterestRate, InterestRatePerDay, MonthlyInterest, YearlyInterest, MonthlyPayment, R, N, X, Y, Z;
System.out.println("Enter your loan amount.");
Principal = user_input.nextDouble();
System.out.println("Enter annual interest rate.");
Rate = user_input.nextDouble();
System.out.println("Enter loan term in years.");
Term = user_input.nextDouble();
MonthlyTerm = (Term*12);
DailyInterestRate = (Rate/365); 
InterestRatePerDay = (DailyInterestRate*Principal);
MonthlyInterest = (InterestRatePerDay*30);
YearlyInterest = (MonthlyInterest*12);
R = (Principal*MonthlyInterest);
X = (Rate*Principal);
Y = (Rate/Term);
Z = Math.pow(Y,-MonthlyTerm);

MonthlyPayment = (R/Y);
System.out.print("Your monthly interest is ");
System.out.println(MonthlyInterest);
System.out.print("Your yearly interest is ");
System.out.println(YearlyInterest);
System.out.print("Your monthly payment is ");
System.out.println(MonthlyPayment);
 }
}