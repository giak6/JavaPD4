class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   
    int x1 = 10;
    int x2 = 90;
    int sum = x1 + x2; 
    System.out.println("the sum is:" + sum);


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/

    int g1 = 85;
    int g2 = 95;
    int g3 = 90;
    int total = g1 + g2 + g3; 
    System.out.println("the sum of all grades:" + total);

/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

    int avg = total/3; 
    System.out.println("the avg of all grades:" + avg);


/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
  
    int a = 4;
    int x = 1;
    int eq1 = a/ x+1;
    System.out.println("eq1 is y=" + eq1);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
    int eq2 = (2*x)*(x+1)*(-x/2)/a; 
    System.out.println("eq2 is y=" + eq2);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
    int b = 2;
    int h = 2;
    int area = (1/2)*(b*h); 
    System.out.println("eq3 area=" + area);


/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}