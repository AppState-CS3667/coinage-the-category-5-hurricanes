import java.util.Random;
/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * coinmint abstract class.
 */
public abstract class CoinMint {
	
    protected boolean fail = false;
    private Random rand = new Random();
/**
 * for resting the failure boolean.
 */
    public void resetFail() {
	fail = false;		
    }
/**
 * @return boolean for returning the fail condtion.
 */
    public boolean getFail() {
	return fail;
    }
/**
 * coin smelting process.
 */
    public void smelt() {
	System.out.println("Smelting some amount of metal...");
    }
/**
 * for imprinting the coin.
 */
    public void imprint() {
	System.out.println("Stamping the metal...");

	if (rand.nextInt(2000) == 39) {
            fail = true;
	}

	failCheck(Processes.IMPRINT);
    }
/**
 * for the inspection process of the coin.
 */	
    public void inspect() {
	System.out.println("Inspecting the coin...");
		
	if (rand.nextInt(12) == 4) {
	    fail = true;
	}
	failCheck(Processes.INSPECT);
    }
/**
 * for smoothing the coin.
 */	
    public void smoothe() {
	if (!fail) {
	    System.out.println("Smoothing the metal... This coin be crusty...");
			
	    if (rand.nextInt(2000) == 39) {
		fail = true;
	    }
	
	    failCheck(Processes.SMOOTHE);
	}
    }
/**
 * for buffing out the scratches.
 */	
    public void buff() {
	if (!fail) {
	    System.out.println("Buffing the metal... "
		+ "This won't remain shiny for long...");
			
	    if (rand.nextInt(2000) == 39) {
		fail = true;
	    }
			
	    failCheck(Processes.BUFF);
	}
    }
/**
 * @param process input of the process infromation.
 * for checking the fail condition.
 */	
    public void failCheck(Processes process) {
	if (fail) {
	    System.out.println("Oh no! The " 
	        + process.toString() + " process failed!");
	}
    }
}
