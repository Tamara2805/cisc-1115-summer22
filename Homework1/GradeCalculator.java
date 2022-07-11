public class GradeCalculator {

//assign variables
static int Homework = 15;
static int CodeLab = 10;
static int Midterm1 = 20;
static int Midterm2 = 20;
static int Final = 35;

//equation
static int TotalScore = Homework+CodeLab+Midterm1+Midterm2+Final;

//ending statement
public static void main(String[] args) {

  System.out.print ("The total score is ");
  System.out.print (TotalScore);
  System.out.println (".");
}
}
