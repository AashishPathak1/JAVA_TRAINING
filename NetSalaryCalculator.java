/*WAP to calculate net salary of employee, take basic salary of employee and calculate
 	HRA 30% of basic salary, 
	DA 20% of the basic salary, 
	TA 10% of the basic salary and 
	Net salary is sum up of basic salary+ allowances-pf.
 	Pf is 1400 fix.*/

import java.util.Scanner;

public class NetSalaryCalculator {

  public static double NetSalary(double basicSalary) {
    double hra = 0.3 * basicSalary;
    double da = 0.2 * basicSalary;
    double ta = 0.1 * basicSalary;
    double pf = 1400;

    return basicSalary + hra + da + ta - pf;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the basic salary :");
    double basicSalary = sc.nextDouble();
    double netSalary = NetSalary(basicSalary);
    System.out.println("Net Salary: " + netSalary);
    sc.close();
  }
}
