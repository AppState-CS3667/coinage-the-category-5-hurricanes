public class HalfDollar extends coin {
	public HalfDollar(boolean _fail){
		boolean fail = _fail;
		double deno = 0.50;
		String commonName = "HalfDollar"
		String cc = "USD";
		String smelt = "91.67% Cu 8.33% Ni";
		super(cc, deno, commonName, smelt, fail);
	}
}
