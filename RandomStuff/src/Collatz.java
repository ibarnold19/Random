
public class Collatz {

	public static int collatz(long n, int counter){
		
		if(n == 1) return counter;
		
		if(n % 2 == 0){
			
			n = n / 2;
			return collatz(n, counter + 1);
			
		} else {
			
			n = (n * 3) + 1;
			return collatz(n, counter + 1);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		long a = 1;
		long b = 2;
		
		int min = 100;
		int max = 1;
		int steps;
		long valueMax = 0;
		long valueMin = 0;
		int unique = 1;
		int counter = 0;
		int temp;
		
		for(long i = a; i <= b; i++){
			
			steps = collatz(i, counter);
			
			if(steps == max){
				
				unique = 0;
				
			} else {
				
				
				unique = 1;
				
			}
			
			if(steps > max){
				
				valueMax = i;
				max = steps;
				unique = 1;
				
				
			} 
		
			if(steps < min){
				
				valueMin = i;
				min = steps;
				
			}
			
		}
		
		if(unique == 1){
			
			System.out.println("max step for " + valueMax + " is: " + max);
			
		} else {
			
			System.out.println("min step for " + valueMin + " is: " + min);
			
		}
		
	}

}
