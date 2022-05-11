public class Main{
    public static void main(String[] args){
        run();
    }
    
    public static void run(){
        intro.GetName();
        riddle.story();
        answers.check1();
        riddle.story2();
        answers.check2();
        riddle.story3();
        answers.check3();
        answers.restart();
    }
}
