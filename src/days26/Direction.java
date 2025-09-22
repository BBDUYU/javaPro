package days26;

public enum Direction {
	EAST(100,"→"), SOUTH(200,"↓"), WEST(300,"←"), NORTH(400,"↑");

	private final int value;
	private final String symbol;


	Direction(int value, String symbol) {
		this.value=value;
		this.symbol=symbol;
		
	}


	public int getValue() {
		return value;
	}


	public String getSymbol() {
		return symbol;
	}


	@Override
	public String toString() {
		return this.name()+": "+this.symbol;
	}
	
	
}
