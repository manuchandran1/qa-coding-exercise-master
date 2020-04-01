
//Question 1:
// Fix the function `printElements`
// Expected Output: [1,2,3,4,5,6,7,8,9,10]

var arry = [1,2,3,4,5,6,7,8,9,10];
function printElements() {
	for (var i = 0; i < 10; i++) {
		console.log(array(i))
	}
 }

//Question 2:
// Fix the function `printObjKeys` 
// expected output: Array ["a", "b", "c", "d"]

const object1 = {
	a: 'somestring',
	b: 42,
	c: false
	d: true
};
function printObjKeys() {	
	 if (Object.c == false) {
		console.log(Object.keys(object1));  
}
		

//Question 3: 
//varA has been delcared, how could we check if the varible is undefined or null? 
		
let varA;
function checkVarible() {
	//your code
}
		
		
//Question 4:
// split the `alphabet` into inividual letters and reverse
// expected output: [z, y, x, w, v, u, t, s, r, q, p, o, n, m, l, k, j, i, h, g, f, e, d, c, b, a]
var alphabet = "abcdefghijklmnopqrstuvwxyz";
function sortAlphabet() {
	//your code
}
		
		
		
//Question 5: FizzBuzz
// Coca! Cola! Coke Zero!
		// Finish FizzBuzz() by creating a loop that iterate by using randomNumber().
		// For each iteration prints "Drink Coca!" if it is a multiple of 3, 
		// print "Drink Cola!" if it's a multiple of 5,
		// print "Drink Coke Zero!" if both cases are valid,
		// print "Don't drink" if both cases are invalid.
		// NOTE: randomNumber() must go up to 100.
		// NOTE: you must interpolate the expected result with the delcared local variables.
		// NOTE: The number of iteration cannot be hardcoded.
		
//local variable. Do not change
		let coca = "Coca!"
		let cola = "Cola!"
		let cokeZero = "Coke Zero!"

//Do not change random number
		function randomNumber(max) {
					return Math.floor(Math.random() * Math.floor(max));
		}
 
		function FizzBuzz() {
				// your code
		}

		
		
// Question 6:  
/// Odd or even
// We have object called `PlayerPreset`. Create four instances of players using the `PlayerPreset`. 
		// Example, PlayerOne, playerName: "Jack", playerDiceRoll: 0, playerCanMove: true,
// For all players instances initialise the `playerDiceRoll` with randomDiceRoll()
// If the `playerDiceRoll` is an even number, set `playerCanMove` to true. Otherwise false. Lastly print the `playerCanMove`.
 //do not change

//preset and die roll, do not change                                        
let maxDiceRoll = 8;
const PlayerPreset = {
	 playerName: "",
	 playerDiceRoll: 0,
	 playerCanMove: true,
};

//Random function do not change    
function randomDiceRoll(maxDiceRoll) {
	return Math.floor(Math.random() * Math.floor(maxDiceRoll));
} 

//your code


//Question 7: 
// Complete runTest function by comparing the following two array outputs actual vs expected, for every actualResult that is not equal to expectedResult, add "Fail" to a third array, otherwise add "Passed". Finally print the testResult array in the console. 
/* actualResult ["Seek","Berry","Beer","Watermelon","Watermelon","Egg", "Tiger"]
	 expectedResult ["Seek","Berry","Blue","Watermelon","Yellow","Egg", "Mars"]
*/
//Expected result, all array count should be equals, you can use any methods to your preference
var actualResult = ["Seek","Berry","Beer","Watermelon","Watermelon","Egg", "Tiger"];
var expectedResult = ["Seek","Berry","Blue","Watermelon","Yellow","Egg", "Mars"];
var testResult = [];
		
