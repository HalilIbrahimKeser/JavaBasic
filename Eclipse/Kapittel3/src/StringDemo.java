public class StringDemo {

	public static void main(String[] args) {
		String m1 = "Evin er den beste eleven.";
		String m2 = m1.toUpperCase();
		
		System.out.println(m1);
		System.out.println(m1.toUpperCase());
		System.out.println("Evin er den beste eleven".toUpperCase());
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2) );
		System.out.println(m1.equalsIgnoreCase(m2) );
		
        String text = "Daniel er min favoritt studentassistent";
        String TEXT = text.toUpperCase();
        System.out.println("");
        System.out.println(text);
        System.out.println(TEXT);
        System.out.println(text == TEXT);
        System.out.println(text.equals(TEXT));
        System.out.println(text.equalsIgnoreCase(TEXT));
		
	}

}
