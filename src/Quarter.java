public class Quarter extends coin{
	public Quarter(boolean _fail){
		boolean fail = _fail;
		double deno = 0.25;
		String commonName = "Quarter"
		String cc = "USD";
		String smelt = "91.67% Cu 8.33% Ni";
		super(cc, deno, commonName, smelt, fail);
	}
}
