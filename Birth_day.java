
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Birth_day {
		public static void main (String a[]) {
			
			Scanner inputScanner = new Scanner(System.in);
			String toy;
			String name, age, answer, answer3, choice;
			int random, child_age;
			double price = 0;
			Random rand = new Random();//use to make random number
			random = rand.nextInt(100000);
			String choice1 = null ;
			JOptionPane.showMessageDialog(null, "Welcome to the toy company\nto choose gift for young children.");
			
			do {
				
			name = JOptionPane.showInputDialog("Enter name of your child."); // User enter the kid name
			age = JOptionPane.showInputDialog("Enter the age of the child."); // User enter age
			
			//convert age from string to int
			child_age = Integer.parseInt(age); 
			
			//Ask for toy choice
			toy = JOptionPane.showInputDialog("Choose a toy:  plushie, blocks,  book.");
		
			//call setToy. 
			Toy toy_choice = new Toy(toy, child_age); 
			//Pass toy to setToy, and setCost
			toy_choice.setToy(toy);
			toy_choice.setCost(toy);
			
			//call setAge
			Toy Age = new Toy();
			//Pass age to setAge
			Age.setAge(child_age);
			
			//check age
			Toy checkAge = new Toy(toy, child_age);
	
		if(checkAge.ageOK() == false) {
				choice1 = JOptionPane.showInputDialog("The age is not appropriate \ndo you want to cancel the request? Yes or No");
				
				
		if (choice1.equals("yes") || choice1.equals("Yes")) {
					name = JOptionPane.showInputDialog("Enter name of your child."); // User enter the kid name
					age = JOptionPane.showInputDialog("Enter the age of the child."); // User enter age
					
					//convert age from string to int
					child_age = Integer.parseInt(age); 
					
					//Ask for toy choice
					toy = JOptionPane.showInputDialog("Choose a toy:  plushie, blocks,  book.");
			
					//Pass toy to setToy, and setCost
					toy_choice.setToy(toy);
					toy_choice.setCost(toy);
					
					//Pass age to setAge
					Age.setAge(child_age);
				
				}
		}
				
			
			answer = JOptionPane.showInputDialog("Do you want a card with the gifts? Yes or No");
			
			//Pass answer to addCard
			Toy check1 = new Toy(toy, child_age);
			check1.addCard(answer);
			
			String answer2 = JOptionPane.showInputDialog("Do you want a baloon with the gift? Yes or No");
			
			//Pass answer2 to addBaloon
			check1.addBalloon(answer2);
			answer3 = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
			
			//Call toString 
			Toy display = new Toy(toy, child_age);
			System.out.println("The gift for " + name + display.toString());
			
			price+=(check1.getCost());
			} while(answer3.equals("yes")|| answer3.equals("Yes"));
			
			System.out.print("The cost of your order is $"+price);
			System.out.println(" Order number is "+random);
		}		
	}
				
		
		
	

		
		

