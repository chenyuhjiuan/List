import java.util.Scanner;

public class SimpleEliza {

    public static void main(String arg[]){
        Scanner keyb= new Scanner(System.in);
        String answer;
        boolean quit=false;
        System.out.println("Welcome to our clinic!");

        while(!quit){

            System.out.printf("What is your problem?");
            answer= keyb.next();
            if((answer.equalsIgnoreCase("I am feeling good"))||(answer.equalsIgnoreCase("q"))){
                quit=true;
            }



        }

    }
}
