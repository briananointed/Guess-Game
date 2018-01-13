import java.util.Scanner;

public class GameConfig {
   //variables imma use in my prog
	String name;
	char c ;
	char b ;
	char choice;
	int tries= 1 ,pguess;
	int targetNumber=(int)(Math.random()*10);
	int cmp = Integer.compare(pguess, targetNumber);

	//after 1st fail, this is the method you come to
	   int ditrial()
	   {
		
		
	
		System.out.println("Target Number :" +targetNumber);
		System.out.println("current guess :" + pguess);
		Scanner input = new Scanner(System.in);
		
		do{
			if(cmp != 0)
			{
				System.out.println("Wrong");
			
			}
			pguess = input.nextInt();
		    cmp = Integer.compare(pguess, targetNumber);
			tries++;
		 
			
		}while(cmp != 0 && tries !=3);
		
		if(cmp == 0)
		{
			System.out.println("Good guess. Thats the answer");
			playagain();
		}
		if(tries ==3)
		{
			System.out.println("\nMaximun trials is 3!!!\nAnswer :" + targetNumber );
			playagain();
		}
		input.close();
		return targetNumber;
	   }
	
	
	//playagain method
	void playagain() {
		// TODO Auto-generated method stub
		Guess game = new Guess();
		
		
		System.out.println("Do you wish to continue ( Y / N)");
		Scanner input = new Scanner(System.in);
		choice = input.next().charAt(0) ;
		// I used a switchcase bcoz you set what input you want to receive
		switch(choice){
		
		case 'Y' :
		case 'y' :
		          game.starter();
		          break;
		case 'n' :
		case 'N' :
		          exit();
		          break;
		case 'x' :
		case 'X' :
			      Defaultexit();
			      break;
	    default  :
	    	      playagain();
	    	      break;
		}
		
		input.close();
	}
	
	
	// default exit when you press x
      void Defaultexit() {
	// TODO Auto-generated method stub
System.out.println ("You have exited the game by default[X]");
System.exit(0);
}

// exit when you are done with the game
      void exit(){
    	  System.out.println ("Thank you. Until next time Lad!!!");
    	 System.exit(0); 
      }
}