import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        boolean song=true;
        Scanner repetition = new Scanner(System.in);

        while (song){
            System.out.println("Will you off repeat this song if yes type Yes");
            String Userinput = repetition.next();
            if(Userinput.equals("yes")){
                song=false;
                System.out.println("Current Song");
            }
        }
        System.out.println("Playing next song");
    }
}
