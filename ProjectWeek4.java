package Assignment;

public class ProjectWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
int [] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 

/*		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
 		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  */

        // the first value in age [0];
        //the last one is ages[ages.length-1];
int [] ages2 = new int[9];

for (int i = 0 ; i < ages.length; i++) {
	
	ages2 [i] =- ages[i] + ages[ages.length-1];
	System.out.println(ages2[i]);
}

        //i. Make sure that there are 9 elements of type int in this new array.  
       
        System.out.println("Make sure that there are 9 elements of type int in this new array" + ages2.length);


//		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

//		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
        for (int i = 0 ; i < ages.length; i++) {
        	
        	
        	System.out.println(-ages2[i] + ages2[ages2.length-1]);
        	
        }    	

        
        
        
        //		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
         
int a = 0;
		
		for (int i = 0; i < ages2.length; i++) {
			
			a+=ages2[i];
			
		}
		 int averageAge2 = a / ages2.length;
		System.out.println(averageAge2);
        
        
        
        
/*		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	        a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	        b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console./*
*/
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sum2 = 0;
		for (int i = 0; i < names.length; i++) {
			
		}
		System.out.println("Value of sum for names" + sum2);
		
		
//		3. How do you access the last element of any array?
		int[] array = {1, 2, 3, 4, 5};
        int lastIndex = array[array.length -1];
        System.out.println("This is the lastIndex in the array; " + lastIndex);
//		4. How do you access the first element of any array?
        int firstIndex = array[0];
        System.out.println("This is the firstIndex in the array; " + firstIndex);
//		5. Create a new array of int called nameLengths. Write a
        //loop to iterate over the previously created names array 
        //and add the length of each name to the nameLengths array.
        int [] nameLengths = new int [names.length];
      for (int i = 0; i < names.length; i++) {
    	  nameLengths[i] = names[i].length(); 
    	  System.out.println(nameLengths[i]);
      } 
        
        
//		6. Write a loop to iterate over the nameLengths array and calculate the sum 
 //       of all the elements in the array. Print the result to the console.
      int sum = 0;
      
      for (int i = 0; i < nameLengths.length; i++) {
    	  sum += nameLengths[i];
  //   sum = sum + nameLengths[i]
    	  
      }   System.out.println("Value of sum is : " + sum);
      
//
//		7. Write a method that takes a String, word, and an int, n, as arguments 
//      and returns the word concatenated to itself n
//      number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        int input = 25; String word = "Hallelujah";
        System.out.println(wordConcatination(input, word)); 
        
      
      
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
        String firstName = "Bob";
        String lastName = "TheBuilder";
        System.out.println(fullName (firstName, lastName));
        
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        int x[] = { 12, 11, 10, 8, 6, 17, 22, 1, 15};
        System.out.println(sum3(x));
//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
        double a2[] = {5.5, 2.3, 10.3, 4.0};
        System.out.println(average1(a2));
//		11. Write a method that takes two arrays of double and returns true 
//      if the average of the elements in the first array 
//      is greater than the average of the elements in the second array.
        double b1[] = {3.3, 4.7, 8.2, 4.8, 9.9};
        double b2 [] = { 2.9, 7.3, 6.3, 7.4, 6.4};
        System.out.println(comparison(b1,b2));
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
//      and a double moneyInPocket, 
//      and returns true if it is hot outside and if
//      moneyInPocket is greater than 10.50.
        boolean isHotOutside = true;
        double moneyInPocket = 10.51;
        System.out.println(willBuyDrink(isHotOutside,moneyInPocket));
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
     // This is a way for someone to calculate their tax in Pennsylvania.
        double price = 3.98;
        System.out.println(tax(price));
        
	}
	//7. Write a method that takes a String, word, and an int, n, as arguments 
//  and returns the word concatenated to itself n
//  number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
    

	public static String wordConcatination(int n, String word ) {
	String wordToReturn = "";	
	for (int i = 0; i < n; i++) {
		wordToReturn += word;
	}
	return wordToReturn;
    }
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
    public static String fullName (String fN, String lN) {
	return fN + " " + lN;
	
}
//	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. 
    public static boolean sum3(int[]x) {
	    int sum3 = 0;
	    for (int i = 0; i < x.length; i++) {
	    	sum3 += x[i];
	    }
	    if (sum3 > 100) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	 
    }
//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
    
    public static double average1(double input[]) {
    	double sum4 = 0;
    	for (int i = 0; i < input.length; i++) {
    	sum4 += input [i]; 	
    	}
    	return sum4 / input.length;
    
    }
//	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    public static boolean comparison(double input[],double input2[]) {
    	double sum5 = 0;
    	double sum6 = 0;
    	double avglocal1 = 0;
    	double avglocal2 = 0;
    	for (int i = 0; i < input.length; i++) {
    	sum5 += input [i]; 	
    	}
    	for (int j = 0; j < input2.length; j++) {
        	sum6 += input2 [j]; 	
        	}
    	avglocal1 = sum5 / input.length;
    	avglocal2 = sum6 / input2.length;
    	
    	if (avglocal1 > avglocal2) {
    		return true;
    	}
    	else {
    		return false;
    	}
    
    }
//    12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
//  and a double moneyInPocket, 
//  and returns true if it is hot outside and if
//  moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	if(isHotOutside == true && moneyInPocket > 10.50) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	}//		13. Create a method of your own that solves a 
    //problem. In comments, write what the method does and why you created it.
    // This is a way for someone to calculate their tax in Pennsylvania. 
    
    public static double tax(double cost) {
    	return cost *= 0.06; 
    }
    
    }
    







