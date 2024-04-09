import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random num=new Random();
S        int i=0;
        int count=0;
        boolean opt=true;
        int score=100;
        while(opt){
            System.out.println("-------------- NUMBER GAME ------------    ");
            System.out.println("NUMBER IS GENERATED");
            System.out.println("GUESS THE NUMBER");
            System.out.println("ENTER THE NUMBER :");
            int RandomInt=num.nextInt(101);
            while(true){
            int UserNum=sc.nextInt();
            if(UserNum==RandomInt){
                System.out.println("Yay! You have guessed the correct number");
                count++;
                System.out.println("-----Total Attempts = "+count+"-----");
                System.out.println("-----Your Score is "+(score-count)+"-----");
                break;
            }
            else{
                count++;
                if(UserNum<RandomInt){
                    System.out.println("Oops! The number is too low");
                    System.out.println("GUESS AGAIN..");
            }
                else{
                    System.out.println("Oops! The number is too high");
                    System.out.println("GUESS AGAIN..");}

            }
        
             }
            System.out.println("DO you want to continue:(yes or no )\nFor yes please enter 1 \nFor no please enter 0");
            int str=sc.nextInt();
            if(str== 1){
                opt=true;
            }
            else{
                System.out.println("----THANK YOU----");
                opt=false;
            }
        }
    }
}
