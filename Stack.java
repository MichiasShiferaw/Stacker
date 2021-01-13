//Scan all primitive data types
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Stackkk {
    public static void main(String[] args) throws IOException {
    //Creating new integer array
    ArrayList<Integer> stackerr = new ArrayList<Integer>();
    ProStack stacker = new ProStack<Integer>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    Scanner input = new Scanner(System.in);
    
    //Declare variables
    int userInput;
    boolean finished = false;
    String another = null;
   
    //Ask user for numeric input
    System.out.println("What would you like to add to the stack?");   
   
    while (finished == false) {
      System.out.println("Remember only integers!!"); 
      try {
        userInput = Integer.parseInt(br.readLine());

        stacker.push(userInput);
        int numbers = userInput;
        stackerr.add(numbers);

      } catch (NumberFormatException nfe) {
        //the user failed to input an integer resulting into an error
        System.err.println("Invalid input!");
        System.err.println("The program only accepts integers.");
        
      }
