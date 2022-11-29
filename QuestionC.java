import java.util.Scanner;

public class QuestionC {
    int StudentID;
    float projectAverage, testAverage;

    float project_weight = (float) 0.43;
    float test_weight = (float) 0.57;


    public float calculateProjectPercentage(){
        float weightAvrProject = projectAverage * project_weight;
        return weightAvrProject;
    };

    public float calculateTestPercentage(){
        float weightAverageTest = testAverage * test_weight;
        return weightAverageTest;
    };

    public void printFinalGrade(){
        return;
    };

    public String StudentGrade(){
        this.StudentID = StudentID;
        this.projectAverage = projectAverage;
        this.testAverage = testAverage;
        return StudentGrade();
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[Final Grades Posted]");
        System.out.println("Student 's final grade are:");




    }
}
