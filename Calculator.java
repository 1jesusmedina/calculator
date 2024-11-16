import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	
		double opNumbers;    //variable for operation numbers
		double answer= 0;    // variable for answer
		int i;               // i integer variable for 'for loop' 
		
		

//while loop so code runs through if statements until prompted to stop
		while (true) {		
			
			System.out.println("Enter the calculator mode: Standard/Scientific?");	 	  // 1. Indicate if Standard or Scientific// 
			String CalcType = sc.next(); 		
				
			if (CalcType.equalsIgnoreCase("Standard")) {
			System.out.println("The calculator will operate in standard mode."); 
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			String OpChoice = sc.next(); 

			//2. program asks for operation

				while (!OpChoice.equals("+") && !OpChoice.equals("-") && !OpChoice.equals("*") && !OpChoice.equals("/")){    //2a. invalid operation input for standard, do one for scientific as well
						System.out.println("Invalid operator " + OpChoice);
						System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
						OpChoice = sc.next();}
					

					if (OpChoice.equals("+"))  {
					System.out.println("How many numbers do you want to add?");      //3. ask user for how many times the operation will happen 
					int AmountOfNumbers = sc.nextInt(); {
					System.out.println("Enter " + AmountOfNumbers + " numbers");	
			 
					for(i = 0; i < AmountOfNumbers; ++i)   {                         // add for loop to keep scanning input until input matches the amount of numbers that are wanted to operate 
					opNumbers = sc.nextDouble();
					if(i==0) {
						answer = opNumbers;}
					else {
						answer = answer + opNumbers;
					}
					}	 
						
					}
					
					
					System.out.println("Result: " + answer);                         //4. display the result
					}
					
					
				    else if (OpChoice.equals("-")) {
					System.out.println("How many numbers do you want to subtract?");
					int AmountOfNumbers = sc.nextInt();
					System.out.println("Enter " + AmountOfNumbers + " numbers");
					
					for(i = 0; i < AmountOfNumbers; ++i)   {                         
						opNumbers = sc.nextDouble();
						if(i==0) {
							answer = opNumbers;}
						else {
							answer = answer - opNumbers;
						
						}
				        }	
					System.out.println("Result: " + answer);
				    }
					
					
				    else if (OpChoice.equals("/")) {
					System.out.println("How many numbers do you want to divide?");
					int AmountOfNumbers = sc.nextInt();
					System.out.println("Enter " + AmountOfNumbers + " numbers");
					
					for(i = 0; i < AmountOfNumbers; ++i)   {                         
						opNumbers = sc.nextDouble();
						if(i==0) {
							answer = opNumbers;}
						else {
							answer = answer / opNumbers;
					} 
					}
					System.out.println("Result: " + answer);
				    }
					
					else if  (OpChoice.equals("*")) { 
					System.out.println("How many numbers do you want to multiply?"); 
					int AmountOfNumbers = sc.nextInt();
				    System.out.println("Enter " + AmountOfNumbers + " numbers"); 
				    
				    for(i = 0; i < AmountOfNumbers; ++i)   {                         
						opNumbers = sc.nextDouble();
						if(i==0) {
							answer = opNumbers;}
						else {
							answer = answer * opNumbers;
				    
				    }
				    }
				    System.out.println("Result: " + answer);
					}
			}


					if  (CalcType.equalsIgnoreCase( "Scientific")) {
			System.out.println("The calculator will operate in scientific mode."); 
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
			String OpChoice = sc.next();

		while (!OpChoice.equals("+") && !OpChoice.equals("-") && !OpChoice.equals("*") && !OpChoice.equals("/") && !OpChoice.equals("/") && !OpChoice.equals("sin") && !OpChoice.equals("cos") && !OpChoice.equals("tan")){    //2a. invalid operation input for standard, do one for scientific as well
			System.out.println("Invalid operator " + OpChoice);		
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x: ");
				OpChoice = sc.next();}
					
			


					 if (OpChoice.equals("+")) { 
					System.out.println("How many numbers do you want to add?");
					int AmountOfNumbers = sc.nextInt();
					System.out.println("Enter " + AmountOfNumbers + " numbers");
					
					for(i = 0; i < AmountOfNumbers; ++i)   {                         
						opNumbers = sc.nextDouble();
						if(i==0) {
							answer = opNumbers;}
						else {
							answer = answer + opNumbers;
						}
						}
						 
					
					System.out.println("Result: " + answer);
				    } 
							
					else if (OpChoice.equals("-")) {
					System.out.println("How many numbers do you want to subtract?");
					int AmountOfNumbers = sc.nextInt();
					System.out.println("Enter " + AmountOfNumbers + " numbers");
					
					
					for(i = 0; i < AmountOfNumbers; ++i)   {                         
						opNumbers = sc.nextDouble();
						if(i==0) {
							answer = opNumbers;}
						else {
							answer = answer - opNumbers;
						}
						}
						 
					System.out.println("Result: " + answer);	
						}

				    
					
					else if (OpChoice.equals("/")) {
					System.out.println("How many numbers do you want to divide?");
					int AmountOfNumbers = sc.nextInt();
					System.out.println("Enter " + AmountOfNumbers + " numbers");
					
					for(i = 0; i < AmountOfNumbers; ++i)   {                         
						opNumbers = sc.nextDouble();
						if(i==0) {
							answer = opNumbers;}
						else {
							answer = answer / opNumbers;
						}
					}
					System.out.println("Result: " + answer);
					}
					
					else if (OpChoice.equals("*")) { 
					System.out.println("How many numbers do you want to multiply?"); 
					int AmountOfNumbers = sc.nextInt();
					System.out.println("Enter " + AmountOfNumbers + " numbers");
					for(i = 0; i < AmountOfNumbers; ++i)   {                         
						opNumbers = sc.nextDouble();
						if(i==0) {
							answer = opNumbers;}
						else {
							answer = answer * opNumbers;
						}
						}
					System.out.println("Result: " + answer);
					}	
					
					else if (OpChoice.equalsIgnoreCase("cos")) { 
					System.out.println("Enter a number in radians to find the cosine");
					opNumbers = sc.nextInt();
					
					answer = Math.cos(opNumbers); 
					
					System.out.println("Result: " + answer);
					}

					else if (OpChoice.equalsIgnoreCase("sin")) { 
						System.out.println("Enter a number in radians to find the sine");
						opNumbers = sc.nextInt();
				        
						answer = Math.sin(opNumbers);
					
						System.out.println("Result: " + answer);
						}
					
					
					else if (OpChoice.equalsIgnoreCase("tan")) { 
						System.out.println("Enter a number in radians to find the tangent");
						opNumbers = sc.nextInt();
				        
					    answer = Math.tan(opNumbers);
					
						System.out.println("Result: " + answer);
						}
					
					 }	
								
			System.out.println("Do you want to start over? (Y/N)");   //5. output if user wants to start over 
			String YorN = sc.next();

		
			
		 if (YorN.equalsIgnoreCase("N")) {
				System.out.println("Goodbye");
				break;
			}

			}
			}

			}

		
