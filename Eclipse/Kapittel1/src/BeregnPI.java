public class BeregnPI {

	public static void main(String[] args) {
	double pi = 0;
	boolean plus = true;
		System.out.println(4 * (1 -1.0/3 + 1.0/5 - 1.0/7 + 1.0 /9 - 1.0/11 + 1.0/13));
		System.out.println(4 * (1 -1.0/3 + 1.0/5 - 1.0/7 + 1.0 /9 - 1.0/11 + 1.0/13 -1.0/15 + 1.0/17));
		
		// med for løkke...
		double part = 1 - 1.0/3;
		for (int i = 5; i < 20000; i+=2) {
			if (plus == true) {
				part+= 1.0/i;
				plus = false;
				}
				else {
					part-= 1.0/i;
					plus = true;
				}
			}
		pi = 4 * part;
		System.out.println(pi);
	}
}