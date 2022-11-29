
import java.util.Scanner;

public class QuestionA {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String nstep;
        int step;
        step = 0;
        System.out.println("[Learn To Waltz]");
        System.out.println("Let's begin the lesson!");
        String lesson;
        lesson = "y";
        while (lesson.equals("y")){
            System.out.print("What is the next step? ");
            nstep = sc.nextLine();
            if (nstep.equals("END")){
                System.out.print("The lesson is over.");
                lesson = "n";
                break;
            } else {
                switch(step){
                    case 0:
                        if (nstep.equals("Forward")) {
                            System.out.println("Correct!");
                            step++;
                        } else {
                            System.out.println("Incorrect! Please try again.");
                        }
                        break;
                    case 1:
                        if (nstep.equals("Right")){
                            System.out.println("Correct!");
                            step++;
                        } else {
                            System.out.println("Incorrect! Please try again.");
                        }
                        break;
                    case 2:
                        if (nstep.equals("Backward")){
                            System.out.println("Correct!");
                            step++;
                        } else {
                            System.out.println("Incorrect! Please try again.");
                        }
                        break;
                    case 3:
                        if (nstep.equals("Left")){
                            System.out.println("Correct!");
                            step = 0;
                        } else {
                            System.out.println("Incorrect! Please try again.");
                        }
                        break;
                }
            }
        }
    }
}
