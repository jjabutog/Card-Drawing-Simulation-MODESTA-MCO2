package view;
import java.awt.EventQueue;

import java.util.Arrays;
import java.util.Vector;

import org.rosuda.JRI.Rengine;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RList;
import org.rosuda.JRI.RVector;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

import model.Cards;
import model.Deck;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.CardLayout;
import javax.swing.JCheckBox;

public class Window {


	private JFrame frame;
	
	public JTextField getNumDraws() {
		return numDraws;
	}

	public void setNumDraws(JTextField numDraws) {
		this.numDraws = numDraws;
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getDesiredTotal() {
		return desiredTotal;
	}

	public void setDesiredTotal(JTextField desiredTotal) {
		this.desiredTotal = desiredTotal;
	}

	public JTextField getNumTrials() {
		return numTrials;
	}

	public void setNumTrials(JTextField numTrials) {
		this.numTrials = numTrials;
	}

	public JTextField getIdealProb() {
		return idealProb;
	}

	public void setIdealProb(JTextField idealProb) {
		this.idealProb = idealProb;
	}

	public JTextField getActualProb() {
		return actualProb;
	}

	public void setActualProb(JTextField actualProb) {
		this.actualProb = actualProb;
	}

	public JTextField getActMean() {
		return actMean;
	}

	public void setActMean(JTextField actMean) {
		this.actMean = actMean;
	}

	public JTextField getActVar() {
		return actVar;
	}

	public void setActVar(JTextField actVar) {
		this.actVar = actVar;
	}

	public JTextField getActSD() {
		return actSD;
	}

	public void setActSD(JTextField actSD) {
		this.actSD = actSD;
	}

	public JTextField getActMed() {
		return actMed;
	}

	public void setActMed(JTextField actMed) {
		this.actMed = actMed;
	}

	public JTextField getActMode() {
		return actMode;
	}

	public void setActMode(JTextField actMode) {
		this.actMode = actMode;
	}

	public JTextField getIdeVar() {
		return ideVar;
	}

	public void setIdeVar(JTextField ideVar) {
		this.ideVar = ideVar;
	}

	public JTextField getIdeMean() {
		return ideMean;
	}

	public void setIdeMean(JTextField ideMean) {
		this.ideMean = ideMean;
	}

	public JTextField getIdeMode() {
		return ideMode;
	}

	public void setIdeMode(JTextField ideMode) {
		this.ideMode = ideMode;
	}

	public JTextField getIdeMedian() {
		return ideMedian;
	}

	public void setIdeMedian(JTextField ideMedian) {
		this.ideMedian = ideMedian;
	}

	public JTextField getIdeSD() {
		return ideSD;
	}

	public void setIdeSD(JTextField ideSD) {
		this.ideSD = ideSD;
	}

	private JTextField desiredTotal;
	private JTextField numTrials;
	private JTextField idealProb;
	private JTextField actualProb;
	private JTextField actMean;
	private JTextField actVar;
	private JTextField actSD;
	private JTextField actMed;
	private JTextField actMode;
	private JTextField ideVar;
	private JTextField ideMean;
	private JTextField ideMode;
	private JTextField ideMedian;
	private JTextField ideSD;
	private JTextField numDraws;
	private JButton btnStart;
	private JCheckBox replacement;
	private JTextArea log;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Window window = new Window();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1427, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 203, 305, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		desiredTotal = new JTextField();
		desiredTotal.setBounds(176, 134, 92, 26);
		panel.add(desiredTotal);
		desiredTotal.setColumns(10);
		
		numTrials = new JTextField();
		numTrials.setColumns(10);
		numTrials.setBounds(176, 34, 92, 26);
		panel.add(numTrials);
		
		JLabel lblNoOfTrials = new JLabel("No. of Trials");
		lblNoOfTrials.setBounds(15, 37, 92, 20);
		panel.add(lblNoOfTrials);
		
		JLabel lblDesiredTotal = new JLabel("Desired Total");
		lblDesiredTotal.setBounds(15, 137, 117, 20);
		panel.add(lblDesiredTotal);
		
		btnStart = new JButton("START");
		btnStart.setBounds(88, 355, 115, 29);
		btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	log.setText("");
            	
            	Deck deck = new Deck();
        		int numCards, nTrials, desiredTotal;
        		int wdTotal = 0;
        		int wodTotal = 0;
            	
            	numCards = Integer.parseInt(getNumDraws().getText());
        		nTrials = Integer.parseInt(getNumTrials().getText());
        		desiredTotal = Integer.parseInt(getDesiredTotal().getText());
        	    
        		
        		process(numCards, nTrials, desiredTotal, deck, wdTotal, wodTotal);
        		
            }
        });
		
		
		panel.add(btnStart);
		
		idealProb = new JTextField();
		idealProb.setBounds(176, 187, 92, 26);
		panel.add(idealProb);
		idealProb.setColumns(10);
		
		JLabel lblIdealProbability = new JLabel("Ideal Probability");
		lblIdealProbability.setBounds(15, 190, 117, 20);
		panel.add(lblIdealProbability);
		
		actualProb = new JTextField();
		actualProb.setColumns(10);
		actualProb.setBounds(176, 245, 92, 26);
		panel.add(actualProb);
		
		JLabel lblActualProbability = new JLabel("Actual Probability");
		lblActualProbability.setBounds(15, 248, 134, 20);
		panel.add(lblActualProbability);
		
		replacement = new JCheckBox("Replacement");
		replacement.setBounds(75, 314, 139, 29);
		panel.add(replacement);
		
		JLabel lblnumDraws = new JLabel("No. of Draws");
		lblnumDraws.setBounds(15, 83, 106, 20);
		panel.add(lblnumDraws);
		
		numDraws = new JTextField();
		numDraws.setColumns(10);
		numDraws.setBounds(176, 80, 92, 26);
		panel.add(numDraws);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(335, 0, 1070, 619);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_5.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblIdeal = new JLabel("ACTUAL");
		lblIdeal.setBounds(15, 16, 69, 20);
		panel_3.add(lblIdeal);
		
		actMean = new JTextField();
		actMean.setColumns(10);
		actMean.setBounds(175, 407, 111, 26);
		panel_3.add(actMean);
		
		JLabel lblMean = new JLabel("Mean");
		lblMean.setBounds(49, 410, 69, 20);
		panel_3.add(lblMean);
		
		JLabel lblMedian = new JLabel("Median");
		lblMedian.setBounds(49, 518, 69, 20);
		panel_3.add(lblMedian);
		
		JLabel lblVariance = new JLabel("Variance");
		lblVariance.setBounds(49, 446, 69, 20);
		panel_3.add(lblVariance);
		
		JLabel lblSd = new JLabel("SD");
		lblSd.setBounds(49, 482, 69, 20);
		panel_3.add(lblSd);
		
		JLabel lblMode = new JLabel("Mode");
		lblMode.setBounds(49, 554, 69, 20);
		panel_3.add(lblMode);
		
		actVar = new JTextField();
		actVar.setColumns(10);
		actVar.setBounds(175, 443, 111, 26);
		panel_3.add(actVar);
		
		actSD = new JTextField();
		actSD.setColumns(10);
		actSD.setBounds(175, 479, 111, 26);
		panel_3.add(actSD);
		
		actMed = new JTextField();
		actMed.setColumns(10);
		actMed.setBounds(175, 515, 111, 26);
		panel_3.add(actMed);
		
		actMode = new JTextField();
		actMode.setColumns(10);
		actMode.setBounds(175, 551, 111, 26);
		panel_3.add(actMode);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 50, 505, 305);
		panel_3.add(panel_1);
		
		JPanel panel_4 = new JPanel();
		panel_5.add(panel_4);
		panel_4.setLayout(null);
		
		ideVar = new JTextField();
		ideVar.setColumns(10);
		ideVar.setBounds(174, 445, 111, 26);
		panel_4.add(ideVar);
		
		JLabel lblIdeal_1 = new JLabel("IDEAL");
		lblIdeal_1.setBounds(15, 14, 102, 20);
		panel_4.add(lblIdeal_1);
		
		ideMean = new JTextField();
		ideMean.setColumns(10);
		ideMean.setBounds(174, 409, 111, 26);
		panel_4.add(ideMean);
		
		JLabel label_1 = new JLabel("Mean");
		label_1.setBounds(48, 412, 69, 20);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("Variance");
		label_2.setBounds(48, 448, 69, 20);
		panel_4.add(label_2);
		
		JLabel label_3 = new JLabel("SD");
		label_3.setBounds(48, 484, 69, 20);
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel("Median");
		label_4.setBounds(48, 520, 69, 20);
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("Mode");
		label_5.setBounds(48, 556, 69, 20);
		panel_4.add(label_5);
		
		ideMode = new JTextField();
		ideMode.setColumns(10);
		ideMode.setBounds(174, 553, 111, 26);
		panel_4.add(ideMode);
		
		ideMedian = new JTextField();
		ideMedian.setColumns(10);
		ideMedian.setBounds(174, 517, 111, 26);
		panel_4.add(ideMedian);
		
		ideSD = new JTextField();
		ideSD.setColumns(10);
		ideSD.setBounds(174, 481, 111, 26);
		panel_4.add(ideSD);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 50, 505, 305);
		panel_4.add(panel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(15, 16, 305, 171);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		log = new JTextArea();
		panel_6.add(log);
	}
	
	public void process(int numCards, int nTrials, int desiredTotal, Deck deck,int wdTotal, int wodTotal){
		
		try{
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
            for (int i = 0; i < nTrials; i++) {
                deck.shuffle();
                Cards[] withReplacement = DrawWithReplacement(deck,numCards);
        		Cards[] withoutReplacement =DrawWithoutReplacement(deck,numCards);
        		int wTotal = GetTotal(withReplacement,numCards);
        		int woTotal = GetTotal(withoutReplacement,numCards);
        		
        		if(desiredTotal==wTotal)
        			wdTotal++;
        		else if(desiredTotal==woTotal)
        			wodTotal++;
        		
                writeFile( writer, deck, i, numCards,withReplacement,withoutReplacement,wdTotal,wodTotal);
                
                if(replacement.isSelected()) {
                	log.append(""+ wTotal +"\n");
                }
                
                else {
                	log.append(""+ woTotal +  "\n" );
                	
                }
                
                deck.ResetDeck();
            }
            
            writer.println("actual probability with replacement: " + (float)wdTotal/(float)nTrials);            
            writer.println("actual probability without replacement: " + (float)wodTotal/(float)nTrials);
            
            
            
            if(replacement.isSelected()) {
            	actualProb.setText("" + (float)wdTotal/(float)nTrials);
            }
            
            else {
            	actualProb.setText(""+ (float)wodTotal/(float)nTrials);
            	
            }
            
            writer.close();
            
            
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//puts all cards drawn in an array - without replacement
	private Cards[] DrawWithoutReplacement(Deck deck,int numCards){
		Cards[] withoutReplacement = new Cards[numCards];
		
		for(int i=0;i<numCards;i++){
			withoutReplacement[i] = deck.drawCardwithoutReplacement();
		}
		return withoutReplacement;
	}
	
	//puts all cards drawn in an array - with replacement
	private Cards[] DrawWithReplacement(Deck deck,int numCards){
		Cards[] withReplacement = new Cards[numCards];
		
		for(int i=0;i<numCards;i++){
			withReplacement[i] = deck.drawCardwithReplacement();
		}
		return withReplacement;
	}
	
	//get sum of a draw card. use this function to get sum of with replacement and without replacement
	private int GetTotal(Cards[] drawCards,int numCards){
		int total = 0;
		
		for(int i=0;i<numCards;i++){
			total += drawCards[i].getValue();
		}
		
		return total;
	}
	
	private int[] computeTotalPossibleSums(int numDraws, boolean wReplacement) {
	   
		String deckVector = "c(1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13)";
	    		     
	    
	    String deckVector2 = "c(1,2,3,4,5,6,7,8,9,10,11,12,13)";
	    
	    Rengine engine = new Rengine(new String[] { "--no-save" }, false, null);

	    
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

	   
    	    
	    int [] intPosTotal1Rep = new int[14];
	    for(int i = 1; i < intPosTotal1Rep.length; i++) {
	    	intPosTotal1Rep[i] = i;
	    }
	    
	    int [] intPosTotal2Rep = new int[27];
	    for(int i = 2; i < intPosTotal2Rep.length; i++) {
	    	intPosTotal2Rep[i] = i;
	    }
	    
	    int [] intPosTotal3Rep = new int[40];
	    for(int i = 3; i < intPosTotal3Rep.length; i++) {
	    	intPosTotal3Rep[i] = i;
	    }
	    
	    int [] intPosTotal4Rep = new int[53];
	    for(int i = 4; i < intPosTotal4Rep.length; i++) {
	    	intPosTotal4Rep[i] = i;
	    }
	    
	    int [] intPosTotal5Rep = new int[66];
	    for(int i = 5; i < intPosTotal5Rep.length; i++) {
	    	intPosTotal5Rep[i] = i;
	    }
	    
	    if(numDraws == 1 && wReplacement == false) {
	    	return intPosTotal1;
	    }
	    else if(numDraws == 1 && wReplacement == true) {
	    	return intPosTotal1Rep;
	    }
	    else if(numDraws == 2 && wReplacement == false) {
	    	return intPosTotal2;
	    }
	    else if(numDraws == 2 && wReplacement == true) {
	    	return intPosTotal2Rep;
	    }
	    else if(numDraws == 3 && wReplacement == false) {
	    	return intPosTotal3;
	    }
	    else if(numDraws == 3 && wReplacement == true) {
	    	return intPosTotal3Rep;
	    }
	    else if(numDraws == 4 && wReplacement == false) {
	    	return intPosTotal4;
	    }
	    else if(numDraws == 4 && wReplacement == true) {
	    	return intPosTotal4Rep;
	    }
	    else if(numDraws == 5 && wReplacement == false) {
	    	return intPosTotal5;
	    }
	    else if(numDraws == 5 && wReplacement == true) {
	    	return intPosTotal5Rep;
	    }
	
	    return intPosTotal5Rep;
		
	}


	//write on file
	private void writeFile(PrintWriter writer, Deck deck, int i, int numCards, Cards[] withReplacement, Cards[] withoutReplacement,int wdTotal, int wodTotal) {
		// TODO Auto-generated method stub
		
//		
//		writer.println("Trial #" + (i+1));
//		
//		
//		writer.println("Without replacement: ");
//		for(int j=0; j< numCards; j++){
//			writer.println("Card #" + (j+1) );
//			writer.println("Card: "  + withoutReplacement[j].getRank()+ " of "  + withoutReplacement[j].getSuit() );
//			
//		}
//		
//		writer.println("With replacement: ");
//		for(int j=0; j<numCards; j++){
//			writer.println("Card #" + (j+1) );
//			writer.println("Card: " + withReplacement[j].getRank()+ " of "+ withReplacement[j].getSuit());
//		}
		
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
		
        writer.println("Without replacement total: \n" + GetTotal(withoutReplacement,numCards));
        writer.println("With replacement total: \n" + GetTotal(withReplacement,numCards));
        writer.println("\n");
	}
	
}
