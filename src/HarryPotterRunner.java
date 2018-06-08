
public class HarryPotterRunner {

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter d = new HarryPotter();
		// 2. become invisible
		d.makeInvisible(true);
		// 3. spy on professor snape
		d.spyOnSnape();
		// 4. become visible again
		d.makeInvisible(false);
		// 5. cast a “stupefy” spell
		d.castSpell("stupefy");

}
}