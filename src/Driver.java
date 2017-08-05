<<<<<<< HEAD
<<<<<<< HEAD
import org.rosuda.JRI.Rengine;
=======
=======
>>>>>>> af2a55fe9f90b8b59f177711561d18103119409f
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.rosuda.JRI.Rengine;

<<<<<<< HEAD
import model.Deck;
>>>>>>> b0a590805d2cdba54a85ecc56a08f13d3348b072
=======
import model.Cards;
import model.Deck;
>>>>>>> af2a55fe9f90b8b59f177711561d18103119409f

public final class Driver {
	
	private Driver(){}
	


	public static void start() {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		int numCards, nTrials;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("number of cards to be drawn. 1 - 5: ");
		numCards = sc.nextInt();
		System.out.println("number of trials:");
		nTrials = sc.nextInt();
		
		process(numCards,nTrials,deck);
<<<<<<< HEAD
		
		/** Sample code for using R **/
		
		// Create an R vector in the form of a string.
		String javaVector = "c(1,2,3,4,5)";
=======
>>>>>>> af2a55fe9f90b8b59f177711561d18103119409f
		
        // Start Rengine.
		Rengine engine = new Rengine(new String[] { "--no-save" }, false, null);
		
		// The vector that was created in JAVA context
		// is stored in 'rVector' which is a variable in R context.
		engine.eval("rVector=" + javaVector);
		
		//Calculate MEAN of vector using R syntax.
		engine.eval("meanVal=mean(rVector)");
		
        //Print output values
		double mean = engine.eval("meanVal").asDouble();
		
		System.out.println("Mean of given vector is=" + mean);
		
		/** End of Sample Code **/
	}
	
	public static void process(int numCards, int nTrials,Deck deck){
		try{
			PrintWriter writer = new PrintWriter("output/output.txt", "UTF-8");
            for (int i = 0; i < nTrials; i++) {
                deck.shuffle();
                writeFile( writer, deck, i, numCards);
            }
            writer.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void process(int numCards, int nTrials,Deck deck){
		try{
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
            for (int i = 0; i < nTrials; i++) {
                deck.shuffle();
                writeFile( writer, deck, i, numCards);
            }
            writer.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}



	private static void writeFile(PrintWriter writer, Deck deck, int i, int numCards) {
		// TODO Auto-generated method stub
		writer.println("------Trial #" + (i+1)+"------");

        for (int j = 0; j < numCards; j++) {
            Cards withoutReplacement = deck.drawCardwithoutReplacement();
            writer.println("----Card #" + (j+1) +  "----");
            writer.println("Without replacement: ");
            writer.println("Card: " + withoutReplacement.getSuit() + " - " + withoutReplacement.getRank());
            Cards withReplacement = deck.drawCardwithReplacement();
            writer.println("With replacement: ");
            writer.println("Card: " + withReplacement.getSuit() + " - " + withReplacement.getRank());
        }
        writer.println("\n");
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



	private static void writeFile(PrintWriter writer, Deck deck, int i, int numCards) {
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
