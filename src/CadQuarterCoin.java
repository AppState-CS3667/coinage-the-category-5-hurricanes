
public CadQuarterCoin extends coin {
	public CadQuarterCoin(boolean _fail) {
		boolean fail = _fail;
		double deno = .25;
		String commonName = "Quarter"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
