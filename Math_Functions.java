package shivani;
// Math all Functions
public class Math_Function {

	public static void main(String[] args) {
		
		System.out.println("-95(abs)    : "+Math.abs(-95));       // 95  (Absolute value 	)
		
		System.out.println("*************************************");
		System.out.println("5.07(floor) : "+Math.floor(5.07));    // 5.0 (Round down)
		System.out.println("5.67(floor) : "+Math.floor(5.67));        
		
		System.out.println("*************************************");
		System.out.println("5.57(round) : "+Math.round(5.57));     // 6  (Nearest integer)
		System.out.println("5.07(round) : "+Math.round(5.57));      
		
		System.out.println("*************************************");
		System.out.println("5.07(ceil)  : "+Math.ceil(5.07));      // 6.0   (	Round up)
		System.out.println("5.57(ceil)  : "+Math.ceil(5.57));    
		
		System.out.println("*************************************");
		System.out.println("PI : "+Math.PI);                       //Math constants
		System.out.println("E : "+Math.E);
		
		System.out.println("*************************************");
		
		System.out.println("Sqrt : "+Math.sqrt(16));
		System.out.println("*************************************");
		System.out.println("Max : "+Math.max(23,20));
		System.out.println("Min : "+Math.min(23,20));
		System.out.println("*************************************");
		
		System.out.println("pow 2^3 :"+Math.pow(2, 3));
		System.out.println("*************************************");
		
		System.out.println("Random Number");    
		
		System.out.println(Math.random());      //random number between 0.0 to 1.0
		System.out.println(Math.random());
		System.out.println("---------------------");
		
		for(int i=0;i<5;i++) {                 //5 random number between 0.0 to 1.0
			System.out.println(Math.random());
		}
		
		System.out.println("---------------------");
		for (int i=0; i<5;i++) {                  //5 random number between 0 to 100
			double random = Math.random() * 100;
			System.out.println(random);
		}
		System.out.println("*************************************");
	

	}

}
