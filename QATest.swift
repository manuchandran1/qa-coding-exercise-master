 /*
Question 1:
-------------
Fix the function `printElements`
Expected Output: 
1
2
3
4
5
6
7
8
9
10
*/
func printElements() {
	let arry = Array(1...10)
	/// Your code
}

printElements()


/* 
Question 2:
-----------
Fix the function `printObjKeys` 
expected output: 
c
d
b
a
*/

func printObjKeys(){
	let dic: [String: Any] = [
		"a": "Hello",
		"b": 42,
		"c": false,
		"d": true
	]
	
	/// Your Code
}

printObjKeys()


/*
Question 3:

varA is defined how can we check if they are nil. If its nil 
checkNull will print "nil" or else "Not nil" 
*/

func checkNull(_ v:Any?) {
	/// your code
}

let varA: Int? = 1
checkNull(varA)

let varB: Int? = nil
checkNull(varB)

/* 
Question 4:
split the `alphabet` into inividual letters and reverse
expected output: ["z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i", "h", "g", "f", "e", "d", "c", "b", "a"]
*/

func sortAlphabet() {
	let alphabet = "abcdefghijklmnopqrstuvwxyz";
	/// Your Code
}

sortAlphabet()

/*
Question 5:
Coca! Cola! Coke Zero!
Finish fizzBuzz() by creating a loop that iterate by using randomNumber(). 
For each iteration 
1. prints "Drink Coca!" if it is a multiple of 3, 
2. print "Drink Cola!" if it's a multiple of 5, 
3. print "Drink Coke Zero!" if both cases are valid, 
4. print "Don't drink" if both cases are invalid.

NOTE: randomNumber() must go up to 100.
NOTE: you must interpolate the expected result with delcared local variable.
NOTE: The number of iteration cannot be hardcoded.
*/

func fizzBuzz(_ loopMaxCount: Int) {
	/// we are expection to loop
	(0...randomNumber(loopMaxCount)).forEach { element in
		/// your code	
	}
}

/// this function should return a 
/// random number between 0 to max value passed to the 
/// if the max value exceeds `100` then clip to `100`
/// function
func randomNumber(_ max: Int) -> Int {
	/// your code for random numberGeneration
	return 1 // modify this code.
}

/// feel free to change the 10 to any number you like
fizzBuzz(10)

/// Question 6: (Odd or Even)
/// You are given the following class, you have to complete the
/// initilization of the class
class PlayerPreset {
	let name: String
	var diceRoll: Int
	var canMove: Bool
    
    init(name: String, diceRoll: Int)
    {
        self.name = name
        self.diceRoll = diceRoll
        /// your code to intilize the value of `canMove`
        /// if the dice roll is even then set `canMove` to true
        /// otherwise falase
    }
}
 
/// Finish `rollTheDice` code
func rollTheDice() -> Int {
    /// your code to generate the random number between
    /// 1 to 8
    return 1 // Modify this code.
}


/// create instance a shown below
let player1 = PlayerPreset(name: "Jack", diceRoll: rollTheDice())
let player2 = PlayerPreset(name: "Jack", diceRoll: rollTheDice())// your code
let player3 = PlayerPreset(name: "Jack", diceRoll: rollTheDice())// your code
let player4 = PlayerPreset(name: "Jack", diceRoll: rollTheDice())// your code

let players = [player1, player2, player3, player4]
players.forEach { player in
    print(player.canMove ? "Can Move" : "Cannot Move")
}

 
/// Question 7:
/// Complete runTest function by comparing the following two arrays
/// actual vs expected, for every actualResult's element that is not equal
/// to expectedResult's element,
/// add "Fail" to a third array, otherwise add "Passed" at their respective index.
/// Finally print the testResult array in the console.
/// Expected result, all array count should be equals, you can use any methods to your preference
let actualResult = ["Seek","Berry","Beer","Watermelon","Watermelon","Egg", "Tiger"];
let expectedResult = ["Seek","Berry","Blue","Watermelon","Yellow","Egg", "Mars"];
var result = [String]()
 
func runTests() {
    /// your code
}
 
runTests()
result.forEach { element in print("\(element)") }
