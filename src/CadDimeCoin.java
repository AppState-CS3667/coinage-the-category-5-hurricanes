package src;

public CadDimeCoin extends coin {
	public CadDimeCoin(boolean _fail) {
		boolean fail = _fail;
		double deno = .10;
		String commonName = "Dime"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}