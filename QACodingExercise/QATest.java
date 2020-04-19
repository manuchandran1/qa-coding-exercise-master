package QACodingExercise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QATest {
	
	public static void main(String[] args) {

		// NOTE: main() method is used to print all the results
		// NOTE: Corresponding Comments are added after each questions

		System.out.println("QUESTION 1:\n");
		printElements();

		System.out.println("\nQUESTION 2:\n");
		printObjKeys();

		System.out.println("\nQUESTION 3:\n");
		printName();

		System.out.println("\n\nQUESTION 4:\n");
		sortAlphabet();

		System.out.println("\nQUESTION 5:\n");
		whatToDrink();

		System.out.println("\nQUESTION 6:\n");

		PlayerPreset player1 = new PlayerPreset("Jack");
		PlayerPreset player2 = new PlayerPreset("Jill");
		PlayerPreset player3 = new PlayerPreset("Harry");
		PlayerPreset player4 = new PlayerPreset("Helen");
		play(player1);
		play(player2);
		play(player3);
		play(player4);

		System.out.println("\nQUESTION 7:\n");
		runTest();

	}
	
	
	//Question 1:
		// Fix the function `printElements`
		// Expected Output: [1,2,3,4,5,6,7,8,9,10]
	
	
	public static void printElements() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(array[i]);
		}
		System.out.println(arrayList);
	}
		// Issues & Corrections:
		// Syntax errors for  "print" & "array(i)". Changed to println & array[i] 
		// Added the elements of the array to an ArrayList<Integer> using the existing for-loop
		// Printed the ArrayList to match the Expected output.

		
		//Question 2:
		// Fix the function `printObjKeys` 
		// expected output: Array ["a", "b", "c", "d"]
	
	static void printObjKeys() {
		HashMap<String, Object> object1 = new HashMap<String, Object>();
		object1.put("a", "somestring");
		object1.put("b", new Integer(42));
		object1.put("c", new Boolean(false));
		object1.put("d", new Boolean(true));
		ArrayList<String> listOfKeys = new ArrayList<String>();
		if ((Boolean) object1.get("c") == false) {
			for (Map.Entry<String, Object> entry : object1.entrySet()) {
				listOfKeys.add(entry.getKey());
			}
			System.out.println("Array " + listOfKeys);
		}
	}
		//Issues & Corrections: 
		//object is not defined. Corrected this to object1.
		//Type casting to (boolean) is incorrect. It is changed to (Boolean) wrapper class
		// Assigned the key values to a an ArrayList
		// Printed the Array list to get the expected out put

		
		
		//Question 3: 
		//Identify the runtime exception, fix it. 
	
	static void printName() {
		String name = getName();
		try {
			System.out.print("Name " + name + " Name length " + name.length());
		} catch (Exception e) {
			System.out.println(e + "\tName is null");
		}
	}

	private static String getName() {
		return "John";
	}
		
		//Issues & Corrections:
		// name.length() will cause Null Pointer Exception during Run time
		// Added a try-catch to handle the exception
		// Added a String (not null) in the return statement 
		
			
		//Question 4:
		// split the `alphabet` into individual letters and reverse
		// expected output: [z, y, x, w, v, u, t, s, r, q, p, o, n, m, l, k, j, i, h, g, f, e, d, c, b, a]
	static void sortAlphabet() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		// your code
		ArrayList<Character> reversedAlphabets = new ArrayList<Character>();
		for (int i = alphabet.length() - 1; i >= 0; i--) {
			reversedAlphabets.add(alphabet.charAt(i));
		}
		System.out.println(reversedAlphabets);
	}
		 
		 //Used for loop to iterate through the string and assigned the chars to a n ArrayList<Character>
		 // Printed the ArrayList to get the expected output
		 
		 
		 
		//Question 5:
		// Coca! Cola! Coke Zero!
		// Finish whatToDrink() by creating a loop that iterate by using randomNumber(). For each iteration prints "Drink Coca!" if it is a multiple of 3, print "Drink Cola!" if it's a multiple of 5, print "Drink Coke Zero!" if both cases are valid, print "Don't drink" if both cases are invalid.
		// NOTE: randomNumber() must go up to 100.
		// NOTE: you must interpolate the expected result with delcared local variable.
		// NOTE: The number of iteration cannot be hardcoded.
		//Do not change randomNumber() function
	private static int randomNumber(int max) {
		int min = 1;
		int range = max - min + 1;
		return (int) (Math.random() * range) + min;
	}

	static void whatToDrink() {
		// local variable. Do not change
		String coca = "Coca!";
		String cola = "Cola!";
		String cokeZero = "Coke Zero!";

		// your code
		int randomNumberValue = randomNumber(100);
		System.out.println("RandomNumber=" + randomNumberValue + "\n");
		for (int i = 1; i <= randomNumberValue; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				if (i % 3 == 0 && i % 5 == 0)
					System.out.println("Drink " + cokeZero);
				else if (i % 3 == 0)
					System.out.println("Drink " + coca);
				else if (i % 5 == 0)
					System.out.println("Drink " + cola);
			} else
				System.out.println("Don't Drink");
		}
	}
		// created a local variable : randomNumberValue to store the random number returned by randomNumber() function & Printed it.
		// for loop is used to iterate from 1 to the randomNumberValue
		// if & else & else if statements are used to print the expected result
		
		
		
		
		
		// Question 6:  
		// Odd or even
		// We have object called `PlayerPreset`. Create four instances of players using the `PlayerPreset`. 
		// Example, PlayerOne, playerName: "Jack", playerDiceRoll: 0, playerCanMove: true,
		// For all players instances initialise the `playerDiceRoll` with randomDiceRoll()
		// If the `playerDiceRoll` is an even number, set `playerCanMove` to true. Otherwise false. Lastly print the `playerCanMove`.
		//do not change
		//preset and die roll, do not change                                        
	static int maxDiceRoll = 8;

	static class PlayerPreset {
		String playerName;
		int playerDiceRoll;
		boolean playerCanMove;

		PlayerPreset(String playerName) {
			this.playerName = playerName;
		}
	}

	// Random function do not change
	private static int randomDiceRoll(int maxDiceRoll) {
		int min = 1;
		int range = maxDiceRoll - min + 1;
		return (int) (Math.random() * range) + min;
	}

	static void play(PlayerPreset player) {
		// Your code
		player.playerCanMove = false;
		player.playerDiceRoll = randomDiceRoll(maxDiceRoll);

		if (player.playerDiceRoll % 2 == 0)
			player.playerCanMove = true;

		System.out.println("Player Name=" + player.playerName + "\tDiceRoll=" + player.playerDiceRoll
				+ "\tPlayer Can Move? =" + player.playerCanMove);
	}
		// A constructor is added to PlayerPreset class to initialize the playerName
		// play() function accepts Instance of PlayerPreset as a parameter 
		// Four instances of PlayerPreset are created in the main() method & 4 instances are sent to the play() function.
		// play() function initializes playerCanMove=false and if condition is used to change the value of playerCanMove & expected result is printed. 
		
		
		
		//Question 7: 
		// Complete runTest function by comparing the following two array outputs actual vs expected, for every actualResult that is not equal to expectedResult, add "Fail" to a third array, otherwise add "Passed". Finally print the testResult array in the console. 
		/* actualResult ["Seek","Berry","Beer","Watermelon","Watermelon","Egg", "Tiger"]
		   expectedResult ["Seek","Berry","Blue","Watermelon","Yellow","Egg", "Mars"]
		*/
	   //Expected result, all array count should be equals, you can use any methods to your preference
	
	static String[] actualResult = { "Seek", "Berry", "Beer", "Watermelon", "Watermelon", "Egg", "Tiger" };
	static String[] expectedResult = { "Seek", "Berry", "Blue", "Watermelon", "Yellow", "Egg", "Mars" };

	static void runTest() {
		// your code
		// boolean[] testResult = new boolean[expectedResult.length];
		String[] testResult = new String[expectedResult.length];
		for (int i = 0; i < expectedResult.length; i++) {
			if (actualResult[i].equals(expectedResult[i]))
				testResult[i] = "Passed";
			else
				testResult[i] = "Fail";
			System.out.println(testResult[i]);
		}
	}
	   
	   // String array testResult is created
	   // for loop is used to iterate through the arrays  
}