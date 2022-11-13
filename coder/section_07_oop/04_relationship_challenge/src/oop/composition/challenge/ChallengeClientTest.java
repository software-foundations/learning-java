package oop.composition.challenge;

public class ChallengeClientTest {

	public static void main(String[] agrs) {
		Client client = new Client("Bruno");
		
		Purchase p1 = new Purchase(client);
		Product notebook = new Product("Notebook", 2000);
		Product monitor = new Product("Monitor", 500);
		Item notebooks = new Item(p1, notebook, 10);
		Item monitors = new Item(p1, monitor, 10);
		System.out.println(client.getTotalPriceOfAllPurchases());

		Purchase p2 = new Purchase(client);
		Product tv = new Product("TV", 4000);
		Product bed = new Product("Bed", 1000);
		Item tvs = new Item(p2, tv, 3);
		Item beds =new Item(p2, bed, 2);
		System.out.println(client.getTotalPriceOfAllPurchases());
	}
}