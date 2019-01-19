
public class fibPrime {

	public static long fibSumPrime(long lim){
		
		long n1 = 1;
		long n2 = 2;
		long n3 = 0;
		long sum = n1 + n2;
		int isPrime = 1;
		
		if(lim <= 1) return 0;
		if(lim == 2) return 1;
		if(lim == 3) return 3;
		
		while(n2 < lim){
			
			n3 = n1 + n2;
			isPrime = 1;
			
			for(int i = 2; i <= n3 / 2; ++i){
				
				if(n3 % i == 0){
					
					isPrime = 0;
					break;
					
				}
				
				
			}
			
			if(n3 >= lim) break;
			
			if(isPrime == 1){
				
				n1 = n2;
				n2 = n3;
				sum += n3;
				System.out.println(n3);
				
			} else {
			
			n1 = n2;
			n2 = n3;
			
			}
			
		}
		
		return sum;
		
	}
	
	public static void main(String args[]){
		
		long lim = 999999;
		
		
		long sumPrime = fibSumPrime(lim);
		
		System.out.println("prime total: " + sumPrime);
		
	}
	
	
}
