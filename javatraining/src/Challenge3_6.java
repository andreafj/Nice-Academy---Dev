import java.util.Scanner;

public class Challenge3_6 {
    public static void showFirstQuestion(){
        System.out.println("Welcome :D, Please choose the correct answer for next question. Only put number ^^");
        System.out.println("What are the primary colors?");
        System.out.println("1. Pink, blue and orange");
        System.out.println("2. Black, White and Yellow");
        System.out.println("3. Red, Yellow and Blue");
    }

    public static void showSecondQuestion(){
        System.out.println("What is not a Avionica song?");
        System.out.println("1. No sabes");
        System.out.println("2. Celos");
        System.out.println("3. Desde cero");
    }
    public static int askFirsQuestion(int numberUser ){
        int answer = 0;
        if (numberUser==3){
            answer=answer+1;
            System.out.println("Yes, you know about primary colors :D");
            System.out.printf("Now, other question and you will be the best :D");

        }else if(numberUser==1 || numberUser==2){
            System.out.println("Your answer is incorrect :C");
            System.out.println("But you have other oportunity with other question. Good luck!");
        }
        return answer;
    }

    public static int askSecondQuestion(int userNumber){
        int answer = 0;
        if (userNumber==2){
            answer=answer+1;
            System.out.println("Yes, you know about Avionica songs <3");

        }else if(userNumber==1 || userNumber==3){
            System.out.println("You don't have correct Answers. You don't know about Avionica songs :C, you need to listen it");
        }
        return answer;
    }

    public static void showResults(int question1, int question2){
        if(question1 == 1 && question2 ==1){
            System.out.println("You are the best in the world! You know about primary colors and Avionica songs");
        }
        if (question1 ==1 && question2==0) {
            System.out.println("Yeah, you have one answer correct, you know about primary color but not about Avionica songs");
        }
        if (question1==0 && question2==1){
            System.out.println("Yeah, you have one answer correct, you know about Avionica songs but not about primary colors jeje");
        }
        if( question1 ==0 && question2==0){
            System.out.println("You don't know about primary colors or Avionica songs :C ");
        }
    }

    public static void main(String[] args) {
        int numberUser;
        int questionsCorrects;
        try {
            showFirstQuestion();
            Scanner userAnswer = new Scanner(System.in);
            numberUser= userAnswer.nextInt();
            int answerQuestion1= askFirsQuestion(numberUser);
            showSecondQuestion();
            numberUser= userAnswer.nextInt();
            int answerQuestion2= askSecondQuestion(numberUser);
            showResults(answerQuestion1,answerQuestion2);


        }catch (Exception e){
            System.out.println("Please enter only numbers");
        }
    }
}
