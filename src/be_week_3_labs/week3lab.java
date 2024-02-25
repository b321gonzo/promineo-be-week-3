package be_week_3_labs;

import java.util.Arrays;

public class week3lab {


//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject: Arrays & Methods
//Java Week 03 Lab
//


	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			double [] myArray = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
			System.out.println("First Element:");
			System.out.println(String.format("%.0f",myArray[0]));
			System.out.println();
		
		// 3. Print out the last element in the array without using the number 5
			System.out.println("Last Element:");
			System.out.println(String.format("%.0f",myArray[myArray.length-1]));
			System.out.println();
		
		// 4. Print out the element in the array at position 6, what happens?
			//System.out.println(myArray[6]);
			// There's an error that index is out of bounds.
		
		// 5. Print out the element in the array at position -1, what happens?
			//System.out.println(myArray[-1]);
			// There's an error that the index is out of bounds
			
		// 6. Write a traditional for loop that prints out each element in the array
			System.out.println("Traditional for-loop to print elements of the array:");
			for (int i = 0; i<myArray.length; i++) {
				System.out.println(String.format("%.0f",myArray[i]));
			}
			System.out.println();
			
		// 7. Write an enhanced for loop that prints out each element in the array
			System.out.println("Enchanced for-loop to print elements of the array:");
			for (double num : myArray) {
				System.out.println(String.format("%.0f",num));
			}
			System.out.println();
			
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			System.out.println("Sum of array:");
			double sum = 0;
			for (double num : myArray) {
				sum += num;
			}
			System.out.println(String.format("%.0f",sum));
			
			System.out.println();
						
		// 9. Create a new variable called average and assign the average value of the array to it
			System.out.println("Average of array:");
			double avg = sum/myArray.length;
			System.out.println(String.format("%.3f",avg));
			
			System.out.println();			
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		
			System.out.println("Enchanced for-loop to print elements of the array if odd:");
			for (double num : myArray) {
				if (num%2-1==0) {
				System.out.println(String.format("%.0f",num));
				}
			}
			
			System.out.println();
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			String [] nameArray = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
			System.out.println("Sum of number of letters in array of names:");
			int nameSum=0;
			for (String name : nameArray) {
				nameSum += name.length();
			}
			System.out.println(nameSum);
			
			System.out.println();		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		System.out.println("Testing method that takes a String name and prints a greeting:");
		
		printGreeting("Bill");
		
		System.out.println();
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println("Testing method that takes a String and returns a greeting:");
		
		System.out.println(returnGreeting("Sam"));
		
		System.out.println();
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.		
		//		b. What do you find? 
		//		c. How are they different?
		
		/*		I feel like those are all asking the same thing really, but with 13 the print statement is 
		*		in the method so when the method is called it just prints, where as with 14, the method
		*		returns a value but then a print statement has to be used calling that method to see that 
		*		value. They both have their pros and cons, such that if you just want to print values constantly,
		*		it's better to have the method print the value, but if you're not necessarily needing to print the
		*		value but need to use it for other parts of the program, then it would be better to just return the value.
		*/		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println("Testing method that checks if number of letters in a string is greater than an integer:");
		
		System.out.println("Bill > 5? " + isLetterCountBiggerThanInt("Bill",5));
		System.out.println("Bill > 4? " + isLetterCountBiggerThanInt("Bill",4));
		System.out.println("Bill > 3? " + isLetterCountBiggerThanInt("Bill",3));
		
		System.out.println("Bill Murray > 11? " + isLetterCountBiggerThanInt("Bill Murray", 11));
		System.out.println("Bill Murray > 10? " + isLetterCountBiggerThanInt("Bill Murray", 10));
		System.out.println("Bill Murray > 9? " + isLetterCountBiggerThanInt("Bill Murray", 9));
		
		System.out.println();		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println("Testing method to see if a string is in an array.");
		System.out.println("String array: " + Arrays.toString(nameArray));
		System.out.println("Sam is in array? "+isStringInArray("Sam", nameArray));
		System.out.println("Sally is in array? "+isStringInArray("Sally", nameArray));
		System.out.println("Bob is in array? "+isStringInArray("Bob", nameArray));
		System.out.println("Thomas is in array? "+isStringInArray("Thomas", nameArray));
		System.out.println("Robert is in array? "+isStringInArray("Robert", nameArray));
		
		System.out.println();
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println("Testing a method that finds the minimum value in an array of integers:");
		
		
		int [] myIntArray = {1, 5, 2, 8, 13, 6};
		System.out.println("Integer array: " + Arrays.toString(myIntArray));
		System.out.println("Minimum: " + min(myIntArray));
		
		
		int [] myIntArray2 = {3094, 50000, 325, 988, 4413, 756};
		System.out.println("Integer array: " + Arrays.toString(myIntArray2));
		System.out.println("Minimum: " + min(myIntArray2));
		
		int [] myIntArray3 = {9, -5, 3, -5, 2, 6};
		System.out.println("Integer array: " + Arrays.toString(myIntArray3));
		System.out.println("Minimum: " + min(myIntArray3));
		
		System.out.println();
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.println("Testing a method that finds the average of the doubles in a double array:");
		
		System.out.println("Double array: " + Arrays.toString(myArray));
		System.out.println(avgDubArray(myArray));
		
		System.out.println();

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.println("Testing a method that \"integerizes\" an array of strings:");
		
		System.out.println("String array: " + Arrays.toString(nameArray));
		int [] intNameArray = integerizeStringArray(nameArray);
		System.out.println("Integerized array: " + Arrays.toString(intNameArray));
		
		System.out.println();		
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println("Testing method that takes an array of strings and checks if the sum of the string lengths with even amount of letters is greater than the sum of the odd:");
		
		System.out.println("String array: " + Arrays.toString(nameArray));
		System.out.println(evenBeatsOdd(nameArray));

		String [] spidermanActorsFirstLast = {"Tobey Maguire", "Andrew Garfield", "Tom Holland"};
		System.out.println("String array: " + Arrays.toString(spidermanActorsFirstLast));
		System.out.println(evenBeatsOdd(spidermanActorsFirstLast));
		
		String [] spidermanActorsFirst = {"Tobey", "Andrew", "Tom"};
		System.out.println("String array: " + Arrays.toString(spidermanActorsFirst));
		System.out.println(evenBeatsOdd(spidermanActorsFirst));
		
		String [] evenCharOddLetters = {"Roger Rabbit", "Daffy Duck", "Bugs Bunny"};
		System.out.println("String array: " + Arrays.toString(evenCharOddLetters));
		System.out.println(evenBeatsOdd(evenCharOddLetters));
		
		String [] oddCharEvenLetters = {"Bill Murray", "Michael Jackson"};
		System.out.println("String array: " + Arrays.toString(oddCharEvenLetters));
		System.out.println(evenBeatsOdd(oddCharEvenLetters));
		
		System.out.println();
		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("Testing if string is palindrome: ");
		
		System.out.println("String: \"mom\"");
		System.out.println(isPalindrome("mom"));
		
		System.out.println("String: \"Dad\"");
		System.out.println(isPalindrome("Dad"));
		
		System.out.println("String: \"bro\"");
		System.out.println(isPalindrome("bro"));
		
		System.out.println("String: \"Madam, I'm Adam\"");
		System.out.println(isPalindrome("Madam, I'm Adam"));
		
	}
	

	
	// Method 13:
	public static void printGreeting (String name) {
		System.out.println("Hello "+name+"!");
	}

	// Method 14:
	public static String returnGreeting (String name) {
		return "Hi "+name+"!";
	}
	
	// Method 15:
	public static boolean isLetterCountBiggerThanInt (String string, int integer) {
		return(string.replaceAll("\\s","")).length() > integer;
	}
	
	// Method 16:
	public static boolean isStringInArray (String string, String [] stringArray) {
		int truthValue = 0;
		for (String str : stringArray) {
			if (str.equals(string)) {
				truthValue ++;
			} 
		}
		return truthValue>0;
	}
	
	// Method 17:
	public static int min (int [] intArray) {
		int min = intArray[0];
		for (int x = 1; x < intArray.length; x++) {
			if (intArray[x] < min) {
				min = intArray[x];
			}
		}
		return min;
	}
	
	// Method 18:
	public static double avgDubArray (double [] dubArray) {
		double sumDubArray = 0;
		for (double n : dubArray) {
			sumDubArray += n;
		}
		return sumDubArray/dubArray.length;
	}
	
	// Method 19:
	public static int [] integerizeStringArray (String [] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int z = 0; z < stringArray.length; z++) {
			intArray[z] = stringArray[z].length();
		}
		return intArray;
	}
	
	// Method 20:
	public static boolean evenBeatsOdd (String [] stringArray) {
		int evenSum = 0;
		int oddSum = 0;
		for (String string : stringArray) {
			if ((string.replaceAll("\\s","")).length() %2 == 0) {
				evenSum += (string.replaceAll("\\s","")).length();
			} else {
				oddSum += (string.replaceAll("\\s","")).length();
			}
		}
		return evenSum > oddSum;
	}
	
	// Method 21:
	public static boolean isPalindrome (String complexString) {
		String simplifiedString = ((complexString.replaceAll("\\p{Punct}", "").replaceAll("\\s",""))).toLowerCase();
		int truthValue = 0;
		for (int j = 0; j < simplifiedString.length(); j++) {
			if (simplifiedString.charAt(j) == simplifiedString.charAt(simplifiedString.length()-1-j)) {
				truthValue ++;
			}
		}
		return truthValue == simplifiedString.length();
	}
}