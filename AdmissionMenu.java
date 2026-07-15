import java.util.Scanner;

public class AdmissionMenu 
{
    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);

        int marks, choice;

        System.out.print("Enter your percentage: ");
        marks = sc.nextInt();

        System.out.println("\n----- STREAM MENU -----");
        System.out.println("1. Engineering");
        System.out.println("2. Medical");
        System.out.println("3. Business");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) 
        {

            case 1:
                if(marks >= 65) {
                    System.out.println("Eligible for Engineering");

                    if(marks >= 85)
                        System.out.println("Branch: CSE");
                    else if(marks >= 75)
                        System.out.println("Branch: Mechanical Engineering");
                    else
                        System.out.println("Branch: BEE");
                }
                else {
                    System.out.println("Not Eligible for Engineering");
                }
                break;

            case 2:
                if(marks >= 85) {
                    System.out.println("Eligible for Medical");

                    if(marks > 95)
                        System.out.println("Course: MBBS");
                    else if(marks > 90)
                        System.out.println("Course: BDS");
                    else
                        System.out.println("Course: Pharmacy");
                }
                else {
                    System.out.println("Not Eligible for Medical");
                }
                break;

            case 3:
                if(marks >= 55) {
                    System.out.println("Eligible for Business");

                    if(marks > 85)
                        System.out.println("Course: B.Com");
                    else if(marks >= 65)
                        System.out.println("Course: BBA");
                    else
                        System.out.println("Business Stream Available");
                }
                else {
                    System.out.println("Not Eligible for Business");
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
