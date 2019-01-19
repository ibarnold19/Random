// Java program for implementation of Horner Method 
// for Polynomial Evaluation
import java.io.*;
import java.util.Scanner;
 
class HornerPolynomial
{
    // Function that returns value of poly[0]x(n-1) +
    // poly[1]x(n-2) + .. + poly[n-1]
    static double horner(double poly[], int n, double x)
    {
        // Initialize result
        double result = 0.0;  
  
        // Evaluate value of polynomial using Horner's method
        for (int i = n - 1; i >= 0; i--){
        	
            result = result * x + poly[i];
            
        }
  
        return result;
    }
    
    public static double power(double x, int n){
    	
    	if(n == 1) return x;
    	
    	if(n % 2 == 0){
    		
    		return power(x, n/2) * power(x, n/2);
    		
    	} else {
    		
    		return x * power(x, n/2) * power(x, n/2);
    		
    	}
    	
    	
    }
     
    // Driver program
    public static void main (String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        
        while(true){
        	
        	int n = 0;
        	double x = 0.0;
        	
        	n = s.nextInt();
        	
        	if(n == -1) break;
        	
        	double[] coefs = new double[n+1];
        	
        	for(int i = 0; i < n + 1; i++){
        		
        		coefs[i] = s.nextDouble();
        		
        	}
        	
        	System.out.print("x ? ");
        	x = s.nextDouble();
        	
        	System.out.println(horner(coefs, n+1, x));
        }
    }
}
 
// Contributed by Pramod Kumar