/*A Insurance Company have a following polices (Insurance Premium Calculation program)
		User Input :
                    a. Person Name
                    b. Person gender
                    c. Person Age
                    d. Person city (Metro or Non-Metro)
	Conditions:
		if person age is 25 to 35 and gender is male and city is metro , Output is Premium is 6%
		if person age is 25 to 40 and gender is male and city is non-metro, Output is Premium 4%
		if person age is 25 to 42 and gender is female and city is Metro, Output is Premium 3%
		if person age is 25 to 45 and gender is female and city is non-metro , output is Premium 2%
		else
 		Not Insured*/

import java.util.Scanner;

public class Insurance {

    static void IncPolicy(String name, String gender,int age,String city){
        if((age>=25 || age<=35 ) && (gender=="male") && (city == "metro"))
        System.out.println( name+ "is Assured with " + "6% of policy");
        else if ((age>=25 || age<=40 ) && (gender=="male") && (city == "non-metro"))
            System.out.println( name+ "is Assured with " + "4% of policy");
        else if((age>=25 || age<=42 ) && (gender=="female") && (city == "metro"))
            System.out.println( name+ "is Assured with " + "3% of policy");
        else if((age>=25 || age<=45 ) && (gender=="female") && (city == "non-metro"))
            System.out.println( name+ "is Assured with " + "2% of policy");
        else
            System.out.println( name+ "is not Assured " );
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the gender:");
        String gender = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter person City(metro or not metro) :");
        String city = sc.next();
        IncPolicy(name, gender, age, city);

    }
}
