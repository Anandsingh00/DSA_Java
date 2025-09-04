package oops;

public class fraction {
	public static int gcd(int num, int deno) {
		int min = Math.min(num, deno);
		for (int i = min; i >= 1; i--) {
			if (num % i == 0 && deno % i == 0)return i;
		}
		return min;
	}

	public static class Fraction {
		int num;
		int deno;

		// constructor
		public Fraction(int num, int deno) {
			this.num = num;
			this.deno = deno;
			simplify();
		}

		public void simplify() {
			int hcf = gcd(num, deno);
			num /= hcf;
			deno /= hcf;
		}
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction(7, 21);
		System.out.println(f1.num+"/"+f1.deno);
		
		System.out.println(f1.num+"/"+f1.deno);
	}

}
