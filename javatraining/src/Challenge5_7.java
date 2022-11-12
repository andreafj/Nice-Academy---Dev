import java.util.Scanner;

public class Challenge5_7 {
    /*
    * First, let's assume that a worker cannot work more than eight hours a week.
    * Second, let's assume that a year only has 52 weeks
    * */

    public static double calculateSalary(double numberHoursPerWeek, double amountMoney,double weeksPerYear){
        double salaryTotal= numberHoursPerWeek*amountMoney*weeksPerYear;
        return salaryTotal;
    }

    public static void showAnswer(double numberHoursPerWeek, double amountMoney,double weeksPerYear, double salaryTotal){
        System.out.println("The employee works per week :"+numberHoursPerWeek);
        System.out.println("The employee "+amountMoney+" $ per hour");
        System.out.println("The employee works "+weeksPerYear+ " weeks per year");
        System.out.println("Employee's gross yearly salary is "+ salaryTotal);
    }

    public static void main(String[] args) {
        double numberHoursPerWeek;
        double amountMoney;
        double weeksPerYear=52;

        try {
            Scanner answerUser= new Scanner(System.in);

            System.out.println("how many hours a week does the employee work?");
            numberHoursPerWeek= answerUser.nextDouble();
            System.out.println("How much money does the employee earn per hour?");
            amountMoney = answerUser.nextDouble();
            double salaryYear = calculateSalary(numberHoursPerWeek,amountMoney,weeksPerYear);
            showAnswer(numberHoursPerWeek,amountMoney,weeksPerYear,salaryYear);

        }catch (Exception e){
            System.out.println("Please enter only numbers");
        }
    }
}
