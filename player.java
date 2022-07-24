import java.util.Random;
public class player {
	Random r = new Random();
	
	private int rps;
	// Rock paper scissors
	private boolean coin;
	// Coin flip
	private int guess;
	// Guessing number 0-100
	
	// Constructors
	public player () {
		rps = 0;
		coin = true;
		guess = 0;
	}
	
	public player (int x, boolean y, int z) {
		if (x>=0 && x<=3) {
			rps = x;
		}
		else {
			rps = 0;
		}
		if (z>=0 && z<=100) {
			guess = z;
		}
		else {
			guess = 100;
		}
		coin = y;
	}
	
	// Accessors
	public int getrps () {
		return rps;
	}
	public boolean getcoin () {
		return coin;
	}
	public int getguess () {
		return guess;
	}

	// Mutators 
	// Mutator for rps 
	public boolean putrps (int x) {
		boolean check;
		if (x>=0 && x<=3) {
			// Rock paper scissors are restricted to these numbers 
			rps = x;
			check = true;
		}
		else {
			check = false;
		}
		return check;
	}
	
	// Mutator for coin flip
	public boolean putcoin (boolean x) {
		boolean check;
		if (coin!=x) {
			coin = x;
			check = true;
		}
		else {
			check = false;
		}
		return check;
	}
	
	// Mutator for guess 
	public boolean putguess (int x) {
		boolean check;
		if (x>=0 && x<=100) {
			// Players can guess between these numbers
			guess = x;
			check = true;
		}
		else {
			check = false;
		}
		return check;
	}
	
	// Print instance method
	public void print (player x) {
		System.out.println("Player chose " + x.rps + " for rock paper scissors");
		System.out.println("Player chose " + x.coin + " for the coinflip");
		System.out.println("Player chose " + x.guess + " for number guessing");
	}
	
	// Class method compare 
	public static boolean compare (player x, player y, boolean c, int g) {
		int timeswony = 0;
		int timeswonx = 0;
		// checking to see who wins rock paper scissors... where 0 = rock, 1 = paper, 2 = scissors
		// Rock Vs paper cases
		if (x.rps==0 && y.rps==1) {
			timeswony++;
		}
		else if (x.rps==1 && y.rps==0) {
			timeswonx++;
		}
		// Rock vs Scissors cases
		if (x.rps==0 && y.rps==2) {
			timeswonx++;
		}
		else if (x.rps==2 && y.rps==0) {
			timeswony++;
		}
		// Paper vs Scissors cases
		if (x.rps==1 && y.rps==2) {
			timeswony++;
		}
		else if (x.rps==2 && y.rps==1) {
			timeswonx++;
		}
		if (x.rps==y.rps) {
		}
		
		// Coin flip game (checking to see who wins using the cases)
		// If they both choose the same side, both players win, so they get a point 
		// But this doesnt interfere with the program
		if (x.coin==c) {
			timeswonx++;
		}
		if (y.coin==c) {
			timeswony++;
		}
		
		// Number Guessing game
		int guessx = x.guess-g;
		int guessy = y.guess-g;
		if (Math.abs(guessx)<Math.abs(guessy)) {
			timeswonx++;
		}
		else if (Math.abs(guessx)==Math.abs(guessy)) {
		// Nothing happens if the players pick the same number 
		}
		else {
			timeswony++;
		}
		
		// Now checking to see who wins (or tie)
		if (timeswonx>timeswony) {
			return true;
		}
		else if (timeswonx==timeswony) {
			return false;
		}
		else {
			return true;
		}
	}
	
	// Winner method (By points)
	public static player winner (player x, player y, boolean c, int g) {
		int timeswony = 0;
		int timeswonx = 0;
		// checking to see who wins rock paper scissors... where 0 = rock, 1 = paper, 2 = scissors
		// Rock Vs paper cases
		if (x.rps==0 && y.rps==1) {
			timeswony++;
		}
		else if (x.rps==1 && y.rps==0) {
			timeswonx++;
		}
		// Rock vs Scissors cases
		if (x.rps==0 && y.rps==2) {
			timeswonx++;
		}
		else if (x.rps==2 && y.rps==0) {
			timeswony++;
		}
		// Paper vs Scissors cases
		if (x.rps==1 && y.rps==2) {
			timeswony++;
		}
		else if (x.rps==2 && y.rps==1) {
			timeswonx++;
		}
		if (x.rps==y.rps) {
			// Nobody wins if the choose the same object (Nobody will get the point)
		}
		
		// Coin flip game
		if (x.coin==c) {
			timeswonx++;
		}
		if (y.coin==c) {
			timeswony++;
		}
		
		// Number Guessing game
		int guessx = x.guess-g;
		int guessy = y.guess-g;
		if (Math.abs(guessx)<Math.abs(guessy)) {
			timeswonx++;
		}
		else if (Math.abs(guessx)==Math.abs(guessy)) {
			// Nobody gains a point if they choose the same number (nobody wins)
		}
		else {
			timeswony++;
		}
		
		// Now checking to see who wins (or tie)
		if (timeswonx>timeswony) {
			return x;
		}
		else {
			return y;
		}
	}
	// Basically just copied the compare method, but now it returns the player that won the games
	// Instead of the true or false counterpart
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
