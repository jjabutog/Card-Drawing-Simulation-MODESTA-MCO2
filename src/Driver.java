import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.rosuda.JRI.Rengine;

import model.Cards;
import model.Deck;

public final class Driver {
	
	private Driver(){}
	


	public static void start() {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		int numCards, nTrials, desiredTotal;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("number of cards to be drawn. 1 - 5: ");
		numCards = sc.nextInt();
		System.out.println("number of trials:");
		nTrials = sc.nextInt();
		//System.out.println("desired sum:");
		//desiredTotal = sc.nextInt();
		
	    Rengine engine = new Rengine(new String[] { "--no-save" }, false, null);

		
		
		process(numCards,nTrials,deck);
		
		System.out.println("oks");
		
	}
	
	public static void process(int numCards, int nTrials,Deck deck){
		try{
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
            for (int i = 0; i < nTrials; i++) {
                deck.shuffle();
                writeFile( writer, deck, i, numCards);
                deck.ResetDeck();
            }
            writer.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//puts all cards drawn in an array - without replacement
	private static Cards[] DrawWithoutReplacement(Deck deck,int numCards){
		Cards[] withoutReplacement = new Cards[numCards];
		
		for(int i=0;i<numCards;i++){
			withoutReplacement[i] = deck.drawCardwithoutReplacement();
		}
		return withoutReplacement;
	}
	
	//puts all cards drawn in an array - with replacement
	private static Cards[] DrawWithReplacement(Deck deck,int numCards){
		Cards[] withReplacement = new Cards[numCards];
		
		for(int i=0;i<numCards;i++){
			withReplacement[i] = deck.drawCardwithReplacement();
		}
		return withReplacement;
	}
	
	//get sum of a draw card. use this function to get sum of with replacement and without replacement
	private static int GetTotal(Cards[] drawCards,int numCards){
		int total = 0;
		
		for(int i=0;i<numCards;i++){
			total += drawCards[i].getValue();
		}
		
		return total;
	}


	//write on file
	private static void writeFile(PrintWriter writer, Deck deck, int i, int numCards) {
		// TODO Auto-generated method stub
		int wTotal = 0; 
		int woTotal = 0;
		
		Cards[] withReplacement = DrawWithReplacement(deck,numCards);
		Cards[] withoutReplacement =DrawWithoutReplacement(deck,numCards);
		wTotal = GetTotal(withReplacement,numCards);
		woTotal = GetTotal(withoutReplacement,numCards);
		
		writer.println("Trial #" + (i+1));
		
		
		writer.println("Without replacement: ");
		for(int j=0; j< numCards; j++){
			writer.println("Card #" + (j+1) );
			writer.println("Card: "  + withoutReplacement[j].getRank()+ " of "  + withoutReplacement[j].getSuit() );
			
		}
		
		writer.println("With replacement: ");
		for(int j=0; j<numCards; j++){
			writer.println("Card #" + (j+1) );
			writer.println("Card: " + withReplacement[j].getRank()+ " of "+ withReplacement[j].getSuit());
		}
		
		/*
        for (int j = 0; j < numCards; j++) {
            Cards withoutReplacement = deck.drawCardwithoutReplacement();
            woTotal += withoutReplacement.getValue();
            writer.println("Card #" + (j+1) );
            writer.println("Without replacement: ");
            writer.println("Card: "  + withoutReplacement.getRank()+ " of "  + withoutReplacement.getSuit() );
            Cards withReplacement = deck.drawCardwithReplacement();
            wTotal += withReplacement.getValue();
            writer.println("With replacement: ");
            writer.println("Card: " + withReplacement.getRank()+ " of "+ withReplacement.getSuit()   );
            writer.println("\n");
        }
        */
		
        writer.println("Without replacement total: " + woTotal);
        writer.println("With replacement total: " + wTotal);
        writer.println("\n");
	}



	private static void DesiredTotal(int wTotal, int woTotal) {
		// TODO Auto-generated method stub
		
		
	}
	
	

	/* Create an R vector in the form of a string.
    String javaVector = "c(1,2,3,4,5)";

    // Start Rengine.
    Rengine engine = new Rengine(new String[] { "--no-save" }, false, null);

    // The vector that was created in JAVA context is stored in 'rVector' which is a variable in R context.
    engine.eval("rVector=" + javaVector);
    
    //Calculate MEAN of vector using R syntax.
    engine.eval("meanVal=mean(rVector)");
    
    //Retrieve MEAN value
    double mean = engine.eval("meanVal").asDouble();
    
    //Print output values
    System.out.println("Mean of given vector is lol=" + mean);
	*/

}
