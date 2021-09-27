import java.util.Scanner;

public class SteinSaksPapir1 {
    	
			//Faste konstanter,
			static int stein=1;
			static int papir =2;
			static int saks =0;
    	
		public static void main(String args[]){
    		double playerOneScore = 0;
    		double computerScore = 0;
    		int userPlay, computerPlay;
    	
			Scanner key = new Scanner(System.in);
    		while(playerOneScore <2 && computerScore <2){
    	    //key.close();
    			
    	
    		System.out.print("Saks (0), Stein (1) eller Papir (2)? ");
    			userPlay = key.nextInt();
    			
    			computerPlay = (int) (Math.random()*((2-0)+1));
    			
    			if (userPlay==1)
    				userPlay = stein;
    			else if (userPlay==2)
    				userPlay =papir;
    			else if (userPlay==0)
    				userPlay=saks;
    			
    			if (computerPlay==1)
    				computerPlay = stein;
    			if (computerPlay==2)
    				computerPlay =papir;
    			if (computerPlay==0)
    				computerPlay=saks;
    			
    	//Regner ut fra de forskjellige inntastningene og viser resultat,
				if (userPlay >=3 && userPlay <= -1 ){ 
		//else if (userPlay <=(-1)) ville gjerne legge inn denne også. Men fikk ikke til,
				System.out.println("Ugyldig tall, kun 0, 1 eller 2 aksepteres.");
				}else {
					
    			if (computerPlay ==stein && userPlay==saks ){
    				System.out.println("Datamaskin er stein. Du er saks. Du tapte...");
    				computerScore++;
    			}
    			if (computerPlay ==stein && userPlay==papir ){
    				System.out.println("Datamaskin er stein. Du er papir. Du har vunnet!");
    				playerOneScore++;
    			}
    			if (computerPlay ==papir && userPlay==saks ){
    				System.out.println("Datamaskin er papir. Du er saks. Du har vunnet!");
    				playerOneScore++;
    			}
    			if (computerPlay ==papir && userPlay==stein ){
    				System.out.println("Datamaskin er papir. Du er stein. Du tapte...");
    				computerScore++;
    			}
    			if (computerPlay ==saks && userPlay==stein ){
    				System.out.println("Datamaskin er saks. Du er stein. Du har vunnet!");
    				playerOneScore++;
    			}
    			if (computerPlay ==saks && userPlay==papir ){
    				System.out.println("Datamaskin er saks. Du er papir. Du tapte...");
    				computerScore++;
    			}
    			if (computerPlay ==saks && userPlay==saks ){
    				System.out.println("Datamaskin er saks. Du er saks. Uavgjort.");
    				computerScore++;	
    			}
				if (computerPlay ==stein && userPlay==stein ){
					System.out.println("Datamaskin er stein. Du er stein. Uavgjort.");
					computerScore++;
    			}
				if (computerPlay ==papir && userPlay==papir ){
					System.out.println("Datamaskin er papir. Du er papir. Uavgjort.");
					computerScore++;
				}
			}
    	}
    }
 }
 /* Stein saks papir    -- Jeg har laget denne først. Men den fungerte ikke av en eller annen grunn. 
   Jeg klarte ikke finne feilen 
  
    import java.util.Scanner;

    public class SteinSaksPapir {
    	public static void main (String[]args){
    		private final static int Stein=1;
    		private final static int Papir =2;
    		private final static int Saks =0;

    		// Scanner objekt,
    		Scanner input = new Scanner(System.in);

    		//Be bruker velge et tall mellom 0-2,
    		System.out.print("Saks (0), Stein (1) eller Papir (2)? ");
    		int tastatur = input.nextInt();

    	// Kalkulerer et heltall mellom 0 (min) og 2 (max),
    	int randomNumber = (int)(Math.random()*((2-0)+1));

    	//Om maskinen får stein,
    	if(randomNumber == 1){
    		if(tastatur == 1){
    			System.out.println("Datamaskin er stein. Du er stein. Uavgjort.");
    		}    else if(tastatur == 2){
    			System.out.println("Datamaskin er stein. Du er papir. Du har vunnet!" );
    		}    else if(tastatur == 0){
    			System.out.println("Datamaskin er stein. Du er saks. Du tapte...");
    		}

    		//Om maskinen får papir. Saks (0), Stein (1) eller Papir (2)
    		else if(randomNumber == 2){
    			if(tastatur == 1){
    				System.out.println("Datamaskin er papir. Du er stein. Du tapte...");
    			}   else if(tastatur == 0){
    				System.out.println("Datamaskin er papir. Du er saks. Du har vunnet!");
    			}   else if(tastatur == 2){
    				System.out.println("Datamaskin er papir. Du er papir. Uavgjort.");
    			}

    			//Om maskinen får saks. Saks (0), Stein (1) eller Papir (2)
    			else if(randomNumber == 0){
    				if(tastatur == 1){
    					System.out.println("Datamaskin er saks. Du er stein. Du har vunnet!");
    				}   else if(tastatur == 0){
    					System.out.println("Datamaskin er saks. Du er saks. Uavgjort.");
    				}   else if(tastatur == 2){
    					System.out.println("Datamaskin er saks. Du er papir. Du tapte...");
    				}

    				//Ugyldige tall
    				else 
    					System.out.println("Ugyldig tall, kun 0, 1 eller 2 aksepteres.");
    			} 
    		}	
    	}

    }
    }

*/