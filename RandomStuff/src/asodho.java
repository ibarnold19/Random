
public class asodho {

	public static int sum(int n, int[] array){
		
		int sum = 0;
		
		for(int i = 0; i < n; i++){
			
			sum += array[i];
			
		}
		
		return sum;
		
	}
	
	public static void fillSquares(int n, int[] array){
		
		for(int i = 1; i <= n; i++){
			
			array[i-1] = i*i;
			
		}
		
	}
	
	public static void main(String args[]){
		
		int n = 320;
		int array[] = new int[n];
		
		fillSquares(n, array);
		int total = sum(n, array);
		
		System.out.println(total);
		
	}
	
}
