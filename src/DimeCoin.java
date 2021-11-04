
public DimeCoin extends coin {
	public DimeCoin(bool _fail) {
		bool fail = _fail;
		double deno = .10;
		String commonName = "Dime"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
