package pairOfDice;

public class RollTwoPairs {
	public static void main (String[] args) {
		PairOfDice firstDice = new PairOfDice(1,1);
		PairOfDice secondDice = new PairOfDice(2,4);
		
		int countRolls = 0;
		int total1, total2;
		
		do {
			firstDice.roll();
			total1 = firstDice.die1 + firstDice.die2;
			System.out.println("First pair comes up " + total1);
			
			secondDice.roll();
			total2 = secondDice.die1 + secondDice.die2;
			System.out.println("Second pair comes up " + total2);
			
			countRolls++;
			System.out.println();
		} while (total1 != total2);
		
		System.out.println("It took " + countRolls + " rolls until the totals were the same.");
		
		
	}

}
