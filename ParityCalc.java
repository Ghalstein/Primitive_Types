public class ParityCalc {
	public static int parity(int num) {
		int parCount = 0;
		while (num > 0) {
			if (num % 2 == 1) {
				parCount++;
			}
			num /= 2;
		}
		if (parCount % 2 == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main (String args[]) {
		int num = Integer.parseInt(args[0]);
		System.out.println(parity(num));
	}
}