
public class DoWhileDemo {

	public static void main(String[] args) {
		//10 ganger
		int count = 0;
		while (count < 10) {
		  System.out.println("Studentassistent");
		  count++;
		}
		
	//9 ganger	
		int ge = 0;
		while (++ge < 10) {
		  System.out.println("Studentassistent");
		}
		
	// x er 4
		int x = 0;
		while (x < 4) {
		  x = x + 1;
		}
		System.out.println("x er " + x); 
		
		
    //3 0	
		int number = 6;
		while (number > 0) {
		  number -= 3;
		  System.out.print(number + " "); 
		  
    //11 ganger	  
		  int count1 = 0;
		  do {
		    System.out.println("Studentassistent");
		  } while (count1++ < 10); 
		    
    //10 ganger		  
		for (int counta = 1; counta <= 10; counta++) {
			  System.out.println("Welcome to Java");
	
    //10 ganger
	   for (int counte = 0; counte < 10; counte++) {
			  System.out.println("Welcome to Java");
			}
			  
   //45 ganger	  
		int sum=0;
		for (int i = 0; i < 10; ++i) {
			  sum += i; 
			} System.out.println(sum);
				} 
		
  //halv pyramide	  
	for (int i = 1; i <= 6; i++) {
		  for (int j = 6; j >= 1; j--)
		    System.out.print(j <= i ? j + " " : " " + " ");
		  System.out.println();
		}
	
	
  //100	
	for (int i = 0; i < 10; i++) 
		  for (int j = 0; j < 10; j++) 
		    System.out.println(i * j);

  //6
	int sum = 0;
	int item = 0;
	do {
	     item++;
	     sum += item;
	     if (sum > 4)
	       break;
	} while (item < 5);
    System.out.println(sum);
    
  //sant    
    int balance = 10;
    while (true) {
      if (balance < 9) 
        break;
      balance = balance - 9;
	 System.out.println(balance);
    }
}}}
