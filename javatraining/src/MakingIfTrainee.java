import java.util.Scanner;

public class MakingIfTrainee {
    public static void main(String[] args){
        int Inputname;

        System.out.println("Pick a number between 1 and 10");
        Scanner Num = new Scanner(System.in);

        Inputname = Num.nextInt();

        if(Inputname <5){
            System.out.println("Enjoy the good luck");
        }else{
            System.out.println("Your show selection will make your very happy");
        }

        String FavoriteFood = "Pique Macho";
        System.out.println(FavoriteFood);

        if(Inputname < 100){
            FavoriteFood="Silpancho";
            System.out.println(FavoriteFood);
        }
        else {
            FavoriteFood = "Planchita";
            System.out.println(FavoriteFood);
        }
    }
}
