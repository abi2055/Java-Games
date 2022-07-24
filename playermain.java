import java.util.Scanner;
import java.util.Random;
public class playermain {

	// Main class code
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random r = new Random ();
		
		int p1rps;
		// Represents player 1 rock paper scissors
		int p2rps;
		// Represents player 2 rock paper scissors
		boolean p1c;
		// Represents player 1 coin flip
		boolean p2c;
		// Represents player 2 coin flip
		int p1g;
		// Represents player 1 number guess
		int p2g;
		// Represents player 2 number guess
		String wish = "no";
		// wish represents the decision to continue changing values in the do while loop
		boolean coinflip = r.nextBoolean();
		// coinflip randomizes the boolean value heads = true, tails = false
		int guess = r.nextInt(101);
		// guess randomizes the number between 0 and 100 
		// (used 101 because the method doesnt include the last value)
		
		// Inputting rps choices
		System.out.println("Player 1: Rock, Paper or Scissors (1, 2, 3)?");
		p1rps = in.nextInt();
		System.out.println("Player 2: Rock, Paper or Scissors (1, 2, 3)?");
		p2rps = in.nextInt();
		
		// Inputting coin flip choices
		System.out.println("Player 1: Heads or Tails (True or False)?");
		p1c = in.nextBoolean();
		System.out.println("Player 2: Heads or Tails (True or False)?");
		p2c = in.nextBoolean();

		// Inputting number guessing choices
		System.out.println("Player 1: Guess a number?");
		p1g = in.nextInt();
		System.out.println("Player 2: Guess a number?");
		p2g = in.nextInt();
		
		// Both these do while loops allow the players to change their choices any number of times
		// However many times they alter simply changes the set variables, so it wouldnt interfere with the code
		do {
			System.out.println("Player 1 these are your choices, would you like to change any?");
			System.out.println("1: RPS: " + p1rps);
			System.out.println("2: Coin Flip: " + p1c);
			System.out.println("3: Number Guessing: " + p1g);
			String user = in.next();
			if (user.equals("yes")) {
				System.out.println("Pick which game you would like to change (1,2,3)");
				int option = in.nextInt();
				if (option==1) {
					System.out.println("What would you like to change it to... ");
					int change = in.nextInt();
					p1rps = change;
				}
				else if (option==2) {
					System.out.println("What would you like to change it to... ");
					boolean change = in.nextBoolean();
					p1c = change;
				}
				else if (option==3) {
					System.out.println("What would you like to change it to... ");
					int change = in.nextInt();
					p1g = change;
				}
				else {
					System.out.println("Invalid Entry");
				}
			}
			System.out.println("Wish to change something else?");
			wish = in.next();
		} while (wish.equals("yes"));
		
		do {
			System.out.println("Player 2 these are your choices, would you like to change any?");
			System.out.println("1: RPS: " + p2rps);
			System.out.println("2: Coin Flip: " + p2c);
			System.out.println("3: Number Guessing: " + p2g);
			String user = in.next();
			if (user.equals("yes")) {
				System.out.println("Pick which game you would like to change (1,2,3)");
				int option = in.nextInt();
				if (option==1) {
					System.out.println("What would you like to change it to... ");
					int change = in.nextInt();
					p2rps = change;
				}
				else if (option==2) {
					System.out.println("What would you like to change it to... ");
					boolean change = in.nextBoolean();
					p2c = change;
				}
				else if (option==3) {
					System.out.println("What would you like to change it to... ");
					int change = in.nextInt();
					p2g = change;
				}
				else {
					System.out.println("Invalid Entry");
				}
			}
			System.out.println("Wish to change something else?");
			wish = in.next();
		} while (wish.equals("yes"));

		player p1 = new player (p1rps, p1c, p1g);
		player p2 = new player (p2rps, p2c, p2g);
		
		boolean store = player.compare(p1, p2, coinflip, guess);
		System.out.println("Any Winner: " + store);
		// You wouldnt necessarily need this
		
		// This block just outputs the values the computer randomized for the game
				if (coinflip==true) {
					System.out.println("The Coinfilp was heads!");
				}
				else {
					System.out.println("The Coinflip was false!");
				}
				System.out.println("The random number was " + guess);
		
		// Finally, this if statement tells the users if we have a winner of the games
		// Or if we have a tie
		if (store==true) {
			if (player.winner(p1, p2, coinflip, guess)==p1) {
				System.out.println("Player 1 Is Victorious!!");
			}
			else {
				System.out.println("Player 2 Is Victorious!!");
			}
		}
		else {
			System.out.println("Well Played Players!");
			System.out.println("We Have a Tie!");
		}
		
		
		
		
	}

}
