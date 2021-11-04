public DollarCoin extends coin{
	public DollarCoin(boolean _fail){
		boolean fail = _fail;
		double deno = 1.00;
		String commonName = "Dollar"
		String cc = "USD";
		String smelt = "88.5% Cu 6% Zi 3.5% Mn 2% Ni";
		super(cc, deno, commonName, smelt, fail);
	}
}
