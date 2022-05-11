
import java.util.Scanner;
public class intro extends Main {
// Store Player Name and Answers
    public static int result;
    public static String pname;
    public static Scanner iden = new Scanner(System.in);
    //Get User Name
    public static String GetName(){
        
            System.out.println("Welcome, New Adventurer! To a world where dragons sleep and giants roam! Name yourself and your journey may begin!");
    
            pname = iden.nextLine();
            System.out.println(pname + ", a worthy name! Embark on this adventure and explore the depths of your choices");
        
                return pname;
    }

}
