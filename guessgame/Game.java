import java.util.Scanner;

public class Guess {
	
	// We need the game configurations so I created the object
	GameConfig playagain = new GameConfig();
	
	// this is the game starter
	public void starter(){
		
		
	System.out.println("Am thinking of a Number.(btn 0 & 9)\n Guess ...");
	System.out.println("current guess :" +playagain.pguess);
	System.out.println("Target Number :" +playagain.targetNumber);
	 
	Scanner input = new Scanner(System.in);
	playagain.pguess = input.nextInt();
	thegame();
	
	input.close();
	
	}
	// This is the game itself 
	public void thegame(){
		
		playagain.cmp = Integer.compare(playagain.pguess,playagain.targetNumber);
		if(playagain.cmp == 0)
		{
			System.out.println("Good guess. Thats the answer");
			
			playagain.playagain();
		}else if (playagain.cmp !=0)
		{
			playagain.ditrial();
		}
		
		
		}	
		
	
	
}