
public class Runner {

	public static void main(String[] args) {

		Player player1 = new Player("DarkWolf", 23, "Lighting", "Power to produce Lighting", "20M");
		Player player2 = new Player("GreyWolf", 21, "Water", "Power to produce 50 litres of water", "80M");

		Swamp swamp = new Swamp("Shrek Swamp", "Brown", "50mm");

		System.out.println(player1);
		System.out.println(player2);
		
		System.out.println(swamp);
	}

}
