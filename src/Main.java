import java.util.Arrays;
import java.util.Vector;

import org.rosuda.JRI.Rengine;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RList;
import org.rosuda.JRI.RVector;

import model.Cards;
import model.Deck;
import view.Window;

public class Main {
	public static void main(String[] args){
		
////		Driver.start();
//		Deck deck = new Deck();
//		int numCards, nTrials, desiredTotal;
//		int wdTotal = 0;
//		int wodTotal = 0;
		
		Window window = new Window();
		window.getFrame().setVisible(true);
	    
//		numCards = Integer.parseInt(window.getNumDraws().getText());
//		nTrials = Integer.parseInt(window.getNumTrials().getText());
//		desiredTotal = Integer.parseInt(window.getDesiredTotal().getText());
//	    
//		
//		Driver.process(numCards, nTrials, desiredTotal, deck, wdTotal, wodTotal);
//		
	    String deckVector = "c(1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13)";
	    		     
	    
	    String deckVector2 = "c(1,2,3,4,5,6,7,8,9,10,11,12,13)";
	    
	    Rengine engine = new Rengine(new String[] { "--no-save" }, false, null);
	    engine.eval("library(gtools)");

	    
	    engine.eval("deckTotal=" + deckVector);
	    engine.eval("deckTotal2=" + deckVector2);

	    /* Initialize all possible card value sums without replacement */
	    
	    REXP posTotal1 = engine.eval("posTotal1 <- unique(combn(deckTotal, 1, sum))");
	    double [] posTotal1Double = posTotal1.asDoubleArray();
	    	    
	    int [] intPosTotal1 = new int[posTotal1Double.length];
	    for(int i = 0; i < intPosTotal1.length; i++) {
	    	intPosTotal1[i] = (int) posTotal1Double[i];
//	    	System.out.println(intPosTotal1[i] );
	    }
	    
	    REXP posTotal2 = engine.eval("posTotal2 <- unique(combn(deckTotal, 2, sum))");
	    double [] posTotal2Double = posTotal2.asDoubleArray();
	    	    
	    int [] intPosTotal2 = new int[posTotal2Double.length];
	    for(int i = 0; i < intPosTotal2.length; i++) {
	    	intPosTotal2[i] = (int) posTotal2Double[i];
//	    	System.out.println(intPosTotal2[i] );
	    }
	    
	    REXP posTotal3 = engine.eval("posTotal3 <- unique(combn(deckTotal, 3, sum))");
	    double [] posTotal3Double = posTotal3.asDoubleArray();
	    	    
	    int [] intPosTotal3 = new int[posTotal3Double.length];
	    for(int i = 0; i < intPosTotal3.length; i++) {
	    	intPosTotal3[i] = (int) posTotal3Double[i];
//	    	System.out.println(intPosTotal3[i] );
	    }
	    
	    REXP posTotal4 = engine.eval("posTotal4 <- unique(combn(deckTotal, 4, sum))");
	    double [] posTotal4Double = posTotal4.asDoubleArray();
	    	    
	    int [] intPosTotal4 = new int[posTotal4Double.length];
	    for(int i = 0; i < intPosTotal4.length; i++) {
	    	intPosTotal4[i] = (int) posTotal4Double[i];
//	    	System.out.println(intPosTotal4[i] );
	    }
	    
	    REXP posTotal5 = engine.eval("posTotal5 <- unique(combn(deckTotal, 5, sum))");
	    double [] posTotal5Double = posTotal5.asDoubleArray();
	    	    
	    int [] intPosTotal5 = new int[posTotal5Double.length];
	    for(int i = 0; i < intPosTotal5.length; i++) {
	    	intPosTotal5[i] = (int) posTotal5Double[i];
//	    	System.out.println(intPosTotal5[i] );
	    }
	    Arrays.sort(intPosTotal1);
	    Arrays.sort(intPosTotal2);
	    Arrays.sort(intPosTotal3);
	    Arrays.sort(intPosTotal4);
	    Arrays.sort(intPosTotal5);

	    /* Initialize all possible card value sums with replacement */

	   
    	    
	    int [] intPosTotal1Rep = new int[13];
	    for(int i = 1; i < intPosTotal1Rep.length; i++) {
	    	intPosTotal1Rep[i] = i;
	    }
	    
	    int [] intPosTotal2Rep = new int[26];
	    for(int i = 2; i < intPosTotal2Rep.length; i++) {
	    	intPosTotal2Rep[i] = i;
	    }
	    
	    int [] intPosTotal3Rep = new int[39];
	    for(int i = 3; i < intPosTotal3Rep.length; i++) {
	    	intPosTotal3Rep[i] = i;
	    }
	    
	    int [] intPosTotal4Rep = new int[52];
	    for(int i = 4; i < intPosTotal4Rep.length; i++) {
	    	intPosTotal4Rep[i] = i;
	    }
	    
	    int [] intPosTotal5Rep = new int[65];
	    for(int i = 5; i < intPosTotal5Rep.length; i++) {
	    	intPosTotal5Rep[i] = i;
	    }
	    
	    
	}
	
}
