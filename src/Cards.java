import java.util.Random;

public class Cards {

	static public void main (String[] args) {
		
		
	
	
	
		// String[] cardsArray(int[] card) {
		int[] cards = new int[16];
		
		// insert random numbers in the array
		for(int i = 0; i < cards.length; i++) {
		Random randN = new Random();
		cards[i] = 1+ randN.nextInt(50);
		}
		//
/*	    for(int i = 0; i < cards.length; i++) {
	      
	    	cards[i] = (int)(Math.random()*20 +1);
	    }*/
	    	
	    	
	    	
	    	for (int x = 0 ; x < cards.length ; x++) {
	    		
	   		int temp;
	    		for (int y = x+1; y < cards.length ; y++) {
	    			
	    		
	    			if (cards[x] > cards[y]); {
	    			temp = cards[x];
	    			cards[x] = cards[y];
	    			cards[y] = temp;
	    		}
	    		}
	    	}
	      
	    

//	      Arrays.sort(cards);
	      
	      for (int n : cards) {
	         System.out.print(n +" ");}
	
		
	    
	    }
}


	




