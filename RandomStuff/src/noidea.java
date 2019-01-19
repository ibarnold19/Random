
public class noidea {

	public static char[] strCat(char dest[], char src[]){
		
		int sizeDest = dest.length;
		int sizeSrc = src.length;
		int count = 0;
		
		char cat[] = new char[sizeDest + sizeSrc];
		
		for(int i = 0; i < sizeDest; i++){
			
			cat[i] = dest[i];
			count++;
			System.out.print(cat[i]);
			
		}
		
		System.out.println("");
		
		for(int j = sizeDest; j < (sizeDest + sizeSrc); j++){
			
			cat[j] = src[j - count];
			System.out.print(cat[j]);
		
		}
		
		System.out.println("");
		
		return cat;
		
	}
	
	public static char[] strdup(char s[]){
		
		int size = s.length;
		
		char newS[] = new char[size];
		
		for(int j = 0; j < size; j++){
			
			newS[j] = s[j];
			System.out.print(newS[j]);
			
		}
		
		System.out.println("");
		
		return newS;
		
	}
	
	public static void main(String[] args) {
		
		char a[] = {'W', 'h', 'a', 't'};
		char b[] = {'e', 'l', 'o'};
		
		char c[] = strCat(a, b);
		char d[] = strdup(a);
		
		for(int i = 0; i < c.length; i++){
			
			System.out.print(c[i]);
			
		}
		
		for(int i = 0; i < d.length; i++){
			
			System.out.print(d[i]);
			
		}

	}

}
