import java.util.Random;

public abstract class CoinMint {
	

	protected boolean fail = false;
	private Random rand = new Random();

	public void resetFail() { // what if two different users of the mint 
		fail = false;		 // are accessing fail from different threads? -pd
	}

	public boolean getFail(){
		return fail;
	}
	
	public void smelt() {
		System.out.println("Smelting some amount of metal...");
	}

	public void imprint() {
		System.out.println("Imprinting coin...");
	}
	
	public void inspect() {
		System.out.println("Inspecting the coin...");
		
		if (rand.nextInt(12) == 4) {
			fail = true;
		}
		
		failCheck(Processes.INSPECT);
	}
	
	public void smoothe() {
		if (!fail) {
			System.out.println("Smoothing the metal... This coin be crusty...");
			
			if (rand.nextInt(2000) == 39) {
				fail = true;
			}
	
			failCheck(Processes.SMOOTHE);
		}
	}
	
	public void buff() {
		if (!fail) {
			System.out.println("Buffing the metal... This won't remain shiny for long...");
			
			if (rand.nextInt(2000) == 39) {
				fail = true;
			}
			
			failCheck(Processes.BUFF);
		}
	}
	
	public void failCheck(Processes process) {
		if (fail) {
			System.out.println("Oh no! The " + process.toString() + " process failed!");
		}
	}
}
