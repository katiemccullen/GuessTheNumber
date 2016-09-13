package randomnumber;
import java.util.*;

public class Randomnumber
{
    public static boolean compareNums(int num1, int num2) 
{ 
    if (num1 == num2) 
    { 
        return true; 
    } 
    else 
    { 
        return false; 
    } 
} 
  
public static void main(String[] args) 
{ 
    boolean correct = false;
    System.out.println("Please input your range, 0-?");
    Scanner input = new Scanner(System.in); 
    int range = input.nextInt();
    int numberOfTries = 0;
    Random rn = new Random();
    int answer = rn.nextInt(range); 
    
    while (correct == false)
    {
        numberOfTries++;
        System.out.println("Enter your guess. 0-" + range); 
        int userGuess = input.nextInt();
  
        if (compareNums(answer, userGuess)) 
        { 
            correct = true;
            System.out.println("Well done. You guessed correctly."); 
            System.out.println("You took " + numberOfTries + " guesses.");
        } 
        else if (answer > userGuess)
        {
                System.out.println("Your answer is too low.");
        }
        else if (answer < userGuess)
        {
            System.out.println("Your answer is too high.");
        }
} 
  
}
}