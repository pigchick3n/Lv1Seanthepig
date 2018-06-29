
public class JamesBond {
	
	public static void main(String[] args) {
		JamesBond jb = new JamesBond();
		Vault v = new Vault(123456);
		int ans = jb.findCode(v);
		System.out.println("The Code was "+ ans);
		ans--;
		System.out.println("The Vault exploded "+ ans+ " times");
	}

	public int findCode(Vault v) {
		for (int i = 0; i < 1000000; i++) {
			boolean b = v.tryCode(i);
			if (b == true) {
				return i;
			}
			

		}
	
		return -1;
	}
}