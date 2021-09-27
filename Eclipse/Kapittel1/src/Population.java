

public class Population {
		public static void main(String[] args) {
			System.out.println("Etter ett år har befolkningen økt til");
			System.out.println(312032486 + (365 * 24 * 60 * 60) / 7 
										 - (365 * 24 * 60 * 60) / 13 
										 + (365 * 24 * 60 * 60) / 45);
			
			System.out.println("Etter fem år har befolkningen økt til");
			System.out.println(312032486 + 5 * ((365 * 24 * 60 * 60) / 7 
											  - (365 * 24 * 60 * 60) / 13  
											  + (365 * 24 * 60 * 60) / 45));
		}
	}
