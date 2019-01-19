import java.util.Scanner;

public class Powerball {

	public static void main(String[] args) {
		
		
		System.out.println("Powerball Calculator");
		System.out.print("Input jackpot prize in million dollars: ");
		Scanner s = new Scanner(System.in);
		int jackpot = s.nextInt();
		jackpot = jackpot * 1000000;
		double pay = jackpot * 1/292201338.00;
		pay = pay + 1000000 / 11688053.52;
		pay = pay + 50000 / 913129.18;
		pay = pay + 100 / 36525.17;
		pay += 100 / 14494.11;
		pay += 7 / 579.76;
		pay += 7 / 701.33;
		pay += 4 / 91.98;
		pay += 4 / 38.32;
		double cost = 2;
		double diff = pay - cost;
		
		System.out.println("Jackpot: " + jackpot + ", Pay; " + pay + ", Difference: " + diff);
		if(diff > 0){
		
			System.out.println("Buy!");
			
		} else {
			
			System.out.println("DO NOT BUY!");
			
		}
		
		s.close();

	}

}
