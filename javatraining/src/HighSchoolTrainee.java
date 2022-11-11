import java.util.Scanner;

public class HighSchoolTrainee {
    public static void  main(String[] args){

        int StudentAge = 24;
        String Midlename = "Andrea";
        String StudentName = "Noelia Andrea";
        String LastName = "Flores";
        double Prom= 8.6;
        char FirstInitial = StudentName.charAt(0);
        char LastInitial = LastName.charAt(0);
        boolean Attendance = true;

        String FirstName = "Noelia";
        System.out.println("My Age is " +StudentAge);
        System.out.println("My Prom is "+Prom);
        System.out.println("My Midlename is "+Midlename);
        System.out.println("My First Initial is  "+FirstInitial);
        System.out.println("My Last Initial is "+LastInitial);
        System.out.println("My Attendance is "+Attendance);
        System.out.println("The student name is  "+StudentName);
        System.out.println("The student First Name "+FirstName);
        System.out.println("The student Last Name is "+LastName);

        System.out.println("The student prom are "+ Prom + " Please modify this prom");

        Scanner input = new Scanner(System.in);
        Prom = input.nextDouble();

        System.out.println("The new prom are "+Prom);

    }
}
