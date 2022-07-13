package alexisandersen;
import java.util.*;

public class ListPrimeNumbers {
	
	static Vector<Long> primes = new Vector<Long>();	
	
	static Boolean isPrime(Long x) {
		for (Long p : primes) {
			if (p*p > x) break;
			if (x % p == 0)
				return false;
		}
		return true;			
	}
	
	public static void main(String[] args) {
		System.out.println("Generating primes.");
		
		Long next = 2l;
		
		while (primes.size() < 100) {
			if (isPrime (next)) {
				primes.add(next);
			}
			next++;
		}
		System.out.println("Done.");
		
		System.out.println("Here are your primes:");
		for (Long p : primes) {
			System.out.append(p.toString());
			if (primes.indexOf(p) % 20 != 19)
				System.out.append(", ");
			else
				System.out.append("\n");
				
		}
		System.out.flush();
		System.out.println("and so on");
	}
}
