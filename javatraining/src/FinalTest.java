import java.util.Scanner;

public class FinalTest {
    public static void main(String[] args) {
        int FinalScore;

        System.out.println("Enter your final score. Please");
        Scanner numScore = new Scanner(System.in);
        FinalScore=numScore.nextInt();
        if (FinalScore>70) {
            System.out.println("Congratulations! You approved");
        }else {
            System.out.println("You don't approved");
        }
    }
}
