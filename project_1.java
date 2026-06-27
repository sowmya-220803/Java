import java.util.Random;
import java.util.Scanner;

public class project_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random= new Random();
         int again;
         int score=0;
        do{
         int number=random.nextInt(100);
         int guess;
         int chance=0;
        
         System.out.println("*************number guessing game**************");
         System.out.println("chose a number between 1 and 100");
         do{
            System.out.println("enter your guess");
            guess=sc.nextInt();
            chance++;
            if(guess>number){
                System.out.println("Too high!Try again");
            
            }else if(guess<number){
                System.out.println("Too low! Try again");

            }else{
                score++;
                System.out.println("Congratulations! you guessed the number");
                System.out.println("Total attempts are:"+ chance);
                System.out.println("your current score is:"+score);
                break;
            }
            if(chance==8){
                System.out.println("your are not guess the number within the attempts");
            }
         }while(chance!=8 || guess==number);
         System.out.println("want to play again?(0 if no/1 if yes)");
         again=sc.nextInt();
        }while(again==1);
        System.out.println("your out of the game....");
        System.out.println("your total score is:"+score);
    }
}