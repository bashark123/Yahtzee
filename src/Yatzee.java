import java.util.Random;

public class Yatzee {
	
	static public void main (String [] args) {
		
		
		
	}
	
	public void rollDice(int dice[])
	{
		
		
		for( int x = 0; x < dice.length; x++) {
			
			dice[x]= (int)(Math.random() *6 ) +1;
		}
		
		Random r1= new Random();
		int d1 =r1.nextInt(6)+1;
		System.out.println("Die #1 is (" + d1 +")");
		
		Random r2= new Random();
		int d2 =r2.nextInt(6)+1;
		System.out.println("Die #2 is (" + d2 +")");
		
		Random r3= new Random();
		int d3 =r3.nextInt(6)+1;
		System.out.println("Die #3 is (" + d3 +")");
		
		Random r4 = new Random();
		int d4 =r4.nextInt(6)+1;
		System.out.println("Die #4 is (" + d4 +")");
		
		Random r5 = new Random();
		int d5 =r5.nextInt(6)+1;
		System.out.println("Die #4 is (" + d5 +")");

/*		int [] round = {d1, d2, d3, d4, d4, d5};
		
		Arrays.sort(round);
		for(int n: round) {
		System.out.print(" " + n);}*/
	}
	

	
}

class Player {
	
	
	
}

class Dice{
	
	int [] die1 = new int[6];
	int [] die2 = new int[6];
	int [] die3 = new int[6];
	int [] die4 = new int[6];
	int [] die5 = new int[6];

	
	
}