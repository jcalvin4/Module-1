import java.util.Scanner;
public class riddle extends intro{
     public static Scanner scanner = new Scanner(System.in);
     //First Riddle
     public static int story(){
        System.out.println(pname + ", you've traveled far to reach your destination. Finally, after a week's journey you have reached the Pryer's Dungeon.");
        System.out.println("Before you can you can enter the dungeon the entrance presents you with a riddle.");
        System.out.println("The more you take the more you leave behind. What am I?");
        System.out.println("1.Footsteps 2. Lunges 3. Water 4. Gold (Enter Number)");
        String output = scanner.nextLine();
        System.out.println("You speak " + output + " and wait.");
        result = Integer.parseInt(output);

        return result;
    }
    public static int story2(){
        System.out.println("Cautiously, you enter the dungeon, but it seems to be void of traps or dangers.");
        System.out.println("Progressing further you see carvings in the wall. You see many people falling into a pit.");
        System.out.println("Another shows a tunnel collapsing in on itself. As you reach the end of the hall you find yourself at the bottom of series of steps."); 
        System.out.println("At the top of the steps you see another door with a riddle.");
        System.out.println("Before Mount Everest was discovered, what was the highest mountain on Earth?");
        System.out.println("1. K2 2. Fuji 3. Everest 4. Hood"); 
        String output = scanner.nextLine();
        System.out.println(output + " is your answer.");
        result = Integer.parseInt(output);
        return result;
    }
    public static int story3(){
        System.out.println("1. Right 2. Left (Enter Number)");
        String output = scanner.nextLine();
        result = Integer.parseInt(output);
        return result;
        
    }
}
