import java.util.Scanner;
public class Primo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int primo = 0;
		
		System.out.println("Digite um numero:");
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) {
				primo += 1;
			}
		}
		if (primo == 2) {
			System.out.println(n + " � primo.");
		} else {
			System.out.println(n + " n�o � primo.");
		}
	}

}


	


