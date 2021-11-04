public class Penny extends coin{
	public Penny(){
		bool fail = _fail;
		double deno = 0.01;
		String commonName = "Penny"
		String cc = "USD";
		String smelt = "2.5% Cu 97.5% Zi";
		super(cc, deno, commonName, smelt, fail);
	}
}
