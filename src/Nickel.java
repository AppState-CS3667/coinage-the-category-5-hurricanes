public class Nickel extends coin{
	public Nickel(boolean _fail){
		boolean fail = _fail;
		double deno = 0.05;
		String commonName = "Nickel"
		String cc = "USD";
		String smelt = "75% Cu 25% Ni";
		super(cc, deno, commonName, smelt, fail);
	}
}
