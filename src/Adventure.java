import java.util.Scanner;
public class Adventure {

	public static void main(String[] args) {
     String num, x,y;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "You are in a creepy house? Would you like to go upstairs or into the kitchen?:");
		 num = keyboard.next();
		 
		 if ( num.equals("kitchen")){
			 System.out.println( "There is a long countertop with dirty dishes everywher, Off to one side "
			 		+ "there is, as you would expect, a refrigerator. You may open the refrigerator"
			 		+ "or look in a cabinet: "); 
			 x = keyboard.next();
		 			 		 
			 if (x.equals("Refrigerator")){
				 System.out.println("Inside the refrigerator you see food and stuff. "
				 		+ "It looks pretty nasty."
				 		+ "Would you like to eat some of the food? (yes or no)");
				 y = keyboard.next();
				 if (y.equals("no")){
					 System.out.print( "You die of starvation... eventually");
				 }
			 
		 
			 else{
				 System.out.print( "Wow");
					 
				 }
			 }
		 }
			 }
		 }



