package studio3;
import java.util.Scanner;
public class sieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Find out the prime number up to: ");
		int n = in.nextInt();
		int[] a = new int[n+1];
		a[0] = 1;
		a[1] = 1;
		for(int i = 1; i <= n; i++) {
			if(a[i] == 0) {
				for(int j = i+1; j <= n; j++) {
					if( j % i == 0)
						a[j] = 1;
				}
			}
		}
		for(int i = 1; i <= n; i++) {
			if(a[i] == 0) {
				System.out.println(i);
			}
		}

	}

}
