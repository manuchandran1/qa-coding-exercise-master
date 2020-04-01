//Question 1:
	// Fix the function `printElements`
	// Expected Output: [1,2,3,4,5,6,7,8,9,10]
	public static void printElements() {
	    int[] arry = {1,2,3,4,5,6,7,8,9,10};
	    for (int i = 0; i < 10; i++) {
		    System.out.print(array(i));
	    }
	}
	//Question 2:
	// Fix the function `printObjKeys` 
	// expected output: Array ["a", "b", "c", "d"]
	static void printObjKeys() {
		HashMap<String, Object> object1 = new HashMap<String, Object>();
		object1.put("a", "somestring");
		object1.put("b", new Integer(42));
		object1.put("c", new Boolean(false))
		object1.put("d", new Boolean(true));
	    if ((boolean)object.get("c") == false) {
		    for (Map.Entry<String, Object> entry : object1.entrySet()) {
				System.out.println(entry.getKey());
			}
	    }
	}
	//Question 3: 
	//Identify the runtime exception, fix it. 
	static void printName() {
		String name = getName();
		System.out.print("Name "+name+ " Name length "+name.length());
	}
	private static String getName() {
		return null;
	}
	//Question 4:
	// split the `alphabet` into inividual letters and reverse
	// expected output: [z, y, x, w, v, u, t, s, r, q, p, o, n, m, l, k, j, i, h, g, f, e, d, c, b, a]
	void static sortAlphabet() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    //your code
	}
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
		return (int)(Math.random() * range) + min; 
	}
	static void whatToDrink() {
		//local variable. Do not change
		String coca = "Coca!";
		String cola = "Cola!";
		String cokeZero = "Coke Zero!";
		// your code
	}
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
	}
	//Random function do not change  
	private static int randomDiceRoll(int maxDiceRoll) {
		int min = 1;
		int range = maxDiceRoll - min + 1;
		return (int)(Math.random() * range) + min; 
	}
	static void play() {
		//Your code
	}
	//Question 7: 
	// Complete runTest function by comparing the following two array outputs actual vs expected, for every actualResult that is not equal to expectedResult, add "Fail" to a third array, otherwise add "Passed". Finally print the testResult array in the console. 
	/* actualResult ["Seek","Berry","Beer","Watermelon","Watermelon","Egg", "Tiger"]
	   expectedResult ["Seek","Berry","Blue","Watermelon","Yellow","Egg", "Mars"]
	*/
   //Expected result, all array count should be equals, you can use any methods to your preference
   static String[] actualResult = {"Seek","Berry","Beer","Watermelon","Watermelon","Egg", "Tiger"};
   static String[] expectedResult = {"Seek","Berry","Blue","Watermelon","Yellow","Egg", "Mars"};
   static void runTest() {
	   //your code
	   //boolean[] testResult = new boolean[/*size*/];
   }