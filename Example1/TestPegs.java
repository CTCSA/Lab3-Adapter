// Test program for Pegs.
public class TestPegs {
	public static void main(String args[]) {
		// Create some pegs.
		RoundPeg roundPeg = new RoundPeg();
		SquarePeg squarePeg = new SquarePeg();
		// Do an insert using the square peg.
		squarePeg.insert("Inserting square peg...");
		// Create a PegAdapter
		PegAdapter adapter = new PegAdapter(roundPeg);
		adapter.insert("Inserting round peg...");
	}
}
