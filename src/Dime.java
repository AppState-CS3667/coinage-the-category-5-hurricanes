public class Dime extends coin {
	public Dime(boolean _fail){
		bool fail = _fail;
		double deno = 0.10;
		String commonName = "Dime"
		String cc = "USD";
		String smelt = "91.67% Cu 8.33% Ni";
		super(cc, deno, commonName, smelt, fail);
	}
}
