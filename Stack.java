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
