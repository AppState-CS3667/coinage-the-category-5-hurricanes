import java.util.Random;

public abstract class CoinMint {
	protected boolean fail = false;
	private Random rand = new Random();
	
	public void resetFail() {
		fail = false;
	}
	
	public void manufacture() {
		System.out.println("Smelting some amount of metal...");
	}
	
	public void inspect() {
		System.out.println("Inspecting the coin...");
		
		if (rand.nextInt(12) == 4) {
			fail = true;
		}
		
		failCheck("inspecting");
	}
	
	public void smoothe() {
		if (!fail) {
			System.out.println("Smoothing the metal... This coin be crusty...");
			
			if (rand.nextInt(2000) == 39) {
				fail = true;
			}
	
			failCheck("smoothing");
		}
	}
	
	public void buff() {
		if (!fail) {
			System.out.println("Buffing the metal. This won't remain shiny for long.");
			
			if (rand.nextInt(2000) == 39) {
				fail = true;
			}
			
			failCheck("buffing");
		}
	}
	
	public void failCheck(String process) {
		if (fail) {
			System.out.println("Oh no! The " + process + " process failed!");
		}
	}
}
