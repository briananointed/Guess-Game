import java.util.Scanner;

public class GStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object creation
		GameConfig G1 = new GameConfig();
		G1.c = 'x';
		Scanner input = new Scanner(System.in);

		//the game asks your name 1st.
		System.out.println("Type your name please");
		G1.name = input.next();
		G1.b =G1.name.charAt(0);
		
		if(G1.c == G1.b)
		{
			G1.Defaultexit();
			G1.exit();
		} else
		{
		
	
		System.out.println("Welcome " + G1.name + " to my game.");
		
		//another object created
		Guess game = new Guess();
		game.starter();
		}
		input.close();
	}

	

}
