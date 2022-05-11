import java.util.Scanner;

public class answers extends intro {
    public static Scanner scanner = new Scanner(System.in);
    //checker
    public static int check1(){
        if (result == 1){
            System.out.println("As you speak your answer, the entrance to the dungeon opens revealing a narrow path.");
            result = 1;
            
        } else {
            riddle.story();
            result = 0;
        }
        return result;
    }

    public static int check2(){
        if (result == 3){
            System.out.println("Answering the riddle correctly the doors swing open revealing two paths. One on the left and one of the right. Which do you choose?");
            
            result = 3;
        } else {
            riddle.story2();
            result = 0;
        }
        return result;
    }
    public static int check3(){
        if (result == 1){
            System.out.println("By taking the left path, the light seems to be eaten away by darkness, taking away your side.");
            System.out.println("Further along the path the floor gives way causing you to fall into a pit. ");
            System.out.println("Your leg is broken and you begin to see a small light. The pit is starting to catch fire.");
            System.out.println("There is no escape. Goodbye.");
            System.out.println("Play again? 1. Yes 2. No");
            String output = scanner.nextLine();
            result = Integer.parseInt(output);
        } else {
            System.out.println("Taking the left path, it begins to loop and go upward.");
            System.out.println("Ascending the steps becomes difficult over time as the temperature begins to rise.");
            System.out.println("After a few grueling hours of walking you see the end of the hall.");
            System.out.println("In excitement you run through the exit. For a split second you see a glorious reward of gold and rare weapons.");
            System.out.println("Too late, however, a dragon sleeping nearby fires a ball of flame melting you and the treasure in a single breath. You die.");
            System.out.println("Play again? 1. Yes 2. No");
            String output = scanner.nextLine();
            result = Integer.parseInt(output);
            
        }
        return result;
        
    }
    public static void restart(){
        if (result == 1){
            Main.run();
        } else {
            System.out.println("Goodbye.");
        }
    }
    
}