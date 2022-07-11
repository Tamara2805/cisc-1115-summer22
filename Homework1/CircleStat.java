import java.util.Scanner;

public class CircleStat {

  //declare variables
  static int radius = 5;

  //ending statement
  public static void main (String[] args) {

//equations
  double area = Math.PI*(radius*radius);
  double circumference = Math.PI*(2*radius);

  System.out.print("When the radius is " + radius);
  System.out.print(" the circumference is " + circumference);
  System.out.print(" and the area is " + area);
  System.out.println(".");
}
}
