import java.util.Scanner;
/**
 * Arrays example
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);


    final int NUM_MARKS = 5;

    // create an array with 5 spots
    double[] grades = new double[NUM_MARKS];

    // put grades into the array using loop
    for(int i = 0; i < grades.length; i++){
      System.out.println("Please enter grade " + (i+1));
    grades[i] = input.nextDouble();
    }
    
    // create a variable to store the sum
    double sum = 0;

    // use a for loop to go threw the array and add sum
    for(int i = 0; i < grades.length; i++){
      // add the grade to sum
      sum = sum + grades[i];
    }

    // determine the average
    double average = sum/NUM_MARKS;

    // let the user know
    System.out.println("Your average grade is " + average);
    
  }
}
