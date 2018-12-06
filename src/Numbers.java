//Program By: Dylan Cavanaugh
import java.util.*;
public class Numbers {

	public static void main(String[] args) {
		try {
			
		Scanner reader = new Scanner(System.in);
		
		//Get input from user
		System.out.println("Enter an even positive whole number between 1 and 20: ");
		int number = reader.nextInt();
		
		//Checks if number is within bounds, if not user asked to reinput
		while(number > 20 || number < 1 || number % 2 != 0) {
			System.out.println("Input is outside of parameters, Please input a new number.");
			number = reader.nextInt();
		}
		
		//tempNumber is the variable that will be shown through the for loop
		int tempNumber = 0; 
		
		//loop through and prints all of the multiples
		for(int i = 1; tempNumber < 1000; i++) {
			tempNumber = number * i;
			
			//Without this check it's possible for a number above 1000 to be output
			if(tempNumber <= 1000)
			{
				System.out.print(tempNumber + " ");
			}
			
			//Makes it so there is 10 numbers on a line
			if (i % 10 == 0)
			{
				System.out.print("\n");
			}
		}reader.close();
		
		}catch(InputMismatchException e) {
			System.out.println("That's not what I asked for, try again");			
		}

	
	}

}
